// Generated from C:/Users/negar/OneDrive/Documents/UT/Term6/Compiler/1/src/main/grammar\SimpleLOOP.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLOOPParser}.
 */
public interface SimpleLOOPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#simpleLOOP}.
	 * @param ctx the parse tree
	 */
	void enterSimpleLOOP(SimpleLOOPParser.SimpleLOOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#simpleLOOP}.
	 * @param ctx the parse tree
	 */
	void exitSimpleLOOP(SimpleLOOPParser.SimpleLOOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleLOOPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleLOOPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#varDefSection}.
	 * @param ctx the parse tree
	 */
	void enterVarDefSection(SimpleLOOPParser.VarDefSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#varDefSection}.
	 * @param ctx the parse tree
	 */
	void exitVarDefSection(SimpleLOOPParser.VarDefSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(SimpleLOOPParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(SimpleLOOPParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#classVarDef}.
	 * @param ctx the parse tree
	 */
	void enterClassVarDef(SimpleLOOPParser.ClassVarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#classVarDef}.
	 * @param ctx the parse tree
	 */
	void exitClassVarDef(SimpleLOOPParser.ClassVarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(SimpleLOOPParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(SimpleLOOPParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#identifierGroup}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierGroup(SimpleLOOPParser.IdentifierGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#identifierGroup}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierGroup(SimpleLOOPParser.IdentifierGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#fptr_type}.
	 * @param ctx the parse tree
	 */
	void enterFptr_type(SimpleLOOPParser.Fptr_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#fptr_type}.
	 * @param ctx the parse tree
	 */
	void exitFptr_type(SimpleLOOPParser.Fptr_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(SimpleLOOPParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(SimpleLOOPParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#set_type}.
	 * @param ctx the parse tree
	 */
	void enterSet_type(SimpleLOOPParser.Set_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#set_type}.
	 * @param ctx the parse tree
	 */
	void exitSet_type(SimpleLOOPParser.Set_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#classSection}.
	 * @param ctx the parse tree
	 */
	void enterClassSection(SimpleLOOPParser.ClassSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#classSection}.
	 * @param ctx the parse tree
	 */
	void exitClassSection(SimpleLOOPParser.ClassSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#classStatementBlock}.
	 * @param ctx the parse tree
	 */
	void enterClassStatementBlock(SimpleLOOPParser.ClassStatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#classStatementBlock}.
	 * @param ctx the parse tree
	 */
	void exitClassStatementBlock(SimpleLOOPParser.ClassStatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#classScope}.
	 * @param ctx the parse tree
	 */
	void enterClassScope(SimpleLOOPParser.ClassScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#classScope}.
	 * @param ctx the parse tree
	 */
	void exitClassScope(SimpleLOOPParser.ClassScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(SimpleLOOPParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(SimpleLOOPParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#initClass}.
	 * @param ctx the parse tree
	 */
	void enterInitClass(SimpleLOOPParser.InitClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#initClass}.
	 * @param ctx the parse tree
	 */
	void exitInitClass(SimpleLOOPParser.InitClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(SimpleLOOPParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(SimpleLOOPParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#mArgument}.
	 * @param ctx the parse tree
	 */
	void enterMArgument(SimpleLOOPParser.MArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#mArgument}.
	 * @param ctx the parse tree
	 */
	void exitMArgument(SimpleLOOPParser.MArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#argVarDef}.
	 * @param ctx the parse tree
	 */
	void enterArgVarDef(SimpleLOOPParser.ArgVarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#argVarDef}.
	 * @param ctx the parse tree
	 */
	void exitArgVarDef(SimpleLOOPParser.ArgVarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#argIdentifierGroup}.
	 * @param ctx the parse tree
	 */
	void enterArgIdentifierGroup(SimpleLOOPParser.ArgIdentifierGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#argIdentifierGroup}.
	 * @param ctx the parse tree
	 */
	void exitArgIdentifierGroup(SimpleLOOPParser.ArgIdentifierGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#mainStatementBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainStatementBlock(SimpleLOOPParser.MainStatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#mainStatementBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainStatementBlock(SimpleLOOPParser.MainStatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(SimpleLOOPParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(SimpleLOOPParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleLOOPParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleLOOPParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SimpleLOOPParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SimpleLOOPParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SimpleLOOPParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SimpleLOOPParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#eachLoop}.
	 * @param ctx the parse tree
	 */
	void enterEachLoop(SimpleLOOPParser.EachLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#eachLoop}.
	 * @param ctx the parse tree
	 */
	void exitEachLoop(SimpleLOOPParser.EachLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(SimpleLOOPParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(SimpleLOOPParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SimpleLOOPParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SimpleLOOPParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#commaExpression}.
	 * @param ctx the parse tree
	 */
	void enterCommaExpression(SimpleLOOPParser.CommaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#commaExpression}.
	 * @param ctx the parse tree
	 */
	void exitCommaExpression(SimpleLOOPParser.CommaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#commaExpressionL}.
	 * @param ctx the parse tree
	 */
	void enterCommaExpressionL(SimpleLOOPParser.CommaExpressionLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#commaExpressionL}.
	 * @param ctx the parse tree
	 */
	void exitCommaExpressionL(SimpleLOOPParser.CommaExpressionLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(SimpleLOOPParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(SimpleLOOPParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(SimpleLOOPParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(SimpleLOOPParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#ternaryExpressionL}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpressionL(SimpleLOOPParser.TernaryExpressionLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#ternaryExpressionL}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpressionL(SimpleLOOPParser.TernaryExpressionLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(SimpleLOOPParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(SimpleLOOPParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#logicalOrExpressionL}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpressionL(SimpleLOOPParser.LogicalOrExpressionLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#logicalOrExpressionL}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpressionL(SimpleLOOPParser.LogicalOrExpressionLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(SimpleLOOPParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(SimpleLOOPParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#logicalAndExpressionL}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpressionL(SimpleLOOPParser.LogicalAndExpressionLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#logicalAndExpressionL}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpressionL(SimpleLOOPParser.LogicalAndExpressionLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(SimpleLOOPParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(SimpleLOOPParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#equalityExpressionL}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpressionL(SimpleLOOPParser.EqualityExpressionLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#equalityExpressionL}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpressionL(SimpleLOOPParser.EqualityExpressionLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#relationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpression(SimpleLOOPParser.RelationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#relationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpression(SimpleLOOPParser.RelationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#relationExpressionL}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpressionL(SimpleLOOPParser.RelationExpressionLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#relationExpressionL}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpressionL(SimpleLOOPParser.RelationExpressionLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SimpleLOOPParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SimpleLOOPParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#additiveExpressionL}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpressionL(SimpleLOOPParser.AdditiveExpressionLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#additiveExpressionL}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpressionL(SimpleLOOPParser.AdditiveExpressionLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(SimpleLOOPParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(SimpleLOOPParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#multExpressionL}.
	 * @param ctx the parse tree
	 */
	void enterMultExpressionL(SimpleLOOPParser.MultExpressionLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#multExpressionL}.
	 * @param ctx the parse tree
	 */
	void exitMultExpressionL(SimpleLOOPParser.MultExpressionLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SimpleLOOPParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SimpleLOOPParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#incDecExpression}.
	 * @param ctx the parse tree
	 */
	void enterIncDecExpression(SimpleLOOPParser.IncDecExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#incDecExpression}.
	 * @param ctx the parse tree
	 */
	void exitIncDecExpression(SimpleLOOPParser.IncDecExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#incDecExpressionL}.
	 * @param ctx the parse tree
	 */
	void enterIncDecExpressionL(SimpleLOOPParser.IncDecExpressionLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#incDecExpressionL}.
	 * @param ctx the parse tree
	 */
	void exitIncDecExpressionL(SimpleLOOPParser.IncDecExpressionLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#memberExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpression(SimpleLOOPParser.MemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#memberExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpression(SimpleLOOPParser.MemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#memberExpressionL}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpressionL(SimpleLOOPParser.MemberExpressionLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#memberExpressionL}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpressionL(SimpleLOOPParser.MemberExpressionLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#specialExpression}.
	 * @param ctx the parse tree
	 */
	void enterSpecialExpression(SimpleLOOPParser.SpecialExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#specialExpression}.
	 * @param ctx the parse tree
	 */
	void exitSpecialExpression(SimpleLOOPParser.SpecialExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#newFuncExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewFuncExpression(SimpleLOOPParser.NewFuncExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#newFuncExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewFuncExpression(SimpleLOOPParser.NewFuncExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#valExpression}.
	 * @param ctx the parse tree
	 */
	void enterValExpression(SimpleLOOPParser.ValExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#valExpression}.
	 * @param ctx the parse tree
	 */
	void exitValExpression(SimpleLOOPParser.ValExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(SimpleLOOPParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(SimpleLOOPParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SimpleLOOPParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SimpleLOOPParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#setLiteral}.
	 * @param ctx the parse tree
	 */
	void enterSetLiteral(SimpleLOOPParser.SetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#setLiteral}.
	 * @param ctx the parse tree
	 */
	void exitSetLiteral(SimpleLOOPParser.SetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(SimpleLOOPParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(SimpleLOOPParser.BoolLiteralContext ctx);
}