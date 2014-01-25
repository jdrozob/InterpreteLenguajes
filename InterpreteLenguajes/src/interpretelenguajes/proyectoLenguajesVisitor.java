// Generated from C:\Users\TOSHIBA\Google Drive\Proyecto Lenguajes de Programacion\proyectoLenguajes.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link proyectoLenguajesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface proyectoLenguajesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(@NotNull proyectoLenguajesParser.ImpresionContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#bloque_sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_sentencias(@NotNull proyectoLenguajesParser.Bloque_sentenciasContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(@NotNull proyectoLenguajesParser.SentenciaContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(@NotNull proyectoLenguajesParser.AtomExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#ltExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpr(@NotNull proyectoLenguajesParser.LtExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#plusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpr(@NotNull proyectoLenguajesParser.PlusExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#stringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull proyectoLenguajesParser.StringAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#lteqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLteqExpr(@NotNull proyectoLenguajesParser.LteqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#numberAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull proyectoLenguajesParser.NumberAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(@NotNull proyectoLenguajesParser.AsignacionContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#booleanAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(@NotNull proyectoLenguajesParser.BooleanAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#parExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(@NotNull proyectoLenguajesParser.ParExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(@NotNull proyectoLenguajesParser.ProgramaContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#minusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(@NotNull proyectoLenguajesParser.MinusExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#idAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(@NotNull proyectoLenguajesParser.IdAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#gteqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGteqExpr(@NotNull proyectoLenguajesParser.GteqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#gtExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpr(@NotNull proyectoLenguajesParser.GtExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#sent_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent_if(@NotNull proyectoLenguajesParser.Sent_ifContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#neqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqExpr(@NotNull proyectoLenguajesParser.NeqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(@NotNull proyectoLenguajesParser.BloqueContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#condicion_bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion_bloque(@NotNull proyectoLenguajesParser.Condicion_bloqueContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(@NotNull proyectoLenguajesParser.EqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#sentencia_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_for(@NotNull proyectoLenguajesParser.Sentencia_forContext ctx);
}