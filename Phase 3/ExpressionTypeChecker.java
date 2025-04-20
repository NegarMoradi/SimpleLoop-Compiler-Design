package main.visitor.typeChecker;

import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.classDec.*;
import main.ast.nodes.declaration.classDec.classMembersDec.*;
import main.ast.nodes.declaration.variableDec.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.SetValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.types.Type;
import main.ast.types.*;
import main.ast.types.primitives.*;
import main.ast.types.set.SetType;
import main.compileError.typeError.*;
import main.ast.nodes.expression.operators.*;
import main.ast.types.functionPointer.*;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.utils.graph.Graph;
import main.util.ArgPair;
import main.visitor.Visitor;
import main.symbolTable.*;
import main.symbolTable.items.*;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;


public class ExpressionTypeChecker extends Visitor<Type> {
    private Graph<String> classHierarchy;

    private ClassDeclaration currentClassName;
    private MethodDeclaration currentMethodName;

    private int err = 0;
    private boolean lvalue = false;
    public void setLvalue(boolean val){this.lvalue = val;}
    public boolean getLvalue(){return this.lvalue;}

    public void set_method_statement(boolean val){this.method_statement = val;}

    private boolean method_statement = false;

    public void setCurrentClassName(ClassDeclaration classDeclaration) {
        this.currentClassName = classDeclaration;
    }

    public void setCurrentMethodName(MethodDeclaration methodDeclaration) {
        this.currentMethodName = methodDeclaration;
    }

    public ExpressionTypeChecker(Graph<String> classHierarchy) {
        this.classHierarchy = classHierarchy;
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        this.lvalue = false;
        Type first = binaryExpression.getFirstOperand().accept(this);
        boolean l = this.lvalue;
        this.lvalue = true;
        Type second = binaryExpression.getSecondOperand().accept(this);
        BinaryOperator binary = binaryExpression.getBinaryOperator();
        switch (binary) {
            case add, sub, mult, div -> {
                if ((first instanceof IntType && second instanceof NoType) || (first instanceof NoType && second instanceof IntType) || (first instanceof NoType && second instanceof NoType))
                    return new NoType();
                if ((first instanceof IntType && second instanceof IntType))
                    return new IntType();
                else {
                    UnsupportedOperandType err = new UnsupportedOperandType(binaryExpression.getLine(), binary.toString());
                    binaryExpression.addError(err);
                    return new NoType();
                }
            }
            case assign -> {
                if (l) {
                    binaryExpression.addError(new LeftSideNotLvalue(binaryExpression.getLine()));
                }
                if (first instanceof NoType)
                    return new NoType();
                if (!isSubType(second, first)) {
                    UnsupportedOperandType err = new UnsupportedOperandType(binaryExpression.getLine(), binary.toString());
                    binaryExpression.addError(err);
                    return new NoType();

                } else {
                    if (l)
                        return new NoType();
                    return first;
                }
            }
            case lt, gt -> {
                if ((first instanceof IntType && second instanceof NoType) || (first instanceof NoType && second instanceof IntType) || (first instanceof NoType && second instanceof NoType))
                    return new NoType();
                if (first instanceof IntType && second instanceof IntType)
                    return new BoolType();
                else {
                    UnsupportedOperandType err = new UnsupportedOperandType(binaryExpression.getLine(), binary.toString());
                    binaryExpression.addError(err);
                    return new NoType();
                }
            }
            case and, or -> {
                if ((first instanceof BoolType && second instanceof NoType) || (first instanceof NoType && second instanceof BoolType) || (first instanceof NoType && second instanceof NoType))
                    return new BoolType();
                if (first instanceof BoolType && second instanceof BoolType)
                    return new BoolType();
                else {
                    UnsupportedOperandType err = new UnsupportedOperandType(binaryExpression.getLine(), binary.toString());
                    binaryExpression.addError(err);
                    return new NoType();
                }
            }
            case eq -> {
                if (first instanceof NoType || second instanceof NoType)
                    return new NoType();
                if ((first instanceof NullType && (second instanceof ClassType || second instanceof FptrType)) || (second instanceof NullType && (first instanceof ClassType || first instanceof FptrType)))
                    return new BoolType();
                if (isSubType(first, second) && isSubType(second, first)) {
                    return new BoolType();
                }
                else {
                    UnsupportedOperandType err = new UnsupportedOperandType(binaryExpression.getLine(), binary.toString());
                    binaryExpression.addError(err);
                    return new NoType();
                }
            }
        }
        return new BoolType();
    }

    @Override
    public Type visit(NewClassInstance newClassInstance) {

        this.lvalue = true;
        boolean check = false;
        String className = newClassInstance.getClassType().getClassName().getName();
        ArrayList<Expression> args = newClassInstance.getArgs();
        try{
            ClassSymbolTableItem classItem = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + className, true);
            ConstructorDeclaration constructorDeclaration = classItem.getClassDeclaration().getConstructor();
            if(constructorDeclaration == null){
                if (args.size() > 0){
                    newClassInstance.addError(new ConstructorArgsNotMatchDefinition(newClassInstance));
                }
                return new NoType();
            }
            ArrayList<Expression> argss = newClassInstance.getArgs();
            if(argss.size() == constructorDeclaration.getArgs().size()) {
                    for (int i = 0; i < argss.size(); i++) {
                        if (!isSubType(argss.get(i).accept(this), argss.get(i).accept(this))) {
                            check = true;
                        }
                    }
                    if(check == false){
                        check = true;
                        //return newClassInstance.getClassType();
                    }
                }
            if(args.size() != constructorDeclaration.getArgs().size()){
                newClassInstance.addError(new ConstructorArgsNotMatchDefinition(newClassInstance));
                return new NoType();
            }
            int i = 0;
            for(ArgPair arg: constructorDeclaration.getArgs()){
                if(!isSubType(args.get(i).accept(this), arg.getVariableDeclaration().getType())){
                    check = true;
                    newClassInstance.addError(new ConstructorArgsNotMatchDefinition(newClassInstance));
                    return new NoType();
                }
                i++;
            }
            return newClassInstance.getClassType();
        }
        catch (ItemNotFoundException exc)
        {
            newClassInstance.addError(new ClassNotDeclared(newClassInstance.getLine(), className));
            return new NoType();
        }
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        this.lvalue = false;
        Type operand = unaryExpression.getOperand().accept(this);
        boolean l = this.lvalue;
        this.lvalue = true;
        UnaryOperator operator = unaryExpression.getOperator();
        switch (operator) {
            case minus -> {
                if (operand instanceof IntType)
                    return new IntType();
                if (operand instanceof NoType) {
                } else {
                    UnsupportedOperandType err = new UnsupportedOperandType(unaryExpression.getLine(), operator.toString());
                    unaryExpression.addError(err);
                }
                return new NoType();
            }
            case postdec, postinc -> {
                if (l) {
                    unaryExpression.addError(new IncDecOperandNotLvalue(unaryExpression.getLine(), operator.toString()));
                }
                if (operand instanceof IntType)
                    return new IntType();
                if (operand instanceof NoType)
                    return new NoType();
                else {
                    UnsupportedOperandType err = new UnsupportedOperandType(unaryExpression.getLine(), operator.toString());
                    unaryExpression.addError(err);
                    return new NoType();
                }
            }
            case not -> {
                if (operand instanceof BoolType)
                    return new BoolType();
                if (operand instanceof NoType) {
                } else {
                    UnsupportedOperandType err = new UnsupportedOperandType(unaryExpression.getLine(), operator.toString());
                    unaryExpression.addError(err);
                }
                return new NoType();
            }
        }
        return null;
    }
//checkd
    @Override
    public Type visit(MethodCall methodCall) {
        this.lvalue = true;
        Type instance = methodCall.getInstance().accept(this);
        if(instance instanceof FptrType) {
            ArrayList<Expression> args = methodCall.getArgs();
            ArrayList<Type> argumentTypes = ((FptrType)instance).getArgumentsTypes();
            if(args.size() != argumentTypes.size()){
                MethodCallNotMatchDefinition exception = new MethodCallNotMatchDefinition(methodCall.getLine());
                methodCall.addError(exception);
                for(Expression arg: args)
                    arg.accept(this);
                if(((FptrType)instance).getReturnType() instanceof NullType && !this.method_statement){
                    CantUseValueOfVoidMethod exceptionv = new CantUseValueOfVoidMethod(methodCall.getLine());
                    methodCall.addError(exceptionv);
                    return new NoType();
                }
                return new NoType();
            }
            int size = args.size();
            for(int i = 0; i < size; i++){
                if(!isSubType(args.get(i).accept(this), argumentTypes.get(i))){
                    MethodCallNotMatchDefinition exceptionm =  new MethodCallNotMatchDefinition(methodCall.getLine());
                    methodCall.addError(exceptionm);
                    if(((FptrType)instance).getReturnType() instanceof NullType && !this.method_statement){
                        CantUseValueOfVoidMethod exceptionv = new CantUseValueOfVoidMethod(methodCall.getLine());
                        methodCall.addError(exceptionv);
                        return new NoType();
                    }
                    return new NoType();
                }
            }
            Validate(((FptrType)instance).getReturnType());
            int e = this.err;
            this.err=0;
            if(e > 0)
                return new NoType();
            if(((FptrType)instance).getReturnType() instanceof NullType && !this.method_statement){
                CantUseValueOfVoidMethod exceptionv = new CantUseValueOfVoidMethod(methodCall.getLine());
                methodCall.addError(exceptionv);
                return new NoType();
            }
            return ((FptrType)instance).getReturnType();
        }
        else{
            if(!(instance instanceof NoType)) {
                CallOnNoneCallable exception = new CallOnNoneCallable(methodCall.getLine());
                methodCall.addError(exception);
            }
            return new NoType();
        }
    }

    @Override
    public Type visit(Identifier identifier) {
        boolean check = false;
        try{
            ClassSymbolTableItem childSymbolTableItem = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + currentClassName.getClassName().getName(), true);
            SymbolTable childSymbolTable = childSymbolTableItem.getClassSymbolTable();
            MethodSymbolTableItem method = (MethodSymbolTableItem) childSymbolTable.getItem(MethodSymbolTableItem.START_KEY + currentMethodName.getMethodName().getName(), true);
            SymbolTable methodSymbolTable = method.getMethodSymbolTable();
            LocalVariableSymbolTableItem var = (LocalVariableSymbolTableItem) methodSymbolTable.getItem(LocalVariableSymbolTableItem.START_KEY + identifier.getName(), true);
            Validate(var.getType());
            int e = this.err;
            this.err = 0;
            if(e > 0)
                return new NoType();
            else
                check = true;
            return var.getType();
        }
        catch(ItemNotFoundException ex){
            VarNotDeclared exception = new VarNotDeclared(identifier.getLine(), identifier.getName());
            identifier.addError(exception);
            return new NoType();
        }
    }

    @Override
    public Type visit(ArrayAccessByIndex arrayAccessByIndex) {
        Type indexType = arrayAccessByIndex.getIndex().accept(this);
        Type instanceType = arrayAccessByIndex.getInstance().accept(this);

        if(!(indexType instanceof IntType || indexType instanceof NoType)){
            arrayAccessByIndex.addError(new ArrayIndexNotInt(arrayAccessByIndex.getLine()));
        }

        if(instanceType instanceof NoType)
            return new NoType();

        if(!(instanceType instanceof main.ast.types.array.ArrayType)){
            arrayAccessByIndex.addError(new AccessByIndexOnNoneArray(arrayAccessByIndex.getLine()));
            return new NoType();
        }
        else {
            if (indexType instanceof IntType)
                return ((main.ast.types.array.ArrayType) instanceType).getType();
            else
                return new NoType();
        }
    }

    @Override
    public Type visit(ObjectMemberAccess objectMemberAccess) {
        Type instance = objectMemberAccess.getInstance().accept(this);
        String name = objectMemberAccess.getMemberName().getName();
        if(instance instanceof NoType)
            return new NoType();

        if(instance instanceof ClassType){
            ClassType cls = (ClassType) instance;
            try {
                ClassSymbolTableItem classSymbolTableItem = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + cls.getClassName().getName(), true);
                FieldSymbolTableItem fieldSymbolTableItem = (FieldSymbolTableItem) classSymbolTableItem.getClassSymbolTable().getItem(FieldSymbolTableItem.START_KEY + name, true);
                Validate(fieldSymbolTableItem.getType());
                int e = this.err;
                this.err = 0;
                if (e > 0)
                    return new NoType();
                return fieldSymbolTableItem.getType();

            }
            catch(ItemNotFoundException exc){
                try{
                    ClassSymbolTableItem classSymbolTableItem = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + cls.getClassName().getName(), true);
                    MethodSymbolTableItem methodSymbolTableItem = (MethodSymbolTableItem) classSymbolTableItem.getClassSymbolTable().getItem(MethodSymbolTableItem.START_KEY + name, true);
                    this.lvalue = true;
                    return new FptrType(methodSymbolTableItem.getArgTypes(), methodSymbolTableItem.getReturnType());
                }
                catch (ItemNotFoundException ex){
                    if(cls.getClassName().getName().equals(name)) {
                        try {
                            ClassSymbolTableItem classSymbolTableItem = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + cls.getClassName().getName(), true);
                            ConstructorDeclaration constructor = classSymbolTableItem.getClassDeclaration().getConstructor();
                            if (constructor != null) {
                                ArrayList<Type> arr = new ArrayList<>();
                                for(ArgPair var: constructor.getArgs())
                                    arr.add(var.getVariableDeclaration().getType());
                                return new FptrType(arr, new NullType());
                            }
                            else{
                                ArrayList<Type> arr = new ArrayList<>();
                                return new FptrType(arr, new NullType());
                            }
                        }catch (ItemNotFoundException ecx){ }
                    }
                    else{
                        objectMemberAccess.addError(new MemberNotAvailableInClass(objectMemberAccess.getLine(), name, cls.getClassName().getName()));
                        return new NoType();
                    }
                }
            }
        }
        else{
            AccessOnNonClass exception = new AccessOnNonClass(objectMemberAccess.getLine());
            objectMemberAccess.addError(exception);
            return new NoType();
        }
        return new NoType();
    }

    @Override
    public Type visit(SetNew setNew) {
        boolean check = false;
        ArrayList<Expression> elements = setNew.getArgs();
        for(int i =0;i < elements.size();i ++){
            if(!(elements.get(i).accept(this) instanceof IntType)){
                setNew.addError(new NewInputNotSet(setNew.getLine()));
                return new NoType();
            }
        }
        return new NoType();

    }

    @Override
    public Type visit(SetInclude setInclude) {
        Expression element = setInclude.getElementArg();
        if(!(element.accept(this) instanceof IntType)){
            setInclude.addError(new SetIncludeInputNotInt(setInclude.getLine()));
            return new NoType();
        }
        return new NoType();
    }

    @Override
    public Type visit(RangeExpression rangeExpression) {
        Expression left = rangeExpression.getLeftExpression();
        Expression right = rangeExpression.getRightExpression();

        Type lt = left.accept(this);
        Type rt = right.accept(this);

        if(!(lt instanceof IntType) || !(rt instanceof IntType)){
            rangeExpression.addError(new EachRangeNotInt(rangeExpression.getLine()));
            return new NoType();
        }
        return new NoType();
    }

    @Override
    public Type visit(TernaryExpression ternaryExpression) {

       Expression cond = ternaryExpression.getCondition();
       Expression TrueE = ternaryExpression.getTrueExpression();
       Expression FalseE = ternaryExpression.getFalseExpression();

       Type ct = cond.accept(this);
       Type tt = TrueE.accept(this);
       Type ft = FalseE.accept(this);

       if(!(ct instanceof BoolType)){
           ternaryExpression.addError(new ConditionNotBool(ternaryExpression.getLine()));
           return new NoType();
       }
       else if((!(isSubType(tt, ft)))){
           ternaryExpression.addError(new UnsupportedOperandType(ternaryExpression.getLine(), "ternary"));
           return new NoType();
       }
       return new NoType();
    }

    @Override
    public Type visit(IntValue intValue) {
        this.lvalue = true;
        return new IntType();
    }

    @Override
    public Type visit(BoolValue boolValue) {
        this.lvalue = true;
        return new BoolType();
    }

    @Override
    public Type visit(SelfClass selfClass) {
        if(currentClassName != null){
            return new ClassType(currentClassName.getClassName());
        }
        else{
            return new NoType();
        }
    }
//checkd
    @Override
    public Type visit(SetValue setValue) {
        this.lvalue = true;
        return new SetType();
    }

    @Override
    public Type visit(NullValue nullValue) {
        this.lvalue = true;
        return new NullType();
    }

//checkd
    public boolean isSubType(Type a, Type b) {
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
        if ((a instanceof main.ast.types.array.ArrayType || a instanceof NullType) && b instanceof ArrayType){
            if (a instanceof NullType)
                return true;
            main.ast.types.array.ArrayType arrA = (main.ast.types.array.ArrayType) a;
            main.ast.types.array.ArrayType arrB = (main.ast.types.array.ArrayType) b;

            ArrayList<Expression> dimsA = arrA.getDimensions();
            ArrayList<Expression> dimsB = arrB.getDimensions();

            if(!(isSubType(arrA.getType(), arrB.getType()))){
                return false;
            }
            if(dimsA.size() != dimsB.size()){
                return false;
            }
            for(int i= 0;i < dimsA.size(); i++){
                IntValue da = (IntValue) dimsA.get(i);
                IntValue db = (IntValue) dimsB.get(i);
                if(da.getConstant() != db.getConstant())
                    return false;
            }

            return true;

        }
        if((a instanceof SetType || a instanceof NullType) && b instanceof SetType){
            if(a instanceof  NullType)
                return true;
        }
        return false;
    }

//check
    public void Validate(Type type){
        if(type instanceof ClassType){
            ClassType ctype = (ClassType)type;
            try{
                SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + ctype.getClassName().getName(), true);
            }
            catch (ItemNotFoundException exc){
                this.err++;
                return;
            }
        }

        else if(type instanceof FptrType){
            FptrType fptrType = (FptrType)type;
            for(Type arg: fptrType.getArgumentsTypes()){
                Validate(arg);
            }
            Validate(fptrType.getReturnType());
        }
    }
}