// Generated from prova.g4 by ANTLR 4.13.2

    import java.io.*;
    import java.lang.Object;
    import java.util.Vector;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link provaParser}.
 */
public interface provaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link provaParser#inici}.
	 * @param ctx the parse tree
	 */
	void enterInici(provaParser.IniciContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#inici}.
	 * @param ctx the parse tree
	 */
	void exitInici(provaParser.IniciContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#estructuraGeneral}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraGeneral(provaParser.EstructuraGeneralContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#estructuraGeneral}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraGeneral(provaParser.EstructuraGeneralContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#tipusDecl}.
	 * @param ctx the parse tree
	 */
	void enterTipusDecl(provaParser.TipusDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#tipusDecl}.
	 * @param ctx the parse tree
	 */
	void exitTipusDecl(provaParser.TipusDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefinicioVector}
	 * labeled alternative in {@link provaParser#novaDefinicio}.
	 * @param ctx the parse tree
	 */
	void enterDefinicioVector(provaParser.DefinicioVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefinicioVector}
	 * labeled alternative in {@link provaParser#novaDefinicio}.
	 * @param ctx the parse tree
	 */
	void exitDefinicioVector(provaParser.DefinicioVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefinicioTupla}
	 * labeled alternative in {@link provaParser#novaDefinicio}.
	 * @param ctx the parse tree
	 */
	void enterDefinicioTupla(provaParser.DefinicioTuplaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefinicioTupla}
	 * labeled alternative in {@link provaParser#novaDefinicio}.
	 * @param ctx the parse tree
	 */
	void exitDefinicioTupla(provaParser.DefinicioTuplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#campTupla}.
	 * @param ctx the parse tree
	 */
	void enterCampTupla(provaParser.CampTuplaContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#campTupla}.
	 * @param ctx the parse tree
	 */
	void exitCampTupla(provaParser.CampTuplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#accioFuncioDecl}.
	 * @param ctx the parse tree
	 */
	void enterAccioFuncioDecl(provaParser.AccioFuncioDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#accioFuncioDecl}.
	 * @param ctx the parse tree
	 */
	void exitAccioFuncioDecl(provaParser.AccioFuncioDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#accioDecl}.
	 * @param ctx the parse tree
	 */
	void enterAccioDecl(provaParser.AccioDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#accioDecl}.
	 * @param ctx the parse tree
	 */
	void exitAccioDecl(provaParser.AccioDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#funcioDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncioDecl(provaParser.FuncioDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#funcioDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncioDecl(provaParser.FuncioDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#parametresFormals}.
	 * @param ctx the parse tree
	 */
	void enterParametresFormals(provaParser.ParametresFormalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#parametresFormals}.
	 * @param ctx the parse tree
	 */
	void exitParametresFormals(provaParser.ParametresFormalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#blocVariables}.
	 * @param ctx the parse tree
	 */
	void enterBlocVariables(provaParser.BlocVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#blocVariables}.
	 * @param ctx the parse tree
	 */
	void exitBlocVariables(provaParser.BlocVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#declaracioVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracioVariable(provaParser.DeclaracioVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#declaracioVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracioVariable(provaParser.DeclaracioVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#tipusDefinit}.
	 * @param ctx the parse tree
	 */
	void enterTipusDefinit(provaParser.TipusDefinitContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#tipusDefinit}.
	 * @param ctx the parse tree
	 */
	void exitTipusDefinit(provaParser.TipusDefinitContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(provaParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(provaParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#assignacio}.
	 * @param ctx the parse tree
	 */
	void enterAssignacio(provaParser.AssignacioContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#assignacio}.
	 * @param ctx the parse tree
	 */
	void exitAssignacio(provaParser.AssignacioContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(provaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(provaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#buclePer}.
	 * @param ctx the parse tree
	 */
	void enterBuclePer(provaParser.BuclePerContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#buclePer}.
	 * @param ctx the parse tree
	 */
	void exitBuclePer(provaParser.BuclePerContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#bucleMent}.
	 * @param ctx the parse tree
	 */
	void enterBucleMent(provaParser.BucleMentContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#bucleMent}.
	 * @param ctx the parse tree
	 */
	void exitBucleMent(provaParser.BucleMentContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#cridaAccio}.
	 * @param ctx the parse tree
	 */
	void enterCridaAccio(provaParser.CridaAccioContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#cridaAccio}.
	 * @param ctx the parse tree
	 */
	void exitCridaAccio(provaParser.CridaAccioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lectura}
	 * labeled alternative in {@link provaParser#operacioLecturaEscritura}.
	 * @param ctx the parse tree
	 */
	void enterLectura(provaParser.LecturaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lectura}
	 * labeled alternative in {@link provaParser#operacioLecturaEscritura}.
	 * @param ctx the parse tree
	 */
	void exitLectura(provaParser.LecturaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Escritura}
	 * labeled alternative in {@link provaParser#operacioLecturaEscritura}.
	 * @param ctx the parse tree
	 */
	void enterEscritura(provaParser.EscrituraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Escritura}
	 * labeled alternative in {@link provaParser#operacioLecturaEscritura}.
	 * @param ctx the parse tree
	 */
	void exitEscritura(provaParser.EscrituraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EscrituraLn}
	 * labeled alternative in {@link provaParser#operacioLecturaEscritura}.
	 * @param ctx the parse tree
	 */
	void enterEscrituraLn(provaParser.EscrituraLnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EscrituraLn}
	 * labeled alternative in {@link provaParser#operacioLecturaEscritura}.
	 * @param ctx the parse tree
	 */
	void exitEscrituraLn(provaParser.EscrituraLnContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#rang}.
	 * @param ctx the parse tree
	 */
	void enterRang(provaParser.RangContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#rang}.
	 * @param ctx the parse tree
	 */
	void exitRang(provaParser.RangContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(provaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(provaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(provaParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(provaParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr3(provaParser.Expr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr3(provaParser.Expr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterExpr4(provaParser.Expr4Context ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitExpr4(provaParser.Expr4Context ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#expr5}.
	 * @param ctx the parse tree
	 */
	void enterExpr5(provaParser.Expr5Context ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#expr5}.
	 * @param ctx the parse tree
	 */
	void exitExpr5(provaParser.Expr5Context ctx);
	/**
	 * Enter a parse tree produced by {@link provaParser#exprbase}.
	 * @param ctx the parse tree
	 */
	void enterExprbase(provaParser.ExprbaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link provaParser#exprbase}.
	 * @param ctx the parse tree
	 */
	void exitExprbase(provaParser.ExprbaseContext ctx);
}