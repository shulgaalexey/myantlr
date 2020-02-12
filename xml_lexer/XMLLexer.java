// Generated from XMLLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN=1, COMMENT=2, EntityRef=3, TEXT=4, CLOSE=5, SLASH_CLOSE=6, EQUALS=7, 
		STRING=8, SlashName=9, Name=10, S=11;
	public static final int
		INSIDE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPEN", "COMMENT", "EntityRef", "TEXT", "CLOSE", "SLASH_CLOSE", "EQUALS", 
			"STRING", "SlashName", "Name", "S", "ALPHA", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", null, null, null, null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN", "COMMENT", "EntityRef", "TEXT", "CLOSE", "SLASH_CLOSE", 
			"EQUALS", "STRING", "SlashName", "Name", "S"
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


	public XMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XMLLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rf\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\6\4\66\n\4"+
		"\r\4\16\4\67\3\4\3\4\3\5\6\5=\n\5\r\5\16\5>\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\7\tM\n\t\f\t\16\tP\13\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\7\13Z\n\13\f\13\16\13]\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\4*N\2\17\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\2\34"+
		"\2\4\2\3\7\3\2c|\4\2((>>\5\2\13\f\17\17\"\"\4\2C\\c|\3\2\62;\2h\2\4\3"+
		"\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\3\f\3\2\2\2\3\16\3\2\2\2\3"+
		"\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\4\36\3"+
		"\2\2\2\6\"\3\2\2\2\b\63\3\2\2\2\n<\3\2\2\2\f@\3\2\2\2\16D\3\2\2\2\20H"+
		"\3\2\2\2\22J\3\2\2\2\24S\3\2\2\2\26V\3\2\2\2\30^\3\2\2\2\32b\3\2\2\2\34"+
		"d\3\2\2\2\36\37\7>\2\2\37 \3\2\2\2 !\b\2\2\2!\5\3\2\2\2\"#\7>\2\2#$\7"+
		"#\2\2$%\7/\2\2%&\7/\2\2&*\3\2\2\2\')\13\2\2\2(\'\3\2\2\2),\3\2\2\2*+\3"+
		"\2\2\2*(\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7/\2\2./\7/\2\2/\60\7@\2\2\60\61"+
		"\3\2\2\2\61\62\b\3\3\2\62\7\3\2\2\2\63\65\7(\2\2\64\66\t\2\2\2\65\64\3"+
		"\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\7=\2\2:\t\3"+
		"\2\2\2;=\n\3\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\13\3\2\2\2@"+
		"A\7@\2\2AB\3\2\2\2BC\b\6\4\2C\r\3\2\2\2DE\7@\2\2EF\3\2\2\2FG\b\7\4\2G"+
		"\17\3\2\2\2HI\7?\2\2I\21\3\2\2\2JN\7$\2\2KM\13\2\2\2LK\3\2\2\2MP\3\2\2"+
		"\2NO\3\2\2\2NL\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7$\2\2R\23\3\2\2\2ST\7\61"+
		"\2\2TU\5\26\13\2U\25\3\2\2\2V[\5\32\r\2WZ\5\32\r\2XZ\5\34\16\2YW\3\2\2"+
		"\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\27\3\2\2\2][\3\2\2\2^_\t"+
		"\4\2\2_`\3\2\2\2`a\b\f\3\2a\31\3\2\2\2bc\t\5\2\2c\33\3\2\2\2de\t\6\2\2"+
		"e\35\3\2\2\2\n\2\3*\67>NY[\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}