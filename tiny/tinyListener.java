// Generated from tiny.g4 by ANTLR 4.13.2

    import java.io.*;
    import java.lang.Object;
    import java.util.Vector;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tinyParser}.
 */
public interface tinyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tinyParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(tinyParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(tinyParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(tinyParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(tinyParser.CContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(tinyParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(tinyParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#e2}.
	 * @param ctx the parse tree
	 */
	void enterE2(tinyParser.E2Context ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#e2}.
	 * @param ctx the parse tree
	 */
	void exitE2(tinyParser.E2Context ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#e3}.
	 * @param ctx the parse tree
	 */
	void enterE3(tinyParser.E3Context ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#e3}.
	 * @param ctx the parse tree
	 */
	void exitE3(tinyParser.E3Context ctx);
}