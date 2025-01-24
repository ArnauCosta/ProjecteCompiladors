// Generated from tiny.g4 by ANTLR 4.13.2

    import java.io.*;
    import java.lang.Object;
    import java.util.Vector;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class tinyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, IF=2, THEN=3, ELSE=4, EIF=5, WHILE=6, DO=7, EWHILE=8, WRITE=9, NOT=10, 
		READ=11, PO=12, PT=13, PC=14, OP_SUMA=15, OP_IGUAL=16, OP_MESPETIT=17, 
		ASSIGNACIO=18, ID=19, NUM=20;
	public static final int
		RULE_p = 0, RULE_c = 1, RULE_e = 2, RULE_e2 = 3, RULE_e3 = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"p", "c", "e", "e2", "e3"
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

	@Override
	public String getGrammarFileName() { return "tiny.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    SymTable TS = new SymTable<Registre>(1001);
	    int contVar=0;
	    Bytecode x;
	    Boolean errorsem=false;
	    Long saltLinia;

	public tinyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PContext extends ParserRuleContext {
		public CContext cc;
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyListener ) ((tinyListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyListener ) ((tinyListener)listener).exitP(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_p);

			  x=new Bytecode("compilat");
			  saltLinia=x.addConstant("S","\n");
			  Vector<Long> trad = new Vector<Long>(10);
			  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				((PContext)_localctx).cc = c();
				trad.addAll(((PContext)_localctx).cc.trad);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 524868L) != 0) );

				   	if (!errorsem)
				   		{
				   		trad.add(x.RETURN);
				   		x.addMainCode(10L,10L,trad);
				   		x.write();
				   		}
				  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CContext extends ParserRuleContext {
		public Vector<Long> trad;
		public Token i;
		public EContext ee;
		public CContext cc;
		public CContext cc2;
		public TerminalNode ASSIGNACIO() { return getToken(tinyParser.ASSIGNACIO, 0); }
		public TerminalNode PC() { return getToken(tinyParser.PC, 0); }
		public TerminalNode ID() { return getToken(tinyParser.ID, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode IF() { return getToken(tinyParser.IF, 0); }
		public TerminalNode THEN() { return getToken(tinyParser.THEN, 0); }
		public TerminalNode EIF() { return getToken(tinyParser.EIF, 0); }
		public TerminalNode ELSE() { return getToken(tinyParser.ELSE, 0); }
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public TerminalNode WHILE() { return getToken(tinyParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(tinyParser.DO, 0); }
		public TerminalNode EWHILE() { return getToken(tinyParser.EWHILE, 0); }
		public TerminalNode WRITE() { return getToken(tinyParser.WRITE, 0); }
		public TerminalNode PO() { return getToken(tinyParser.PO, 0); }
		public TerminalNode PT() { return getToken(tinyParser.PT, 0); }
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyListener ) ((tinyListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyListener ) ((tinyListener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_c);

			((CContext)_localctx).trad = new Vector<Long>(10);
		    
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				((CContext)_localctx).i = match(ID);
				setState(20);
				match(ASSIGNACIO);
				setState(21);
				((CContext)_localctx).ee = e();
				setState(22);
				match(PC);

					   if (((CContext)_localctx).ee.tipus=='I')
					   	{
					   	Registre r;
					   	if (!(TS.existeix((((CContext)_localctx).i!=null?((CContext)_localctx).i.getText():null))))
					   		{
					   		r=new Registre((((CContext)_localctx).i!=null?((CContext)_localctx).i.getText():null),'I',contVar++);
					   		TS.inserir((((CContext)_localctx).i!=null?((CContext)_localctx).i.getText():null),r);
					   		}
					   	r=(Registre)TS.obtenir((((CContext)_localctx).i!=null?((CContext)_localctx).i.getText():null));
					   	((CContext)_localctx).trad = ((CContext)_localctx).ee.trad;
					   	_localctx.trad.add(x.ISTORE);
					   	_localctx.trad.add(new Long(r.getAdreca()));
					   	}
					   
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(IF);
				setState(26);
				((CContext)_localctx).ee = e();
				Vector<Long> trad2 = new Vector<Long>(10);Vector<Long> trad3 = new Vector<Long>(10);
				setState(28);
				match(THEN);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524868L) != 0)) {
					{
					{
					setState(29);
					((CContext)_localctx).cc = c();
					trad2.addAll(((CContext)_localctx).cc.trad);
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(37);
					match(ELSE);
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524868L) != 0)) {
						{
						{
						setState(38);
						((CContext)_localctx).cc2 = c();
						trad3.addAll(((CContext)_localctx).cc2.trad);
						}
						}
						setState(45);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(48);
				match(EIF);

					    if (((CContext)_localctx).ee.tipus == 'Z')
					   	{
					   	((CContext)_localctx).trad = ((CContext)_localctx).ee.trad;
					   	_localctx.trad.add(x.IFNE);
					   	Long salt=trad2.size()+6L;
					   	_localctx.trad.add(x.nByte(salt,2));
					   	_localctx.trad.add(x.nByte(salt,1));
					   	_localctx.trad.addAll(trad2);
					   	_localctx.trad.add(x.GOTO);
					   	salt=trad3.size()+3L;
					   	_localctx.trad.add(x.nByte(salt,2));
					   	_localctx.trad.add(x.nByte(salt,1));
					   	_localctx.trad.addAll(trad3);
					   	}
					   
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(WHILE);
				setState(52);
				((CContext)_localctx).ee = e();
				Vector<Long> trad2 = new Vector<Long>(10);
				setState(54);
				match(DO);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524868L) != 0)) {
					{
					{
					setState(55);
					((CContext)_localctx).cc = c();
					trad2.addAll(((CContext)_localctx).cc.trad);
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				match(EWHILE);

					   if (((CContext)_localctx).ee.tipus == 'Z')
					   	{
					   	((CContext)_localctx).trad = ((CContext)_localctx).ee.trad;
					   	_localctx.trad.add(x.IFNE);
					   	Long salt=trad2.size()+6L;
					   	_localctx.trad.add(x.nByte(salt,2));
					   	_localctx.trad.add(x.nByte(salt,1));
					   	_localctx.trad.addAll(trad2);
					   	salt=0L-_localctx.trad.size();
					   	_localctx.trad.add(x.GOTO);
					   	_localctx.trad.add(x.nByte(salt,2));
					   	_localctx.trad.add(x.nByte(salt,1));
					   	}
					   
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(WRITE);
				setState(67);
				match(PO);
				setState(68);
				((CContext)_localctx).ee = e();
				setState(69);
				match(PT);
				setState(70);
				match(PC);

					   if (((CContext)_localctx).ee.tipus != 'E')
					   	{
					   	((CContext)_localctx).trad = ((CContext)_localctx).ee.trad;
					   	_localctx.trad.add(x.INVOKESTATIC);
					   	if (((CContext)_localctx).ee.tipus=='I')
					   		{
					   		_localctx.trad.add(x.nByte(x.mPutInt,2));
					   		_localctx.trad.add(x.nByte(x.mPutInt,1));
					   		}
					   	else
					   		{
					   		_localctx.trad.add(x.nByte(x.mPutBoolean,2));
					   		_localctx.trad.add(x.nByte(x.mPutBoolean,1));
					   		}
				    	   	_localctx.trad.add(x.LDC_W);
					   	_localctx.trad.add(x.nByte(saltLinia,2));
					   	_localctx.trad.add(x.nByte(saltLinia,1));
				    	   	_localctx.trad.add(x.INVOKESTATIC);
					   	_localctx.trad.add(x.nByte(x.mPutString,2));
					   	_localctx.trad.add(x.nByte(x.mPutString,1));
					   	}
					   
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EContext extends ParserRuleContext {
		public Vector<Long> trad;
		public char tipus;
		public E2Context ee;
		public EContext e22;
		public E2Context e2() {
			return getRuleContext(E2Context.class,0);
		}
		public TerminalNode OP_IGUAL() { return getToken(tinyParser.OP_IGUAL, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyListener ) ((tinyListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyListener ) ((tinyListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_e);

			((EContext)_localctx).trad = new Vector<Long>(10);
			
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((EContext)_localctx).ee = e2();

			         ((EContext)_localctx).trad = ((EContext)_localctx).ee.trad;
			         ((EContext)_localctx).tipus = ((EContext)_localctx).ee.tipus;
			        
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(77);
				match(OP_IGUAL);
				setState(78);
				((EContext)_localctx).e22 = e();

					 if (((EContext)_localctx).ee.tipus==((EContext)_localctx).e22.tipus)
							{
							_localctx.trad.addAll(((EContext)_localctx).e22.trad);
							_localctx.trad.add(x.IF_ICMPNE);
					   		Long salt=8L;
					   		_localctx.trad.add(x.nByte(salt,2));
					   		_localctx.trad.add(x.nByte(salt,1));
							_localctx.trad.add(x.BIPUSH);
							_localctx.trad.add(0L);
							_localctx.trad.add(x.GOTO);
					   		salt=5L;
					   		_localctx.trad.add(x.nByte(salt,2));
					   		_localctx.trad.add(x.nByte(salt,1));
							_localctx.trad.add(x.BIPUSH);
							_localctx.trad.add(1L);
							((EContext)_localctx).tipus = 'Z';
							}
						else
							{
							((EContext)_localctx).tipus = 'E';
							}
						
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class E2Context extends ParserRuleContext {
		public Vector<Long> trad;
		public char tipus;
		public E3Context ee;
		public E2Context e22;
		public E2Context e2;
		public E3Context e3() {
			return getRuleContext(E3Context.class,0);
		}
		public TerminalNode OP_SUMA() { return getToken(tinyParser.OP_SUMA, 0); }
		public E2Context e2() {
			return getRuleContext(E2Context.class,0);
		}
		public E2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyListener ) ((tinyListener)listener).enterE2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyListener ) ((tinyListener)listener).exitE2(this);
		}
	}

	public final E2Context e2() throws RecognitionException {
		E2Context _localctx = new E2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_e2);

			((E2Context)_localctx).trad = new Vector<Long>(10);
			
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			((E2Context)_localctx).ee = e3();

			         ((E2Context)_localctx).trad = ((E2Context)_localctx).ee.trad;
			         ((E2Context)_localctx).tipus = ((E2Context)_localctx).ee.tipus;
			        
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(85);
				match(OP_SUMA);
				setState(86);
				((E2Context)_localctx).e22 = ((E2Context)_localctx).e2 = e2();

						if (((E2Context)_localctx).ee.tipus=='I' && ((E2Context)_localctx).e22.tipus=='I')
							{
							((E2Context)_localctx).trad = ((E2Context)_localctx).ee.trad;
							_localctx.trad.addAll(((E2Context)_localctx).e2.trad);
							_localctx.trad.add(x.IADD);
							((E2Context)_localctx).tipus = 'I';
							}
						else
							{
							((E2Context)_localctx).tipus = 'E';
							}
						
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class E3Context extends ParserRuleContext {
		public Vector<Long> trad;
		public char tipus;
		public EContext ee;
		public Token n;
		public Token i;
		public TerminalNode NOT() { return getToken(tinyParser.NOT, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode NUM() { return getToken(tinyParser.NUM, 0); }
		public TerminalNode ID() { return getToken(tinyParser.ID, 0); }
		public TerminalNode READ() { return getToken(tinyParser.READ, 0); }
		public TerminalNode PO() { return getToken(tinyParser.PO, 0); }
		public TerminalNode PT() { return getToken(tinyParser.PT, 0); }
		public E3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyListener ) ((tinyListener)listener).enterE3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyListener ) ((tinyListener)listener).exitE3(this);
		}
	}

	public final E3Context e3() throws RecognitionException {
		E3Context _localctx = new E3Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_e3);

			((E3Context)_localctx).trad = new Vector<Long>(10);
			
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(91);
				match(NOT);
				setState(92);
				((E3Context)_localctx).ee = e();
				}

						if (((E3Context)_localctx).ee.tipus=='Z')
							{
							((E3Context)_localctx).trad = ((E3Context)_localctx).ee.trad;
							_localctx.trad.add(x.IFEQ);
					   		Long salt=8L;
					   		_localctx.trad.add(x.nByte(salt,2));
					   		_localctx.trad.add(x.nByte(salt,1));
							_localctx.trad.add(x.BIPUSH);
							_localctx.trad.add(0L);
							_localctx.trad.add(x.GOTO);
					   		salt=5L;
					   		_localctx.trad.add(x.nByte(salt,2));
					   		_localctx.trad.add(x.nByte(salt,1));
							_localctx.trad.add(x.BIPUSH);
							_localctx.trad.add(1L);
							((E3Context)_localctx).tipus = 'Z';
							}
						else
							{
							((E3Context)_localctx).tipus = 'E';
							}
						
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				((E3Context)_localctx).n = match(NUM);

						_localctx.trad.add(x.BIPUSH);
						_localctx.trad.add(new Long((((E3Context)_localctx).n!=null?((E3Context)_localctx).n.getText():null)));
						((E3Context)_localctx).tipus = 'I';
						
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				((E3Context)_localctx).i = match(ID);

						if (TS.existeix((((E3Context)_localctx).i!=null?((E3Context)_localctx).i.getText():null)))
							{
							Registre r=(Registre)TS.obtenir((((E3Context)_localctx).i!=null?((E3Context)_localctx).i.getText():null));
							_localctx.trad.add(x.ILOAD);
							_localctx.trad.add(new Long(r.getAdreca()));
							((E3Context)_localctx).tipus = 'I';
							}
						else
							{
							errorsem=true;
							((E3Context)_localctx).tipus = 'E';
							}
						
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(READ);

					   	_localctx.trad.add(x.INVOKESTATIC);
					   	_localctx.trad.add(x.nByte(x.mGetInt,2));
					   	_localctx.trad.add(x.nByte(x.mGetInt,1));
					   	((E3Context)_localctx).tipus = 'I';
						
				}
				break;
			case PO:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				match(PO);
				setState(103);
				((E3Context)_localctx).ee = e();
				setState(104);
				match(PT);

				         ((E3Context)_localctx).trad = ((E3Context)_localctx).ee.trad;
				         ((E3Context)_localctx).tipus = ((E3Context)_localctx).ee.tipus;
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014n\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001!\b\u0001"+
		"\n\u0001\f\u0001$\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001*\b\u0001\n\u0001\f\u0001-\t\u0001\u0003\u0001/\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001;\b\u0001\n\u0001"+
		"\f\u0001>\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001J\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002R\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Z\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004l\b\u0004\u0001"+
		"\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000v\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004K\u0001"+
		"\u0000\u0000\u0000\u0006S\u0001\u0000\u0000\u0000\bk\u0001\u0000\u0000"+
		"\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0006\u0000\uffff\uffff"+
		"\u0000\f\u000e\u0001\u0000\u0000\u0000\r\n\u0001\u0000\u0000\u0000\u000e"+
		"\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012"+
		"\u0006\u0000\uffff\uffff\u0000\u0012\u0001\u0001\u0000\u0000\u0000\u0013"+
		"\u0014\u0005\u0013\u0000\u0000\u0014\u0015\u0005\u0012\u0000\u0000\u0015"+
		"\u0016\u0003\u0004\u0002\u0000\u0016\u0017\u0005\u000e\u0000\u0000\u0017"+
		"\u0018\u0006\u0001\uffff\uffff\u0000\u0018J\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0005\u0002\u0000\u0000\u001a\u001b\u0003\u0004\u0002\u0000\u001b"+
		"\u001c\u0006\u0001\uffff\uffff\u0000\u001c\"\u0005\u0003\u0000\u0000\u001d"+
		"\u001e\u0003\u0002\u0001\u0000\u001e\u001f\u0006\u0001\uffff\uffff\u0000"+
		"\u001f!\u0001\u0000\u0000\u0000 \u001d\u0001\u0000\u0000\u0000!$\u0001"+
		"\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000"+
		"#.\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%+\u0005\u0004\u0000"+
		"\u0000&\'\u0003\u0002\u0001\u0000\'(\u0006\u0001\uffff\uffff\u0000(*\u0001"+
		"\u0000\u0000\u0000)&\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000.%\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u000001\u0005\u0005\u0000\u000012\u0006"+
		"\u0001\uffff\uffff\u00002J\u0001\u0000\u0000\u000034\u0005\u0006\u0000"+
		"\u000045\u0003\u0004\u0002\u000056\u0006\u0001\uffff\uffff\u00006<\u0005"+
		"\u0007\u0000\u000078\u0003\u0002\u0001\u000089\u0006\u0001\uffff\uffff"+
		"\u00009;\u0001\u0000\u0000\u0000:7\u0001\u0000\u0000\u0000;>\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0005\b\u0000\u0000@A\u0006"+
		"\u0001\uffff\uffff\u0000AJ\u0001\u0000\u0000\u0000BC\u0005\t\u0000\u0000"+
		"CD\u0005\f\u0000\u0000DE\u0003\u0004\u0002\u0000EF\u0005\r\u0000\u0000"+
		"FG\u0005\u000e\u0000\u0000GH\u0006\u0001\uffff\uffff\u0000HJ\u0001\u0000"+
		"\u0000\u0000I\u0013\u0001\u0000\u0000\u0000I\u0019\u0001\u0000\u0000\u0000"+
		"I3\u0001\u0000\u0000\u0000IB\u0001\u0000\u0000\u0000J\u0003\u0001\u0000"+
		"\u0000\u0000KL\u0003\u0006\u0003\u0000LQ\u0006\u0002\uffff\uffff\u0000"+
		"MN\u0005\u0010\u0000\u0000NO\u0003\u0004\u0002\u0000OP\u0006\u0002\uffff"+
		"\uffff\u0000PR\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000R\u0005\u0001\u0000\u0000\u0000ST\u0003\b\u0004\u0000"+
		"TY\u0006\u0003\uffff\uffff\u0000UV\u0005\u000f\u0000\u0000VW\u0003\u0006"+
		"\u0003\u0000WX\u0006\u0003\uffff\uffff\u0000XZ\u0001\u0000\u0000\u0000"+
		"YU\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0007\u0001\u0000"+
		"\u0000\u0000[\\\u0005\n\u0000\u0000\\]\u0003\u0004\u0002\u0000]^\u0001"+
		"\u0000\u0000\u0000^_\u0006\u0004\uffff\uffff\u0000_l\u0001\u0000\u0000"+
		"\u0000`a\u0005\u0014\u0000\u0000al\u0006\u0004\uffff\uffff\u0000bc\u0005"+
		"\u0013\u0000\u0000cl\u0006\u0004\uffff\uffff\u0000de\u0005\u000b\u0000"+
		"\u0000el\u0006\u0004\uffff\uffff\u0000fg\u0005\f\u0000\u0000gh\u0003\u0004"+
		"\u0002\u0000hi\u0005\r\u0000\u0000ij\u0006\u0004\uffff\uffff\u0000jl\u0001"+
		"\u0000\u0000\u0000k[\u0001\u0000\u0000\u0000k`\u0001\u0000\u0000\u0000"+
		"kb\u0001\u0000\u0000\u0000kd\u0001\u0000\u0000\u0000kf\u0001\u0000\u0000"+
		"\u0000l\t\u0001\u0000\u0000\u0000\t\u000f\"+.<IQYk";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}