// Generated from /Users/trobalik/Development/gradle-script-grammar/gradle-script-grammar/src/main/antlr/com/autonomousapps/grammar/gradle/GradleScriptLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GradleScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEPENDENCIES=1, FILE=2, FILES=3, TEST_FIXTURES=4, ENFORCED_PLATFORM=5, 
		PLATFORM=6, PROJECT=7, BUILDSCRIPT=8, PATH=9, CONFIGURATION=10, BRACE_OPEN=11, 
		BRACE_CLOSE=12, PARENS_OPEN=13, PARENS_CLOSE=14, QUOTE_SINGLE=15, QUOTE_DOUBLE=16, 
		EQUALS=17, SEMI=18, COMMA=19, BACKSLASH=20, UNICODE_LATIN=21, ID=22, NAME=23, 
		DIGIT=24, COMMENT=25, LINE_COMMENT=26, WS=27, IGNORE=28;
	public static final int
		WHITESPACE=2, COMMENTS=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "WHITESPACE", "COMMENTS"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEPENDENCIES", "FILE", "FILES", "TEST_FIXTURES", "ENFORCED_PLATFORM", 
			"PLATFORM", "PROJECT", "BUILDSCRIPT", "PATH", "CONFIGURATION", "BRACE_OPEN", 
			"BRACE_CLOSE", "PARENS_OPEN", "PARENS_CLOSE", "QUOTE_SINGLE", "QUOTE_DOUBLE", 
			"EQUALS", "SEMI", "COMMA", "BACKSLASH", "UNICODE_LATIN", "ID", "NAME", 
			"DIGIT", "Letter", "LetterOrDigit", "LetterOrDigitEtc", "COMMENT", "LINE_COMMENT", 
			"WS", "IGNORE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'file('", "'files('", "'testFixtures('", "'enforcedPlatform('", 
			"'platform('", "'project'", "'buildscript'", "'path:'", "'configuration:'", 
			"'{'", "'}'", "'('", "')'", "'''", "'\"'", "'='", "';'", "','", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEPENDENCIES", "FILE", "FILES", "TEST_FIXTURES", "ENFORCED_PLATFORM", 
			"PLATFORM", "PROJECT", "BUILDSCRIPT", "PATH", "CONFIGURATION", "BRACE_OPEN", 
			"BRACE_CLOSE", "PARENS_OPEN", "PARENS_CLOSE", "QUOTE_SINGLE", "QUOTE_DOUBLE", 
			"EQUALS", "SEMI", "COMMA", "BACKSLASH", "UNICODE_LATIN", "ID", "NAME", 
			"DIGIT", "COMMENT", "LINE_COMMENT", "WS", "IGNORE"
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


	public GradleScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GradleScriptLexer.g4"; }

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
		"\u0004\u0000\u001c\u0111\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000N\b\u0000"+
		"\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u00cd\b\u0015\n\u0015\f\u0015\u00d0\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u00d4\b\u0016\n\u0016\f\u0016\u00d7\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00df\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u00e3\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u00e7\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u00ed\b\u001b\n\u001b\f\u001b\u00f0"+
		"\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u00fb\b\u001c\n"+
		"\u001c\f\u001c\u00fe\t\u001c\u0001\u001c\u0003\u001c\u0101\b\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0004\u001d\u0108"+
		"\b\u001d\u000b\u001d\f\u001d\u0109\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u00ee\u0000\u001f\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00003\u00005\u00007\u00199\u001a;\u001b=\u001c\u0001\u0000\b\u0001"+
		"\u000009\u0005\u0000$$::AZ__az\u0002\u0000\u0000\u007f\u8000\ud800\u8000"+
		"\udbff\u0001\u0000\u8000\ud800\u8000\udbff\u0001\u0000\u8000\udc00\u8000"+
		"\udfff\u0005\u0000$$++-/{{}}\u0002\u0000\n\n\r\r\u0003\u0000\t\n\f\r "+
		" \u0118\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009"+
		"\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000"+
		"\u0000\u0000\u0001?\u0001\u0000\u0000\u0000\u0003T\u0001\u0000\u0000\u0000"+
		"\u0005Z\u0001\u0000\u0000\u0000\u0007a\u0001\u0000\u0000\u0000\to\u0001"+
		"\u0000\u0000\u0000\u000b\u0081\u0001\u0000\u0000\u0000\r\u008b\u0001\u0000"+
		"\u0000\u0000\u000f\u0093\u0001\u0000\u0000\u0000\u0011\u009f\u0001\u0000"+
		"\u0000\u0000\u0013\u00a5\u0001\u0000\u0000\u0000\u0015\u00b4\u0001\u0000"+
		"\u0000\u0000\u0017\u00b6\u0001\u0000\u0000\u0000\u0019\u00b8\u0001\u0000"+
		"\u0000\u0000\u001b\u00ba\u0001\u0000\u0000\u0000\u001d\u00bc\u0001\u0000"+
		"\u0000\u0000\u001f\u00be\u0001\u0000\u0000\u0000!\u00c0\u0001\u0000\u0000"+
		"\u0000#\u00c2\u0001\u0000\u0000\u0000%\u00c4\u0001\u0000\u0000\u0000\'"+
		"\u00c6\u0001\u0000\u0000\u0000)\u00c8\u0001\u0000\u0000\u0000+\u00ca\u0001"+
		"\u0000\u0000\u0000-\u00d1\u0001\u0000\u0000\u0000/\u00d8\u0001\u0000\u0000"+
		"\u00001\u00de\u0001\u0000\u0000\u00003\u00e2\u0001\u0000\u0000\u00005"+
		"\u00e6\u0001\u0000\u0000\u00007\u00e8\u0001\u0000\u0000\u00009\u00f6\u0001"+
		"\u0000\u0000\u0000;\u0107\u0001\u0000\u0000\u0000=\u010d\u0001\u0000\u0000"+
		"\u0000?@\u0005d\u0000\u0000@A\u0005e\u0000\u0000AB\u0005p\u0000\u0000"+
		"BC\u0005e\u0000\u0000CD\u0005n\u0000\u0000DE\u0005d\u0000\u0000EF\u0005"+
		"e\u0000\u0000FG\u0005n\u0000\u0000GH\u0005c\u0000\u0000HI\u0005i\u0000"+
		"\u0000IJ\u0005e\u0000\u0000JK\u0005s\u0000\u0000KO\u0001\u0000\u0000\u0000"+
		"LN\u0003;\u001d\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000RS\u0003\u0015\n\u0000S\u0002\u0001\u0000"+
		"\u0000\u0000TU\u0005f\u0000\u0000UV\u0005i\u0000\u0000VW\u0005l\u0000"+
		"\u0000WX\u0005e\u0000\u0000XY\u0005(\u0000\u0000Y\u0004\u0001\u0000\u0000"+
		"\u0000Z[\u0005f\u0000\u0000[\\\u0005i\u0000\u0000\\]\u0005l\u0000\u0000"+
		"]^\u0005e\u0000\u0000^_\u0005s\u0000\u0000_`\u0005(\u0000\u0000`\u0006"+
		"\u0001\u0000\u0000\u0000ab\u0005t\u0000\u0000bc\u0005e\u0000\u0000cd\u0005"+
		"s\u0000\u0000de\u0005t\u0000\u0000ef\u0005F\u0000\u0000fg\u0005i\u0000"+
		"\u0000gh\u0005x\u0000\u0000hi\u0005t\u0000\u0000ij\u0005u\u0000\u0000"+
		"jk\u0005r\u0000\u0000kl\u0005e\u0000\u0000lm\u0005s\u0000\u0000mn\u0005"+
		"(\u0000\u0000n\b\u0001\u0000\u0000\u0000op\u0005e\u0000\u0000pq\u0005"+
		"n\u0000\u0000qr\u0005f\u0000\u0000rs\u0005o\u0000\u0000st\u0005r\u0000"+
		"\u0000tu\u0005c\u0000\u0000uv\u0005e\u0000\u0000vw\u0005d\u0000\u0000"+
		"wx\u0005P\u0000\u0000xy\u0005l\u0000\u0000yz\u0005a\u0000\u0000z{\u0005"+
		"t\u0000\u0000{|\u0005f\u0000\u0000|}\u0005o\u0000\u0000}~\u0005r\u0000"+
		"\u0000~\u007f\u0005m\u0000\u0000\u007f\u0080\u0005(\u0000\u0000\u0080"+
		"\n\u0001\u0000\u0000\u0000\u0081\u0082\u0005p\u0000\u0000\u0082\u0083"+
		"\u0005l\u0000\u0000\u0083\u0084\u0005a\u0000\u0000\u0084\u0085\u0005t"+
		"\u0000\u0000\u0085\u0086\u0005f\u0000\u0000\u0086\u0087\u0005o\u0000\u0000"+
		"\u0087\u0088\u0005r\u0000\u0000\u0088\u0089\u0005m\u0000\u0000\u0089\u008a"+
		"\u0005(\u0000\u0000\u008a\f\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"p\u0000\u0000\u008c\u008d\u0005r\u0000\u0000\u008d\u008e\u0005o\u0000"+
		"\u0000\u008e\u008f\u0005j\u0000\u0000\u008f\u0090\u0005e\u0000\u0000\u0090"+
		"\u0091\u0005c\u0000\u0000\u0091\u0092\u0005t\u0000\u0000\u0092\u000e\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005b\u0000\u0000\u0094\u0095\u0005u\u0000"+
		"\u0000\u0095\u0096\u0005i\u0000\u0000\u0096\u0097\u0005l\u0000\u0000\u0097"+
		"\u0098\u0005d\u0000\u0000\u0098\u0099\u0005s\u0000\u0000\u0099\u009a\u0005"+
		"c\u0000\u0000\u009a\u009b\u0005r\u0000\u0000\u009b\u009c\u0005i\u0000"+
		"\u0000\u009c\u009d\u0005p\u0000\u0000\u009d\u009e\u0005t\u0000\u0000\u009e"+
		"\u0010\u0001\u0000\u0000\u0000\u009f\u00a0\u0005p\u0000\u0000\u00a0\u00a1"+
		"\u0005a\u0000\u0000\u00a1\u00a2\u0005t\u0000\u0000\u00a2\u00a3\u0005h"+
		"\u0000\u0000\u00a3\u00a4\u0005:\u0000\u0000\u00a4\u0012\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005c\u0000\u0000\u00a6\u00a7\u0005o\u0000\u0000\u00a7"+
		"\u00a8\u0005n\u0000\u0000\u00a8\u00a9\u0005f\u0000\u0000\u00a9\u00aa\u0005"+
		"i\u0000\u0000\u00aa\u00ab\u0005g\u0000\u0000\u00ab\u00ac\u0005u\u0000"+
		"\u0000\u00ac\u00ad\u0005r\u0000\u0000\u00ad\u00ae\u0005a\u0000\u0000\u00ae"+
		"\u00af\u0005t\u0000\u0000\u00af\u00b0\u0005i\u0000\u0000\u00b0\u00b1\u0005"+
		"o\u0000\u0000\u00b1\u00b2\u0005n\u0000\u0000\u00b2\u00b3\u0005:\u0000"+
		"\u0000\u00b3\u0014\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005{\u0000\u0000"+
		"\u00b5\u0016\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005}\u0000\u0000\u00b7"+
		"\u0018\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005(\u0000\u0000\u00b9\u001a"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005)\u0000\u0000\u00bb\u001c\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005\'\u0000\u0000\u00bd\u001e\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005\"\u0000\u0000\u00bf \u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005=\u0000\u0000\u00c1\"\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0005;\u0000\u0000\u00c3$\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0005,\u0000\u0000\u00c5&\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\\"+
		"\u0000\u0000\u00c7(\u0001\u0000\u0000\u0000\u00c8\u00c9\u0002!~\u0000"+
		"\u00c9*\u0001\u0000\u0000\u0000\u00ca\u00ce\u00031\u0018\u0000\u00cb\u00cd"+
		"\u00035\u001a\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf,\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d5\u00031\u0018\u0000\u00d2\u00d4\u00033\u0019\u0000"+
		"\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d6.\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0007\u0000\u0000\u0000\u00d90\u0001\u0000\u0000\u0000\u00da\u00df"+
		"\u0007\u0001\u0000\u0000\u00db\u00df\b\u0002\u0000\u0000\u00dc\u00dd\u0007"+
		"\u0003\u0000\u0000\u00dd\u00df\u0007\u0004\u0000\u0000\u00de\u00da\u0001"+
		"\u0000\u0000\u0000\u00de\u00db\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00df2\u0001\u0000\u0000\u0000\u00e0\u00e3\u00031\u0018"+
		"\u0000\u00e1\u00e3\u0007\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e34\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e7\u00033\u0019\u0000\u00e5\u00e7\u0007\u0005\u0000\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7"+
		"6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005/\u0000\u0000\u00e9\u00ea\u0005"+
		"*\u0000\u0000\u00ea\u00ee\u0001\u0000\u0000\u0000\u00eb\u00ed\t\u0000"+
		"\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0005*\u0000\u0000\u00f2\u00f3\u0005/\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0006\u001b\u0000\u0000"+
		"\u00f58\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005/\u0000\u0000\u00f7\u00f8"+
		"\u0005/\u0000\u0000\u00f8\u00fc\u0001\u0000\u0000\u0000\u00f9\u00fb\b"+
		"\u0006\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00ff\u0101\u0005\r\u0000\u0000\u0100\u00ff\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0005\n\u0000\u0000\u0103\u0104\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0006\u001c\u0000\u0000\u0105:\u0001\u0000\u0000\u0000"+
		"\u0106\u0108\u0007\u0007\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0006\u001d\u0001\u0000\u010c<\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\t\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0006\u001e\u0002\u0000\u0110>\u0001\u0000\u0000\u0000\u000b\u0000O\u00ce"+
		"\u00d5\u00de\u00e2\u00e6\u00ee\u00fc\u0100\u0109\u0003\u0000\u0003\u0000"+
		"\u0000\u0002\u0000\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}