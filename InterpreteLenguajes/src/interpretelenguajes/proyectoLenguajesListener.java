// Generated from C:\Users\TOSHIBA\Google Drive\Proyecto Lenguajes de Programacion\proyectoLenguajes.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link proyectoLenguajesParser}.
 */
public interface proyectoLenguajesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(@NotNull proyectoLenguajesParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(@NotNull proyectoLenguajesParser.ImpresionContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#bloque_sentencias}.
	 * @param ctx the parse tree
	 */
	void enterBloque_sentencias(@NotNull proyectoLenguajesParser.Bloque_sentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#bloque_sentencias}.
	 * @param ctx the parse tree
	 */
	void exitBloque_sentencias(@NotNull proyectoLenguajesParser.Bloque_sentenciasContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(@NotNull proyectoLenguajesParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(@NotNull proyectoLenguajesParser.SentenciaContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull proyectoLenguajesParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull proyectoLenguajesParser.AtomExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#ltExpr}.
	 * @param ctx the parse tree
	 */
	void enterLtExpr(@NotNull proyectoLenguajesParser.LtExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#ltExpr}.
	 * @param ctx the parse tree
	 */
	void exitLtExpr(@NotNull proyectoLenguajesParser.LtExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#plusExpr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(@NotNull proyectoLenguajesParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#plusExpr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(@NotNull proyectoLenguajesParser.PlusExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull proyectoLenguajesParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull proyectoLenguajesParser.StringAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#lteqExpr}.
	 * @param ctx the parse tree
	 */
	void enterLteqExpr(@NotNull proyectoLenguajesParser.LteqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#lteqExpr}.
	 * @param ctx the parse tree
	 */
	void exitLteqExpr(@NotNull proyectoLenguajesParser.LteqExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull proyectoLenguajesParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull proyectoLenguajesParser.NumberAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(@NotNull proyectoLenguajesParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(@NotNull proyectoLenguajesParser.AsignacionContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#booleanAtom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(@NotNull proyectoLenguajesParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#booleanAtom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(@NotNull proyectoLenguajesParser.BooleanAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#parExpr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull proyectoLenguajesParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#parExpr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull proyectoLenguajesParser.ParExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull proyectoLenguajesParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull proyectoLenguajesParser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(@NotNull proyectoLenguajesParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(@NotNull proyectoLenguajesParser.MinusExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#idAtom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(@NotNull proyectoLenguajesParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#idAtom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(@NotNull proyectoLenguajesParser.IdAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#gteqExpr}.
	 * @param ctx the parse tree
	 */
	void enterGteqExpr(@NotNull proyectoLenguajesParser.GteqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#gteqExpr}.
	 * @param ctx the parse tree
	 */
	void exitGteqExpr(@NotNull proyectoLenguajesParser.GteqExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#gtExpr}.
	 * @param ctx the parse tree
	 */
	void enterGtExpr(@NotNull proyectoLenguajesParser.GtExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#gtExpr}.
	 * @param ctx the parse tree
	 */
	void exitGtExpr(@NotNull proyectoLenguajesParser.GtExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#sent_if}.
	 * @param ctx the parse tree
	 */
	void enterSent_if(@NotNull proyectoLenguajesParser.Sent_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#sent_if}.
	 * @param ctx the parse tree
	 */
	void exitSent_if(@NotNull proyectoLenguajesParser.Sent_ifContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#neqExpr}.
	 * @param ctx the parse tree
	 */
	void enterNeqExpr(@NotNull proyectoLenguajesParser.NeqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#neqExpr}.
	 * @param ctx the parse tree
	 */
	void exitNeqExpr(@NotNull proyectoLenguajesParser.NeqExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(@NotNull proyectoLenguajesParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(@NotNull proyectoLenguajesParser.BloqueContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#condicion_bloque}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_bloque(@NotNull proyectoLenguajesParser.Condicion_bloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#condicion_bloque}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_bloque(@NotNull proyectoLenguajesParser.Condicion_bloqueContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(@NotNull proyectoLenguajesParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(@NotNull proyectoLenguajesParser.EqExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#sentencia_for}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_for(@NotNull proyectoLenguajesParser.Sentencia_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#sentencia_for}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_for(@NotNull proyectoLenguajesParser.Sentencia_forContext ctx);
}