// Generated from A2Jason.g4 by ANTLR 4.4

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
public class A2JasonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		NUM=17, ID=18, WS=19;
	public static final String[] tokenNames = {
		"<INVALID>", "'do'", "')'", "'+'", "'while'", "'*'", "'-'", "'('", "':'", 
		"'<'", "'Integer'", "'>'", "'and'", "'end while'", "':='", "'/'", "'declare'", 
		"NUM", "ID", "WS"
	};
	public static final int
		RULE_start = 0, RULE_stmtlist = 1, RULE_a = 2, RULE_stmt = 3, RULE_expr = 4, 
		RULE_c = 5, RULE_term = 6, RULE_d = 7, RULE_factor = 8, RULE_loop = 9, 
		RULE_conditionlist = 10, RULE_e = 11, RULE_condition = 12, RULE_dec = 13, 
		RULE_type = 14, RULE_var = 15;
	public static final String[] ruleNames = {
		"start", "stmtlist", "a", "stmt", "expr", "c", "term", "d", "factor", 
		"loop", "conditionlist", "e", "condition", "dec", "type", "var"
	};

	@Override
	public String getGrammarFileName() { return "A2Jason.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }




	public A2JasonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StmtlistContext stmtlist;
		public List<TerminalNode> EOF() { return getTokens(A2JasonParser.EOF); }
		public StmtlistContext stmtlist() {
			return getRuleContext(StmtlistContext.class,0);
		}
		public TerminalNode EOF(int i) {
			return getToken(A2JasonParser.EOF, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("public class A2_apples {\n\tpublic static void main(String[] args){");
			{
			setState(33); ((StartContext)_localctx).stmtlist = stmtlist();
			System.out.println( ((StartContext)_localctx).stmtlist.s );
			}
			setState(36); match(EOF);
			System.out.print("\t}\n}\n");
			setState(38); match(EOF);
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

	public static class StmtlistContext extends ParserRuleContext {
		public String s;
		public StmtContext stmt;
		public AContext a;
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtlist; }
	}

	public final StmtlistContext stmtlist() throws RecognitionException {
		StmtlistContext _localctx = new StmtlistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmtlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); ((StmtlistContext)_localctx).stmt = stmt();
			setState(41); ((StmtlistContext)_localctx).a = a();
			 ((StmtlistContext)_localctx).s =   ((StmtlistContext)_localctx).stmt.s + ((StmtlistContext)_localctx).a.s; 
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

	public static class AContext extends ParserRuleContext {
		public String s;
		public StmtlistContext stmtlist;
		public StmtlistContext stmtlist() {
			return getRuleContext(StmtlistContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_a);
		try {
			setState(48);
			switch (_input.LA(1)) {
			case T__12:
			case T__0:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); ((AContext)_localctx).stmtlist = stmtlist();
				 ((AContext)_localctx).s =  ((AContext)_localctx).stmtlist.s; 
				}
				break;
			case EOF:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				 ((AContext)_localctx).s =  ""; 
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

	public static class StmtContext extends ParserRuleContext {
		public String s;
		public Token ID;
		public ExprContext expr;
		public LoopContext loop;
		public DecContext dec;
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public TerminalNode ID() { return getToken(A2JasonParser.ID, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(61);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); ((StmtContext)_localctx).ID = match(ID);
				setState(51); match(T__2);
				setState(52); ((StmtContext)_localctx).expr = expr();
				 ((StmtContext)_localctx).s =  "\t\t" + ((StmtContext)_localctx).ID.getText() + " = " +  ((StmtContext)_localctx).expr.s + ";\n"; 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(55); ((StmtContext)_localctx).loop = loop();
				 ((StmtContext)_localctx).s =  "\t\t" + ((StmtContext)_localctx).loop.s +"\t\t}\n"; 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(58); ((StmtContext)_localctx).dec = dec();
				 ((StmtContext)_localctx).s =  "\t\t" + ((StmtContext)_localctx).dec.s + "\n"; 
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

	public static class ExprContext extends ParserRuleContext {
		public String s;
		public TermContext term;
		public CContext c;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); ((ExprContext)_localctx).term = term();
			setState(64); ((ExprContext)_localctx).c = c();
			 ((ExprContext)_localctx).s =  ((ExprContext)_localctx).term.s + ((ExprContext)_localctx).c.s; 
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

	public static class CContext extends ParserRuleContext {
		public String s;
		public TermContext term;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_c);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(67); match(T__13);
				setState(68); ((CContext)_localctx).term = term();
				 ((CContext)_localctx).s =  " + " + ((CContext)_localctx).term.s; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); match(T__10);
				setState(72); ((CContext)_localctx).term = term();
				 ((CContext)_localctx).s =  " - " + ((CContext)_localctx).term.s; 
				}
				break;
			case EOF:
			case T__14:
			case T__12:
			case T__7:
			case T__5:
			case T__4:
			case T__3:
			case T__0:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				 ((CContext)_localctx).s =  ""; 
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

	public static class TermContext extends ParserRuleContext {
		public String s;
		public FactorContext factor;
		public DContext d;
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); ((TermContext)_localctx).factor = factor();
			setState(79); ((TermContext)_localctx).d = d();
			 ((TermContext)_localctx).s =  ((TermContext)_localctx).factor.s + ((TermContext)_localctx).d.s; 
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

	public static class DContext extends ParserRuleContext {
		public String s;
		public FactorContext factor;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_d);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); match(T__11);
				setState(83); ((DContext)_localctx).factor = factor();
				 ((DContext)_localctx).s =  " * " + ((DContext)_localctx).factor.s; 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(86); match(T__1);
				setState(87); ((DContext)_localctx).factor = factor();
				 ((DContext)_localctx).s =  " / " + ((DContext)_localctx).factor.s; 
				}
				break;
			case EOF:
			case T__14:
			case T__13:
			case T__12:
			case T__10:
			case T__7:
			case T__5:
			case T__4:
			case T__3:
			case T__0:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				 ((DContext)_localctx).s =  ""; 
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

	public static class FactorContext extends ParserRuleContext {
		public String s;
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
		enterRule(_localctx, 16, RULE_factor);
		try {
			setState(101);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); match(T__9);
				setState(94); ((FactorContext)_localctx).expr = expr();
				setState(95); match(T__14);
				 ((FactorContext)_localctx).s =  "(" + ((FactorContext)_localctx).expr.s + ")"; 
				}
				break;
			case NUM:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); ((FactorContext)_localctx).var = var();
				 ((FactorContext)_localctx).s =  ((FactorContext)_localctx).var.number; 
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

	public static class LoopContext extends ParserRuleContext {
		public String s;
		public ConditionlistContext conditionlist;
		public StmtlistContext stmtlist;
		public StmtlistContext stmtlist() {
			return getRuleContext(StmtlistContext.class,0);
		}
		public ConditionlistContext conditionlist() {
			return getRuleContext(ConditionlistContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(T__12);
			setState(104); match(T__9);
			setState(105); ((LoopContext)_localctx).conditionlist = conditionlist();
			setState(106); match(T__14);
			setState(107); match(T__15);
			setState(108); ((LoopContext)_localctx).stmtlist = stmtlist();
			setState(109); match(T__3);
			 
						((LoopContext)_localctx).s =  "while (" + ((LoopContext)_localctx).conditionlist.s + ") {\n\t" +
							((LoopContext)_localctx).stmtlist.s;
					
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

	public static class ConditionlistContext extends ParserRuleContext {
		public String s;
		public ConditionContext condition;
		public EContext e;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public ConditionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionlist; }
	}

	public final ConditionlistContext conditionlist() throws RecognitionException {
		ConditionlistContext _localctx = new ConditionlistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); ((ConditionlistContext)_localctx).condition = condition();
			setState(113); ((ConditionlistContext)_localctx).e = e();
			 ((ConditionlistContext)_localctx).s =  ((ConditionlistContext)_localctx).condition.s + ((ConditionlistContext)_localctx).e.s; 
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

	public static class EContext extends ParserRuleContext {
		public String s;
		public ConditionlistContext conditionlist;
		public ConditionlistContext conditionlist() {
			return getRuleContext(ConditionlistContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_e);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); match(T__4);
				setState(117); ((EContext)_localctx).conditionlist = conditionlist();
				 ((EContext)_localctx).s =  " && " + ((EContext)_localctx).conditionlist.s; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				 ((EContext)_localctx).s =  ""; 
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

	public static class ConditionContext extends ParserRuleContext {
		public String s;
		public ExprContext expr1;
		public ExprContext expr2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); ((ConditionContext)_localctx).expr1 = expr();
				setState(124); match(T__7);
				setState(125); ((ConditionContext)_localctx).expr2 = expr();
				 ((ConditionContext)_localctx).s =  "(" + ((ConditionContext)_localctx).expr1.s + " < " + ((ConditionContext)_localctx).expr2.s + ")"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); ((ConditionContext)_localctx).expr1 = expr();
				setState(129); match(T__5);
				setState(130); ((ConditionContext)_localctx).expr2 = expr();
				 ((ConditionContext)_localctx).s =  "(" + ((ConditionContext)_localctx).expr1.s + " > " + ((ConditionContext)_localctx).expr2.s + ")"; 
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

	public static class DecContext extends ParserRuleContext {
		public String s;
		public Token ID;
		public TypeContext type;
		public TerminalNode ID() { return getToken(A2JasonParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(T__0);
			setState(136); ((DecContext)_localctx).ID = match(ID);
			setState(137); match(T__8);
			setState(138); ((DecContext)_localctx).type = type();
			 ((DecContext)_localctx).s =  ((DecContext)_localctx).type.s + " " + ((DecContext)_localctx).ID.getText() + ";"; 
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

	public static class TypeContext extends ParserRuleContext {
		public String s;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(T__6);
			 ((TypeContext)_localctx).s =  "int"; 
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
		public String number;
		public Token ID;
		public Token NUM;
		public TerminalNode ID() { return getToken(A2JasonParser.ID, 0); }
		public TerminalNode NUM() { return getToken(A2JasonParser.NUM, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(144); ((VarContext)_localctx).ID = match(ID);
				 
							((VarContext)_localctx).number =  ""+((VarContext)_localctx).ID.getText(); 
						
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); ((VarContext)_localctx).NUM = match(NUM);
				 
							((VarContext)_localctx).number =  ""+ ((VarContext)_localctx).NUM.getText(); 
						
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u0099\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\63\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\nh\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\5\r|\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u0088\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\5\21\u0097\n\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \2\2\u0093\2\"\3\2\2\2\4*\3\2\2\2\6\62\3\2\2\2\b?\3"+
		"\2\2\2\nA\3\2\2\2\fN\3\2\2\2\16P\3\2\2\2\20]\3\2\2\2\22g\3\2\2\2\24i\3"+
		"\2\2\2\26r\3\2\2\2\30{\3\2\2\2\32\u0087\3\2\2\2\34\u0089\3\2\2\2\36\u008f"+
		"\3\2\2\2 \u0096\3\2\2\2\"#\b\2\1\2#$\5\4\3\2$%\b\2\1\2%&\3\2\2\2&\'\7"+
		"\2\2\3\'(\b\2\1\2()\7\2\2\3)\3\3\2\2\2*+\5\b\5\2+,\5\6\4\2,-\b\3\1\2-"+
		"\5\3\2\2\2./\5\4\3\2/\60\b\4\1\2\60\63\3\2\2\2\61\63\b\4\1\2\62.\3\2\2"+
		"\2\62\61\3\2\2\2\63\7\3\2\2\2\64\65\7\24\2\2\65\66\7\20\2\2\66\67\5\n"+
		"\6\2\678\b\5\1\28@\3\2\2\29:\5\24\13\2:;\b\5\1\2;@\3\2\2\2<=\5\34\17\2"+
		"=>\b\5\1\2>@\3\2\2\2?\64\3\2\2\2?9\3\2\2\2?<\3\2\2\2@\t\3\2\2\2AB\5\16"+
		"\b\2BC\5\f\7\2CD\b\6\1\2D\13\3\2\2\2EF\7\5\2\2FG\5\16\b\2GH\b\7\1\2HO"+
		"\3\2\2\2IJ\7\b\2\2JK\5\16\b\2KL\b\7\1\2LO\3\2\2\2MO\b\7\1\2NE\3\2\2\2"+
		"NI\3\2\2\2NM\3\2\2\2O\r\3\2\2\2PQ\5\22\n\2QR\5\20\t\2RS\b\b\1\2S\17\3"+
		"\2\2\2TU\7\7\2\2UV\5\22\n\2VW\b\t\1\2W^\3\2\2\2XY\7\21\2\2YZ\5\22\n\2"+
		"Z[\b\t\1\2[^\3\2\2\2\\^\b\t\1\2]T\3\2\2\2]X\3\2\2\2]\\\3\2\2\2^\21\3\2"+
		"\2\2_`\7\t\2\2`a\5\n\6\2ab\7\4\2\2bc\b\n\1\2ch\3\2\2\2de\5 \21\2ef\b\n"+
		"\1\2fh\3\2\2\2g_\3\2\2\2gd\3\2\2\2h\23\3\2\2\2ij\7\6\2\2jk\7\t\2\2kl\5"+
		"\26\f\2lm\7\4\2\2mn\7\3\2\2no\5\4\3\2op\7\17\2\2pq\b\13\1\2q\25\3\2\2"+
		"\2rs\5\32\16\2st\5\30\r\2tu\b\f\1\2u\27\3\2\2\2vw\7\16\2\2wx\5\26\f\2"+
		"xy\b\r\1\2y|\3\2\2\2z|\b\r\1\2{v\3\2\2\2{z\3\2\2\2|\31\3\2\2\2}~\5\n\6"+
		"\2~\177\7\13\2\2\177\u0080\5\n\6\2\u0080\u0081\b\16\1\2\u0081\u0088\3"+
		"\2\2\2\u0082\u0083\5\n\6\2\u0083\u0084\7\r\2\2\u0084\u0085\5\n\6\2\u0085"+
		"\u0086\b\16\1\2\u0086\u0088\3\2\2\2\u0087}\3\2\2\2\u0087\u0082\3\2\2\2"+
		"\u0088\33\3\2\2\2\u0089\u008a\7\22\2\2\u008a\u008b\7\24\2\2\u008b\u008c"+
		"\7\n\2\2\u008c\u008d\5\36\20\2\u008d\u008e\b\17\1\2\u008e\35\3\2\2\2\u008f"+
		"\u0090\7\f\2\2\u0090\u0091\b\20\1\2\u0091\37\3\2\2\2\u0092\u0093\7\24"+
		"\2\2\u0093\u0097\b\21\1\2\u0094\u0095\7\23\2\2\u0095\u0097\b\21\1\2\u0096"+
		"\u0092\3\2\2\2\u0096\u0094\3\2\2\2\u0097!\3\2\2\2\n\62?N]g{\u0087\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}