package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.EachStmt;
import main.ast.types.NullType;
import main.ast.types.Type;
import main.ast.types.array.ArrayType;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.ClassType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.FieldSymbolTableItem;
import main.symbolTable.utils.graph.Graph;
import main.symbolTable.utils.stack.Stack;
import main.util.ArgPair;
import main.visitor.Visitor;
import main.visitor.typeChecker.ExpressionTypeChecker;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;

public class CodeGenerator extends Visitor<String> {
    ExpressionTypeChecker expressionTypeChecker;
    Graph<String> classHierarchy;
    private String outputPath;
    private FileWriter currentFile;
    private ClassDeclaration currentClass;
    private MethodDeclaration currentMethod;

    private String elsifNext;
    private ArrayList<String> elsifLabels;
    private ArrayList<VariableDeclaration> globalVar;
    private int dimensionLevel = 0;
    private Stack<String> startLoopLabel = new Stack<>();
    private Stack<String> endLoopLabel = new Stack<>();

    private int lastSlot = -1;
    private int lastLabel = 0;


    public CodeGenerator(Graph<String> classHierarchy) {
        this.globalVar = new ArrayList<>();
        this.classHierarchy = classHierarchy;
        this.expressionTypeChecker = new ExpressionTypeChecker(classHierarchy);
        this.prepareOutputFolder();
    }

    private void prepareOutputFolder() {
        this.outputPath = "output/";
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String arrayClassPath = "utilities/codeGenerationUtilityClasses/Array.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) {
            e.printStackTrace();
        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(arrayClassPath, this.outputPath + "Array.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");
    }

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createFile(String name) {
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(path);
            this.currentFile = fileWriter;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                this.currentFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                this.currentFile.write(command + "\n");
            else
                this.currentFile.write("\t\t" + command + "\n");
            this.currentFile.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addStaticMainMethod() {
        addCommand(".method public static main([Ljava/lang/String;)V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("new Main");
        addCommand("invokespecial Main/<init>()V");
        addCommand("return");
        addCommand(".end method");
    }

    private String newLabel() {
        String label = "Label_" + lastLabel;
        lastLabel++;
        return label;
    }

    private int slotOf(String identifier) {
        if (identifier.equals("")) {
            if (lastSlot == -1)
                lastSlot = currentMethod.getLocalVars().size() + currentMethod.getArgs().size();
            lastSlot++;
            return lastSlot;
        }

        int i = 1;
        for(VariableDeclaration variableDeclaration: globalVar){
            if(variableDeclaration.getVarName().getName().equals(identifier))
                return i;
            i++;
        }
        i =1;
        for (ArgPair arg : currentMethod.getArgs()) {
            if (arg.getVariableDeclaration().getVarName().getName().equals(identifier))
                return i;
            i++;
        }
        i = 1;
        for (VariableDeclaration localVar : currentMethod.getLocalVars()) {
            if (localVar.getVarName().getName().equals(identifier))
                return i;
            i++;
        }
        return 0;
    }

    private String checkcastType(Type t) {
        if (t instanceof IntType)
            return  "java/lang/Integer";
        else if (t instanceof BoolType)
            return "java/lang/Boolean";
        else if (t instanceof ArrayType)
            return "Array";
        else if (t instanceof FptrType)
            return "Fptr";
        else if (t instanceof ClassType)
            return ((ClassType) t).getClassName().getName();
        else if (t instanceof NullType)
            return "V";

        return null;
    }

    private String castToPrimitive(Type type) {
        if (type instanceof IntType)
            return  "invokevirtual java/lang/Integer/intValue()I";
        else if (type instanceof BoolType)
            return "invokevirtual java/lang/Boolean/booleanValue()Z";
        return null;
    }

    private String castToNonPrimitive(Type type) {
        if (type instanceof IntType)
            return  "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;";
        else if (type instanceof BoolType)
            return "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;";
        return null;
    }

    private String makeTypeSignature(Type t) {
        if (t instanceof IntType)
            return  "Ljava/lang/Integer;";
        else if (t instanceof BoolType)
            return "Ljava/lang/Boolean;";
        else if (t instanceof ArrayType)
            return "LArray;";
        else if (t instanceof FptrType)
            return "LFptr;";
        else if (t instanceof ClassType)
            return "L" + ((ClassType) t).getClassName().getName() + ";";
        else if (t instanceof NullType)
            return "V";

        return null;
    }

    private void addDefaultValueCommand(Type type) {
        if (type instanceof IntType) {
            addCommand("ldc 0");
            addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
        }
        else if (type instanceof BoolType) {
            addCommand("ldc 0");
            addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
        }
        else if(type instanceof ArrayType){
            while(((ArrayType) type).getDimensions().size() > dimensionLevel){
                addCommand("new Array");
                addCommand("dup");
                addCommand(((ArrayType) type).getDimensions().get(dimensionLevel++).accept(this));
            }
            addDefaultValueCommand(((ArrayType) type).getType());
            for(int i = 0; i < dimensionLevel; i++)
                addCommand("invokespecial Array/<init>(ILjava/lang/Object;)V");
        }
        else if (type instanceof FptrType) {
            addCommand("aconst_null");
        }
        else if (type instanceof ClassType) {
            addCommand("aconst_null");
        }
    }


    private void addDefaultConstructor() {
        String className = currentClass.getClassName().getName();
        addCommand(".method public <init>()V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("aload_0");
        if (currentClass.getParentClassName() != null) {
            addCommand("invokespecial " + currentClass.getParentClassName().getName() + "/<init>()V");
        }
        else {
            addCommand("invokespecial java/lang/Object/<init>()V");
        }
        for (FieldDeclaration field : currentClass.getFields()) {
            String fieldName = field.getVarDeclaration().getVarName().getName();
            Type fieldType = field.getVarDeclaration().getType();

            addCommand("aload_0");
            addDefaultValueCommand(fieldType);
            addCommand("putfield " + className + "/" + fieldName + " " + makeTypeSignature(fieldType));
        }
        addCommand("return");
        addCommand(".end method");
    }

    public VariableDeclaration getGlobals(Identifier identifier){
        for(VariableDeclaration variableDeclaration: globalVar )
            if(variableDeclaration.getVarName().getName().equals(identifier.getName()))
                return variableDeclaration;

        return null;
    }

    private void setSlotLabel(){
        lastSlot = -1;
        lastLabel = 0;
    }

    @Override
    public String visit(Program program) {
        //todo
        //generate new class for global variables
        //using .field, add global variables as static fields to the class
        if(program.getGlobalVariables().size()>0) {
            globalVar.addAll(program.getGlobalVariables());
            createFile("Global");
            addCommand(".class public Global");
            addCommand(".super java/lang/Object");
            ClassDeclaration GlobalClass = new ClassDeclaration(new Identifier("Global"));
            for (VariableDeclaration variableDeclaration : program.getGlobalVariables()) {
                addCommand(".field static " + variableDeclaration.getVarName().getName() + " " + makeTypeSignature(variableDeclaration.getType()));
                GlobalClass.addField(new FieldDeclaration(variableDeclaration, false));
            }
            addCommand(".method public <init>()V");
            addCommand(".limit stack 128");
            addCommand(".limit locals 128");
            addCommand("aload_0");
            addCommand("invokespecial java/lang/Object/<init>()V");
            for (VariableDeclaration variableDeclaration : program.getGlobalVariables()) {
                addCommand("aload_0");
                addDefaultValueCommand(variableDeclaration.getType());
                addCommand("putstatic Global/" + variableDeclaration.getVarName().getName() + " " + makeTypeSignature(variableDeclaration.getType()));
            }
            addCommand("return");
            addCommand(".end method");
        }

        for(ClassDeclaration classDeclaration : program.getClasses()) {
            this.expressionTypeChecker.setCurrentClass(classDeclaration);
            this.currentClass = classDeclaration;
            classDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ClassDeclaration classDeclaration) {
        String name = classDeclaration.getClassName().getName();
        createFile(name);
        addCommand(".class public " + name);
        if(classDeclaration.getParentClassName() == null)
            addCommand(".super java/lang/Object");
        else
            addCommand(".super " + classDeclaration.getParentClassName().getName());
        for(FieldDeclaration field: classDeclaration.getFields())
            addCommand(field.accept(this));
        setSlotLabel();
        if(classDeclaration.getConstructor() == null)
            addDefaultConstructor();
        else{
            currentMethod = classDeclaration.getConstructor();
            expressionTypeChecker.setCurrentMethod(currentMethod);
            classDeclaration.getConstructor().accept(this);
        }
        setSlotLabel();
        for(MethodDeclaration method: classDeclaration.getMethods()) {
            currentMethod = method;
            expressionTypeChecker.setCurrentMethod(currentMethod);
            method.accept(this);
        }
        setSlotLabel();
        return null;
    }

    @Override
    public String visit(ConstructorDeclaration constructorDeclaration) {
        if(constructorDeclaration.getArgs().size() > 0)
            addDefaultConstructor();
        if(currentClass.getClassName().getName().equals("Main"))
            addStaticMainMethod();
        this.visit((MethodDeclaration) constructorDeclaration);
        return null;
    }

    @Override
    public String visit(MethodDeclaration methodDeclaration) {
        String command = ".method public ";
        if(methodDeclaration instanceof ConstructorDeclaration)
            command += "<init>";
        else
            command += methodDeclaration.getMethodName().getName();
        command += "(";
        for (ArgPair arg : methodDeclaration.getArgs())
            command += makeTypeSignature(arg.getVariableDeclaration().getType());
        command += ")";
        command += makeTypeSignature(methodDeclaration.getReturnType());
        addCommand(command);
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        if(methodDeclaration instanceof ConstructorDeclaration) {
            addCommand("aload_0");
            if (currentClass.getParentClassName() == null)
                addCommand("invokespecial java/lang/Object/<init>()V");
            else
                addCommand("invokespecial " + currentClass.getParentClassName().getName() + "/<init>()V");

            for (FieldDeclaration field : currentClass.getFields()) {
                String fieldName = field.getVarDeclaration().getVarName().getName();
                Type fieldType = field.getVarDeclaration().getType();
                String name = currentClass.getClassName().getName();
                addCommand("aload_0");
                addDefaultValueCommand(fieldType);
                addCommand("putfield " + name + "/" + fieldName + " " + makeTypeSignature(fieldType));
            }
        }
        for (VariableDeclaration var : methodDeclaration.getLocalVars())
            var.accept(this);

        for (Statement statement : methodDeclaration.getBody())
            statement.accept(this);

        if (!methodDeclaration.getDoesReturn())
            addCommand("return");

        addCommand(".end method");
        return null;
    }

    @Override
    public String visit(FieldDeclaration fieldDeclaration) {
        return ".field " + fieldDeclaration.getVarDeclaration().getVarName().getName() + " " + makeTypeSignature(fieldDeclaration.getVarDeclaration().getType());
    }

    @Override
    public String visit(VariableDeclaration variableDeclaration) {
        addDefaultValueCommand(variableDeclaration.getType());
        //addCommand("astore " + slotOf(variableDeclaration.getVarName().getName()));
        if(variableDeclaration.getType() instanceof ArrayType)
            dimensionLevel = 0;

        VariableDeclaration globals = getGlobals(variableDeclaration.getVarName());
        if(globals == null)
            addCommand("astore " + slotOf(variableDeclaration.getVarName().getName()));
        else
            addCommand("putstatic Global/" + globals.getVarName().getName() + " " + makeTypeSignature(globals.getType()));
        return null;
    }

    @Override
    public String visit(AssignmentStmt assignmentStmt) {
        BinaryExpression assignmentExp = new BinaryExpression(assignmentStmt.getlValue(), assignmentStmt.getrValue(), BinaryOperator.assign);
        addCommand(";Assign Statement");
        addCommand(assignmentExp.accept(this));
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(BlockStmt blockStmt) {
        for(Statement statement : blockStmt.getStatements())
            statement.accept(this);
        return null;
    }

    @Override
    public String visit(ConditionalStmt conditionalStmt) {
        elsifLabels = new ArrayList<>();
        for(ElsifStmt stmt: conditionalStmt.getElsif())
            elsifLabels.add(newLabel());

        String command = "; If statement " + conditionalStmt.getLine();
        addCommand(command);
        addCommand(conditionalStmt.getCondition().accept(this));
        String elseLabel = newLabel();
        if(elsifLabels.size() > 0)
            addCommand("ifeq " + elsifLabels.get(0));
        else
            addCommand("ifeq " + elseLabel);

        conditionalStmt.getThenBody().accept(this);
        String afterLabel = newLabel();
        addCommand("goto " + afterLabel);
        int index = 0;
        for(ElsifStmt elsif: conditionalStmt.getElsif()){
            if(index < elsifLabels.size() - 1)
                elsifNext = elsifLabels.get(index+1);
            else
                elsifNext = elseLabel;
            addCommand(elsifLabels.get(index) + ":");
            elsif.accept(this);
            addCommand("goto " +  afterLabel);
            index += 1;
        }
        addCommand(elseLabel + ":");
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        addCommand(afterLabel + ":");
        return null;
    }

    @Override
    public String visit(ElsifStmt elsifStmt) {
        String command = elsifStmt.getCondition().accept(this);
        addCommand(command);
        addCommand("ifeq " + elsifNext);
        elsifStmt.getThenBody().accept(this);
        return null;
    }

    @Override
    public String visit(MethodCallStmt methodCallStmt) {
        methodCallStmt.getMethodCall().accept(expressionTypeChecker);
        expressionTypeChecker.setIsInMethodCallStmt(true);
        addCommand(methodCallStmt.getMethodCall().accept(this));
        expressionTypeChecker.setIsInMethodCallStmt(false);
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(PrintStmt print) {
        Type type = print.getArg().accept(expressionTypeChecker);
        addCommand("; Print Statement " + print.getLine());
        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
        addCommand(print.getArg().accept(this));
        String argType;
        if (type instanceof IntType)
            argType = "I";
        else if (type instanceof BoolType)
            argType = "Z";
        else
            argType = "Ljava/lang/String;";

        addCommand("invokevirtual java/io/PrintStream/println(" + argType + ")V");
        return null;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        Type type = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        if(type instanceof NullType)
            addCommand("return");
        else {
            addCommand(returnStmt.getReturnedExpr().accept(this));
            if (type instanceof IntType)
                addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
            else if (type instanceof BoolType)
                addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
            addCommand("areturn");
        }
        return null;
    }

    @Override
    public String visit(EachStmt eachStmt) {
        String cont = newLabel();
        String brk = newLabel();
        String rest = newLabel();
        Integer slot = slotOf("");
        addCommand("ldc 0");
        addCommand("istore " + slot.toString());
        addCommand(rest + ":");
        addCommand("iload " + slot.toString());
        String eachList = eachStmt.getList().accept(this);
        addCommand(eachList);
        addCommand("getfield Array/elements Ljava/util/ArrayList;");
        addCommand("invokevirtual java/util/ArrayList/size()I");
        addCommand("if_icmpge " + brk );
        String eachCheckList = eachStmt.getList().accept(this);
        addCommand(eachCheckList);
        addCommand("iload " + slot.toString());
        addCommand("invokevirtual Array/getElement(I)Ljava/lang/Object;");
        Type t = ((ArrayType) eachStmt.getList().accept(expressionTypeChecker)).getType();
        addCommand("checkcast " + checkcastType(t));
        addCommand("astore " + slotOf(eachStmt.getVariable().getName()));
        if(eachStmt.getBody() !=  null)
            eachStmt.getBody().accept(this);
        addCommand(cont + ":");
        addCommand("iload " + slot.toString());
        addCommand("ldc 1");
        addCommand("iadd");
        addCommand("istore " + slot.toString());
        addCommand("goto " + rest);
        addCommand(brk + ":");
        return null;

    }

    @Override
    public String visit(TernaryExpression ternaryExpression) {
        String command = "";
        command += ternaryExpression.getCondition().accept(this);
        String breakLabel = newLabel();
        String afterLabel = newLabel();
        command += "\nifeq " + breakLabel;
        command += "\n" + ternaryExpression.getTrueExpression().accept(this);
        command += "\ngoto " + afterLabel;
        command += "\n" + breakLabel + ":";
        command += "\n" + ternaryExpression.getFalseExpression().accept(this);
        command += "\n" + afterLabel + ":";
        return command;
    }

    @Override
    public String visit(RangeExpression rangeExpression) {
        String  commands = "";
        commands += "new Array\n";
        commands += "dup\n";
        String rangeLeft = rangeExpression.getLeftExpression().accept(this);
        String rangeRight = rangeExpression.getRightExpression().accept(this);
        commands += rangeLeft + rangeRight + "\n";
        commands += "invokespecial Array/<init>(II)V\n";
        return commands;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        String commands = "";

        String FirstOp = binaryExpression.getFirstOperand().accept(this);
        String SecOp =  binaryExpression.getSecondOperand().accept(this);
        commands += FirstOp + "\n" + SecOp;
        if (operator == BinaryOperator.add)
            commands += "\niadd";
        else if (operator == BinaryOperator.sub)
            commands += "\nisub";
        else if (operator == BinaryOperator.mult)
            commands += "\nimul";
        else if (operator == BinaryOperator.div)
            commands += "\nidiv";


        else if((operator == BinaryOperator.gt) || (operator == BinaryOperator.lt)) {
            String trueLabel = newLabel();
            String afterLabel = newLabel();
            if (operator == BinaryOperator.gt)
                commands += "\nif_icmpgt " + trueLabel + " ; binary gt";
            else
                commands += "\nif_icmplt " + trueLabel + " ; binary lt";
            commands += "\nldc 0";
            commands += "\ngoto " + afterLabel;
            commands += "\n" + trueLabel + ":";
            commands += "\nldc 1";
            commands += "\n" + afterLabel + ":";
        }
        else if((operator == BinaryOperator.eq)) {
            String trueLabel = newLabel();
            String afterLabel = newLabel();
            String cmpCommand = "if_a";
            Type type = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
            if (type instanceof IntType || type instanceof BoolType)
                cmpCommand = "if_i";

            if (operator == BinaryOperator.eq)
                commands += "\n" + cmpCommand + "cmpeq "  + trueLabel + " ; binary eq";
            else
                commands += "\n" + cmpCommand + "cmpne "  + trueLabel + " ; binary neq";

            commands += "\nldc 0";
            commands += "\ngoto " + afterLabel;
            commands += "\n" + trueLabel + ":";
            commands += "\nldc 1";
            commands += "\n" + afterLabel + ":";

        }
        else if(operator == BinaryOperator.and) {
            String shortCircuitLabel = newLabel();
            String trueLabel = newLabel();
            String afterLabel = newLabel();
            String andFirstOp = binaryExpression.getFirstOperand().accept(this);
            String andSecOp = binaryExpression.getSecondOperand().accept(this);
            commands = "; logical AND\n";
            commands += andFirstOp + "\nifeq " + shortCircuitLabel;
            commands += "\n" + andSecOp;
            commands += "\nifne " + trueLabel;
            commands += "\n" + shortCircuitLabel + ":";
            commands += "\nldc 0";
            commands += "\ngoto " + afterLabel;
            commands += "\n" + trueLabel + ":";
            commands += "\nldc 1";
            commands += "\n" + afterLabel + ":";

        }
        else if(operator == BinaryOperator.or) {
            String trueLabel = newLabel();
            String afterLabel = newLabel();
            String orFirstOp = binaryExpression.getFirstOperand().accept(this);
            String orSecOp = binaryExpression.getFirstOperand().accept(this);
            commands = "; logical OR\n";
            commands += orFirstOp;
            commands += "\nifne " + trueLabel + "\n" + orSecOp;
            commands += "\nifne " + trueLabel;
            commands += "\nldc 0";
            commands += "\ngoto " + afterLabel;
            commands += "\n" + trueLabel + ":";
            commands += "\nldc 1";
            commands += "\n" + afterLabel + ":";
        }
        else if(operator == BinaryOperator.assign) {
            commands = "";
            Type firstType = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
            Type secondType = binaryExpression.getSecondOperand().accept(expressionTypeChecker);
            String secondOperandCommands = binaryExpression.getSecondOperand().accept(this);
            if(firstType instanceof ArrayType) {
                //check
                secondOperandCommands = "new Array\ndup\n" + secondOperandCommands;
                secondOperandCommands += "\ninvokespecial Array/<init>(LArray;)V";
            }
            if(binaryExpression.getFirstOperand() instanceof Identifier) {
                String name = ((Identifier) binaryExpression.getFirstOperand()).getName();
                commands += secondOperandCommands;
                commands += "\ndup ; keep value on stack";
                String castCmd = castToNonPrimitive(secondType);
                if (castCmd != null)
                    commands += "\n" + castCmd;
                VariableDeclaration globalv = getGlobals(((Identifier) ((Identifier) binaryExpression.getFirstOperand())));
                if(globalv == null)
                    commands += "\nastore " + slotOf(name);
                else
                    commands += "\nputstatic Global/" + name + " " + makeTypeSignature(globalv.getType());
            }

//check
            else if(binaryExpression.getFirstOperand() instanceof ArrayAccessByIndex) {
                int tempSlot = slotOf("");
                ArrayAccessByIndex arrayAccessByIndex = (ArrayAccessByIndex) binaryExpression.getFirstOperand();
                String arrayInstance = arrayAccessByIndex.getInstance().accept(this);
                String arrayIndex = arrayAccessByIndex.getIndex().accept(this);
                commands += arrayInstance;
                commands += "\ndup ";
                commands += "\n" + arrayIndex;
                commands += "\ndup ";
                commands += "\nistore " + tempSlot;
                commands += "\n" + secondOperandCommands;
                String castCmd = castToNonPrimitive(secondType);
                if (castCmd != null)
                    commands += "\n" + castCmd;
                commands += "\n" + "invokevirtual Array/setElement(ILjava/lang/Object;)V";
                commands += "\niload " + tempSlot;
                commands += "\n" + "invokevirtual Array/getElement(I)Ljava/lang/Object;";
                commands += "\ncheckcast " + checkcastType(secondType);
                castCmd = castToPrimitive(secondType);
                if (castCmd != null)
                    commands += "\n" + castCmd;

            }
            else if(binaryExpression.getFirstOperand() instanceof ObjectMemberAccess) {
                Expression instance = ((ObjectMemberAccess) binaryExpression.getFirstOperand()).getInstance();
                Type memberType = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
                String memberName = ((ObjectMemberAccess) binaryExpression.getFirstOperand()).getMemberName().getName();
                Type instanceType = instance.accept(expressionTypeChecker);
                if(instanceType instanceof ArrayType) {
                    //checkd
                    ArrayType arrayType = (ArrayType) instanceType;
                    commands += instance.accept(this);
                    commands += "\ndup";
                    commands += "\nldc 0" ;
                    commands += "\n" + secondOperandCommands;
                    String castCmd = castToNonPrimitive(secondType);
                    if (castCmd != null)
                        commands += "\n" + castCmd;
                    commands += "\ninvokevirtual Array/setElement(ILjava/lang/Object;)V";
                    commands += "\nldc 0";
                    commands += "\ninvokevirtual Array/getElement(I)Ljava/lang/Object; ; putting back on stack";
                    commands += "\ncheckcast " + checkcastType(secondType);
                    castCmd = castToPrimitive(secondType);
                    if (castCmd != null)
                        commands += "\n" + castCmd;

                   }
                else if(instanceType instanceof ClassType) {
                    commands += instance.accept(this);
                    commands += "\ndup ; to getfield for putting back on stack";
                    commands += "\n" + secondOperandCommands;
                    String castCmd = castToNonPrimitive(secondType);
                    if (castCmd != null)
                        commands += "\n" + castCmd;
                    commands += "\nputfield " + ((ClassType) instanceType).getClassName().getName()
                            + "/" + memberName + " " + makeTypeSignature(secondType);
                    commands += "\ngetfield " + ((ClassType) instanceType).getClassName().getName()
                            + "/" + memberName + " " + makeTypeSignature(secondType) + " ; for putting assign on stack ";
                    castCmd = castToPrimitive(secondType);
                    if (castCmd != null)
                        commands += "\n" + castCmd;
                }
            }
        }
        return commands;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        UnaryOperator operator = unaryExpression.getOperator();
        String commands = "";
        String UOp = unaryExpression.getOperand().accept(this);
        commands += UOp;
        if(operator == UnaryOperator.minus)
            commands += "\nineg";

        else if(operator == UnaryOperator.not) {
            String trueLabel = newLabel();
            String afterLabel = newLabel();
            commands += "\nifne " + trueLabel + " ; not command";
            commands += "\nldc 1";
            commands += "\ngoto " + afterLabel;
            commands += "\n" + trueLabel + ":";
            commands += "\nldc 0";
            commands += "\n" + afterLabel + ":";
        }

        else if((operator == UnaryOperator.postdec) || (operator == UnaryOperator.postinc)) {
            commands += "\ndup ; keep old on stack";
            commands += "\nldc 1 ; Unary post";
            if (operator == UnaryOperator.postinc)
                commands += "\niadd";
            else
                commands += "\nisub";

            if(unaryExpression.getOperand() instanceof Identifier) {
                int slot = slotOf(((Identifier) unaryExpression.getOperand()).getName());
                commands += "\n" + castToNonPrimitive(new IntType());
                VariableDeclaration globalv = getGlobals(((Identifier) unaryExpression.getOperand()));
                if(globalv == null)
                    commands += "\nastore " + slot;
                else
                    commands += "\nputstatic Global/" + ((Identifier) unaryExpression.getOperand()).getName() + " " + makeTypeSignature(globalv.getType());
            }
            else if(unaryExpression.getOperand() instanceof ArrayAccessByIndex) {
                //check
                int tmpSlot = slotOf("");
                commands += "\n" + castToNonPrimitive(new IntType());
                commands += "\nastore " + tmpSlot;
                String UgetIns = ((ArrayAccessByIndex) unaryExpression.getOperand()).getInstance().accept(this);
                String UgetInd = ((ArrayAccessByIndex) unaryExpression.getOperand()).getIndex().accept(this);
                commands += "\n" + UgetIns;
                commands += "\n" + UgetInd;
                commands += "\naload " + tmpSlot;
                commands += "\n" + "invokevirtual Array/setElement(ILjava/lang/Object;)V";
            }
            else if(unaryExpression.getOperand() instanceof ObjectMemberAccess) {
                Expression instance = ((ObjectMemberAccess) unaryExpression.getOperand()).getInstance();
                Type memberType = unaryExpression.getOperand().accept(expressionTypeChecker);
                String memberName = ((ObjectMemberAccess) unaryExpression.getOperand()).getMemberName().getName();
                Type instanceType = instance.accept(expressionTypeChecker);
                if(instanceType instanceof ArrayType) {
                    //check
                    int tmpSlot = slotOf("");
                    commands += "\n" + castToNonPrimitive(new IntType());
                    commands += "\nastore " + tmpSlot;
                    commands += "\n" + instance.accept(this);
                    commands += "\nldc 0";
                    commands += "\naload " + tmpSlot;
                    commands += "\n" + "invokevirtual List/setElement(ILjava/lang/Object;)V";
                }
                else if(instanceType instanceof ClassType) {
                    int tmpSlot = slotOf("");
                    commands += "\n" + castToNonPrimitive(new IntType());
                    commands += "\nastore " + tmpSlot;
                    commands += "\n" + instance.accept(this);
                    commands += "\naload " + tmpSlot;
                    commands += "\nputfield " + ((ClassType) instanceType).getClassName().getName()
                            + "/" + memberName + " " + makeTypeSignature(new IntType());
                }
            }
        }
        return commands;
    }

    @Override
    public String visit(ObjectMemberAccess objectMemberAccess) {

        Type memberType = objectMemberAccess.accept(expressionTypeChecker);
        Type instanceType = objectMemberAccess.getInstance().accept(expressionTypeChecker);
        String memberName = objectMemberAccess.getMemberName().getName();
        String commands = "";

        if(instanceType instanceof ClassType) {
            String className = ((ClassType) instanceType).getClassName().getName();
            try {
                SymbolTable classSymbolTable = ((ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + className, true)).getClassSymbolTable();
                try {
                    classSymbolTable.getItem(FieldSymbolTableItem.START_KEY + memberName, true);
                    commands += objectMemberAccess.getInstance().accept(this) + " ; object field access";
                    commands += "\ngetfield " + className + "/" + memberName + " " + makeTypeSignature(memberType);
                    String castCmd = castToPrimitive(memberType);
                    if (castCmd != null)
                        commands += "\n" + castCmd;
                } catch (ItemNotFoundException memberIsMethod) {
                    commands += "\nnew Fptr" + " ;object method access\ndup";
                    commands += "\n" + objectMemberAccess.getInstance().accept(this);
                    commands += "\nldc \"" + memberName + "\"";
                    commands += "\ninvokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V";
                }
            } catch (ItemNotFoundException classNotFound) {
            }
        }
        return commands;
    }

    @Override
    public String visit(Identifier identifier) {
        //global
        String commands = "";
        VariableDeclaration globalVar = getGlobals(identifier);
        if(globalVar != null){
            commands += "getstatic Global/" + identifier.getName() + " " + makeTypeSignature(globalVar.getType());
        }
        else{
            int slot = slotOf(identifier.getName());
            commands += "aload " + String.valueOf(slot);
        }

        Type type = identifier.accept(expressionTypeChecker);
        String castCmd = castToPrimitive(type);
        if (castCmd != null)
            commands += "\n" + castCmd;
        return commands;
    }

    @Override
    public String visit(ArrayAccessByIndex arrayAccessByIndex) {
        String commands = "";
        Type elementType = arrayAccessByIndex.accept(expressionTypeChecker);
        String arInst = arrayAccessByIndex.getInstance().accept(this);
        String arInd = arrayAccessByIndex.getIndex().accept(this);
        commands += arInst + "\n" + arInd;
        commands += "\ninvokevirtual Array/getElement(I)Ljava/lang/Object;";
        commands += "\ncheckcast " + checkcastType(elementType);
        String castCmd = castToPrimitive(elementType);
        if (castCmd != null)
            commands += "\n" + castCmd;

        return commands;
    }

    //default
    @Override
    public String visit(MethodCall methodCall) {

        //check def
        String commands = "";
        Type retType = methodCall.accept(expressionTypeChecker);
        commands += methodCall.getInstance().accept(this) + " ;methodCall";
        commands += "\nnew java/util/ArrayList\ndup\ninvokespecial java/util/ArrayList/<init>()V";
        for (Expression arg : methodCall.getArgs()) {
            commands += "\ndup\n" + arg.accept(this);
            Type type = arg.accept(expressionTypeChecker);
            String castCmd = castToNonPrimitive(type);
            if (castCmd != null)
                commands += "\n" + castCmd;
            commands += "\ninvokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\npop";
        }
        commands += "\ninvokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;";

        if (!(retType instanceof NullType))
            commands += "\ncheckcast " + checkcastType(retType);
        if (retType instanceof IntType)
            commands +=  "\ninvokevirtual java/lang/Integer/intValue()I";
        else if (retType instanceof BoolType)
            commands += "\ninvokevirtual java/lang/Boolean/booleanValue()Z";

        return commands;
    }

    //default
    @Override
    public String visit(NewClassInstance newClassInstance) {
        String commands = "";
        String className = newClassInstance.getClassType().getClassName().getName();
        commands += "new " + className + "\ndup";
        for (Expression arg : newClassInstance.getArgs()) {
            commands += "\n" + arg.accept(this);
            Type type = arg.accept(expressionTypeChecker);
            String castCmd = castToNonPrimitive(type);
            if (castCmd != null)
                commands += "\n" + castCmd;
        }
        commands += "\ninvokespecial " + className + "/<init>(";
        for (Expression arg : newClassInstance.getArgs())
            commands += makeTypeSignature(arg.accept(expressionTypeChecker));;

        commands += ")V";
        return commands;
    }

    @Override
    public String visit(SelfClass selfClass) {
        String commands = "aload_0";
        return commands;
    }

    @Override
    public String visit(NullValue nullValue) {
        String commands = "";
        commands += "aconst_null\n";
        return commands;
    }

    @Override
    public String visit(IntValue intValue) {
        String commands = "";
        commands += "ldc " + intValue.getConstant() + "\n";
        return commands;
    }

    @Override
    public String visit(BoolValue boolValue) {
        String commands = "";
        if(boolValue.getConstant())
            commands += "ldc 1\n";
        else
            commands += "ldc 0\n";
        return commands;
    }

}
