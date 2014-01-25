// Generated from proyectoLenguajes.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface proyectoLenguajesVisitor<T> extends ParseTreeVisitor<T> {
	T visitStat_block(proyectoLenguajesParser.Stat_blockContext ctx);

	T visitFor_stat(proyectoLenguajesParser.For_statContext ctx);

	T visitPrint_stat(proyectoLenguajesParser.Print_statContext ctx);

	T visitBlock(proyectoLenguajesParser.BlockContext ctx);

	T visitAtomExpr(proyectoLenguajesParser.AtomExprContext ctx);

	T visitLtExpr(proyectoLenguajesParser.LtExprContext ctx);

	T visitPlusExpr(proyectoLenguajesParser.PlusExprContext ctx);

	T visitStringAtom(proyectoLenguajesParser.StringAtomContext ctx);

	T visitLteqExpr(proyectoLenguajesParser.LteqExprContext ctx);

	T visitNumberAtom(proyectoLenguajesParser.NumberAtomContext ctx);

	T visitStat(proyectoLenguajesParser.StatContext ctx);

	T visitBooleanAtom(proyectoLenguajesParser.BooleanAtomContext ctx);

	T visitParExpr(proyectoLenguajesParser.ParExprContext ctx);

	T visitMinusExpr(proyectoLenguajesParser.MinusExprContext ctx);

	T visitAssignment(proyectoLenguajesParser.AssignmentContext ctx);

	T visitIdAtom(proyectoLenguajesParser.IdAtomContext ctx);

	T visitGteqExpr(proyectoLenguajesParser.GteqExprContext ctx);

	T visitGtExpr(proyectoLenguajesParser.GtExprContext ctx);

	T visitCondition_block(proyectoLenguajesParser.Condition_blockContext ctx);

	T visitNeqExpr(proyectoLenguajesParser.NeqExprContext ctx);

	T visitParse(proyectoLenguajesParser.ParseContext ctx);

	T visitEqExpr(proyectoLenguajesParser.EqExprContext ctx);

	T visitIf_stat(proyectoLenguajesParser.If_statContext ctx);
}