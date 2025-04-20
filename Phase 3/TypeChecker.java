package main.visitor.typeChecker;

import main.ast.nodes.*;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.SetValue;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.set.*;
import main.ast.types.NoType;
import main.ast.types.NullType;
import main.ast.types.Type;
import main.ast.types.array.ArrayType;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.ClassType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.ast.types.set.SetType;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.utils.graph.Graph;
import main.util.ArgPair;
import main.visitor.*;

import java.util.ArrayList;

public class TypeChecker extends Visitor<Void> {
    private Graph<String> classHierarchy;
    ExpressionTypeChecker expressionTypeChecker;
    private ClassDeclaration currClassName;
    private MethodDeclaration currMethodName;
    private Integer loopsNo = 0;
    private boolean hasReturn = false;

    public TypeChecker(Graph<String> classHierarchy){
        this.classHierarchy = classHierarchy;
        this.expressionTypeChecker = new ExpressionTypeChecker(classHierarchy);
    }

    @Override
    public Void visit(Program program) {
        boolean main = false;
        for (ClassDeclaration classDeclaration : program.getClasses()){
            if (classDeclaration.getClassName().getName().equals("Main")){
                main = true;
            }
            currClassName = classDeclaration;
            expressionTypeChecker.setCurrentClassName(classDeclaration);
            classDeclaration.accept(this);
        }
        if (!main){
            program.addError(new NoMainClass());
        }
        for (VariableDeclaration variableDeclaration : program.getGlobalVariables()){
            variableDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        String classParent;
        if (classDeclaration.getParentClassName() != null) {
            classParent = classDeclaration.getParentClassName().getName();
            if (classParent.equals("Main")) {
                classDeclaration.addError(new CannotExtendFromMainClass(classDeclaration.getLine()));
            }
            try {
                ClassSymbolTableItem classSymbolTableItem = (ClassSymbolTableItem) SymbolTable
                        .root
                        .getItem(ClassSymbolTableItem.START_KEY + classParent, true);
            } catch (ItemNotFoundException ignored) {
                classDeclaration.addError(new ClassNotDeclared(classDeclaration.getLine(), classParent));
            }
        }
        if (classDeclaration.getClassName().getName().equals("Main") && classDeclaration.getConstructor() == null) {
            classDeclaration.addError(new NoConstructorInMainClass(classDeclaration));
        }
        for (FieldDeclaration fieldDeclaration : classDeclaration.getFields()){
            fieldDeclaration.accept(this);
        }
        if (classDeclaration.getConstructor() != null) {
            currMethodName = classDeclaration.getConstructor();
            expressionTypeChecker.setCurrentMethodName(currMethodName);
            classDeclaration.getConstructor().accept(this);
            this.loopsNo = 0;
        }
        for (MethodDeclaration methodDeclaration : classDeclaration.getMethods()){
            currMethodName = methodDeclaration;
            expressionTypeChecker.setCurrentMethodName(currMethodName);
            methodDeclaration.accept(this);
            this.loopsNo = 0;
        }
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        String constructorName = constructorDeclaration.getMethodName().getName();
        if (currClassName.getClassName().getName().equals("Main") && constructorDeclaration.getArgs().size() != 0){
            constructorDeclaration.addError(new MainConstructorCantHaveArgs(constructorDeclaration.getLine()));
        }
        for (ArgPair argPair : constructorDeclaration.getArgs()){
            VariableDeclaration variableDeclaration = argPair.getVariableDeclaration();
            variableDeclaration.accept(this);
        }
        for (VariableDeclaration variableDeclaration : constructorDeclaration.getLocalVars()){
            variableDeclaration.accept(this);
        }
        for (Statement statement : constructorDeclaration.getBody()){
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        boolean doesReturn = false;
        for (ArgPair argPair : methodDeclaration.getArgs()){
            argPair.getVariableDeclaration().accept(this);
        }
        for (VariableDeclaration variableDeclaration : methodDeclaration.getLocalVars()){
            variableDeclaration.accept(this);
        }
        for (Statement statement : methodDeclaration.getBody()){
            //new
            if(doesReturn || this.hasReturn) {UnreachableStatements exception = new UnreachableStatements(statement);
                statement.addError(new UnreachableStatements(statement));
            }
            if (statement instanceof ReturnStmt){
                doesReturn = true;
            }
            if (!this.hasReturn){
                statement.accept(this);
            }
        }
        this.hasReturn = false;
        if (!(methodDeclaration.getReturnType() instanceof VoidType) && !doesReturn){
            methodDeclaration.addError(new MissingReturnStatement(methodDeclaration));
        }
        if ((methodDeclaration.getReturnType() instanceof VoidType) && doesReturn){
            methodDeclaration.addError(new VoidMethodHasReturn(methodDeclaration));
        }
        Validate(methodDeclaration, methodDeclaration.getReturnType());
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        fieldDeclaration.getVarDeclaration().accept(this);
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        varDeclaration = CheckVarDec(varDeclaration, varDeclaration.getType());
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        expressionTypeChecker.setLvalue(false);
        Type leftValueType = assignmentStmt.getlValue().accept(expressionTypeChecker);
        boolean lvalue = expressionTypeChecker.getLvalue();
        Type rightValueType = assignmentStmt.getrValue().accept(expressionTypeChecker);
        if (lvalue) {
            assignmentStmt.addError(new LeftSideNotLvalue(assignmentStmt.getLine()));
        }
        if (leftValueType instanceof NoType){
            return null;
        }
        if (!(isSubType(rightValueType, leftValueType))){
            assignmentStmt.addError(new UnsupportedOperandType(assignmentStmt.getLine(), BinaryOperator.assign.toString()));
        }
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        boolean doesReturn = false;
        if (blockStmt != null){
            for (Statement statement : blockStmt.getStatements()){
                //new
                if(doesReturn) {UnreachableStatements exception = new UnreachableStatements(statement);
                    statement.addError(new UnreachableStatements(statement));
                }
                if (statement instanceof ReturnStmt){
                    doesReturn = true;
                }
                statement.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        Type conditionType = conditionalStmt.getCondition().accept(expressionTypeChecker);
        if(!(conditionType instanceof BoolType || conditionType instanceof NullType)){
            conditionalStmt.addError(new ConditionNotBool(conditionalStmt.getLine()));
        }
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        conditionalStmt.getThenBody().accept(this);
        return null;
    }

    @Override
    public Void visit(ElsifStmt elsifStmt) {
        Type conditionType = elsifStmt.getCondition().accept(expressionTypeChecker);
        if(!(conditionType instanceof BoolType || conditionType instanceof NullType)){
            elsifStmt.addError(new ConditionNotBool(elsifStmt.getLine()));
        }
        elsifStmt.getThenBody().accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        expressionTypeChecker.set_method_statement(true);
        Type returnType = methodCallStmt.getMethodCall().accept(expressionTypeChecker);
        expressionTypeChecker.set_method_statement(false);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        Type argType = print.getArg().accept(expressionTypeChecker);
        if(!(argType instanceof IntType || argType instanceof ArrayType || argType instanceof SetType ||
                argType instanceof BoolType || argType instanceof NoType)) {
            UnsupportedTypeForPrint exception = new UnsupportedTypeForPrint(print.getLine());
            print.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        Type currMethodType = currMethodName.getReturnType();
        if (returnStmt != null){
            if (returnStmt.getReturnedExpr() != null){
                Type returnType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
                if(!(isSubType(returnType, currMethodType))){
                    returnStmt.addError(new ReturnValueNotMatchMethodReturnType(returnStmt));
                }
            }
        }
        return null;
    }

    @Override
    public Void visit(EachStmt eachStmt) {
        //todo
        Type listType = eachStmt.getList().accept(expressionTypeChecker);
        loopsNo ++;
        if (listType instanceof NoType){
            eachStmt.getBody().accept(this);
            if (eachStmt.getBody() instanceof ReturnStmt){
                this.hasReturn = true;
            }
            return null;
        }
        if (!(listType instanceof SetType || listType instanceof main.ast.types.array.ArrayType)){
            eachStmt.addError(new EachCantIterateNoneArray(eachStmt.getLine()));
            eachStmt.getBody().accept(this);
            if (eachStmt.getBody() instanceof ReturnStmt){
                this.hasReturn = true;
            }
            return null;
        } else {
            if(!(eachStmt.getList().accept(expressionTypeChecker) instanceof main.ast.types.array.ArrayType)){
                eachStmt.addError(new EachCantIterateNoneArray(eachStmt.getLine()));
            }
            else {
                main.ast.types.array.ArrayType artype = (main.ast.types.array.ArrayType) listType;
                if(!(isSubType(artype.getType(), eachStmt.getVariable().accept(expressionTypeChecker)))){
                    eachStmt.addError(new EachVarNotMatchList(eachStmt));
                }

            }
            eachStmt.getBody().accept(this);
            if (eachStmt.getBody() instanceof ReturnStmt){
                this.hasReturn = true;
            }
        }
        loopsNo --;
        return null;
    }

    @Override
    public Void visit(SetDelete setDelete) {
        return null;
    }

    @Override
    public Void visit(SetMerge setMerge) {
        //todo
//        if (!(setMerge.accept(expressionTypeChecker) instanceof SetType)){
//            setMerge.addError(new MergeInputNotSet(setMerge.getLine()));
//        }
        for (Expression expression : setMerge.getElementArgs()) {
            Type argType = expression.accept(expressionTypeChecker);
            if (!(argType instanceof SetType)){
                setMerge.addError(new MergeInputNotSet(setMerge.getLine()));
            }
        }
        return null;
    }

    @Override
    public Void visit(SetAdd setAdd) {
        if(!(setAdd.getElementArg().accept(expressionTypeChecker) instanceof IntType)){
            setAdd.addError(new AddInputNotInt(setAdd.getLine()));
        }
        return null;
    }

    public MethodDeclaration Validate(MethodDeclaration methodDeclaration, Type varDeclarationType){
        if (varDeclarationType instanceof ClassType){
            ClassType classType = (ClassType) varDeclarationType;
            try {
                SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + classType.getClassName().getName(), true);
            } catch (ItemNotFoundException exc) {
                methodDeclaration.addError(new ClassNotDeclared(methodDeclaration.getLine(), classType.getClassName().getName()));
                return methodDeclaration;
            }
        }

        else if (varDeclarationType instanceof ArrayType){
            ArrayType arrayType = (ArrayType) varDeclarationType;
            ArrayList <Expression> dims = arrayType.getDimensions();
            for(int i =0 ;i < dims.size(); i++ ){
                if((dims.get(i).accept(expressionTypeChecker) instanceof IntType)) {
                    IntValue intt = (IntValue) dims.get(i);
                    if(intt.getConstant() == 0){
                        methodDeclaration.addError(new CannotHaveEmptyArray(methodDeclaration.getLine()));
                        return methodDeclaration;
                    }
                }
            }
        }
        else if (varDeclarationType instanceof FptrType){
            FptrType fptrType = (FptrType) varDeclarationType;
            for (Type type : fptrType.getArgumentsTypes()){
                methodDeclaration = Validate(methodDeclaration, type);
            }
            methodDeclaration = Validate(methodDeclaration, fptrType.getReturnType());
        }
        return methodDeclaration;
    }

    private VariableDeclaration CheckVarDec (VariableDeclaration variableDeclaration, Type varDeclarationType) {
        if (varDeclarationType instanceof ClassType){
            ClassType classType = (ClassType) varDeclarationType;
            try {
                SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + classType.getClassName().getName(), true);
            } catch (ItemNotFoundException exc) {
                variableDeclaration.addError(new ClassNotDeclared(variableDeclaration.getLine(), classType.getClassName().getName()));
                variableDeclaration.setType(new NoType());
                return variableDeclaration;
            }
        }

        else if (varDeclarationType instanceof main.ast.types.array.ArrayType){
            main.ast.types.array.ArrayType arrt = (main.ast.types.array.ArrayType) varDeclarationType;

            ArrayList <Expression> dims = arrt.getDimensions();
            for(int i =0 ;i < dims.size(); i++ ){
                if((dims.get(i).accept(expressionTypeChecker) instanceof IntType)) {
                    IntValue intt = (IntValue) dims.get(i);
                    if(intt.getConstant() == 0){
                        variableDeclaration.addError(new CannotHaveEmptyArray(variableDeclaration.getLine()));
                        variableDeclaration.setType(new NoType());
                        return variableDeclaration;
                    }
                }

            }
        }
        else if (varDeclarationType instanceof FptrType){
            FptrType fptrType = (FptrType) varDeclarationType;
            for (Type type : fptrType.getArgumentsTypes()){
                variableDeclaration = CheckVarDec(variableDeclaration, type);
            }
            variableDeclaration = CheckVarDec(variableDeclaration, fptrType.getReturnType());
        }
        return variableDeclaration;
    }

    private boolean isSubType(Type a, Type b) {
        if (a instanceof NoType) {
            return true;
        }
        if (b instanceof NoType) {
            return false;
        }
        if ((a instanceof IntType && b instanceof IntType) || (a instanceof VoidType && b instanceof VoidType)
                || (a instanceof BoolType && b instanceof BoolType) || (a instanceof NullType && b instanceof NullType)) {
            return true;
        }
        if ((a instanceof ClassType || a instanceof NullType) && b instanceof ClassType) {
            if (a instanceof NullType)
                return true;
            ClassType classA = (ClassType) a;
            ClassType classB = (ClassType) b;
            return classHierarchy.isSecondNodeAncestorOf(classA.getClassName().getName(), classB.getClassName().getName());
        }
        if ((a instanceof FptrType || a instanceof NullType) && b instanceof FptrType) {
            if (a instanceof NullType)
                return true;
            FptrType fptrA = (FptrType) a;
            FptrType fptrB = (FptrType) b;
            if (!(isSubType(fptrA.getReturnType(), fptrB.getReturnType()))) {
                return false;
            } else {
                ArrayList<Type> argsA = fptrA.getArgumentsTypes();
                ArrayList<Type> argsB = fptrB.getArgumentsTypes();
                if (argsA.size() != argsB.size()) {
                    return false;
                }
                int size = argsA.size();
                for (int j = 0; j < size; j++) {
                    if (!isSubType(argsB.get(j), argsA.get(j))) {
                        return false;
                    }
                }
                return true;
            }
        }
        if ((a instanceof main.ast.types.array.ArrayType || a instanceof NullType) && b instanceof javax.lang.model.type.ArrayType) {
            if (a instanceof NullType)
                return true;
            main.ast.types.array.ArrayType arrA = (main.ast.types.array.ArrayType) a;
            main.ast.types.array.ArrayType arrB = (main.ast.types.array.ArrayType) b;

            ArrayList<Expression> dimsA = arrA.getDimensions();
            ArrayList<Expression> dimsB = arrB.getDimensions();

            if (!(isSubType(arrA.getType(), arrB.getType()))) {
                return false;
            }
            if (dimsA.size() != dimsB.size()) {
                return false;
            }
            for (int i = 0; i < dimsA.size(); i++) {
                IntValue da = (IntValue) dimsA.get(i);
                IntValue db = (IntValue) dimsB.get(i);
                if (da.getConstant() != db.getConstant())
                    return false;
            }

            return true;
        }
        if ((a instanceof SetType || a instanceof NullType) && b instanceof SetType) {
            if (a instanceof NullType)
                return true;
        }
        return false;
    }
}


