// Generated from tiny.g4 by ANTLR 4.13.2

    import java.io.*;
    import java.lang.Object;
    import java.util.Vector;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class tinyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, IF=2, THEN=3, ELSE=4, EIF=5, WHILE=6, DO=7, EWHILE=8, WRITE=9, NOT=10, 
		READ=11, PO=12, PT=13, PC=14, OP_SUMA=15, OP_IGUAL=16, OP_MESPETIT=17, 
		ASSIGNACIO=18, ID=19, NUM=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "IF", "THEN", "ELSE", "EIF", "WHILE", "DO", "EWHILE", "WRITE", 
			"NOT", "READ", "PO", "PT", "PC", "OP_SUMA", "OP_IGUAL", "OP_MESPETIT", 
			"ASSIGNACIO", "DIGIT", "LLETRA", "ID", "NUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'if'", "'then'", "'else'", "'eif'", "'while'", "'do'", "'ewhile'", 
			"'write'", "'not'", "'read'", "'('", "')'", "';'", "'+'", "'='", "'<'", 
			"':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "IF", "THEN", "ELSE", "EIF", "WHILE", "DO", "EWHILE", "WRITE", 
			"NOT", "READ", "PO", "PT", "PC", "OP_SUMA", "OP_IGUAL", "OP_MESPETIT", 
			"ASSIGNACIO", "ID", "NUM"
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


	    SymTable TS = new SymTable<Registre>(1001);
	    int contVar=0;
	    Bytecode x;
	    Boolean errorsem=false;
	    Long saltLinia;


	public tinyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tiny.g4"; }

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
		"\u0004\u0000\u0014\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014y\b"+
		"\u0014\n\u0014\f\u0014|\t\u0014\u0001\u0015\u0004\u0015\u007f\b\u0015"+
		"\u000b\u0015\f\u0015\u0080\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0000\'\u0000)\u0013+\u0014\u0001\u0000\u0002\u0003\u0000\t\n"+
		"\r\r  \u0002\u0000AZaz\u0083\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001"+
		"-\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u00054\u0001"+
		"\u0000\u0000\u0000\u00079\u0001\u0000\u0000\u0000\t>\u0001\u0000\u0000"+
		"\u0000\u000bB\u0001\u0000\u0000\u0000\rH\u0001\u0000\u0000\u0000\u000f"+
		"K\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013X\u0001"+
		"\u0000\u0000\u0000\u0015\\\u0001\u0000\u0000\u0000\u0017a\u0001\u0000"+
		"\u0000\u0000\u0019c\u0001\u0000\u0000\u0000\u001be\u0001\u0000\u0000\u0000"+
		"\u001dg\u0001\u0000\u0000\u0000\u001fi\u0001\u0000\u0000\u0000!k\u0001"+
		"\u0000\u0000\u0000#m\u0001\u0000\u0000\u0000%p\u0001\u0000\u0000\u0000"+
		"\'r\u0001\u0000\u0000\u0000)t\u0001\u0000\u0000\u0000+~\u0001\u0000\u0000"+
		"\u0000-.\u0007\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0006\u0000"+
		"\u0000\u00000\u0002\u0001\u0000\u0000\u000012\u0005i\u0000\u000023\u0005"+
		"f\u0000\u00003\u0004\u0001\u0000\u0000\u000045\u0005t\u0000\u000056\u0005"+
		"h\u0000\u000067\u0005e\u0000\u000078\u0005n\u0000\u00008\u0006\u0001\u0000"+
		"\u0000\u00009:\u0005e\u0000\u0000:;\u0005l\u0000\u0000;<\u0005s\u0000"+
		"\u0000<=\u0005e\u0000\u0000=\b\u0001\u0000\u0000\u0000>?\u0005e\u0000"+
		"\u0000?@\u0005i\u0000\u0000@A\u0005f\u0000\u0000A\n\u0001\u0000\u0000"+
		"\u0000BC\u0005w\u0000\u0000CD\u0005h\u0000\u0000DE\u0005i\u0000\u0000"+
		"EF\u0005l\u0000\u0000FG\u0005e\u0000\u0000G\f\u0001\u0000\u0000\u0000"+
		"HI\u0005d\u0000\u0000IJ\u0005o\u0000\u0000J\u000e\u0001\u0000\u0000\u0000"+
		"KL\u0005e\u0000\u0000LM\u0005w\u0000\u0000MN\u0005h\u0000\u0000NO\u0005"+
		"i\u0000\u0000OP\u0005l\u0000\u0000PQ\u0005e\u0000\u0000Q\u0010\u0001\u0000"+
		"\u0000\u0000RS\u0005w\u0000\u0000ST\u0005r\u0000\u0000TU\u0005i\u0000"+
		"\u0000UV\u0005t\u0000\u0000VW\u0005e\u0000\u0000W\u0012\u0001\u0000\u0000"+
		"\u0000XY\u0005n\u0000\u0000YZ\u0005o\u0000\u0000Z[\u0005t\u0000\u0000"+
		"[\u0014\u0001\u0000\u0000\u0000\\]\u0005r\u0000\u0000]^\u0005e\u0000\u0000"+
		"^_\u0005a\u0000\u0000_`\u0005d\u0000\u0000`\u0016\u0001\u0000\u0000\u0000"+
		"ab\u0005(\u0000\u0000b\u0018\u0001\u0000\u0000\u0000cd\u0005)\u0000\u0000"+
		"d\u001a\u0001\u0000\u0000\u0000ef\u0005;\u0000\u0000f\u001c\u0001\u0000"+
		"\u0000\u0000gh\u0005+\u0000\u0000h\u001e\u0001\u0000\u0000\u0000ij\u0005"+
		"=\u0000\u0000j \u0001\u0000\u0000\u0000kl\u0005<\u0000\u0000l\"\u0001"+
		"\u0000\u0000\u0000mn\u0005:\u0000\u0000no\u0005=\u0000\u0000o$\u0001\u0000"+
		"\u0000\u0000pq\u000209\u0000q&\u0001\u0000\u0000\u0000rs\u0007\u0001\u0000"+
		"\u0000s(\u0001\u0000\u0000\u0000tz\u0003\'\u0013\u0000uy\u0003\'\u0013"+
		"\u0000vy\u0003%\u0012\u0000wy\u0005_\u0000\u0000xu\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{*\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}\u007f\u0003%\u0012\u0000~}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081,\u0001\u0000\u0000"+
		"\u0000\u0004\u0000xz\u0080\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}