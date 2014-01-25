// Generated from proyectoLenguajes.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class proyectoLenguajesBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements proyectoLenguajesVisitor<T> {
	@Override public T visitStat_block(proyectoLenguajesParser.Stat_blockContext ctx) { return visitChildren(ctx); }

	@Override public T visitFor_stat(proyectoLenguajesParser.For_statContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrint_stat(proyectoLenguajesParser.Print_statContext ctx) { return visitChildren(ctx); }

	@Override public T visitBlock(proyectoLenguajesParser.BlockContext ctx) { return visitChildren(ctx); }

	@Override public T visitAtomExpr(proyectoLenguajesParser.AtomExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitLtExpr(proyectoLenguajesParser.LtExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitPlusExpr(proyectoLenguajesParser.PlusExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitStringAtom(proyectoLenguajesParser.StringAtomContext ctx) { return visitChildren(ctx); }

	@Override public T visitLteqExpr(proyectoLenguajesParser.LteqExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitNumberAtom(proyectoLenguajesParser.NumberAtomContext ctx) { return visitChildren(ctx); }

	@Override public T visitStat(proyectoLenguajesParser.StatContext ctx) { return visitChildren(ctx); }

	@Override public T visitBooleanAtom(proyectoLenguajesParser.BooleanAtomContext ctx) { return visitChildren(ctx); }

	@Override public T visitParExpr(proyectoLenguajesParser.ParExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitMinusExpr(proyectoLenguajesParser.MinusExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignment(proyectoLenguajesParser.AssignmentContext ctx) { return visitChildren(ctx); }

	@Override public T visitIdAtom(proyectoLenguajesParser.IdAtomContext ctx) { return visitChildren(ctx); }

	@Override public T visitGteqExpr(proyectoLenguajesParser.GteqExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitGtExpr(proyectoLenguajesParser.GtExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitCondition_block(proyectoLenguajesParser.Condition_blockContext ctx) { return visitChildren(ctx); }

	@Override public T visitNeqExpr(proyectoLenguajesParser.NeqExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitParse(proyectoLenguajesParser.ParseContext ctx) { return visitChildren(ctx); }

	@Override public T visitEqExpr(proyectoLenguajesParser.EqExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitIf_stat(proyectoLenguajesParser.If_statContext ctx) { return visitChildren(ctx); }
}