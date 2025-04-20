package main.visitor.name;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.compileError.nameError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.*;
import main.visitor.Visitor;

public class NameCollector extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        SymbolTable.push(new SymbolTable());
        SymbolTable.root = SymbolTable.top;
        for (VariableDeclaration variableDeclaration : program.getGlobalVariables()){
            try {
                SymbolTable.top.put(new GlobalVariableSymbolTableItem(variableDeclaration));
                SymbolTable.top.put(new LocalVariableSymbolTableItem(variableDeclaration));
            } catch (ItemAlreadyExistsException e) {
                GlobalVarRedefinition exception = new GlobalVarRedefinition(variableDeclaration.getLine(), variableDeclaration.getVarName().getName());
                variableDeclaration.addError(exception);
            }
        }
        for(ClassDeclaration classDeclaration : program.getClasses()) {
            classDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        ClassSymbolTableItem classSymbolTableItem = new ClassSymbolTableItem(classDeclaration);
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        classSymbolTableItem.setClassSymbolTable(SymbolTable.top);
        try {
            SymbolTable.root.put(classSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            ClassRedefinition exception = new ClassRedefinition(classDeclaration.getLine(), classDeclaration.getClassName().getName());
            classDeclaration.addError(exception);
        }
        for(FieldDeclaration fieldDeclaration : classDeclaration.getFields()) {
            fieldDeclaration.accept(this);
        }
        if(classDeclaration.getConstructor() != null) {
            classDeclaration.getConstructor().accept(this);
        }
        for(MethodDeclaration methodDeclaration : classDeclaration.getMethods()) {
            methodDeclaration.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        this.visit((MethodDeclaration) constructorDeclaration);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        MethodSymbolTableItem methodSymbolTableItem = new MethodSymbolTableItem(methodDeclaration);
        SymbolTable methodSymbolTable = new SymbolTable(SymbolTable.top);
        methodSymbolTableItem.setMethodSymbolTable(methodSymbolTable);
        try {
            SymbolTable.top.put(methodSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            MethodRedefinition exception = new MethodRedefinition(methodDeclaration.getLine(), methodDeclaration.getMethodName().getName());
            methodDeclaration.addError(exception);
        }
        SymbolTable.push(methodSymbolTable);
        for(VariableDeclaration varDeclaration : methodDeclaration.getArgs()) {
            try{
                SymbolTable.root.getItem(LocalVariableSymbolTableItem.START_KEY + varDeclaration.getVarName().getName(), true);
                LocalVarConflictWithGlobalVar exception = new LocalVarConflictWithGlobalVar(varDeclaration.getLine(), varDeclaration.getVarName().getName());
                varDeclaration.addError(exception);
            } catch (ItemNotFoundException ignored) {
                varDeclaration.accept(this);
            }

        }
        for(VariableDeclaration varDeclaration : methodDeclaration.getLocalVars()) {
            try{
                SymbolTable.root.getItem(LocalVariableSymbolTableItem.START_KEY + varDeclaration.getVarName().getName(), true);
                LocalVarConflictWithGlobalVar exception = new LocalVarConflictWithGlobalVar(varDeclaration.getLine(), varDeclaration.getVarName().getName());
                varDeclaration.addError(exception);
            } catch (ItemNotFoundException ignored) {
                varDeclaration.accept(this);
            }
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        try {
            SymbolTable.top.put(new FieldSymbolTableItem(fieldDeclaration));
        } catch (ItemAlreadyExistsException e) {
            FieldRedefinition exception = new FieldRedefinition(fieldDeclaration.getLine(), fieldDeclaration.getVarDeclaration().getVarName().getName());
            fieldDeclaration.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {

        try {
            SymbolTable.top.put(new LocalVariableSymbolTableItem(varDeclaration));
        } catch (ItemAlreadyExistsException e) {
            LocalVarRedefinition exception = new LocalVarRedefinition(varDeclaration.getLine(), varDeclaration.getVarName().getName());
            varDeclaration.addError(exception);
        }
        return null;
    }
}
