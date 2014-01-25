// Generated from C:\Users\TOSHIBA\Documents\NetBeansProjects\InterpreteLenguajes\InterpreteLenguajes\src\interpretelenguajes\proyectoLenguajes.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link proyectoLenguajesParser}.
 */
public interface proyectoLenguajesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(@NotNull proyectoLenguajesParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(@NotNull proyectoLenguajesParser.Stat_blockContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(@NotNull proyectoLenguajesParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(@NotNull proyectoLenguajesParser.For_statContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#print_stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stat(@NotNull proyectoLenguajesParser.Print_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#print_stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stat(@NotNull proyectoLenguajesParser.Print_statContext ctx);

	/**
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull proyectoLenguajesParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull proyectoLenguajesParser.BlockContext ctx);

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
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull proyectoLenguajesParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull proyectoLenguajesParser.StatContext ctx);

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
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull proyectoLenguajesParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull proyectoLenguajesParser.AssignmentContext ctx);

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
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(@NotNull proyectoLenguajesParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(@NotNull proyectoLenguajesParser.Condition_blockContext ctx);

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
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull proyectoLenguajesParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull proyectoLenguajesParser.ParseContext ctx);

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
	 * Enter a parse tree produced by {@link proyectoLenguajesParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(@NotNull proyectoLenguajesParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link proyectoLenguajesParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(@NotNull proyectoLenguajesParser.If_statContext ctx);
}