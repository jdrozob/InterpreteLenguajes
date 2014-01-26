// Generated from C:\Users\TOSHIBA\Documents\NetBeansProjects\InterpreteLenguajes\InterpreteLenguajes\src\interpretelenguajes\proyectoLenguajes.g4 by ANTLR 4.1
package interpretelenguajes;
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
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(@NotNull proyectoLenguajesParser.Stat_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(@NotNull proyectoLenguajesParser.For_statContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#print_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stat(@NotNull proyectoLenguajesParser.Print_statContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull proyectoLenguajesParser.BlockContext ctx);

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
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(@NotNull proyectoLenguajesParser.StatContext ctx);

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
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#minusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(@NotNull proyectoLenguajesParser.MinusExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull proyectoLenguajesParser.AssignmentContext ctx);

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
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(@NotNull proyectoLenguajesParser.Condition_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#neqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqExpr(@NotNull proyectoLenguajesParser.NeqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull proyectoLenguajesParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(@NotNull proyectoLenguajesParser.EqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link proyectoLenguajesParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(@NotNull proyectoLenguajesParser.If_statContext ctx);
}