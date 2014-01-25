// Generated from proyectoLenguajes.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface proyectoLenguajesVisitor<T> extends ParseTreeVisitor<T> {
	T visitImpresion(proyectoLenguajesParser.ImpresionContext ctx);

	T visitBloque_sentencias(proyectoLenguajesParser.Bloque_sentenciasContext ctx);

	T visitSentencia(proyectoLenguajesParser.SentenciaContext ctx);

	T visitAtomExpr(proyectoLenguajesParser.AtomExprContext ctx);

	T visitLtExpr(proyectoLenguajesParser.LtExprContext ctx);

	T visitPlusExpr(proyectoLenguajesParser.PlusExprContext ctx);

	T visitStringAtom(proyectoLenguajesParser.StringAtomContext ctx);

	T visitLteqExpr(proyectoLenguajesParser.LteqExprContext ctx);

	T visitNumberAtom(proyectoLenguajesParser.NumberAtomContext ctx);

	T visitAsignacion(proyectoLenguajesParser.AsignacionContext ctx);

	T visitBooleanAtom(proyectoLenguajesParser.BooleanAtomContext ctx);

	T visitParExpr(proyectoLenguajesParser.ParExprContext ctx);

	T visitPrograma(proyectoLenguajesParser.ProgramaContext ctx);

	T visitMinusExpr(proyectoLenguajesParser.MinusExprContext ctx);

	T visitIdAtom(proyectoLenguajesParser.IdAtomContext ctx);

	T visitGteqExpr(proyectoLenguajesParser.GteqExprContext ctx);

	T visitGtExpr(proyectoLenguajesParser.GtExprContext ctx);

	T visitSent_if(proyectoLenguajesParser.Sent_ifContext ctx);

	T visitNeqExpr(proyectoLenguajesParser.NeqExprContext ctx);

	T visitBloque(proyectoLenguajesParser.BloqueContext ctx);

	T visitCondicion_bloque(proyectoLenguajesParser.Condicion_bloqueContext ctx);

	T visitEqExpr(proyectoLenguajesParser.EqExprContext ctx);

	T visitSentencia_for(proyectoLenguajesParser.Sentencia_forContext ctx);
}