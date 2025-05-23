package parser;
// Generated from MiniC.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, CHAR=2, BOOL=3, IF=4, ELSE=5, WHILE=6, FOR=7, RETURN=8, PRINTF=9, 
		SCANF=10, TRUE=11, FALSE=12, PLUS=13, MINUS=14, MULT=15, DIV=16, MOD=17, 
		ASSIGN=18, EQ=19, NEQ=20, LT=21, GT=22, LE=23, GE=24, AND=25, OR=26, NOT=27, 
		SEMI=28, COMMA=29, LPAREN=30, RPAREN=31, LBRACE=32, RBRACE=33, ID=34, 
		NUMBER=35, CHAR_LITERAL=36, STRING=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "CHAR", "BOOL", "IF", "ELSE", "WHILE", "FOR", "RETURN", "PRINTF", 
			"SCANF", "TRUE", "FALSE", "PLUS", "MINUS", "MULT", "DIV", "MOD", "ASSIGN", 
			"EQ", "NEQ", "LT", "GT", "LE", "GE", "AND", "OR", "NOT", "SEMI", "COMMA", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "ID", "NUMBER", "CHAR_LITERAL", 
			"STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'char'", "'bool'", "'if'", "'else'", "'while'", "'for'", 
			"'return'", "'printf'", "'scanf'", "'true'", "'false'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
			"'&&'", "'||'", "'!'", "';'", "','", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "CHAR", "BOOL", "IF", "ELSE", "WHILE", "FOR", "RETURN", 
			"PRINTF", "SCANF", "TRUE", "FALSE", "PLUS", "MINUS", "MULT", "DIV", "MOD", 
			"ASSIGN", "EQ", "NEQ", "LT", "GT", "LE", "GE", "AND", "OR", "NOT", "SEMI", 
			"COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "ID", "NUMBER", "CHAR_LITERAL", 
			"STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MiniCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\7#\u00c1\n#\f#\16#\u00c4"+
		"\13#\3$\6$\u00c7\n$\r$\16$\u00c8\3%\3%\3%\3%\3&\3&\7&\u00d1\n&\f&\16&"+
		"\u00d4\13&\3&\3&\3\'\6\'\u00d9\n\'\r\'\16\'\u00da\3\'\3\'\3\u00d2\2(\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17"+
		"\17\"\"\2\u00e1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5S\3\2\2"+
		"\2\7X\3\2\2\2\t]\3\2\2\2\13`\3\2\2\2\re\3\2\2\2\17k\3\2\2\2\21o\3\2\2"+
		"\2\23v\3\2\2\2\25}\3\2\2\2\27\u0083\3\2\2\2\31\u0088\3\2\2\2\33\u008e"+
		"\3\2\2\2\35\u0090\3\2\2\2\37\u0092\3\2\2\2!\u0094\3\2\2\2#\u0096\3\2\2"+
		"\2%\u0098\3\2\2\2\'\u009a\3\2\2\2)\u009d\3\2\2\2+\u00a0\3\2\2\2-\u00a2"+
		"\3\2\2\2/\u00a4\3\2\2\2\61\u00a7\3\2\2\2\63\u00aa\3\2\2\2\65\u00ad\3\2"+
		"\2\2\67\u00b0\3\2\2\29\u00b2\3\2\2\2;\u00b4\3\2\2\2=\u00b6\3\2\2\2?\u00b8"+
		"\3\2\2\2A\u00ba\3\2\2\2C\u00bc\3\2\2\2E\u00be\3\2\2\2G\u00c6\3\2\2\2I"+
		"\u00ca\3\2\2\2K\u00ce\3\2\2\2M\u00d8\3\2\2\2OP\7k\2\2PQ\7p\2\2QR\7v\2"+
		"\2R\4\3\2\2\2ST\7e\2\2TU\7j\2\2UV\7c\2\2VW\7t\2\2W\6\3\2\2\2XY\7d\2\2"+
		"YZ\7q\2\2Z[\7q\2\2[\\\7n\2\2\\\b\3\2\2\2]^\7k\2\2^_\7h\2\2_\n\3\2\2\2"+
		"`a\7g\2\2ab\7n\2\2bc\7u\2\2cd\7g\2\2d\f\3\2\2\2ef\7y\2\2fg\7j\2\2gh\7"+
		"k\2\2hi\7n\2\2ij\7g\2\2j\16\3\2\2\2kl\7h\2\2lm\7q\2\2mn\7t\2\2n\20\3\2"+
		"\2\2op\7t\2\2pq\7g\2\2qr\7v\2\2rs\7w\2\2st\7t\2\2tu\7p\2\2u\22\3\2\2\2"+
		"vw\7r\2\2wx\7t\2\2xy\7k\2\2yz\7p\2\2z{\7v\2\2{|\7h\2\2|\24\3\2\2\2}~\7"+
		"u\2\2~\177\7e\2\2\177\u0080\7c\2\2\u0080\u0081\7p\2\2\u0081\u0082\7h\2"+
		"\2\u0082\26\3\2\2\2\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085\u0086"+
		"\7w\2\2\u0086\u0087\7g\2\2\u0087\30\3\2\2\2\u0088\u0089\7h\2\2\u0089\u008a"+
		"\7c\2\2\u008a\u008b\7n\2\2\u008b\u008c\7u\2\2\u008c\u008d\7g\2\2\u008d"+
		"\32\3\2\2\2\u008e\u008f\7-\2\2\u008f\34\3\2\2\2\u0090\u0091\7/\2\2\u0091"+
		"\36\3\2\2\2\u0092\u0093\7,\2\2\u0093 \3\2\2\2\u0094\u0095\7\61\2\2\u0095"+
		"\"\3\2\2\2\u0096\u0097\7\'\2\2\u0097$\3\2\2\2\u0098\u0099\7?\2\2\u0099"+
		"&\3\2\2\2\u009a\u009b\7?\2\2\u009b\u009c\7?\2\2\u009c(\3\2\2\2\u009d\u009e"+
		"\7#\2\2\u009e\u009f\7?\2\2\u009f*\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1,\3"+
		"\2\2\2\u00a2\u00a3\7@\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5\u00a6"+
		"\7?\2\2\u00a6\60\3\2\2\2\u00a7\u00a8\7@\2\2\u00a8\u00a9\7?\2\2\u00a9\62"+
		"\3\2\2\2\u00aa\u00ab\7(\2\2\u00ab\u00ac\7(\2\2\u00ac\64\3\2\2\2\u00ad"+
		"\u00ae\7~\2\2\u00ae\u00af\7~\2\2\u00af\66\3\2\2\2\u00b0\u00b1\7#\2\2\u00b1"+
		"8\3\2\2\2\u00b2\u00b3\7=\2\2\u00b3:\3\2\2\2\u00b4\u00b5\7.\2\2\u00b5<"+
		"\3\2\2\2\u00b6\u00b7\7*\2\2\u00b7>\3\2\2\2\u00b8\u00b9\7+\2\2\u00b9@\3"+
		"\2\2\2\u00ba\u00bb\7}\2\2\u00bbB\3\2\2\2\u00bc\u00bd\7\177\2\2\u00bdD"+
		"\3\2\2\2\u00be\u00c2\t\2\2\2\u00bf\u00c1\t\3\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3F\3\2\2\2"+
		"\u00c4\u00c2\3\2\2\2\u00c5\u00c7\t\4\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9H\3\2\2\2\u00ca"+
		"\u00cb\7)\2\2\u00cb\u00cc\13\2\2\2\u00cc\u00cd\7)\2\2\u00cdJ\3\2\2\2\u00ce"+
		"\u00d2\7$\2\2\u00cf\u00d1\13\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\7$\2\2\u00d6L\3\2\2\2\u00d7\u00d9\t\5\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\'\2\2\u00ddN\3\2\2\2\7\2\u00c2"+
		"\u00c8\u00d2\u00da\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}