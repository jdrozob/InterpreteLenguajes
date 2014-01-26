// Generated from C:\Users\TOSHIBA\Documents\NetBeansProjects\InterpreteLenguajes\InterpreteLenguajes\src\interpretelenguajes\proyectoLenguajes.g4 by ANTLR 4.1
package interpretelenguajes;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class proyectoLenguajesLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, SCOL=2, OPAR=3, CPAR=4, OBRACE=5, CBRACE=6, COMA=7, IF=8, ELSEIF=9, 
		ELSE=10, FOR=11, IN=12, RANGE=13, PRINT=14, TRUE=15, FALSE=16, EQ=17, 
		NEQ=18, GT=19, LT=20, GTEQ=21, LTEQ=22, PLUS=23, MINUS=24, ID=25, INT=26, 
		FLOAT=27, STRING=28, COMMENT=29, SPACE=30, OTHER=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'='", "';'", "'('", "')'", "'{'", "'}'", "','", "'if'", "'elif'", "'else'", 
		"'for'", "'in'", "'range'", "'print'", "'true'", "'false'", "'=='", "'!='", 
		"'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "ID", "INT", "FLOAT", "STRING", 
		"COMMENT", "SPACE", "OTHER"
	};
	public static final String[] ruleNames = {
		"ASSIGN", "SCOL", "OPAR", "CPAR", "OBRACE", "CBRACE", "COMA", "IF", "ELSEIF", 
		"ELSE", "FOR", "IN", "RANGE", "PRINT", "TRUE", "FALSE", "EQ", "NEQ", "GT", 
		"LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "ID", "INT", "FLOAT", "STRING", 
		"COMMENT", "SPACE", "OTHER"
	};


	public proyectoLenguajesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "proyectoLenguajes.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 28: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 29: SPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2!\u00c8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\7\32\u0091\n\32\f\32\16\32\u0094\13\32\3\33\6\33\u0097\n"+
		"\33\r\33\16\33\u0098\3\34\6\34\u009c\n\34\r\34\16\34\u009d\3\34\3\34\7"+
		"\34\u00a2\n\34\f\34\16\34\u00a5\13\34\3\34\3\34\6\34\u00a9\n\34\r\34\16"+
		"\34\u00aa\5\34\u00ad\n\34\3\35\3\35\3\35\3\35\7\35\u00b3\n\35\f\35\16"+
		"\35\u00b6\13\35\3\35\3\35\3\36\3\36\7\36\u00bc\n\36\f\36\16\36\u00bf\13"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \2!\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1"+
		"\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33"+
		"\1\65\34\1\67\35\19\36\1;\37\2= \3?!\1\3\2\7\5\2C\\aac|\6\2\62;C\\aac"+
		"|\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u00d0\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2"+
		"\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23R\3\2\2\2\25W\3\2\2\2\27\\\3\2\2"+
		"\2\31`\3\2\2\2\33c\3\2\2\2\35i\3\2\2\2\37o\3\2\2\2!t\3\2\2\2#z\3\2\2\2"+
		"%}\3\2\2\2\'\u0080\3\2\2\2)\u0082\3\2\2\2+\u0084\3\2\2\2-\u0087\3\2\2"+
		"\2/\u008a\3\2\2\2\61\u008c\3\2\2\2\63\u008e\3\2\2\2\65\u0096\3\2\2\2\67"+
		"\u00ac\3\2\2\29\u00ae\3\2\2\2;\u00b9\3\2\2\2=\u00c2\3\2\2\2?\u00c6\3\2"+
		"\2\2AB\7?\2\2B\4\3\2\2\2CD\7=\2\2D\6\3\2\2\2EF\7*\2\2F\b\3\2\2\2GH\7+"+
		"\2\2H\n\3\2\2\2IJ\7}\2\2J\f\3\2\2\2KL\7\177\2\2L\16\3\2\2\2MN\7.\2\2N"+
		"\20\3\2\2\2OP\7k\2\2PQ\7h\2\2Q\22\3\2\2\2RS\7g\2\2ST\7n\2\2TU\7k\2\2U"+
		"V\7h\2\2V\24\3\2\2\2WX\7g\2\2XY\7n\2\2YZ\7u\2\2Z[\7g\2\2[\26\3\2\2\2\\"+
		"]\7h\2\2]^\7q\2\2^_\7t\2\2_\30\3\2\2\2`a\7k\2\2ab\7p\2\2b\32\3\2\2\2c"+
		"d\7t\2\2de\7c\2\2ef\7p\2\2fg\7i\2\2gh\7g\2\2h\34\3\2\2\2ij\7r\2\2jk\7"+
		"t\2\2kl\7k\2\2lm\7p\2\2mn\7v\2\2n\36\3\2\2\2op\7v\2\2pq\7t\2\2qr\7w\2"+
		"\2rs\7g\2\2s \3\2\2\2tu\7h\2\2uv\7c\2\2vw\7n\2\2wx\7u\2\2xy\7g\2\2y\""+
		"\3\2\2\2z{\7?\2\2{|\7?\2\2|$\3\2\2\2}~\7#\2\2~\177\7?\2\2\177&\3\2\2\2"+
		"\u0080\u0081\7@\2\2\u0081(\3\2\2\2\u0082\u0083\7>\2\2\u0083*\3\2\2\2\u0084"+
		"\u0085\7@\2\2\u0085\u0086\7?\2\2\u0086,\3\2\2\2\u0087\u0088\7>\2\2\u0088"+
		"\u0089\7?\2\2\u0089.\3\2\2\2\u008a\u008b\7-\2\2\u008b\60\3\2\2\2\u008c"+
		"\u008d\7/\2\2\u008d\62\3\2\2\2\u008e\u0092\t\2\2\2\u008f\u0091\t\3\2\2"+
		"\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\64\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\4\62;\2\u0096"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\66\3\2\2\2\u009a\u009c\4\62;\2\u009b\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a3\7\60\2\2\u00a0\u00a2\4\62;\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00ad\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a8\7\60\2\2\u00a7\u00a9\4\62;\2\u00a8\u00a7\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u009b\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ad8\3\2\2\2"+
		"\u00ae\u00b4\7$\2\2\u00af\u00b3\n\4\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b3"+
		"\7$\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b8\7$\2\2\u00b8:\3\2\2\2\u00b9\u00bd\7%\2\2\u00ba\u00bc"+
		"\n\5\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\b\36"+
		"\2\2\u00c1<\3\2\2\2\u00c2\u00c3\t\6\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5"+
		"\b\37\3\2\u00c5>\3\2\2\2\u00c6\u00c7\13\2\2\2\u00c7@\3\2\2\2\f\2\u0092"+
		"\u0098\u009d\u00a3\u00aa\u00ac\u00b2\u00b4\u00bd";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}