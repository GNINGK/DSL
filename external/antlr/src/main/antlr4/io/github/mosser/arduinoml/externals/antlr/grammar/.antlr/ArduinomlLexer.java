// Generated from /home/user/Bureau/DSL/external/antlr/src/main/antlr4/io/github/mosser/arduinoml/externals/antlr/grammar/Arduinoml.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArduinomlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PORT_NUMBER=11, IDENTIFIER=12, SIGNAL=13, NEWLINE=14, WS=15, 
		COMMENT=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "PORT_NUMBER", "IDENTIFIER", "SIGNAL", "LOWERCASE", "UPPERCASE", 
		"NEWLINE", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'application'", "'sensor'", "'actuator'", "':'", "'{'", "'}'", 
		"'<='", "'is'", "'=>'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "PORT_NUMBER", 
		"IDENTIFIER", "SIGNAL", "NEWLINE", "WS", "COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ArduinomlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Arduinoml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f_\n\f\3\r\3\r\3\r\6\rd\n\r\r\r\16\r"+
		"e\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16o\n\16\3\17\3\17\3\20\3\20\3"+
		"\21\5\21v\n\21\3\21\3\21\6\21z\n\21\r\21\16\21{\3\21\3\21\3\22\6\22\u0081"+
		"\n\22\r\22\16\22\u0082\3\22\3\22\3\23\3\23\7\23\u0089\n\23\f\23\16\23"+
		"\u008c\13\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\2\37\2!\20#\21%\22\3\2\7\3\2\63;\3\2c|\3\2C"+
		"\\\4\2\13\13\"\"\4\2\f\f\17\17\2\u0098\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5\63\3\2\2\2\7:\3\2\2\2\tC\3\2"+
		"\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21L\3\2\2\2\23O\3\2\2\2\25R\3"+
		"\2\2\2\27^\3\2\2\2\31`\3\2\2\2\33n\3\2\2\2\35p\3\2\2\2\37r\3\2\2\2!y\3"+
		"\2\2\2#\u0080\3\2\2\2%\u0086\3\2\2\2\'(\7c\2\2()\7r\2\2)*\7r\2\2*+\7n"+
		"\2\2+,\7k\2\2,-\7e\2\2-.\7c\2\2./\7v\2\2/\60\7k\2\2\60\61\7q\2\2\61\62"+
		"\7p\2\2\62\4\3\2\2\2\63\64\7u\2\2\64\65\7g\2\2\65\66\7p\2\2\66\67\7u\2"+
		"\2\678\7q\2\289\7t\2\29\6\3\2\2\2:;\7c\2\2;<\7e\2\2<=\7v\2\2=>\7w\2\2"+
		">?\7c\2\2?@\7v\2\2@A\7q\2\2AB\7t\2\2B\b\3\2\2\2CD\7<\2\2D\n\3\2\2\2EF"+
		"\7}\2\2F\f\3\2\2\2GH\7\177\2\2H\16\3\2\2\2IJ\7>\2\2JK\7?\2\2K\20\3\2\2"+
		"\2LM\7k\2\2MN\7u\2\2N\22\3\2\2\2OP\7?\2\2PQ\7@\2\2Q\24\3\2\2\2RS\7/\2"+
		"\2ST\7@\2\2T\26\3\2\2\2U_\t\2\2\2VW\7\63\2\2W_\7\62\2\2XY\7\63\2\2Y_\7"+
		"\63\2\2Z[\7\63\2\2[_\7\64\2\2\\]\7\63\2\2]_\7\65\2\2^U\3\2\2\2^V\3\2\2"+
		"\2^X\3\2\2\2^Z\3\2\2\2^\\\3\2\2\2_\30\3\2\2\2`c\5\35\17\2ad\5\35\17\2"+
		"bd\5\37\20\2ca\3\2\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\32\3\2"+
		"\2\2gh\7J\2\2hi\7K\2\2ij\7I\2\2jo\7J\2\2kl\7N\2\2lm\7Q\2\2mo\7Y\2\2ng"+
		"\3\2\2\2nk\3\2\2\2o\34\3\2\2\2pq\t\3\2\2q\36\3\2\2\2rs\t\4\2\2s \3\2\2"+
		"\2tv\7\17\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wz\7\f\2\2xz\7\17\2\2yu\3\2"+
		"\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\21\2\2~\"\3"+
		"\2\2\2\177\u0081\t\5\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\22\2\2"+
		"\u0085$\3\2\2\2\u0086\u008a\7%\2\2\u0087\u0089\n\6\2\2\u0088\u0087\3\2"+
		"\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\b\23\2\2\u008e&\3\2\2\2"+
		"\f\2^cenuy{\u0082\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}