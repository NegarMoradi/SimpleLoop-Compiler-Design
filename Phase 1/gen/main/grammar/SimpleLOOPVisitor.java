// Generated from C:/Users/negar/OneDrive/Documents/UT/Term6/Compiler/1/src/main/grammar\SimpleLOOP.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleLOOPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleLOOPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#simpleLOOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleLOOP(SimpleLOOPParser.SimpleLOOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleLOOPParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#varDefSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefSection(SimpleLOOPParser.VarDefSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(SimpleLOOPParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#classVarDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVarDef(SimpleLOOPParser.ClassVarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(SimpleLOOPParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#identifierGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierGroup(SimpleLOOPParser.IdentifierGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#fptr_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFptr_type(SimpleLOOPParser.Fptr_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(SimpleLOOPParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#set_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_type(SimpleLOOPParser.Set_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#classSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSection(SimpleLOOPParser.ClassSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#classStatementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatementBlock(SimpleLOOPParser.ClassStatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#classScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassScope(SimpleLOOPParser.ClassScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(SimpleLOOPParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#initClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitClass(SimpleLOOPParser.InitClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(SimpleLOOPParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#mArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMArgument(SimpleLOOPParser.MArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#argVarDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgVarDef(SimpleLOOPParser.ArgVarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#argIdentifierGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgIdentifierGroup(SimpleLOOPParser.ArgIdentifierGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#mainStatementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatementBlock(SimpleLOOPParser.MainStatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(SimpleLOOPParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleLOOPParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SimpleLOOPParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SimpleLOOPParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#eachLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEachLoop(SimpleLOOPParser.EachLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(SimpleLOOPParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SimpleLOOPParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#commaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaExpression(SimpleLOOPParser.CommaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#commaExpressionL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaExpressionL(SimpleLOOPParser.CommaExpressionLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#assignExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(SimpleLOOPParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#ternaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(SimpleLOOPParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#ternaryExpressionL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpressionL(SimpleLOOPParser.TernaryExpressionLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(SimpleLOOPParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#logicalOrExpressionL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpressionL(SimpleLOOPParser.LogicalOrExpressionLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(SimpleLOOPParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#logicalAndExpressionL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpressionL(SimpleLOOPParser.LogicalAndExpressionLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(SimpleLOOPParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#equalityExpressionL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpressionL(SimpleLOOPParser.EqualityExpressionLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#relationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpression(SimpleLOOPParser.RelationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#relationExpressionL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpressionL(SimpleLOOPParser.RelationExpressionLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(SimpleLOOPParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#additiveExpressionL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpressionL(SimpleLOOPParser.AdditiveExpressionLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#multExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(SimpleLOOPParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#multExpressionL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpressionL(SimpleLOOPParser.MultExpressionLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(SimpleLOOPParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#incDecExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecExpression(SimpleLOOPParser.IncDecExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#incDecExpressionL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecExpressionL(SimpleLOOPParser.IncDecExpressionLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#memberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpression(SimpleLOOPParser.MemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#memberExpressionL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpressionL(SimpleLOOPParser.MemberExpressionLContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#specialExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialExpression(SimpleLOOPParser.SpecialExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#newFuncExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewFuncExpression(SimpleLOOPParser.NewFuncExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#valExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExpression(SimpleLOOPParser.ValExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(SimpleLOOPParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SimpleLOOPParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#setLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetLiteral(SimpleLOOPParser.SetLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(SimpleLOOPParser.BoolLiteralContext ctx);
}