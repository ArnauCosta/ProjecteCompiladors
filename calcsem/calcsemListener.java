// Generated from calcsem.g4 by ANTLR 4.13.2

    import java.io.*;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calcsemParser}.
 */
public interface calcsemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calcsemParser#lexpressions}.
	 * @param ctx the parse tree
	 */
	void enterLexpressions(calcsemParser.LexpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcsemParser#lexpressions}.
	 * @param ctx the parse tree
	 */
	void exitLexpressions(calcsemParser.LexpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcsemParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(calcsemParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcsemParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(calcsemParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcsemParser#terme}.
	 * @param ctx the parse tree
	 */
	void enterTerme(calcsemParser.TermeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcsemParser#terme}.
	 * @param ctx the parse tree
	 */
	void exitTerme(calcsemParser.TermeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcsemParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(calcsemParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcsemParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(calcsemParser.FactorContext ctx);
}