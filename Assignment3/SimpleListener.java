// Generated from Simple.g4 by ANTLR 4.4

import java.util.TreeMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(@NotNull SimpleParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(@NotNull SimpleParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull SimpleParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull SimpleParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(@NotNull SimpleParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(@NotNull SimpleParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull SimpleParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull SimpleParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull SimpleParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull SimpleParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull SimpleParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull SimpleParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull SimpleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull SimpleParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull SimpleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull SimpleParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull SimpleParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull SimpleParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(@NotNull SimpleParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(@NotNull SimpleParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#repeatStmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStmt(@NotNull SimpleParser.RepeatStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#repeatStmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStmt(@NotNull SimpleParser.RepeatStmtContext ctx);
}