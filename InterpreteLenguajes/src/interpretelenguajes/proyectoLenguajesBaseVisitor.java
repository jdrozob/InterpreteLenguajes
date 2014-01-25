// Generated from proyectoLenguajes.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class proyectoLenguajesBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements proyectoLenguajesVisitor<T> {
	@Override public T visitImpresion(proyectoLenguajesParser.ImpresionContext ctx) { return visitChildren(ctx); }

	@Override public T visitBloque_sentencias(proyectoLenguajesParser.Bloque_sentenciasContext ctx) { return visitChildren(ctx); }

	@Override public T visitSentencia(proyectoLenguajesParser.SentenciaContext ctx) { return visitChildren(ctx); }

	@Override public T visitAtomExpr(proyectoLenguajesParser.AtomExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitLtExpr(proyectoLenguajesParser.LtExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitPlusExpr(proyectoLenguajesParser.PlusExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitStringAtom(proyectoLenguajesParser.StringAtomContext ctx) { return visitChildren(ctx); }

	@Override public T visitLteqExpr(proyectoLenguajesParser.LteqExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitNumberAtom(proyectoLenguajesParser.NumberAtomContext ctx) { return visitChildren(ctx); }

	@Override public T visitAsignacion(proyectoLenguajesParser.AsignacionContext ctx) { return visitChildren(ctx); }

	@Override public T visitBooleanAtom(proyectoLenguajesParser.BooleanAtomContext ctx) { return visitChildren(ctx); }

	@Override public T visitParExpr(proyectoLenguajesParser.ParExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrograma(proyectoLenguajesParser.ProgramaContext ctx) { return visitChildren(ctx); }

	@Override public T visitMinusExpr(proyectoLenguajesParser.MinusExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitIdAtom(proyectoLenguajesParser.IdAtomContext ctx) { return visitChildren(ctx); }

	@Override public T visitGteqExpr(proyectoLenguajesParser.GteqExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitGtExpr(proyectoLenguajesParser.GtExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitSent_if(proyectoLenguajesParser.Sent_ifContext ctx) { return visitChildren(ctx); }

	@Override public T visitNeqExpr(proyectoLenguajesParser.NeqExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitBloque(proyectoLenguajesParser.BloqueContext ctx) { return visitChildren(ctx); }

	@Override public T visitCondicion_bloque(proyectoLenguajesParser.Condicion_bloqueContext ctx) { return visitChildren(ctx); }

	@Override public T visitEqExpr(proyectoLenguajesParser.EqExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitSentencia_for(proyectoLenguajesParser.Sentencia_forContext ctx) { return visitChildren(ctx); }
}