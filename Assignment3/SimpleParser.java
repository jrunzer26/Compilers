// Generated from Simple.g4 by ANTLR 4.4

import java.util.TreeMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, NUM=14, ID=15, WS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "')'", "','", "'+'", "'let'", "'-'", "'*'", "'('", 
		"'print'", "'/'", "'='", "'}'", "'repeat'", "NUM", "ID", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_term = 2, RULE_factor = 3, RULE_repeatStmt = 4, 
		RULE_block = 5, RULE_stmt = 6, RULE_printStmt = 7, RULE_exprlist = 8, 
		RULE_assignStmt = 9, RULE_var = 10;
	public static final String[] ruleNames = {
		"prog", "expr", "term", "factor", "repeatStmt", "block", "stmt", "printStmt", 
		"exprlist", "assignStmt", "var"
	};

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		// The String is the variable name, and the Integer will be the register location
		public static TreeMap<String, Integer> decVars = new TreeMap<String, Integer>();
		public static int nextRegister = 0;

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{

					System.out.println(".class public SimpleStuff");
					System.out.println(".super java/lang/Object");
					System.out.println(".method public <init>()V");
			  		System.out.println("aload_0");
			  		System.out.println("invokenonvirtual java/lang/Object/<init>()V");
			  		System.out.println("return");
					System.out.println(".end method\n");
					System.out.println(".method public static main([Ljava/lang/String;)V");
			  		System.out.println(".limit stack 10");
			  		System.out.println(".limit locals 10");
				
			setState(23); block();
			  
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

	public static class ExprContext extends ParserRuleContext {
		public int val;
		public TermContext term;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); ((ExprContext)_localctx).term = term();
				 ((ExprContext)_localctx).val =  ((ExprContext)_localctx).term.val; 
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(28); match(T__9);
					setState(29); ((ExprContext)_localctx).term = term();
					 ((ExprContext)_localctx).val =  _localctx.val + ((ExprContext)_localctx).term.val; 
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37); ((ExprContext)_localctx).term = term();
				 ((ExprContext)_localctx).val =  ((ExprContext)_localctx).term.val; 
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(39); match(T__7);
					setState(40); ((ExprContext)_localctx).term = term();
					 ((ExprContext)_localctx).val =  _localctx.val - ((ExprContext)_localctx).term.val; 
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class TermContext extends ParserRuleContext {
		public int val;
		public FactorContext factor;
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		int _la;
		try {
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); ((TermContext)_localctx).factor = factor();
				 ((TermContext)_localctx).val =  ((TermContext)_localctx).factor.val; 
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(52); match(T__6);
					setState(53); ((TermContext)_localctx).factor = factor();
					 ((TermContext)_localctx).val =  _localctx.val * ((TermContext)_localctx).factor.val; 
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); ((TermContext)_localctx).factor = factor();
				 ((TermContext)_localctx).val =  ((TermContext)_localctx).factor.val; 
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(63); match(T__3);
					setState(64); ((TermContext)_localctx).factor = factor();
					 ((TermContext)_localctx).val =  _localctx.val / ((TermContext)_localctx).factor.val; 
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class FactorContext extends ParserRuleContext {
		public int val;
		public ExprContext expr;
		public VarContext var;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_factor);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); match(T__5);
				setState(75); ((FactorContext)_localctx).expr = expr();
				setState(76); match(T__11);
				 ((FactorContext)_localctx).val =  ((FactorContext)_localctx).expr.val; 
				}
				break;
			case NUM:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); ((FactorContext)_localctx).var = var();
				 ((FactorContext)_localctx).val =  ((FactorContext)_localctx).var.number; 
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

	public static class RepeatStmtContext extends ParserRuleContext {
		public String s;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RepeatStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStmt; }
	}

	public final RepeatStmtContext repeatStmt() throws RecognitionException {
		RepeatStmtContext _localctx = new RepeatStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_repeatStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(T__0);
			setState(85); expr();
			setState(86); match(T__12);
			setState(87); block();
			setState(88); match(T__1);

						((RepeatStmtContext)_localctx).s =  "";
					
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

	public static class BlockContext extends ParserRuleContext {
		public String s;
		public StmtContext stmt;
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91); ((BlockContext)_localctx).stmt = stmt();
				 
							if (_localctx.s != null)
								((BlockContext)_localctx).s =  _localctx.s + ((BlockContext)_localctx).stmt.s;
							else
								((BlockContext)_localctx).s =  ((BlockContext)_localctx).stmt.s;
						
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__4) | (1L << T__0))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public String s;
		public PrintStmtContext printStmt;
		public AssignStmtContext assignStmt;
		public RepeatStmtContext repeatStmt() {
			return getRuleContext(RepeatStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(107);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); ((StmtContext)_localctx).printStmt = printStmt();
				 ((StmtContext)_localctx).s =  ((StmtContext)_localctx).printStmt.s; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); ((StmtContext)_localctx).assignStmt = assignStmt();
				 ((StmtContext)_localctx).s =  ((StmtContext)_localctx).assignStmt.s; 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(104); repeatStmt();
				 ((StmtContext)_localctx).s =  ""; 
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

	public static class PrintStmtContext extends ParserRuleContext {
		public String s;
		public ExprlistContext exprlist;
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(T__4);
			setState(110); match(T__5);
			setState(111); ((PrintStmtContext)_localctx).exprlist = exprlist();
			setState(112); match(T__11);
			 ((PrintStmtContext)_localctx).s =  ((PrintStmtContext)_localctx).exprlist.s; 
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

	public static class ExprlistContext extends ParserRuleContext {
		public String s;
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

					System.out.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
				
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116); ((ExprlistContext)_localctx).e1 = expr();
					setState(117); match(T__10);
					 
								((ExprlistContext)_localctx).s =  "";
					    			System.out.println("invokevirtual java/io/PrintStream/println(I)V");
							
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}

					System.out.println("; Print the value");
					System.out.println("getstatic java/lang/System/out Ljava/io/PrintStream;");
				
			setState(126); ((ExprlistContext)_localctx).e2 = expr();

			    		System.out.println("invokevirtual java/io/PrintStream/println(I)V");
				
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

	public static class AssignStmtContext extends ParserRuleContext {
		public String s;
		public Token ID;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(T__8);
			setState(130); ((AssignStmtContext)_localctx).ID = match(ID);
			setState(131); match(T__2);
			setState(132); expr();
			 
						decVars.put( ((AssignStmtContext)_localctx).ID.getText(), nextRegister++);
						((AssignStmtContext)_localctx).s =  "";
						System.out.println("istore " + decVars.get(((AssignStmtContext)_localctx).ID.getText()));
					
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

	public static class VarContext extends ParserRuleContext {
		public int number;
		public Token x;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		try {
			setState(139);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); ((VarContext)_localctx).x = match(ID);
				 
							((VarContext)_localctx).number =  decVars.get(((VarContext)_localctx).x.getText());
							System.out.println("; load the variable from the register");
							System.out.println("iload " + decVars.get(((VarContext)_localctx).x.getText()));
						
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); ((VarContext)_localctx).x = match(NUM);
				 
							((VarContext)_localctx).number =  Integer.parseInt(((VarContext)_localctx).x.getText());
							System.out.println("ldc " + ((VarContext)_localctx).x.getText());
						
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22\u0090\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\5\3\63\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4F\n\4\f\4\16\4I\13\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5U\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\6\7a\n\7\r\7\16\7b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u008e\n\f\3\f\2\2\r\2\4\6\b\n\f\16"+
		"\20\22\24\26\2\2\u0090\2\30\3\2\2\2\4\62\3\2\2\2\6J\3\2\2\2\bT\3\2\2\2"+
		"\nV\3\2\2\2\f`\3\2\2\2\16m\3\2\2\2\20o\3\2\2\2\22u\3\2\2\2\24\u0083\3"+
		"\2\2\2\26\u008d\3\2\2\2\30\31\b\2\1\2\31\32\5\f\7\2\32\33\b\2\1\2\33\3"+
		"\3\2\2\2\34\35\5\6\4\2\35$\b\3\1\2\36\37\7\6\2\2\37 \5\6\4\2 !\b\3\1\2"+
		"!#\3\2\2\2\"\36\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\63\3\2\2\2&$\3"+
		"\2\2\2\'(\5\6\4\2(/\b\3\1\2)*\7\b\2\2*+\5\6\4\2+,\b\3\1\2,.\3\2\2\2-)"+
		"\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\62"+
		"\34\3\2\2\2\62\'\3\2\2\2\63\5\3\2\2\2\64\65\5\b\5\2\65<\b\4\1\2\66\67"+
		"\7\t\2\2\678\5\b\5\289\b\4\1\29;\3\2\2\2:\66\3\2\2\2;>\3\2\2\2<:\3\2\2"+
		"\2<=\3\2\2\2=K\3\2\2\2><\3\2\2\2?@\5\b\5\2@G\b\4\1\2AB\7\f\2\2BC\5\b\5"+
		"\2CD\b\4\1\2DF\3\2\2\2EA\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2"+
		"\2IG\3\2\2\2J\64\3\2\2\2J?\3\2\2\2K\7\3\2\2\2LM\7\n\2\2MN\5\4\3\2NO\7"+
		"\4\2\2OP\b\5\1\2PU\3\2\2\2QR\5\26\f\2RS\b\5\1\2SU\3\2\2\2TL\3\2\2\2TQ"+
		"\3\2\2\2U\t\3\2\2\2VW\7\17\2\2WX\5\4\3\2XY\7\3\2\2YZ\5\f\7\2Z[\7\16\2"+
		"\2[\\\b\6\1\2\\\13\3\2\2\2]^\5\16\b\2^_\b\7\1\2_a\3\2\2\2`]\3\2\2\2ab"+
		"\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\r\3\2\2\2de\5\20\t\2ef\b\b\1\2fn\3\2\2\2"+
		"gh\5\24\13\2hi\b\b\1\2in\3\2\2\2jk\5\n\6\2kl\b\b\1\2ln\3\2\2\2md\3\2\2"+
		"\2mg\3\2\2\2mj\3\2\2\2n\17\3\2\2\2op\7\13\2\2pq\7\n\2\2qr\5\22\n\2rs\7"+
		"\4\2\2st\b\t\1\2t\21\3\2\2\2u|\b\n\1\2vw\5\4\3\2wx\7\5\2\2xy\b\n\1\2y"+
		"{\3\2\2\2zv\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2"+
		"\2\177\u0080\b\n\1\2\u0080\u0081\5\4\3\2\u0081\u0082\b\n\1\2\u0082\23"+
		"\3\2\2\2\u0083\u0084\7\7\2\2\u0084\u0085\7\21\2\2\u0085\u0086\7\r\2\2"+
		"\u0086\u0087\5\4\3\2\u0087\u0088\b\13\1\2\u0088\25\3\2\2\2\u0089\u008a"+
		"\7\21\2\2\u008a\u008e\b\f\1\2\u008b\u008c\7\20\2\2\u008c\u008e\b\f\1\2"+
		"\u008d\u0089\3\2\2\2\u008d\u008b\3\2\2\2\u008e\27\3\2\2\2\r$/\62<GJTb"+
		"m|\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}