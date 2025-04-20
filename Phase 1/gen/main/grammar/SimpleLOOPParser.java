// Generated from C:/Users/negar/OneDrive/Documents/UT/Term6/Compiler/1/src/main/grammar\SimpleLOOP.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLOOPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntLiteral=1, Class=2, Private=3, Public=4, Self=5, Initialize=6, Print=7, 
		New=8, Null=9, Delete=10, Include=11, Add=12, Merge=13, Begin=14, End=15, 
		Int=16, Bool=17, True=18, False=19, Set=20, Fptr=21, Main=22, Void=23, 
		While=24, Do=25, If=26, Else=27, Elsif=28, Each=29, Return=30, SemiCollon=31, 
		LPar=32, RPar=33, LBrack=34, RBrack=35, LCurlyBrack=36, RCurlyBrack=37, 
		Comma=38, Equals=39, PPlus=40, MMinus=41, Assign=42, Plus=43, Minus=44, 
		Not=45, Multiply=46, Division=47, DSlahs=48, Dot=49, Arrow=50, Less=51, 
		Greater=52, And=53, Or=54, Line=55, Colon=56, QMark=57, NONZERODIGIT=58, 
		Identifier=59, ClassIdentifier=60, NewLine=61, Comment=62, WS=63;
	public static final int
		RULE_simpleLOOP = 0, RULE_program = 1, RULE_varDefSection = 2, RULE_varDef = 3, 
		RULE_classVarDef = 4, RULE_types = 5, RULE_identifierGroup = 6, RULE_fptr_type = 7, 
		RULE_array_type = 8, RULE_set_type = 9, RULE_classSection = 10, RULE_classStatementBlock = 11, 
		RULE_classScope = 12, RULE_classDef = 13, RULE_initClass = 14, RULE_constructor = 15, 
		RULE_mArgument = 16, RULE_argVarDef = 17, RULE_argIdentifierGroup = 18, 
		RULE_mainStatementBlock = 19, RULE_scope = 20, RULE_statement = 21, RULE_returnStatement = 22, 
		RULE_ifStatement = 23, RULE_eachLoop = 24, RULE_printStatement = 25, RULE_expressionStatement = 26, 
		RULE_commaExpression = 27, RULE_commaExpressionL = 28, RULE_assignExpression = 29, 
		RULE_ternaryExpression = 30, RULE_ternaryExpressionL = 31, RULE_logicalOrExpression = 32, 
		RULE_logicalOrExpressionL = 33, RULE_logicalAndExpression = 34, RULE_logicalAndExpressionL = 35, 
		RULE_equalityExpression = 36, RULE_equalityExpressionL = 37, RULE_relationExpression = 38, 
		RULE_relationExpressionL = 39, RULE_additiveExpression = 40, RULE_additiveExpressionL = 41, 
		RULE_multExpression = 42, RULE_multExpressionL = 43, RULE_unaryExpression = 44, 
		RULE_incDecExpression = 45, RULE_incDecExpressionL = 46, RULE_memberExpression = 47, 
		RULE_memberExpressionL = 48, RULE_specialExpression = 49, RULE_newFuncExpression = 50, 
		RULE_valExpression = 51, RULE_params = 52, RULE_literal = 53, RULE_setLiteral = 54, 
		RULE_boolLiteral = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"simpleLOOP", "program", "varDefSection", "varDef", "classVarDef", "types", 
			"identifierGroup", "fptr_type", "array_type", "set_type", "classSection", 
			"classStatementBlock", "classScope", "classDef", "initClass", "constructor", 
			"mArgument", "argVarDef", "argIdentifierGroup", "mainStatementBlock", 
			"scope", "statement", "returnStatement", "ifStatement", "eachLoop", "printStatement", 
			"expressionStatement", "commaExpression", "commaExpressionL", "assignExpression", 
			"ternaryExpression", "ternaryExpressionL", "logicalOrExpression", "logicalOrExpressionL", 
			"logicalAndExpression", "logicalAndExpressionL", "equalityExpression", 
			"equalityExpressionL", "relationExpression", "relationExpressionL", "additiveExpression", 
			"additiveExpressionL", "multExpression", "multExpressionL", "unaryExpression", 
			"incDecExpression", "incDecExpressionL", "memberExpression", "memberExpressionL", 
			"specialExpression", "newFuncExpression", "valExpression", "params", 
			"literal", "setLiteral", "boolLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'class'", "'private'", "'public'", "'self'", "'initialize'", 
			"'print'", "'new'", "'null'", "'delete'", "'include'", "'add'", "'merge'", 
			"'begin'", "'end'", "'int'", "'bool'", "'true'", "'false'", "'Set'", 
			"'fptr'", "'main'", "'void'", "'while'", "'do'", "'if'", "'else'", "'elsif'", 
			"'each'", "'return'", "';'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"','", "'=='", "'++'", "'--'", "'='", "'+'", "'-'", "'!'", "'*'", "'/'", 
			"'//'", "'.'", "'->'", "'<'", "'>'", "'&&'", "'||'", "'|'", "':'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntLiteral", "Class", "Private", "Public", "Self", "Initialize", 
			"Print", "New", "Null", "Delete", "Include", "Add", "Merge", "Begin", 
			"End", "Int", "Bool", "True", "False", "Set", "Fptr", "Main", "Void", 
			"While", "Do", "If", "Else", "Elsif", "Each", "Return", "SemiCollon", 
			"LPar", "RPar", "LBrack", "RBrack", "LCurlyBrack", "RCurlyBrack", "Comma", 
			"Equals", "PPlus", "MMinus", "Assign", "Plus", "Minus", "Not", "Multiply", 
			"Division", "DSlahs", "Dot", "Arrow", "Less", "Greater", "And", "Or", 
			"Line", "Colon", "QMark", "NONZERODIGIT", "Identifier", "ClassIdentifier", 
			"NewLine", "Comment", "WS"
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
	public String getGrammarFileName() { return "SimpleLOOP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLOOPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SimpleLOOPContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SimpleLOOPParser.EOF, 0); }
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public SimpleLOOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleLOOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSimpleLOOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSimpleLOOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSimpleLOOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleLOOPContext simpleLOOP() throws RecognitionException {
		SimpleLOOPContext _localctx = new SimpleLOOPContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_simpleLOOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(112);
				match(NewLine);
				}
				break;
			}
			setState(115);
			program();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(116);
				match(NewLine);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(EOF);
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

	public static class ProgramContext extends ParserRuleContext {
		public VarDefSectionContext varDefSection() {
			return getRuleContext(VarDefSectionContext.class,0);
		}
		public ClassSectionContext classSection() {
			return getRuleContext(ClassSectionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			varDefSection();
			setState(125);
			classSection();
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

	public static class VarDefSectionContext extends ParserRuleContext {
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public VarDefSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterVarDefSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitVarDefSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitVarDefSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefSectionContext varDefSection() throws RecognitionException {
		VarDefSectionContext _localctx = new VarDefSectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDefSection);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << Set) | (1L << Fptr) | (1L << ClassIdentifier))) != 0)) {
				{
				{
				setState(127);
				varDef();
				setState(129); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(128);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(131); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VarDefContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public IdentifierGroupContext identifierGroup() {
			return getRuleContext(IdentifierGroupContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			types();
			setState(139);
			identifierGroup();
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

	public static class ClassVarDefContext extends ParserRuleContext {
		public Token r;
		public TerminalNode Identifier() { return getToken(SimpleLOOPParser.Identifier, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode Void() { return getToken(SimpleLOOPParser.Void, 0); }
		public ClassVarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVarDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClassVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClassVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClassVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVarDefContext classVarDef() throws RecognitionException {
		ClassVarDefContext _localctx = new ClassVarDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classVarDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
			case Set:
			case Fptr:
			case ClassIdentifier:
				{
				setState(141);
				types();
				}
				break;
			case Void:
				{
				setState(142);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(145);
			((ClassVarDefContext)_localctx).r = match(Identifier);
			System.out.println("MethodDec : " + (((ClassVarDefContext)_localctx).r!=null?((ClassVarDefContext)_localctx).r.getText():null));
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

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SimpleLOOPParser.Int, 0); }
		public TerminalNode Bool() { return getToken(SimpleLOOPParser.Bool, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Fptr_typeContext fptr_type() {
			return getRuleContext(Fptr_typeContext.class,0);
		}
		public Set_typeContext set_type() {
			return getRuleContext(Set_typeContext.class,0);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_types);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(Int);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(Bool);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				array_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				fptr_type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				set_type();
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

	public static class IdentifierGroupContext extends ParserRuleContext {
		public Token r;
		public Token z;
		public List<TerminalNode> Identifier() { return getTokens(SimpleLOOPParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimpleLOOPParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLOOPParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLOOPParser.Comma, i);
		}
		public TerminalNode SemiCollon() { return getToken(SimpleLOOPParser.SemiCollon, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IdentifierGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIdentifierGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIdentifierGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIdentifierGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierGroupContext identifierGroup() throws RecognitionException {
		IdentifierGroupContext _localctx = new IdentifierGroupContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifierGroup);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				((IdentifierGroupContext)_localctx).r = match(Identifier);
				System.out.println("VarDec : " + (((IdentifierGroupContext)_localctx).r!=null?((IdentifierGroupContext)_localctx).r.getText():null));
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(157);
					match(Comma);
					setState(158);
					((IdentifierGroupContext)_localctx).z = match(Identifier);
					System.out.println("VarDec : " + (((IdentifierGroupContext)_localctx).z!=null?((IdentifierGroupContext)_localctx).z.getText():null));
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(165);
					match(SemiCollon);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				((IdentifierGroupContext)_localctx).r = match(Identifier);
				System.out.println("VarDec : " + (((IdentifierGroupContext)_localctx).r!=null?((IdentifierGroupContext)_localctx).r.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				expressionStatement();
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

	public static class Fptr_typeContext extends ParserRuleContext {
		public TerminalNode Fptr() { return getToken(SimpleLOOPParser.Fptr, 0); }
		public TerminalNode Less() { return getToken(SimpleLOOPParser.Less, 0); }
		public TerminalNode Arrow() { return getToken(SimpleLOOPParser.Arrow, 0); }
		public TerminalNode Greater() { return getToken(SimpleLOOPParser.Greater, 0); }
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public List<TerminalNode> Void() { return getTokens(SimpleLOOPParser.Void); }
		public TerminalNode Void(int i) {
			return getToken(SimpleLOOPParser.Void, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLOOPParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLOOPParser.Comma, i);
		}
		public Fptr_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptr_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterFptr_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitFptr_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitFptr_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fptr_typeContext fptr_type() throws RecognitionException {
		Fptr_typeContext _localctx = new Fptr_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fptr_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(Fptr);
			setState(174);
			match(Less);
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
			case Set:
			case Fptr:
			case ClassIdentifier:
				{
				setState(175);
				types();
				}
				break;
			case Void:
				{
				setState(176);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(179);
				match(Comma);
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Int:
				case Bool:
				case Set:
				case Fptr:
				case ClassIdentifier:
					{
					setState(180);
					types();
					}
					break;
				case Void:
					{
					setState(181);
					match(Void);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(Arrow);
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
			case Set:
			case Fptr:
			case ClassIdentifier:
				{
				setState(190);
				types();
				}
				break;
			case Void:
				{
				setState(191);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(194);
			match(Greater);
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

	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SimpleLOOPParser.Int, 0); }
		public TerminalNode Bool() { return getToken(SimpleLOOPParser.Bool, 0); }
		public TerminalNode ClassIdentifier() { return getToken(SimpleLOOPParser.ClassIdentifier, 0); }
		public List<TerminalNode> LBrack() { return getTokens(SimpleLOOPParser.LBrack); }
		public TerminalNode LBrack(int i) {
			return getToken(SimpleLOOPParser.LBrack, i);
		}
		public List<CommaExpressionContext> commaExpression() {
			return getRuleContexts(CommaExpressionContext.class);
		}
		public CommaExpressionContext commaExpression(int i) {
			return getRuleContext(CommaExpressionContext.class,i);
		}
		public List<TerminalNode> RBrack() { return getTokens(SimpleLOOPParser.RBrack); }
		public TerminalNode RBrack(int i) {
			return getToken(SimpleLOOPParser.RBrack, i);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << ClassIdentifier))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBrack:
				{
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(197);
					match(LBrack);
					setState(198);
					commaExpression();
					setState(199);
					match(RBrack);
					}
					}
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBrack );
				}
				break;
			case IntLiteral:
			case Self:
			case Initialize:
			case True:
			case False:
			case Set:
			case LPar:
			case Comma:
			case Minus:
			case Not:
			case Arrow:
			case Greater:
			case Identifier:
			case ClassIdentifier:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Set_typeContext extends ParserRuleContext {
		public TerminalNode Set() { return getToken(SimpleLOOPParser.Set, 0); }
		public TerminalNode Less() { return getToken(SimpleLOOPParser.Less, 0); }
		public TerminalNode Int() { return getToken(SimpleLOOPParser.Int, 0); }
		public TerminalNode Greater() { return getToken(SimpleLOOPParser.Greater, 0); }
		public Set_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSet_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSet_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSet_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_typeContext set_type() throws RecognitionException {
		Set_typeContext _localctx = new Set_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_set_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(Set);
			setState(209);
			match(Less);
			setState(210);
			match(Int);
			setState(211);
			match(Greater);
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

	public static class ClassSectionContext extends ParserRuleContext {
		public Token z;
		public Token r;
		public List<TerminalNode> Class() { return getTokens(SimpleLOOPParser.Class); }
		public TerminalNode Class(int i) {
			return getToken(SimpleLOOPParser.Class, i);
		}
		public List<TerminalNode> Less() { return getTokens(SimpleLOOPParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(SimpleLOOPParser.Less, i);
		}
		public List<ClassStatementBlockContext> classStatementBlock() {
			return getRuleContexts(ClassStatementBlockContext.class);
		}
		public ClassStatementBlockContext classStatementBlock(int i) {
			return getRuleContext(ClassStatementBlockContext.class,i);
		}
		public List<TerminalNode> ClassIdentifier() { return getTokens(SimpleLOOPParser.ClassIdentifier); }
		public TerminalNode ClassIdentifier(int i) {
			return getToken(SimpleLOOPParser.ClassIdentifier, i);
		}
		public ClassSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClassSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClassSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClassSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSectionContext classSection() throws RecognitionException {
		ClassSectionContext _localctx = new ClassSectionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Class) {
				{
				setState(224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					{
					setState(213);
					match(Class);
					setState(214);
					((ClassSectionContext)_localctx).z = match(ClassIdentifier);
					System.out.println("ClassDec : " + (((ClassSectionContext)_localctx).z!=null?((ClassSectionContext)_localctx).z.getText():null));
					setState(216);
					match(Less);
					setState(217);
					((ClassSectionContext)_localctx).r = match(ClassIdentifier);
					System.out.println("Inheritance : " + (((ClassSectionContext)_localctx).z!=null?((ClassSectionContext)_localctx).z.getText():null) + " < " + (((ClassSectionContext)_localctx).r!=null?((ClassSectionContext)_localctx).r.getText():null));
					setState(219);
					classStatementBlock();
					}
					}
					break;
				case 2:
					{
					{
					setState(220);
					match(Class);
					setState(221);
					((ClassSectionContext)_localctx).r = match(ClassIdentifier);
					System.out.println("ClassDec : " + (((ClassSectionContext)_localctx).r!=null?((ClassSectionContext)_localctx).r.getText():null));
					setState(223);
					classStatementBlock();
					}
					}
					break;
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ClassStatementBlockContext extends ParserRuleContext {
		public TerminalNode LCurlyBrack() { return getToken(SimpleLOOPParser.LCurlyBrack, 0); }
		public ClassScopeContext classScope() {
			return getRuleContext(ClassScopeContext.class,0);
		}
		public TerminalNode RCurlyBrack() { return getToken(SimpleLOOPParser.RCurlyBrack, 0); }
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public TerminalNode Public() { return getToken(SimpleLOOPParser.Public, 0); }
		public InitClassContext initClass() {
			return getRuleContext(InitClassContext.class,0);
		}
		public TerminalNode Private() { return getToken(SimpleLOOPParser.Private, 0); }
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ClassStatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClassStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClassStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClassStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatementBlockContext classStatementBlock() throws RecognitionException {
		ClassStatementBlockContext _localctx = new ClassStatementBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classStatementBlock);
		int _la;
		try {
			int _alt;
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCurlyBrack:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(229);
				match(LCurlyBrack);
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(230);
					match(NewLine);
					}
					}
					setState(233); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NewLine );
				setState(235);
				classScope();
				setState(236);
				match(RCurlyBrack);
				setState(238); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(237);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(240); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				break;
			case NewLine:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242);
					match(NewLine);
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NewLine );
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					{
					setState(247);
					_la = _input.LA(1);
					if ( !(_la==Private || _la==Public) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(248);
						varDef();
						}
						break;
					case 2:
						{
						setState(249);
						constructor();
						}
						break;
					}
					}
					}
					break;
				case 2:
					{
					{
					setState(252);
					match(Public);
					setState(253);
					initClass();
					}
					}
					break;
				}
				setState(257); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(256);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(259); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ClassScopeContext extends ParserRuleContext {
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public List<TerminalNode> Public() { return getTokens(SimpleLOOPParser.Public); }
		public TerminalNode Public(int i) {
			return getToken(SimpleLOOPParser.Public, i);
		}
		public InitClassContext initClass() {
			return getRuleContext(InitClassContext.class,0);
		}
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public List<TerminalNode> Private() { return getTokens(SimpleLOOPParser.Private); }
		public TerminalNode Private(int i) {
			return getToken(SimpleLOOPParser.Private, i);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public ClassScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClassScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClassScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClassScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassScopeContext classScope() throws RecognitionException {
		ClassScopeContext _localctx = new ClassScopeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			classDef();
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(264);
				match(Public);
				setState(265);
				initClass();
				setState(266);
				match(NewLine);
				}
				break;
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Private || _la==Public) {
				{
				{
				setState(270);
				_la = _input.LA(1);
				if ( !(_la==Private || _la==Public) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(271);
					varDef();
					}
					break;
				case 2:
					{
					setState(272);
					constructor();
					}
					break;
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NewLine) {
					{
					{
					setState(275);
					match(NewLine);
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ClassDefContext extends ParserRuleContext {
		public List<TerminalNode> Public() { return getTokens(SimpleLOOPParser.Public); }
		public TerminalNode Public(int i) {
			return getToken(SimpleLOOPParser.Public, i);
		}
		public List<TerminalNode> Private() { return getTokens(SimpleLOOPParser.Private); }
		public TerminalNode Private(int i) {
			return getToken(SimpleLOOPParser.Private, i);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					_la = _input.LA(1);
					if ( !(_la==Private || _la==Public) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(287);
						varDef();
						}
						break;
					case 2:
						{
						setState(288);
						constructor();
						}
						break;
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NewLine) {
						{
						{
						setState(291);
						match(NewLine);
						}
						}
						setState(296);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class InitClassContext extends ParserRuleContext {
		public TerminalNode Initialize() { return getToken(SimpleLOOPParser.Initialize, 0); }
		public MArgumentContext mArgument() {
			return getRuleContext(MArgumentContext.class,0);
		}
		public MainStatementBlockContext mainStatementBlock() {
			return getRuleContext(MainStatementBlockContext.class,0);
		}
		public InitClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterInitClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitInitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitInitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitClassContext initClass() throws RecognitionException {
		InitClassContext _localctx = new InitClassContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_initClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(Initialize);
			setState(303);
			mArgument();
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(304);
				mainStatementBlock();
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

	public static class ConstructorContext extends ParserRuleContext {
		public ClassVarDefContext classVarDef() {
			return getRuleContext(ClassVarDefContext.class,0);
		}
		public MArgumentContext mArgument() {
			return getRuleContext(MArgumentContext.class,0);
		}
		public MainStatementBlockContext mainStatementBlock() {
			return getRuleContext(MainStatementBlockContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			classVarDef();
			setState(308);
			mArgument();
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(309);
				mainStatementBlock();
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

	public static class MArgumentContext extends ParserRuleContext {
		public TerminalNode LPar() { return getToken(SimpleLOOPParser.LPar, 0); }
		public TerminalNode RPar() { return getToken(SimpleLOOPParser.RPar, 0); }
		public List<ArgVarDefContext> argVarDef() {
			return getRuleContexts(ArgVarDefContext.class);
		}
		public ArgVarDefContext argVarDef(int i) {
			return getRuleContext(ArgVarDefContext.class,i);
		}
		public List<TerminalNode> Assign() { return getTokens(SimpleLOOPParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(SimpleLOOPParser.Assign, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLOOPParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLOOPParser.Comma, i);
		}
		public MArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MArgumentContext mArgument() throws RecognitionException {
		MArgumentContext _localctx = new MArgumentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(LPar);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << Set) | (1L << Fptr) | (1L << ClassIdentifier))) != 0)) {
				{
				setState(313);
				argVarDef();
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(314);
					match(Assign);
					setState(315);
					literal();
					}
				}

				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(318);
					match(Comma);
					setState(319);
					argVarDef();
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Assign) {
						{
						setState(320);
						match(Assign);
						setState(321);
						literal();
						}
					}

					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(331);
			match(RPar);
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

	public static class ArgVarDefContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ArgIdentifierGroupContext argIdentifierGroup() {
			return getRuleContext(ArgIdentifierGroupContext.class,0);
		}
		public ArgVarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argVarDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterArgVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitArgVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitArgVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgVarDefContext argVarDef() throws RecognitionException {
		ArgVarDefContext _localctx = new ArgVarDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argVarDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			types();
			setState(334);
			argIdentifierGroup();
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

	public static class ArgIdentifierGroupContext extends ParserRuleContext {
		public Token r;
		public Token z;
		public List<TerminalNode> Identifier() { return getTokens(SimpleLOOPParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimpleLOOPParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLOOPParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLOOPParser.Comma, i);
		}
		public ArgIdentifierGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argIdentifierGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterArgIdentifierGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitArgIdentifierGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitArgIdentifierGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgIdentifierGroupContext argIdentifierGroup() throws RecognitionException {
		ArgIdentifierGroupContext _localctx = new ArgIdentifierGroupContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argIdentifierGroup);
		try {
			int _alt;
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				((ArgIdentifierGroupContext)_localctx).r = match(Identifier);
				System.out.println("ArgumentDec : " + (((ArgIdentifierGroupContext)_localctx).r!=null?((ArgIdentifierGroupContext)_localctx).r.getText():null));
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(338);
						match(Comma);
						setState(339);
						((ArgIdentifierGroupContext)_localctx).z = match(Identifier);
						System.out.println("ArgumentDec : " + (((ArgIdentifierGroupContext)_localctx).z!=null?((ArgIdentifierGroupContext)_localctx).z.getText():null));
						}
						} 
					}
					setState(345);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				((ArgIdentifierGroupContext)_localctx).r = match(Identifier);
				System.out.println("ArgumentDec : " + (((ArgIdentifierGroupContext)_localctx).r!=null?((ArgIdentifierGroupContext)_localctx).r.getText():null));
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

	public static class MainStatementBlockContext extends ParserRuleContext {
		public TerminalNode LCurlyBrack() { return getToken(SimpleLOOPParser.LCurlyBrack, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode RCurlyBrack() { return getToken(SimpleLOOPParser.RCurlyBrack, 0); }
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SemiCollon() { return getToken(SimpleLOOPParser.SemiCollon, 0); }
		public MainStatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStatementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMainStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMainStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMainStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainStatementBlockContext mainStatementBlock() throws RecognitionException {
		MainStatementBlockContext _localctx = new MainStatementBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mainStatementBlock);
		int _la;
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NewLine) {
					{
					{
					setState(350);
					match(NewLine);
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
				match(LCurlyBrack);
				setState(358); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(357);
					match(NewLine);
					}
					}
					setState(360); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NewLine );
				setState(362);
				scope();
				setState(363);
				match(RCurlyBrack);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NewLine) {
					{
					{
					setState(365);
					match(NewLine);
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(371);
				statement();
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(372);
					match(SemiCollon);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				match(NewLine);
				setState(376);
				match(LCurlyBrack);
				setState(377);
				match(NewLine);
				setState(378);
				match(RCurlyBrack);
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

	public static class ScopeContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SemiCollon() { return getToken(SimpleLOOPParser.SemiCollon, 0); }
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_scope);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			statement();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiCollon) {
				{
				setState(382);
				match(SemiCollon);
				}
			}

			setState(386); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(385);
				match(NewLine);
				}
				}
				setState(388); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NewLine );
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(390);
					scope();
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public EachLoopContext eachLoop() {
			return getRuleContext(EachLoopContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				eachLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(400);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(401);
				printStatement();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(SimpleLOOPParser.Return, 0); }
		public CommaExpressionContext commaExpression() {
			return getRuleContext(CommaExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStatement);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(Return);
				System.out.println("Return");
				setState(406);
				commaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(Return);
				System.out.println("Return");
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(SimpleLOOPParser.If, 0); }
		public List<CommaExpressionContext> commaExpression() {
			return getRuleContexts(CommaExpressionContext.class);
		}
		public CommaExpressionContext commaExpression(int i) {
			return getRuleContext(CommaExpressionContext.class,i);
		}
		public List<MainStatementBlockContext> mainStatementBlock() {
			return getRuleContexts(MainStatementBlockContext.class);
		}
		public MainStatementBlockContext mainStatementBlock(int i) {
			return getRuleContext(MainStatementBlockContext.class,i);
		}
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public List<TerminalNode> Elsif() { return getTokens(SimpleLOOPParser.Elsif); }
		public TerminalNode Elsif(int i) {
			return getToken(SimpleLOOPParser.Elsif, i);
		}
		public List<TerminalNode> Else() { return getTokens(SimpleLOOPParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(SimpleLOOPParser.Else, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(If);
				System.out.println("Conditional : if");
				setState(413);
				commaExpression();
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(414);
						match(NewLine);
						}
						} 
					}
					setState(419);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(420);
				mainStatementBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(If);
				System.out.println("Conditional : if");
				setState(424);
				commaExpression();
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(425);
					match(NewLine);
					}
					break;
				}
				setState(428);
				mainStatementBlock();
				setState(441); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(429);
						match(NewLine);
						setState(430);
						match(Elsif);
						System.out.println("Conditional : elsif");
						setState(432);
						commaExpression();
						setState(436);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(433);
								match(NewLine);
								}
								} 
							}
							setState(438);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
						}
						setState(439);
						mainStatementBlock();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(443); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				match(If);
				System.out.println("Conditional : if");
				setState(447);
				commaExpression();
				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(448);
					match(NewLine);
					}
					break;
				}
				setState(451);
				mainStatementBlock();
				setState(463); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(453); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(452);
							match(NewLine);
							}
							}
							setState(455); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NewLine );
						setState(457);
						match(Else);
						System.out.println("Conditional : else");
						setState(460);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
						case 1:
							{
							setState(459);
							match(NewLine);
							}
							break;
						}
						setState(462);
						mainStatementBlock();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(465); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				match(If);
				System.out.println("Conditional : if");
				setState(469);
				commaExpression();
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(470);
					match(NewLine);
					}
					break;
				}
				setState(473);
				mainStatementBlock();
				setState(481); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(474);
						match(NewLine);
						setState(475);
						match(Elsif);
						System.out.println("Conditional : elsif");
						setState(477);
						commaExpression();
						setState(478);
						match(NewLine);
						setState(479);
						mainStatementBlock();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(483); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(486); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(485);
					match(NewLine);
					}
					}
					setState(488); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NewLine );
				setState(490);
				match(Else);
				System.out.println("Conditional : else");
				setState(492);
				match(NewLine);
				setState(493);
				mainStatementBlock();
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

	public static class EachLoopContext extends ParserRuleContext {
		public List<TerminalNode> Dot() { return getTokens(SimpleLOOPParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(SimpleLOOPParser.Dot, i);
		}
		public TerminalNode Each() { return getToken(SimpleLOOPParser.Each, 0); }
		public TerminalNode Do() { return getToken(SimpleLOOPParser.Do, 0); }
		public List<TerminalNode> Line() { return getTokens(SimpleLOOPParser.Line); }
		public TerminalNode Line(int i) {
			return getToken(SimpleLOOPParser.Line, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(SimpleLOOPParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimpleLOOPParser.Identifier, i);
		}
		public MainStatementBlockContext mainStatementBlock() {
			return getRuleContext(MainStatementBlockContext.class,0);
		}
		public TerminalNode LPar() { return getToken(SimpleLOOPParser.LPar, 0); }
		public List<CommaExpressionContext> commaExpression() {
			return getRuleContexts(CommaExpressionContext.class);
		}
		public CommaExpressionContext commaExpression(int i) {
			return getRuleContext(CommaExpressionContext.class,i);
		}
		public TerminalNode RPar() { return getToken(SimpleLOOPParser.RPar, 0); }
		public EachLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eachLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterEachLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitEachLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitEachLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EachLoopContext eachLoop() throws RecognitionException {
		EachLoopContext _localctx = new EachLoopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_eachLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPar:
				{
				{
				setState(497);
				match(LPar);
				setState(498);
				commaExpression();
				setState(499);
				match(Dot);
				setState(500);
				match(Dot);
				setState(501);
				commaExpression();
				setState(502);
				match(RPar);
				}
				}
				break;
			case Identifier:
				{
				setState(504);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(507);
			match(Dot);
			setState(508);
			match(Each);
			System.out.println("Loop : each");
			setState(510);
			match(Do);
			setState(511);
			match(Line);
			setState(512);
			match(Identifier);
			setState(513);
			match(Line);
			setState(514);
			mainStatementBlock();
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(SimpleLOOPParser.Print, 0); }
		public TerminalNode LPar() { return getToken(SimpleLOOPParser.LPar, 0); }
		public TerminalNode RPar() { return getToken(SimpleLOOPParser.RPar, 0); }
		public TerminalNode Identifier() { return getToken(SimpleLOOPParser.Identifier, 0); }
		public CommaExpressionContext commaExpression() {
			return getRuleContext(CommaExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(Print);
			System.out.println("Built-in : print");
			setState(518);
			match(LPar);
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(519);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(520);
				commaExpression();
				}
				break;
			}
			setState(523);
			match(RPar);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
		}
		public TerminalNode LPar() { return getToken(SimpleLOOPParser.LPar, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RPar() { return getToken(SimpleLOOPParser.RPar, 0); }
		public CommaExpressionContext commaExpression() {
			return getRuleContext(CommaExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionStatement);
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("MethodCall");
				setState(526);
				memberExpression();
				setState(527);
				match(LPar);
				setState(528);
				params();
				setState(529);
				match(RPar);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				commaExpression();
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

	public static class CommaExpressionContext extends ParserRuleContext {
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public CommaExpressionLContext commaExpressionL() {
			return getRuleContext(CommaExpressionLContext.class,0);
		}
		public CommaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterCommaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitCommaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitCommaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaExpressionContext commaExpression() throws RecognitionException {
		CommaExpressionContext _localctx = new CommaExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_commaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			assignExpression();
			setState(535);
			commaExpressionL();
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

	public static class CommaExpressionLContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(SimpleLOOPParser.Comma, 0); }
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public CommaExpressionLContext commaExpressionL() {
			return getRuleContext(CommaExpressionLContext.class,0);
		}
		public CommaExpressionLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaExpressionL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterCommaExpressionL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitCommaExpressionL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitCommaExpressionL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaExpressionLContext commaExpressionL() throws RecognitionException {
		CommaExpressionLContext _localctx = new CommaExpressionLContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_commaExpressionL);
		try {
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Comma:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(Comma);
				setState(538);
				assignExpression();
				System.out.println("Operator : ,");
				setState(540);
				commaExpressionL();
				}
				break;
			case IntLiteral:
			case Private:
			case Public:
			case Self:
			case Initialize:
			case Print:
			case Int:
			case Bool:
			case True:
			case False:
			case Set:
			case Fptr:
			case If:
			case Return:
			case SemiCollon:
			case LPar:
			case RPar:
			case RBrack:
			case LCurlyBrack:
			case RCurlyBrack:
			case Minus:
			case Not:
			case Dot:
			case Identifier:
			case ClassIdentifier:
			case NewLine:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AssignExpressionContext extends ParserRuleContext {
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public TerminalNode Assign() { return getToken(SimpleLOOPParser.Assign, 0); }
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignExpression);
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				ternaryExpression();
				setState(546);
				match(Assign);
				setState(547);
				assignExpression();
				System.out.println("Operator : =");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				ternaryExpression();
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

	public static class TernaryExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TernaryExpressionLContext ternaryExpressionL() {
			return getRuleContext(TernaryExpressionLContext.class,0);
		}
		public TernaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryExpressionContext ternaryExpression() throws RecognitionException {
		TernaryExpressionContext _localctx = new TernaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ternaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			logicalOrExpression();
			setState(554);
			ternaryExpressionL();
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

	public static class TernaryExpressionLContext extends ParserRuleContext {
		public TerminalNode QMark() { return getToken(SimpleLOOPParser.QMark, 0); }
		public List<TernaryExpressionContext> ternaryExpression() {
			return getRuleContexts(TernaryExpressionContext.class);
		}
		public TernaryExpressionContext ternaryExpression(int i) {
			return getRuleContext(TernaryExpressionContext.class,i);
		}
		public TerminalNode Colon() { return getToken(SimpleLOOPParser.Colon, 0); }
		public TernaryExpressionLContext ternaryExpressionL() {
			return getRuleContext(TernaryExpressionLContext.class,0);
		}
		public TernaryExpressionLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpressionL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterTernaryExpressionL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitTernaryExpressionL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitTernaryExpressionL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryExpressionLContext ternaryExpressionL() throws RecognitionException {
		TernaryExpressionLContext _localctx = new TernaryExpressionLContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ternaryExpressionL);
		try {
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				match(QMark);
				setState(557);
				ternaryExpression();
				setState(558);
				match(Colon);
				setState(559);
				ternaryExpression();
				System.out.println("Operator : ?:");
				setState(561);
				ternaryExpressionL();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionLContext logicalOrExpressionL() {
			return getRuleContext(LogicalOrExpressionLContext.class,0);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_logicalOrExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			logicalAndExpression();
			setState(567);
			logicalOrExpressionL();
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

	public static class LogicalOrExpressionLContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(SimpleLOOPParser.Or, 0); }
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionLContext logicalOrExpressionL() {
			return getRuleContext(LogicalOrExpressionLContext.class,0);
		}
		public LogicalOrExpressionLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpressionL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterLogicalOrExpressionL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitLogicalOrExpressionL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitLogicalOrExpressionL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionLContext logicalOrExpressionL() throws RecognitionException {
		LogicalOrExpressionLContext _localctx = new LogicalOrExpressionLContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_logicalOrExpressionL);
		try {
			setState(575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Or:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				match(Or);
				setState(570);
				logicalAndExpression();
				System.out.println("Operator : ||");
				setState(572);
				logicalOrExpressionL();
				}
				break;
			case IntLiteral:
			case Private:
			case Public:
			case Self:
			case Initialize:
			case Print:
			case Int:
			case Bool:
			case True:
			case False:
			case Set:
			case Fptr:
			case If:
			case Return:
			case SemiCollon:
			case LPar:
			case RPar:
			case RBrack:
			case LCurlyBrack:
			case RCurlyBrack:
			case Comma:
			case Assign:
			case Minus:
			case Not:
			case Dot:
			case Colon:
			case QMark:
			case Identifier:
			case ClassIdentifier:
			case NewLine:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public LogicalAndExpressionLContext logicalAndExpressionL() {
			return getRuleContext(LogicalAndExpressionLContext.class,0);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_logicalAndExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			equalityExpression();
			setState(578);
			logicalAndExpressionL();
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

	public static class LogicalAndExpressionLContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(SimpleLOOPParser.And, 0); }
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public LogicalAndExpressionLContext logicalAndExpressionL() {
			return getRuleContext(LogicalAndExpressionLContext.class,0);
		}
		public LogicalAndExpressionLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpressionL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterLogicalAndExpressionL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitLogicalAndExpressionL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitLogicalAndExpressionL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionLContext logicalAndExpressionL() throws RecognitionException {
		LogicalAndExpressionLContext _localctx = new LogicalAndExpressionLContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_logicalAndExpressionL);
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				match(And);
				setState(581);
				equalityExpression();
				System.out.println("Operator : &&");
				setState(583);
				logicalAndExpressionL();
				}
				break;
			case IntLiteral:
			case Private:
			case Public:
			case Self:
			case Initialize:
			case Print:
			case Int:
			case Bool:
			case True:
			case False:
			case Set:
			case Fptr:
			case If:
			case Return:
			case SemiCollon:
			case LPar:
			case RPar:
			case RBrack:
			case LCurlyBrack:
			case RCurlyBrack:
			case Comma:
			case Assign:
			case Minus:
			case Not:
			case Dot:
			case Or:
			case Colon:
			case QMark:
			case Identifier:
			case ClassIdentifier:
			case NewLine:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationExpressionContext relationExpression() {
			return getRuleContext(RelationExpressionContext.class,0);
		}
		public EqualityExpressionLContext equalityExpressionL() {
			return getRuleContext(EqualityExpressionLContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_equalityExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			relationExpression();
			setState(589);
			equalityExpressionL();
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

	public static class EqualityExpressionLContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(SimpleLOOPParser.Equals, 0); }
		public RelationExpressionContext relationExpression() {
			return getRuleContext(RelationExpressionContext.class,0);
		}
		public EqualityExpressionLContext equalityExpressionL() {
			return getRuleContext(EqualityExpressionLContext.class,0);
		}
		public EqualityExpressionLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpressionL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterEqualityExpressionL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitEqualityExpressionL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitEqualityExpressionL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionLContext equalityExpressionL() throws RecognitionException {
		EqualityExpressionLContext _localctx = new EqualityExpressionLContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_equalityExpressionL);
		try {
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equals:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(Equals);
				setState(592);
				relationExpression();
				System.out.println("Operator : ==");
				setState(594);
				equalityExpressionL();
				}
				break;
			case IntLiteral:
			case Private:
			case Public:
			case Self:
			case Initialize:
			case Print:
			case Int:
			case Bool:
			case True:
			case False:
			case Set:
			case Fptr:
			case If:
			case Return:
			case SemiCollon:
			case LPar:
			case RPar:
			case RBrack:
			case LCurlyBrack:
			case RCurlyBrack:
			case Comma:
			case Assign:
			case Minus:
			case Not:
			case Dot:
			case And:
			case Or:
			case Colon:
			case QMark:
			case Identifier:
			case ClassIdentifier:
			case NewLine:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class RelationExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public RelationExpressionLContext relationExpressionL() {
			return getRuleContext(RelationExpressionLContext.class,0);
		}
		public RelationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterRelationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitRelationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitRelationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExpressionContext relationExpression() throws RecognitionException {
		RelationExpressionContext _localctx = new RelationExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_relationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			additiveExpression();
			setState(600);
			relationExpressionL();
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

	public static class RelationExpressionLContext extends ParserRuleContext {
		public Token r;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public RelationExpressionLContext relationExpressionL() {
			return getRuleContext(RelationExpressionLContext.class,0);
		}
		public TerminalNode Less() { return getToken(SimpleLOOPParser.Less, 0); }
		public TerminalNode Greater() { return getToken(SimpleLOOPParser.Greater, 0); }
		public RelationExpressionLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpressionL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterRelationExpressionL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitRelationExpressionL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitRelationExpressionL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExpressionLContext relationExpressionL() throws RecognitionException {
		RelationExpressionLContext _localctx = new RelationExpressionLContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_relationExpressionL);
		int _la;
		try {
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Less:
			case Greater:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				((RelationExpressionLContext)_localctx).r = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Less || _la==Greater) ) {
					((RelationExpressionLContext)_localctx).r = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(603);
				additiveExpression();
				System.out.println("Operator : " + (((RelationExpressionLContext)_localctx).r!=null?((RelationExpressionLContext)_localctx).r.getText():null));
				setState(605);
				relationExpressionL();
				}
				break;
			case IntLiteral:
			case Private:
			case Public:
			case Self:
			case Initialize:
			case Print:
			case Int:
			case Bool:
			case True:
			case False:
			case Set:
			case Fptr:
			case If:
			case Return:
			case SemiCollon:
			case LPar:
			case RPar:
			case RBrack:
			case LCurlyBrack:
			case RCurlyBrack:
			case Comma:
			case Equals:
			case Assign:
			case Minus:
			case Not:
			case Dot:
			case And:
			case Or:
			case Colon:
			case QMark:
			case Identifier:
			case ClassIdentifier:
			case NewLine:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultExpressionContext multExpression() {
			return getRuleContext(MultExpressionContext.class,0);
		}
		public AdditiveExpressionLContext additiveExpressionL() {
			return getRuleContext(AdditiveExpressionLContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_additiveExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			multExpression();
			setState(611);
			additiveExpressionL();
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

	public static class AdditiveExpressionLContext extends ParserRuleContext {
		public Token r;
		public MultExpressionContext multExpression() {
			return getRuleContext(MultExpressionContext.class,0);
		}
		public AdditiveExpressionLContext additiveExpressionL() {
			return getRuleContext(AdditiveExpressionLContext.class,0);
		}
		public TerminalNode Plus() { return getToken(SimpleLOOPParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleLOOPParser.Minus, 0); }
		public AdditiveExpressionLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpressionL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAdditiveExpressionL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAdditiveExpressionL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAdditiveExpressionL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionLContext additiveExpressionL() throws RecognitionException {
		AdditiveExpressionLContext _localctx = new AdditiveExpressionLContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_additiveExpressionL);
		int _la;
		try {
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				((AdditiveExpressionLContext)_localctx).r = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
					((AdditiveExpressionLContext)_localctx).r = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(614);
				multExpression();
				System.out.println("Operator : " + (((AdditiveExpressionLContext)_localctx).r!=null?((AdditiveExpressionLContext)_localctx).r.getText():null));
				setState(616);
				additiveExpressionL();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MultExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultExpressionLContext multExpressionL() {
			return getRuleContext(MultExpressionLContext.class,0);
		}
		public MultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExpressionContext multExpression() throws RecognitionException {
		MultExpressionContext _localctx = new MultExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_multExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			unaryExpression();
			setState(622);
			multExpressionL();
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

	public static class MultExpressionLContext extends ParserRuleContext {
		public Token r;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultExpressionLContext multExpressionL() {
			return getRuleContext(MultExpressionLContext.class,0);
		}
		public TerminalNode Multiply() { return getToken(SimpleLOOPParser.Multiply, 0); }
		public TerminalNode Division() { return getToken(SimpleLOOPParser.Division, 0); }
		public MultExpressionLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpressionL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMultExpressionL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMultExpressionL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMultExpressionL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExpressionLContext multExpressionL() throws RecognitionException {
		MultExpressionLContext _localctx = new MultExpressionLContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_multExpressionL);
		int _la;
		try {
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
			case Division:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				((MultExpressionLContext)_localctx).r = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Multiply || _la==Division) ) {
					((MultExpressionLContext)_localctx).r = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(625);
				unaryExpression();
				System.out.println("Operator : " + (((MultExpressionLContext)_localctx).r!=null?((MultExpressionLContext)_localctx).r.getText():null));
				setState(627);
				multExpressionL();
				}
				break;
			case IntLiteral:
			case Private:
			case Public:
			case Self:
			case Initialize:
			case Print:
			case Int:
			case Bool:
			case True:
			case False:
			case Set:
			case Fptr:
			case If:
			case Return:
			case SemiCollon:
			case LPar:
			case RPar:
			case RBrack:
			case LCurlyBrack:
			case RCurlyBrack:
			case Comma:
			case Equals:
			case Assign:
			case Plus:
			case Minus:
			case Not:
			case Dot:
			case Less:
			case Greater:
			case And:
			case Or:
			case Colon:
			case QMark:
			case Identifier:
			case ClassIdentifier:
			case NewLine:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public Token r;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Minus() { return getToken(SimpleLOOPParser.Minus, 0); }
		public TerminalNode Not() { return getToken(SimpleLOOPParser.Not, 0); }
		public IncDecExpressionContext incDecExpression() {
			return getRuleContext(IncDecExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_unaryExpression);
		int _la;
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				((UnaryExpressionContext)_localctx).r = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Minus || _la==Not) ) {
					((UnaryExpressionContext)_localctx).r = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(633);
				unaryExpression();
				System.out.println("Operator : " + (((UnaryExpressionContext)_localctx).r!=null?((UnaryExpressionContext)_localctx).r.getText():null));
				}
				break;
			case IntLiteral:
			case Self:
			case Initialize:
			case True:
			case False:
			case Set:
			case LPar:
			case Identifier:
			case ClassIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				incDecExpression();
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

	public static class IncDecExpressionContext extends ParserRuleContext {
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
		}
		public IncDecExpressionLContext incDecExpressionL() {
			return getRuleContext(IncDecExpressionLContext.class,0);
		}
		public IncDecExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIncDecExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIncDecExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecExpressionContext incDecExpression() throws RecognitionException {
		IncDecExpressionContext _localctx = new IncDecExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_incDecExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			memberExpression();
			setState(640);
			incDecExpressionL();
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

	public static class IncDecExpressionLContext extends ParserRuleContext {
		public Token r;
		public IncDecExpressionLContext incDecExpressionL() {
			return getRuleContext(IncDecExpressionLContext.class,0);
		}
		public TerminalNode PPlus() { return getToken(SimpleLOOPParser.PPlus, 0); }
		public TerminalNode MMinus() { return getToken(SimpleLOOPParser.MMinus, 0); }
		public IncDecExpressionLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecExpressionL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIncDecExpressionL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIncDecExpressionL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIncDecExpressionL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecExpressionLContext incDecExpressionL() throws RecognitionException {
		IncDecExpressionLContext _localctx = new IncDecExpressionLContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_incDecExpressionL);
		int _la;
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PPlus:
			case MMinus:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				((IncDecExpressionLContext)_localctx).r = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PPlus || _la==MMinus) ) {
					((IncDecExpressionLContext)_localctx).r = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				System.out.println("Operator : " + (((IncDecExpressionLContext)_localctx).r!=null?((IncDecExpressionLContext)_localctx).r.getText():null));
				setState(644);
				incDecExpressionL();
				}
				break;
			case IntLiteral:
			case Private:
			case Public:
			case Self:
			case Initialize:
			case Print:
			case Int:
			case Bool:
			case True:
			case False:
			case Set:
			case Fptr:
			case If:
			case Return:
			case SemiCollon:
			case LPar:
			case RPar:
			case RBrack:
			case LCurlyBrack:
			case RCurlyBrack:
			case Comma:
			case Equals:
			case Assign:
			case Plus:
			case Minus:
			case Not:
			case Multiply:
			case Division:
			case Dot:
			case Less:
			case Greater:
			case And:
			case Or:
			case Colon:
			case QMark:
			case Identifier:
			case ClassIdentifier:
			case NewLine:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MemberExpressionContext extends ParserRuleContext {
		public ValExpressionContext valExpression() {
			return getRuleContext(ValExpressionContext.class,0);
		}
		public MemberExpressionLContext memberExpressionL() {
			return getRuleContext(MemberExpressionLContext.class,0);
		}
		public MemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMemberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberExpressionContext memberExpression() throws RecognitionException {
		MemberExpressionContext _localctx = new MemberExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_memberExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			valExpression();
			setState(649);
			memberExpressionL();
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

	public static class MemberExpressionLContext extends ParserRuleContext {
		public TerminalNode LPar() { return getToken(SimpleLOOPParser.LPar, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RPar() { return getToken(SimpleLOOPParser.RPar, 0); }
		public MemberExpressionLContext memberExpressionL() {
			return getRuleContext(MemberExpressionLContext.class,0);
		}
		public TerminalNode Dot() { return getToken(SimpleLOOPParser.Dot, 0); }
		public SpecialExpressionContext specialExpression() {
			return getRuleContext(SpecialExpressionContext.class,0);
		}
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
		}
		public TerminalNode LBrack() { return getToken(SimpleLOOPParser.LBrack, 0); }
		public CommaExpressionContext commaExpression() {
			return getRuleContext(CommaExpressionContext.class,0);
		}
		public TerminalNode RBrack() { return getToken(SimpleLOOPParser.RBrack, 0); }
		public MemberExpressionLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberExpressionL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMemberExpressionL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMemberExpressionL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMemberExpressionL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberExpressionLContext memberExpressionL() throws RecognitionException {
		MemberExpressionLContext _localctx = new MemberExpressionLContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_memberExpressionL);
		try {
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				match(LPar);
				setState(652);
				params();
				setState(653);
				match(RPar);
				setState(654);
				memberExpressionL();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(Dot);
				setState(659);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case New:
				case Delete:
				case Include:
				case Add:
				case Merge:
					{
					setState(657);
					specialExpression();
					}
					break;
				case IntLiteral:
				case Self:
				case Initialize:
				case True:
				case False:
				case Set:
				case LPar:
				case Identifier:
				case ClassIdentifier:
					{
					setState(658);
					memberExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(661);
				memberExpressionL();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(663);
				match(LBrack);
				setState(664);
				commaExpression();
				setState(665);
				match(RBrack);
				setState(666);
				memberExpressionL();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class SpecialExpressionContext extends ParserRuleContext {
		public NewFuncExpressionContext newFuncExpression() {
			return getRuleContext(NewFuncExpressionContext.class,0);
		}
		public TerminalNode LPar() { return getToken(SimpleLOOPParser.LPar, 0); }
		public TerminalNode RPar() { return getToken(SimpleLOOPParser.RPar, 0); }
		public TerminalNode Add() { return getToken(SimpleLOOPParser.Add, 0); }
		public TerminalNode Include() { return getToken(SimpleLOOPParser.Include, 0); }
		public TerminalNode Delete() { return getToken(SimpleLOOPParser.Delete, 0); }
		public TerminalNode IntLiteral() { return getToken(SimpleLOOPParser.IntLiteral, 0); }
		public TerminalNode Identifier() { return getToken(SimpleLOOPParser.Identifier, 0); }
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public TerminalNode Merge() { return getToken(SimpleLOOPParser.Merge, 0); }
		public TerminalNode Set() { return getToken(SimpleLOOPParser.Set, 0); }
		public TerminalNode Dot() { return getToken(SimpleLOOPParser.Dot, 0); }
		public CommaExpressionContext commaExpression() {
			return getRuleContext(CommaExpressionContext.class,0);
		}
		public SpecialExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSpecialExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSpecialExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSpecialExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialExpressionContext specialExpression() throws RecognitionException {
		SpecialExpressionContext _localctx = new SpecialExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_specialExpression);
		try {
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case New:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				newFuncExpression();
				}
				break;
			case Delete:
			case Include:
			case Add:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Add:
					{
					setState(672);
					match(Add);
					System.out.println("ADD");
					}
					break;
				case Include:
					{
					setState(674);
					match(Include);
					System.out.println("INCLUDE");
					}
					break;
				case Delete:
					{
					setState(676);
					match(Delete);
					System.out.println("DELETE");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(680);
				match(LPar);
				setState(684);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(681);
					match(IntLiteral);
					}
					break;
				case 2:
					{
					setState(682);
					match(Identifier);
					}
					break;
				case 3:
					{
					setState(683);
					assignExpression();
					}
					break;
				}
				setState(686);
				match(RPar);
				}
				break;
			case Merge:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				match(Merge);
				System.out.println("MERGE");
				setState(689);
				match(LPar);
				setState(694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(690);
					match(Set);
					setState(691);
					match(Dot);
					setState(692);
					newFuncExpression();
					}
					break;
				case 2:
					{
					setState(693);
					commaExpression();
					}
					break;
				}
				setState(696);
				match(RPar);
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

	public static class NewFuncExpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(SimpleLOOPParser.New, 0); }
		public List<TerminalNode> LPar() { return getTokens(SimpleLOOPParser.LPar); }
		public TerminalNode LPar(int i) {
			return getToken(SimpleLOOPParser.LPar, i);
		}
		public List<TerminalNode> RPar() { return getTokens(SimpleLOOPParser.RPar); }
		public TerminalNode RPar(int i) {
			return getToken(SimpleLOOPParser.RPar, i);
		}
		public List<TerminalNode> IntLiteral() { return getTokens(SimpleLOOPParser.IntLiteral); }
		public TerminalNode IntLiteral(int i) {
			return getToken(SimpleLOOPParser.IntLiteral, i);
		}
		public TerminalNode Comma() { return getToken(SimpleLOOPParser.Comma, 0); }
		public NewFuncExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newFuncExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterNewFuncExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitNewFuncExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitNewFuncExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewFuncExpressionContext newFuncExpression() throws RecognitionException {
		NewFuncExpressionContext _localctx = new NewFuncExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_newFuncExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(New);
			System.out.println("NEW");
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				{
				setState(702);
				match(LPar);
				setState(703);
				match(IntLiteral);
				{
				setState(704);
				match(Comma);
				setState(705);
				match(IntLiteral);
				}
				setState(707);
				match(RPar);
				}
				}
				break;
			case 2:
				{
				{
				setState(708);
				match(LPar);
				setState(709);
				match(LPar);
				setState(710);
				match(IntLiteral);
				{
				setState(711);
				match(Comma);
				setState(712);
				match(IntLiteral);
				}
				setState(714);
				match(RPar);
				setState(715);
				match(RPar);
				}
				}
				break;
			case 3:
				{
				setState(716);
				match(LPar);
				setState(717);
				match(RPar);
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

	public static class ValExpressionContext extends ParserRuleContext {
		public TerminalNode LPar() { return getToken(SimpleLOOPParser.LPar, 0); }
		public CommaExpressionContext commaExpression() {
			return getRuleContext(CommaExpressionContext.class,0);
		}
		public TerminalNode RPar() { return getToken(SimpleLOOPParser.RPar, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimpleLOOPParser.Identifier, 0); }
		public TerminalNode Self() { return getToken(SimpleLOOPParser.Self, 0); }
		public TerminalNode Set() { return getToken(SimpleLOOPParser.Set, 0); }
		public TerminalNode IntLiteral() { return getToken(SimpleLOOPParser.IntLiteral, 0); }
		public TerminalNode ClassIdentifier() { return getToken(SimpleLOOPParser.ClassIdentifier, 0); }
		public TerminalNode Initialize() { return getToken(SimpleLOOPParser.Initialize, 0); }
		public ValExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterValExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitValExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitValExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValExpressionContext valExpression() throws RecognitionException {
		ValExpressionContext _localctx = new ValExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_valExpression);
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				match(LPar);
				setState(721);
				commaExpression();
				setState(722);
				match(RPar);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(725);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(726);
				match(Self);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(727);
				match(Set);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(728);
				match(IntLiteral);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(729);
				match(ClassIdentifier);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(730);
				match(Initialize);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<AssignExpressionContext> assignExpression() {
			return getRuleContexts(AssignExpressionContext.class);
		}
		public AssignExpressionContext assignExpression(int i) {
			return getRuleContext(AssignExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLOOPParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLOOPParser.Comma, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntLiteral) | (1L << Self) | (1L << Initialize) | (1L << True) | (1L << False) | (1L << Set) | (1L << LPar) | (1L << Minus) | (1L << Not) | (1L << Identifier) | (1L << ClassIdentifier))) != 0)) {
				{
				setState(733);
				assignExpression();
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(734);
					match(Comma);
					setState(735);
					assignExpression();
					}
					}
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntLiteral() { return getToken(SimpleLOOPParser.IntLiteral, 0); }
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public SetLiteralContext setLiteral() {
			return getRuleContext(SetLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_literal);
		try {
			setState(746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				match(IntLiteral);
				}
				break;
			case True:
			case False:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				boolLiteral();
				}
				break;
			case LPar:
				enterOuterAlt(_localctx, 3);
				{
				setState(745);
				setLiteral();
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

	public static class SetLiteralContext extends ParserRuleContext {
		public TerminalNode LPar() { return getToken(SimpleLOOPParser.LPar, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RPar() { return getToken(SimpleLOOPParser.RPar, 0); }
		public SetLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSetLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSetLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetLiteralContext setLiteral() throws RecognitionException {
		SetLiteralContext _localctx = new SetLiteralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_setLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(LPar);
			setState(749);
			params();
			setState(750);
			match(RPar);
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

	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(SimpleLOOPParser.True, 0); }
		public TerminalNode False() { return getToken(SimpleLOOPParser.False, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_la = _input.LA(1);
			if ( !(_la==True || _la==False) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u02f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\5\2t\n\2\3\2\3\2\7\2"+
		"x\n\2\f\2\16\2{\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\6\4\u0084\n\4\r\4\16"+
		"\4\u0085\7\4\u0088\n\4\f\4\16\4\u008b\13\4\3\5\3\5\3\5\3\6\3\6\5\6\u0092"+
		"\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u009c\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u00a3\n\b\f\b\16\b\u00a6\13\b\3\b\5\b\u00a9\n\b\3\b\3\b\3\b\5\b\u00ae"+
		"\n\b\3\t\3\t\3\t\3\t\5\t\u00b4\n\t\3\t\3\t\3\t\5\t\u00b9\n\t\7\t\u00bb"+
		"\n\t\f\t\16\t\u00be\13\t\3\t\3\t\3\t\5\t\u00c3\n\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\6\n\u00cc\n\n\r\n\16\n\u00cd\3\n\5\n\u00d1\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e3\n\f\f"+
		"\f\16\f\u00e6\13\f\3\r\3\r\6\r\u00ea\n\r\r\r\16\r\u00eb\3\r\3\r\3\r\6"+
		"\r\u00f1\n\r\r\r\16\r\u00f2\3\r\6\r\u00f6\n\r\r\r\16\r\u00f7\3\r\3\r\3"+
		"\r\5\r\u00fd\n\r\3\r\3\r\5\r\u0101\n\r\3\r\6\r\u0104\n\r\r\r\16\r\u0105"+
		"\5\r\u0108\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u010f\n\16\3\16\3\16\3\16"+
		"\5\16\u0114\n\16\3\16\7\16\u0117\n\16\f\16\16\16\u011a\13\16\7\16\u011c"+
		"\n\16\f\16\16\16\u011f\13\16\3\17\3\17\3\17\5\17\u0124\n\17\3\17\7\17"+
		"\u0127\n\17\f\17\16\17\u012a\13\17\7\17\u012c\n\17\f\17\16\17\u012f\13"+
		"\17\3\20\3\20\3\20\5\20\u0134\n\20\3\21\3\21\3\21\5\21\u0139\n\21\3\22"+
		"\3\22\3\22\3\22\5\22\u013f\n\22\3\22\3\22\3\22\3\22\5\22\u0145\n\22\7"+
		"\22\u0147\n\22\f\22\16\22\u014a\13\22\5\22\u014c\n\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0158\n\24\f\24\16\24\u015b\13"+
		"\24\3\24\3\24\5\24\u015f\n\24\3\25\7\25\u0162\n\25\f\25\16\25\u0165\13"+
		"\25\3\25\3\25\6\25\u0169\n\25\r\25\16\25\u016a\3\25\3\25\3\25\3\25\7\25"+
		"\u0171\n\25\f\25\16\25\u0174\13\25\3\25\3\25\5\25\u0178\n\25\3\25\3\25"+
		"\3\25\3\25\5\25\u017e\n\25\3\26\3\26\5\26\u0182\n\26\3\26\6\26\u0185\n"+
		"\26\r\26\16\26\u0186\3\26\7\26\u018a\n\26\f\26\16\26\u018d\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u0195\n\27\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u019c\n\30\3\31\3\31\3\31\3\31\7\31\u01a2\n\31\f\31\16\31\u01a5\13\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01ad\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u01b5\n\31\f\31\16\31\u01b8\13\31\3\31\3\31\6\31\u01bc\n\31"+
		"\r\31\16\31\u01bd\3\31\3\31\3\31\3\31\5\31\u01c4\n\31\3\31\3\31\6\31\u01c8"+
		"\n\31\r\31\16\31\u01c9\3\31\3\31\3\31\5\31\u01cf\n\31\3\31\6\31\u01d2"+
		"\n\31\r\31\16\31\u01d3\3\31\3\31\3\31\3\31\5\31\u01da\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\6\31\u01e4\n\31\r\31\16\31\u01e5\3\31\6\31"+
		"\u01e9\n\31\r\31\16\31\u01ea\3\31\3\31\3\31\3\31\3\31\5\31\u01f2\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01fc\n\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u020c\n\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0217\n\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0222\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u022a\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u0237\n"+
		"!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u0242\n#\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\5%\u024d\n%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0258\n\'\3(\3(\3("+
		"\3)\3)\3)\3)\3)\3)\5)\u0263\n)\3*\3*\3*\3+\3+\3+\3+\3+\3+\5+\u026e\n+"+
		"\3,\3,\3,\3-\3-\3-\3-\3-\3-\5-\u0279\n-\3.\3.\3.\3.\3.\5.\u0280\n.\3/"+
		"\3/\3/\3\60\3\60\3\60\3\60\5\60\u0289\n\60\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\5\62\u0296\n\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u02a0\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u02a9\n\63\3\63\3\63\3\63\3\63\5\63\u02af\n\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\5\63\u02b9\n\63\3\63\3\63\5\63\u02bd\n\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u02d1\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\5\65\u02de\n\65\3\66\3\66\3\66\7\66\u02e3\n\66\f\66\16\66\u02e6"+
		"\13\66\5\66\u02e8\n\66\3\67\3\67\3\67\5\67\u02ed\n\67\38\38\38\38\39\3"+
		"9\39\2\2:\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\n\4\2\22\23>>\3\2\5\6\3\2\65\66\3\2-"+
		".\3\2\60\61\3\2./\3\2*+\3\2\24\25\2\u032a\2s\3\2\2\2\4~\3\2\2\2\6\u0089"+
		"\3\2\2\2\b\u008c\3\2\2\2\n\u0091\3\2\2\2\f\u009b\3\2\2\2\16\u00ad\3\2"+
		"\2\2\20\u00af\3\2\2\2\22\u00c6\3\2\2\2\24\u00d2\3\2\2\2\26\u00e4\3\2\2"+
		"\2\30\u0107\3\2\2\2\32\u0109\3\2\2\2\34\u012d\3\2\2\2\36\u0130\3\2\2\2"+
		" \u0135\3\2\2\2\"\u013a\3\2\2\2$\u014f\3\2\2\2&\u015e\3\2\2\2(\u017d\3"+
		"\2\2\2*\u017f\3\2\2\2,\u0194\3\2\2\2.\u019b\3\2\2\2\60\u01f1\3\2\2\2\62"+
		"\u01fb\3\2\2\2\64\u0206\3\2\2\2\66\u0216\3\2\2\28\u0218\3\2\2\2:\u0221"+
		"\3\2\2\2<\u0229\3\2\2\2>\u022b\3\2\2\2@\u0236\3\2\2\2B\u0238\3\2\2\2D"+
		"\u0241\3\2\2\2F\u0243\3\2\2\2H\u024c\3\2\2\2J\u024e\3\2\2\2L\u0257\3\2"+
		"\2\2N\u0259\3\2\2\2P\u0262\3\2\2\2R\u0264\3\2\2\2T\u026d\3\2\2\2V\u026f"+
		"\3\2\2\2X\u0278\3\2\2\2Z\u027f\3\2\2\2\\\u0281\3\2\2\2^\u0288\3\2\2\2"+
		"`\u028a\3\2\2\2b\u029f\3\2\2\2d\u02bc\3\2\2\2f\u02be\3\2\2\2h\u02dd\3"+
		"\2\2\2j\u02e7\3\2\2\2l\u02ec\3\2\2\2n\u02ee\3\2\2\2p\u02f2\3\2\2\2rt\7"+
		"?\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uy\5\4\3\2vx\7?\2\2wv\3\2\2\2x{\3\2"+
		"\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\2\2\3}\3\3\2\2\2~\177"+
		"\5\6\4\2\177\u0080\5\26\f\2\u0080\5\3\2\2\2\u0081\u0083\5\b\5\2\u0082"+
		"\u0084\7?\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0081\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\7\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008c\u008d\5\f\7\2\u008d\u008e\5\16\b\2\u008e\t"+
		"\3\2\2\2\u008f\u0092\5\f\7\2\u0090\u0092\7\31\2\2\u0091\u008f\3\2\2\2"+
		"\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7=\2\2\u0094\u0095"+
		"\b\6\1\2\u0095\13\3\2\2\2\u0096\u009c\7\22\2\2\u0097\u009c\7\23\2\2\u0098"+
		"\u009c\5\22\n\2\u0099\u009c\5\20\t\2\u009a\u009c\5\24\13\2\u009b\u0096"+
		"\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\r\3\2\2\2\u009d\u009e\7=\2\2\u009e\u00a4\b\b\1\2"+
		"\u009f\u00a0\7(\2\2\u00a0\u00a1\7=\2\2\u00a1\u00a3\b\b\1\2\u00a2\u009f"+
		"\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\7!\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ae\3\2\2\2\u00aa\u00ab\7=\2\2\u00ab"+
		"\u00ae\b\b\1\2\u00ac\u00ae\5\66\34\2\u00ad\u009d\3\2\2\2\u00ad\u00aa\3"+
		"\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\17\3\2\2\2\u00af\u00b0\7\27\2\2\u00b0"+
		"\u00b3\7\65\2\2\u00b1\u00b4\5\f\7\2\u00b2\u00b4\7\31\2\2\u00b3\u00b1\3"+
		"\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00bc\3\2\2\2\u00b5\u00b8\7(\2\2\u00b6"+
		"\u00b9\5\f\7\2\u00b7\u00b9\7\31\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b5\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00bf\u00c2\7\64\2\2\u00c0\u00c3\5\f\7\2\u00c1\u00c3\7\31\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\66"+
		"\2\2\u00c5\21\3\2\2\2\u00c6\u00d0\t\2\2\2\u00c7\u00c8\7$\2\2\u00c8\u00c9"+
		"\58\35\2\u00c9\u00ca\7%\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\23\3\2\2\2\u00d2\u00d3\7\26\2\2\u00d3\u00d4\7\65\2\2\u00d4\u00d5\7\22"+
		"\2\2\u00d5\u00d6\7\66\2\2\u00d6\25\3\2\2\2\u00d7\u00d8\7\4\2\2\u00d8\u00d9"+
		"\7>\2\2\u00d9\u00da\b\f\1\2\u00da\u00db\7\65\2\2\u00db\u00dc\7>\2\2\u00dc"+
		"\u00dd\b\f\1\2\u00dd\u00e3\5\30\r\2\u00de\u00df\7\4\2\2\u00df\u00e0\7"+
		">\2\2\u00e0\u00e1\b\f\1\2\u00e1\u00e3\5\30\r\2\u00e2\u00d7\3\2\2\2\u00e2"+
		"\u00de\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\27\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\7&\2\2\u00e8\u00ea"+
		"\7?\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\5\32\16\2\u00ee\u00f0\7"+
		"\'\2\2\u00ef\u00f1\7?\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u0108\3\2\2\2\u00f4\u00f6\7?"+
		"\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u0100\3\2\2\2\u00f9\u00fc\t\3\2\2\u00fa\u00fd\5\b"+
		"\5\2\u00fb\u00fd\5 \21\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"\u0101\3\2\2\2\u00fe\u00ff\7\6\2\2\u00ff\u0101\5\36\20\2\u0100\u00f9\3"+
		"\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0104\7?\2\2\u0103"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0108\3\2\2\2\u0107\u00e7\3\2\2\2\u0107\u00f5\3\2\2\2\u0108"+
		"\31\3\2\2\2\u0109\u010e\5\34\17\2\u010a\u010b\7\6\2\2\u010b\u010c\5\36"+
		"\20\2\u010c\u010d\7?\2\2\u010d\u010f\3\2\2\2\u010e\u010a\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u011d\3\2\2\2\u0110\u0113\t\3\2\2\u0111\u0114\5\b"+
		"\5\2\u0112\u0114\5 \21\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0118\3\2\2\2\u0115\u0117\7?\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u0110\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\33\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0123"+
		"\t\3\2\2\u0121\u0124\5\b\5\2\u0122\u0124\5 \21\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0128\3\2\2\2\u0125\u0127\7?\2\2\u0126\u0125\3\2"+
		"\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u0120\3\2\2\2\u012c\u012f\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\35\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u0130\u0131\7\b\2\2\u0131\u0133\5\"\22\2\u0132\u0134\5(\25\2"+
		"\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\37\3\2\2\2\u0135\u0136"+
		"\5\n\6\2\u0136\u0138\5\"\22\2\u0137\u0139\5(\25\2\u0138\u0137\3\2\2\2"+
		"\u0138\u0139\3\2\2\2\u0139!\3\2\2\2\u013a\u014b\7\"\2\2\u013b\u013e\5"+
		"$\23\2\u013c\u013d\7,\2\2\u013d\u013f\5l\67\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0148\3\2\2\2\u0140\u0141\7(\2\2\u0141\u0144\5$\23"+
		"\2\u0142\u0143\7,\2\2\u0143\u0145\5l\67\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0140\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u013b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\7#\2\2\u014e#\3\2\2\2\u014f\u0150\5\f\7\2\u0150\u0151\5&\24\2\u0151"+
		"%\3\2\2\2\u0152\u0153\7=\2\2\u0153\u0159\b\24\1\2\u0154\u0155\7(\2\2\u0155"+
		"\u0156\7=\2\2\u0156\u0158\b\24\1\2\u0157\u0154\3\2\2\2\u0158\u015b\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015f\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015d\7=\2\2\u015d\u015f\b\24\1\2\u015e\u0152\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015f\'\3\2\2\2\u0160\u0162\7?\2\2\u0161\u0160"+
		"\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0168\7&\2\2\u0167\u0169\7?\2"+
		"\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\5*\26\2\u016d\u016e\7\'\2\2\u016e"+
		"\u017e\3\2\2\2\u016f\u0171\7?\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0177\5,\27\2\u0176\u0178\7!\2\2\u0177\u0176\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u017e\3\2\2\2\u0179\u017a\7?\2\2\u017a"+
		"\u017b\7&\2\2\u017b\u017c\7?\2\2\u017c\u017e\7\'\2\2\u017d\u0163\3\2\2"+
		"\2\u017d\u0172\3\2\2\2\u017d\u0179\3\2\2\2\u017e)\3\2\2\2\u017f\u0181"+
		"\5,\27\2\u0180\u0182\7!\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0184\3\2\2\2\u0183\u0185\7?\2\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018b\3\2\2\2\u0188"+
		"\u018a\5*\26\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c+\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0195"+
		"\5\b\5\2\u018f\u0195\5\66\34\2\u0190\u0195\5\60\31\2\u0191\u0195\5\62"+
		"\32\2\u0192\u0195\5.\30\2\u0193\u0195\5\64\33\2\u0194\u018e\3\2\2\2\u0194"+
		"\u018f\3\2\2\2\u0194\u0190\3\2\2\2\u0194\u0191\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0194\u0193\3\2\2\2\u0195-\3\2\2\2\u0196\u0197\7 \2\2\u0197\u0198"+
		"\b\30\1\2\u0198\u019c\58\35\2\u0199\u019a\7 \2\2\u019a\u019c\b\30\1\2"+
		"\u019b\u0196\3\2\2\2\u019b\u0199\3\2\2\2\u019c/\3\2\2\2\u019d\u019e\7"+
		"\34\2\2\u019e\u019f\b\31\1\2\u019f\u01a3\58\35\2\u01a0\u01a2\7?\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\5(\25\2\u01a7"+
		"\u01f2\3\2\2\2\u01a8\u01a9\7\34\2\2\u01a9\u01aa\b\31\1\2\u01aa\u01ac\5"+
		"8\35\2\u01ab\u01ad\7?\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01bb\5(\25\2\u01af\u01b0\7?\2\2\u01b0\u01b1\7\36"+
		"\2\2\u01b1\u01b2\b\31\1\2\u01b2\u01b6\58\35\2\u01b3\u01b5\7?\2\2\u01b4"+
		"\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\5(\25\2\u01ba"+
		"\u01bc\3\2\2\2\u01bb\u01af\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\u01f2\3\2\2\2\u01bf\u01c0\7\34\2\2\u01c0"+
		"\u01c1\b\31\1\2\u01c1\u01c3\58\35\2\u01c2\u01c4\7?\2\2\u01c3\u01c2\3\2"+
		"\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01d1\5(\25\2\u01c6"+
		"\u01c8\7?\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\7\35\2\2\u01cc"+
		"\u01ce\b\31\1\2\u01cd\u01cf\7?\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\5(\25\2\u01d1\u01c7\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01f2\3\2"+
		"\2\2\u01d5\u01d6\7\34\2\2\u01d6\u01d7\b\31\1\2\u01d7\u01d9\58\35\2\u01d8"+
		"\u01da\7?\2\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2"+
		"\2\2\u01db\u01e3\5(\25\2\u01dc\u01dd\7?\2\2\u01dd\u01de\7\36\2\2\u01de"+
		"\u01df\b\31\1\2\u01df\u01e0\58\35\2\u01e0\u01e1\7?\2\2\u01e1\u01e2\5("+
		"\25\2\u01e2\u01e4\3\2\2\2\u01e3\u01dc\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e9\7?"+
		"\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\7\35\2\2\u01ed\u01ee\b"+
		"\31\1\2\u01ee\u01ef\7?\2\2\u01ef\u01f0\5(\25\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u019d\3\2\2\2\u01f1\u01a8\3\2\2\2\u01f1\u01bf\3\2\2\2\u01f1\u01d5\3\2"+
		"\2\2\u01f2\61\3\2\2\2\u01f3\u01f4\7\"\2\2\u01f4\u01f5\58\35\2\u01f5\u01f6"+
		"\7\63\2\2\u01f6\u01f7\7\63\2\2\u01f7\u01f8\58\35\2\u01f8\u01f9\7#\2\2"+
		"\u01f9\u01fc\3\2\2\2\u01fa\u01fc\7=\2\2\u01fb\u01f3\3\2\2\2\u01fb\u01fa"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\7\63\2\2\u01fe\u01ff\7\37\2\2"+
		"\u01ff\u0200\b\32\1\2\u0200\u0201\7\33\2\2\u0201\u0202\79\2\2\u0202\u0203"+
		"\7=\2\2\u0203\u0204\79\2\2\u0204\u0205\5(\25\2\u0205\63\3\2\2\2\u0206"+
		"\u0207\7\t\2\2\u0207\u0208\b\33\1\2\u0208\u020b\7\"\2\2\u0209\u020c\7"+
		"=\2\2\u020a\u020c\58\35\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020e\7#\2\2\u020e\65\3\2\2\2\u020f\u0210\b\34\1"+
		"\2\u0210\u0211\5`\61\2\u0211\u0212\7\"\2\2\u0212\u0213\5j\66\2\u0213\u0214"+
		"\7#\2\2\u0214\u0217\3\2\2\2\u0215\u0217\58\35\2\u0216\u020f\3\2\2\2\u0216"+
		"\u0215\3\2\2\2\u0217\67\3\2\2\2\u0218\u0219\5<\37\2\u0219\u021a\5:\36"+
		"\2\u021a9\3\2\2\2\u021b\u021c\7(\2\2\u021c\u021d\5<\37\2\u021d\u021e\b"+
		"\36\1\2\u021e\u021f\5:\36\2\u021f\u0222\3\2\2\2\u0220\u0222\3\2\2\2\u0221"+
		"\u021b\3\2\2\2\u0221\u0220\3\2\2\2\u0222;\3\2\2\2\u0223\u0224\5> \2\u0224"+
		"\u0225\7,\2\2\u0225\u0226\5<\37\2\u0226\u0227\b\37\1\2\u0227\u022a\3\2"+
		"\2\2\u0228\u022a\5> \2\u0229\u0223\3\2\2\2\u0229\u0228\3\2\2\2\u022a="+
		"\3\2\2\2\u022b\u022c\5B\"\2\u022c\u022d\5@!\2\u022d?\3\2\2\2\u022e\u022f"+
		"\7;\2\2\u022f\u0230\5> \2\u0230\u0231\7:\2\2\u0231\u0232\5> \2\u0232\u0233"+
		"\b!\1\2\u0233\u0234\5@!\2\u0234\u0237\3\2\2\2\u0235\u0237\3\2\2\2\u0236"+
		"\u022e\3\2\2\2\u0236\u0235\3\2\2\2\u0237A\3\2\2\2\u0238\u0239\5F$\2\u0239"+
		"\u023a\5D#\2\u023aC\3\2\2\2\u023b\u023c\78\2\2\u023c\u023d\5F$\2\u023d"+
		"\u023e\b#\1\2\u023e\u023f\5D#\2\u023f\u0242\3\2\2\2\u0240\u0242\3\2\2"+
		"\2\u0241\u023b\3\2\2\2\u0241\u0240\3\2\2\2\u0242E\3\2\2\2\u0243\u0244"+
		"\5J&\2\u0244\u0245\5H%\2\u0245G\3\2\2\2\u0246\u0247\7\67\2\2\u0247\u0248"+
		"\5J&\2\u0248\u0249\b%\1\2\u0249\u024a\5H%\2\u024a\u024d\3\2\2\2\u024b"+
		"\u024d\3\2\2\2\u024c\u0246\3\2\2\2\u024c\u024b\3\2\2\2\u024dI\3\2\2\2"+
		"\u024e\u024f\5N(\2\u024f\u0250\5L\'\2\u0250K\3\2\2\2\u0251\u0252\7)\2"+
		"\2\u0252\u0253\5N(\2\u0253\u0254\b\'\1\2\u0254\u0255\5L\'\2\u0255\u0258"+
		"\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0251\3\2\2\2\u0257\u0256\3\2\2\2\u0258"+
		"M\3\2\2\2\u0259\u025a\5R*\2\u025a\u025b\5P)\2\u025bO\3\2\2\2\u025c\u025d"+
		"\t\4\2\2\u025d\u025e\5R*\2\u025e\u025f\b)\1\2\u025f\u0260\5P)\2\u0260"+
		"\u0263\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u025c\3\2\2\2\u0262\u0261\3\2"+
		"\2\2\u0263Q\3\2\2\2\u0264\u0265\5V,\2\u0265\u0266\5T+\2\u0266S\3\2\2\2"+
		"\u0267\u0268\t\5\2\2\u0268\u0269\5V,\2\u0269\u026a\b+\1\2\u026a\u026b"+
		"\5T+\2\u026b\u026e\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u0267\3\2\2\2\u026d"+
		"\u026c\3\2\2\2\u026eU\3\2\2\2\u026f\u0270\5Z.\2\u0270\u0271\5X-\2\u0271"+
		"W\3\2\2\2\u0272\u0273\t\6\2\2\u0273\u0274\5Z.\2\u0274\u0275\b-\1\2\u0275"+
		"\u0276\5X-\2\u0276\u0279\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0272\3\2\2"+
		"\2\u0278\u0277\3\2\2\2\u0279Y\3\2\2\2\u027a\u027b\t\7\2\2\u027b\u027c"+
		"\5Z.\2\u027c\u027d\b.\1\2\u027d\u0280\3\2\2\2\u027e\u0280\5\\/\2\u027f"+
		"\u027a\3\2\2\2\u027f\u027e\3\2\2\2\u0280[\3\2\2\2\u0281\u0282\5`\61\2"+
		"\u0282\u0283\5^\60\2\u0283]\3\2\2\2\u0284\u0285\t\b\2\2\u0285\u0286\b"+
		"\60\1\2\u0286\u0289\5^\60\2\u0287\u0289\3\2\2\2\u0288\u0284\3\2\2\2\u0288"+
		"\u0287\3\2\2\2\u0289_\3\2\2\2\u028a\u028b\5h\65\2\u028b\u028c\5b\62\2"+
		"\u028ca\3\2\2\2\u028d\u028e\7\"\2\2\u028e\u028f\5j\66\2\u028f\u0290\7"+
		"#\2\2\u0290\u0291\5b\62\2\u0291\u02a0\3\2\2\2\u0292\u0295\7\63\2\2\u0293"+
		"\u0296\5d\63\2\u0294\u0296\5`\61\2\u0295\u0293\3\2\2\2\u0295\u0294\3\2"+
		"\2\2\u0296\u0297\3\2\2\2\u0297\u0298\5b\62\2\u0298\u02a0\3\2\2\2\u0299"+
		"\u029a\7$\2\2\u029a\u029b\58\35\2\u029b\u029c\7%\2\2\u029c\u029d\5b\62"+
		"\2\u029d\u02a0\3\2\2\2\u029e\u02a0\3\2\2\2\u029f\u028d\3\2\2\2\u029f\u0292"+
		"\3\2\2\2\u029f\u0299\3\2\2\2\u029f\u029e\3\2\2\2\u02a0c\3\2\2\2\u02a1"+
		"\u02bd\5f\64\2\u02a2\u02a3\7\16\2\2\u02a3\u02a9\b\63\1\2\u02a4\u02a5\7"+
		"\r\2\2\u02a5\u02a9\b\63\1\2\u02a6\u02a7\7\f\2\2\u02a7\u02a9\b\63\1\2\u02a8"+
		"\u02a2\3\2\2\2\u02a8\u02a4\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\3\2"+
		"\2\2\u02aa\u02ae\7\"\2\2\u02ab\u02af\7\3\2\2\u02ac\u02af\7=\2\2\u02ad"+
		"\u02af\5<\37\2\u02ae\u02ab\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2"+
		"\2\2\u02af\u02b0\3\2\2\2\u02b0\u02bd\7#\2\2\u02b1\u02b2\7\17\2\2\u02b2"+
		"\u02b3\b\63\1\2\u02b3\u02b8\7\"\2\2\u02b4\u02b5\7\26\2\2\u02b5\u02b6\7"+
		"\63\2\2\u02b6\u02b9\5f\64\2\u02b7\u02b9\58\35\2\u02b8\u02b4\3\2\2\2\u02b8"+
		"\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\7#\2\2\u02bb\u02bd\3\2"+
		"\2\2\u02bc\u02a1\3\2\2\2\u02bc\u02a8\3\2\2\2\u02bc\u02b1\3\2\2\2\u02bd"+
		"e\3\2\2\2\u02be\u02bf\7\n\2\2\u02bf\u02d0\b\64\1\2\u02c0\u02c1\7\"\2\2"+
		"\u02c1\u02c2\7\3\2\2\u02c2\u02c3\7(\2\2\u02c3\u02c4\7\3\2\2\u02c4\u02c5"+
		"\3\2\2\2\u02c5\u02d1\7#\2\2\u02c6\u02c7\7\"\2\2\u02c7\u02c8\7\"\2\2\u02c8"+
		"\u02c9\7\3\2\2\u02c9\u02ca\7(\2\2\u02ca\u02cb\7\3\2\2\u02cb\u02cc\3\2"+
		"\2\2\u02cc\u02cd\7#\2\2\u02cd\u02d1\7#\2\2\u02ce\u02cf\7\"\2\2\u02cf\u02d1"+
		"\7#\2\2\u02d0\u02c0\3\2\2\2\u02d0\u02c6\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1"+
		"g\3\2\2\2\u02d2\u02d3\7\"\2\2\u02d3\u02d4\58\35\2\u02d4\u02d5\7#\2\2\u02d5"+
		"\u02de\3\2\2\2\u02d6\u02de\5l\67\2\u02d7\u02de\7=\2\2\u02d8\u02de\7\7"+
		"\2\2\u02d9\u02de\7\26\2\2\u02da\u02de\7\3\2\2\u02db\u02de\7>\2\2\u02dc"+
		"\u02de\7\b\2\2\u02dd\u02d2\3\2\2\2\u02dd\u02d6\3\2\2\2\u02dd\u02d7\3\2"+
		"\2\2\u02dd\u02d8\3\2\2\2\u02dd\u02d9\3\2\2\2\u02dd\u02da\3\2\2\2\u02dd"+
		"\u02db\3\2\2\2\u02dd\u02dc\3\2\2\2\u02dei\3\2\2\2\u02df\u02e4\5<\37\2"+
		"\u02e0\u02e1\7(\2\2\u02e1\u02e3\5<\37\2\u02e2\u02e0\3\2\2\2\u02e3\u02e6"+
		"\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6"+
		"\u02e4\3\2\2\2\u02e7\u02df\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8k\3\2\2\2"+
		"\u02e9\u02ed\7\3\2\2\u02ea\u02ed\5p9\2\u02eb\u02ed\5n8\2\u02ec\u02e9\3"+
		"\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02eb\3\2\2\2\u02edm\3\2\2\2\u02ee\u02ef"+
		"\7\"\2\2\u02ef\u02f0\5j\66\2\u02f0\u02f1\7#\2\2\u02f1o\3\2\2\2\u02f2\u02f3"+
		"\t\t\2\2\u02f3q\3\2\2\2Xsy\u0085\u0089\u0091\u009b\u00a4\u00a8\u00ad\u00b3"+
		"\u00b8\u00bc\u00c2\u00cd\u00d0\u00e2\u00e4\u00eb\u00f2\u00f7\u00fc\u0100"+
		"\u0105\u0107\u010e\u0113\u0118\u011d\u0123\u0128\u012d\u0133\u0138\u013e"+
		"\u0144\u0148\u014b\u0159\u015e\u0163\u016a\u0172\u0177\u017d\u0181\u0186"+
		"\u018b\u0194\u019b\u01a3\u01ac\u01b6\u01bd\u01c3\u01c9\u01ce\u01d3\u01d9"+
		"\u01e5\u01ea\u01f1\u01fb\u020b\u0216\u0221\u0229\u0236\u0241\u024c\u0257"+
		"\u0262\u026d\u0278\u027f\u0288\u0295\u029f\u02a8\u02ae\u02b8\u02bc\u02d0"+
		"\u02dd\u02e4\u02e7\u02ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}