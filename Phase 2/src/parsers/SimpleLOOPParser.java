// Generated from C:/Users/negar/OneDrive/Documents/UT/Term6/Compiler/Compiler/src/main/grammar\SimpleLOOP.g4 by ANTLR 4.9.2
package parsers;

     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.classDec.*;
     import main.ast.nodes.declaration.classDec.classMembersDec.*;
     import main.ast.nodes.declaration.variableDec.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.nodes.statement.set.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import main.ast.types.set.*;
     import main.ast.types.functionPointer.*;
     import main.ast.types.array.*;
     import java.util.*;
 
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
		LINE_BREAK=1, CLASS=2, PUBLIC=3, PRIVATE=4, INITIALIZE=5, NEW=6, SELF=7, 
		RETURN=8, VOID=9, DELETE=10, INCLUDE=11, ADD=12, MERGE=13, PRINT=14, IF=15, 
		ELSE=16, ELSIF=17, PLUS=18, MINUS=19, MULT=20, DIVIDE=21, INC=22, DEC=23, 
		EQUAL=24, GREATER_THAN=25, LESS_THAN=26, ARROW=27, BAR=28, AND=29, OR=30, 
		NOT=31, TIF=32, TELSE=33, TRUE=34, FALSE=35, NULL=36, BEGIN=37, END=38, 
		INT=39, BOOL=40, FPTR=41, SET=42, EACH=43, DO=44, ASSIGN=45, SHARP=46, 
		LPAR=47, RPAR=48, LBRACK=49, RBRACK=50, LBRACE=51, RBRACE=52, COMMA=53, 
		DOT=54, SEMICOLON=55, NEWLINE=56, INT_VALUE=57, IDENTIFIER=58, CLASS_IDENTIFIER=59, 
		COMMENT=60, MLCOMMENT=61, WS=62;
	public static final int
		RULE_simpleLOOP = 0, RULE_program = 1, RULE_constructor = 2, RULE_classDeclaration = 3, 
		RULE_field_decleration = 4, RULE_method = 5, RULE_methodBody = 6, RULE_methodArgsDec = 7, 
		RULE_argDec = 8, RULE_methodArgs = 9, RULE_body = 10, RULE_blockStatement = 11, 
		RULE_singleStatement = 12, RULE_addStatement = 13, RULE_mergeStatement = 14, 
		RULE_deleteStatement = 15, RULE_varDecStatement = 16, RULE_ifStatement = 17, 
		RULE_elsifStatement = 18, RULE_condition = 19, RULE_elseStatement = 20, 
		RULE_printStatement = 21, RULE_methodCallStmt = 22, RULE_returnStatement = 23, 
		RULE_assignmentStatement = 24, RULE_loopStatement = 25, RULE_expression = 26, 
		RULE_ternaryExpression = 27, RULE_orExpression = 28, RULE_andExpression = 29, 
		RULE_equalityExpression = 30, RULE_relationalExpression = 31, RULE_additiveExpression = 32, 
		RULE_multiplicativeExpression = 33, RULE_preUnaryExpression = 34, RULE_postUnaryExpression = 35, 
		RULE_accessExpression = 36, RULE_otherExpression = 37, RULE_setNew = 38, 
		RULE_value = 39, RULE_boolValue = 40, RULE_class_identifier = 41, RULE_identifier = 42, 
		RULE_type = 43, RULE_array_type = 44, RULE_fptr_type = 45, RULE_set_type = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"simpleLOOP", "program", "constructor", "classDeclaration", "field_decleration", 
			"method", "methodBody", "methodArgsDec", "argDec", "methodArgs", "body", 
			"blockStatement", "singleStatement", "addStatement", "mergeStatement", 
			"deleteStatement", "varDecStatement", "ifStatement", "elsifStatement", 
			"condition", "elseStatement", "printStatement", "methodCallStmt", "returnStatement", 
			"assignmentStatement", "loopStatement", "expression", "ternaryExpression", 
			"orExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "preUnaryExpression", 
			"postUnaryExpression", "accessExpression", "otherExpression", "setNew", 
			"value", "boolValue", "class_identifier", "identifier", "type", "array_type", 
			"fptr_type", "set_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'class'", "'public'", "'private'", "'initialize'", "'new'", 
			"'self'", "'return'", "'void'", "'delete'", "'include'", "'add'", "'merge'", 
			"'print'", "'if'", "'else'", "'elsif'", "'+'", "'-'", "'*'", "'/'", "'++'", 
			"'--'", "'=='", "'>'", "'<'", "'->'", "'|'", "'&&'", "'||'", "'!'", "'?'", 
			"':'", "'true'", "'false'", "'null'", "'=begin'", "'=end'", "'int'", 
			"'bool'", "'fptr'", "'Set'", "'each'", "'do'", "'='", "'#'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "','", "'.'", "';'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_BREAK", "CLASS", "PUBLIC", "PRIVATE", "INITIALIZE", "NEW", 
			"SELF", "RETURN", "VOID", "DELETE", "INCLUDE", "ADD", "MERGE", "PRINT", 
			"IF", "ELSE", "ELSIF", "PLUS", "MINUS", "MULT", "DIVIDE", "INC", "DEC", 
			"EQUAL", "GREATER_THAN", "LESS_THAN", "ARROW", "BAR", "AND", "OR", "NOT", 
			"TIF", "TELSE", "TRUE", "FALSE", "NULL", "BEGIN", "END", "INT", "BOOL", 
			"FPTR", "SET", "EACH", "DO", "ASSIGN", "SHARP", "LPAR", "RPAR", "LBRACK", 
			"RBRACK", "LBRACE", "RBRACE", "COMMA", "DOT", "SEMICOLON", "NEWLINE", 
			"INT_VALUE", "IDENTIFIER", "CLASS_IDENTIFIER", "COMMENT", "MLCOMMENT", 
			"WS"
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
		public Program simpleLOOPProgram;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(SimpleLOOPParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					match(NEWLINE);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(100);
			((SimpleLOOPContext)_localctx).p = program();
			((SimpleLOOPContext)_localctx).simpleLOOPProgram =  ((SimpleLOOPContext)_localctx).p.programRet;
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(102);
				match(NEWLINE);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
		public Program programRet;
		public VarDecStatementContext v;
		public ClassDeclarationContext c;
		public List<VarDecStatementContext> varDecStatement() {
			return getRuleContexts(VarDecStatementContext.class);
		}
		public VarDecStatementContext varDecStatement(int i) {
			return getRuleContext(VarDecStatementContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).programRet =  new Program();
			     int line = 1;
			     _localctx.programRet.setLine(line);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				{
				setState(111);
				((ProgramContext)_localctx).v = varDecStatement();
				setState(113); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(112);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(115); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				        for (VariableDeclaration varDec: ((ProgramContext)_localctx).v.varDecStmtRet)
				            _localctx.programRet.addGlobalVariable(varDec);
				    
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(124);
				((ProgramContext)_localctx).c = classDeclaration();
				setState(126); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(125);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(128); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				_localctx.programRet.addClass(((ProgramContext)_localctx).c.classDeclarationRet);
				}
				}
				setState(136);
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

	public static class ConstructorContext extends ParserRuleContext {
		public ConstructorDeclaration constructorRet;
		public Token init;
		public MethodArgsDecContext args;
		public MethodBodyContext bod;
		public TerminalNode PUBLIC() { return getToken(SimpleLOOPParser.PUBLIC, 0); }
		public TerminalNode INITIALIZE() { return getToken(SimpleLOOPParser.INITIALIZE, 0); }
		public MethodArgsDecContext methodArgsDec() {
			return getRuleContext(MethodArgsDecContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
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
		enterRule(_localctx, 4, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(PUBLIC);
			setState(138);
			((ConstructorContext)_localctx).init = match(INITIALIZE);
			   ((ConstructorContext)_localctx).constructorRet =  new ConstructorDeclaration();
			        _localctx.constructorRet.setLine(((ConstructorContext)_localctx).init.getLine());
			setState(140);
			((ConstructorContext)_localctx).args = methodArgsDec();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(141);
				match(NEWLINE);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.constructorRet.setArgs( ((ConstructorContext)_localctx).args.argsRet ); 
			setState(148);
			((ConstructorContext)_localctx).bod = methodBody();
			 _localctx.constructorRet.setLocalVars(((ConstructorContext)_localctx).bod.localVars);
			            _localctx.constructorRet.setBody( ((ConstructorContext)_localctx).bod.statements ); 
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclaration classDeclarationRet;
		public Token cls;
		public Class_identifierContext clsn;
		public Class_identifierContext pname;
		public Field_declerationContext fd;
		public Field_declerationContext fds;
		public TerminalNode CLASS() { return getToken(SimpleLOOPParser.CLASS, 0); }
		public List<Class_identifierContext> class_identifier() {
			return getRuleContexts(Class_identifierContext.class);
		}
		public Class_identifierContext class_identifier(int i) {
			return getRuleContext(Class_identifierContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(SimpleLOOPParser.LESS_THAN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public TerminalNode LBRACE() { return getToken(SimpleLOOPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleLOOPParser.RBRACE, 0); }
		public List<Field_declerationContext> field_decleration() {
			return getRuleContexts(Field_declerationContext.class);
		}
		public Field_declerationContext field_decleration(int i) {
			return getRuleContext(Field_declerationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			((ClassDeclarationContext)_localctx).cls = match(CLASS);
			setState(152);
			((ClassDeclarationContext)_localctx).clsn = class_identifier();
			 ((ClassDeclarationContext)_localctx).classDeclarationRet =  new ClassDeclaration( ((ClassDeclarationContext)_localctx).clsn.idRet);
			        _localctx.classDeclarationRet.setLine( ((ClassDeclarationContext)_localctx).cls.getLine()) ;
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(154);
				match(LESS_THAN);
				setState(155);
				((ClassDeclarationContext)_localctx).pname = class_identifier();
				 _localctx.classDeclarationRet.setParentClassName( ((ClassDeclarationContext)_localctx).pname.idRet ); 
				}
			}

			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(160);
				match(NEWLINE);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				{
				setState(166);
				match(LBRACE);
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167);
					match(NEWLINE);
					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(172);
					((ClassDeclarationContext)_localctx).fd = field_decleration();
					 for (Declaration field : ((ClassDeclarationContext)_localctx).fd.decRet) {
					                if (field instanceof FieldDeclaration) {
					                    _localctx.classDeclarationRet.addField((FieldDeclaration) field); }
					                else if (field instanceof ConstructorDeclaration) {
					                    _localctx.classDeclarationRet.setConstructor((ConstructorDeclaration) field); }
					                else if (field instanceof MethodDeclaration) {
					                    _localctx.classDeclarationRet.addMethod((MethodDeclaration) field); }

					                }
					            
					setState(175); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(174);
						match(NEWLINE);
						}
						}
						setState(177); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					}
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PUBLIC || _la==PRIVATE );
				setState(183);
				match(RBRACE);
				}
				}
				break;
			case PUBLIC:
			case PRIVATE:
				{
				{
				setState(185);
				((ClassDeclarationContext)_localctx).fds = field_decleration();

				                for (Declaration field : ((ClassDeclarationContext)_localctx).fds.decRet) {
				                                if (field instanceof FieldDeclaration) {
				                                    _localctx.classDeclarationRet.addField((FieldDeclaration) field); }
				                                else if (field instanceof MethodDeclaration) {
				                                    _localctx.classDeclarationRet.addMethod((MethodDeclaration) field); }
				                                else if (field instanceof ConstructorDeclaration) {
				                                    _localctx.classDeclarationRet.setConstructor((ConstructorDeclaration) field); }


				                }
				}
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

	public static class Field_declerationContext extends ParserRuleContext {
		public ArrayList<Declaration> decRet;
		public Token acs;
		public VarDecStatementContext vs;
		public MethodContext mt;
		public ConstructorContext cs;
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(SimpleLOOPParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(SimpleLOOPParser.PRIVATE, 0); }
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Field_declerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterField_decleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitField_decleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitField_decleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declerationContext field_decleration() throws RecognitionException {
		Field_declerationContext _localctx = new Field_declerationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field_decleration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((Field_declerationContext)_localctx).decRet =  new ArrayList<>();
			    
			{
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				{
				setState(191);
				((Field_declerationContext)_localctx).acs = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					((Field_declerationContext)_localctx).acs = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(192);
					((Field_declerationContext)_localctx).vs = varDecStatement();

					        for (VariableDeclaration varDec: ((Field_declerationContext)_localctx).vs.varDecStmtRet){
					            var nField = new FieldDeclaration(varDec, ((Field_declerationContext)_localctx).acs.toString() == "public" ? true : false);

					            nField.setLine(varDec.getLine());
					            _localctx.decRet.add(nField);
					            }
					    
					}
					break;
				case 2:
					{
					setState(195);
					((Field_declerationContext)_localctx).mt = method();

					        var nMethod = ((Field_declerationContext)_localctx).mt.methodDecRet;
					        if(((Field_declerationContext)_localctx).acs.toString() == "public")
					            nMethod.setPrivate(false);
					        else
					            nMethod.setPrivate(true);
					        _localctx.decRet.add(((Field_declerationContext)_localctx).mt.methodDecRet);

					    
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				setState(200);
				((Field_declerationContext)_localctx).cs = constructor();

				        _localctx.decRet.add(((Field_declerationContext)_localctx).cs.constructorRet);
				    
				}
				break;
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

	public static class MethodContext extends ParserRuleContext {
		public MethodDeclaration methodDecRet;
		public Type mtype;
		public TypeContext tp;
		public IdentifierContext id;
		public MethodArgsDecContext magd;
		public MethodBodyContext mbody;
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimpleLOOPParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodArgsDecContext methodArgsDec() {
			return getRuleContext(MethodArgsDecContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				setState(205);
				((MethodContext)_localctx).tp = type();

				        ((MethodContext)_localctx).mtype =  ((MethodContext)_localctx).tp.typeRet;
				     
				}
				break;
			case VOID:
				{
				setState(208);
				match(VOID);

				        ((MethodContext)_localctx).mtype =  new VoidType();
				     
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(212);
			((MethodContext)_localctx).id = identifier();
			}
			{
			setState(213);
			((MethodContext)_localctx).magd = methodArgsDec();
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(214);
				match(NEWLINE);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			((MethodContext)_localctx).mbody = methodBody();

			        ((MethodContext)_localctx).methodDecRet =  new MethodDeclaration(((MethodContext)_localctx).id.idRet, _localctx.mtype, false);
			        _localctx.methodDecRet.setArgs(((MethodContext)_localctx).magd.argsRet);
			        _localctx.methodDecRet.setLocalVars(((MethodContext)_localctx).mbody.localVars);
			        _localctx.methodDecRet.setBody(((MethodContext)_localctx).mbody.statements);
			        _localctx.methodDecRet.setLine(((MethodContext)_localctx).id.idRet.getLine());
			     
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

	public static class MethodBodyContext extends ParserRuleContext {
		public ArrayList<VariableDeclaration> localVars;
		public ArrayList<Statement> statements;
		public VarDecStatementContext vs;
		public SingleStatementContext ss;
		public TerminalNode LBRACE() { return getToken(SimpleLOOPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleLOOPParser.RBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public List<VarDecStatementContext> varDecStatement() {
			return getRuleContexts(VarDecStatementContext.class);
		}
		public VarDecStatementContext varDecStatement(int i) {
			return getRuleContext(VarDecStatementContext.class,i);
		}
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{

				        ((MethodBodyContext)_localctx).localVars =  new ArrayList<>();
				        ((MethodBodyContext)_localctx).statements =  new ArrayList<>();
				    
				{
				setState(224);
				match(LBRACE);
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(225);
					match(NEWLINE);
					}
					}
					setState(228); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(230);
						((MethodBodyContext)_localctx).vs = varDecStatement();
						setState(232); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(231);
							match(NEWLINE);
							}
							}
							setState(234); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEWLINE );

						          for (VariableDeclaration varDec : ((MethodBodyContext)_localctx).vs.varDecStmtRet)
						               _localctx.localVars.add(varDec);
						    
						}
						} 
					}
					setState(242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
					{
					{
					setState(243);
					((MethodBodyContext)_localctx).ss = singleStatement();
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(244);
						match(NEWLINE);
						}
						}
						setState(247); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );

					        _localctx.statements.add(((MethodBodyContext)_localctx).ss.singleRet);
					    
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				match(RBRACE);
				}
				}
				break;
			case SELF:
			case RETURN:
			case PRINT:
			case IF:
			case MINUS:
			case NOT:
			case TRUE:
			case FALSE:
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
			case CLASS_IDENTIFIER:
				{

				            ((MethodBodyContext)_localctx).localVars =  new ArrayList<>();
				            ((MethodBodyContext)_localctx).statements =  new ArrayList<>();
				    
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					{
					setState(258);
					((MethodBodyContext)_localctx).vs = varDecStatement();

					        for (VariableDeclaration varDec : ((MethodBodyContext)_localctx).vs.varDecStmtRet)
					             _localctx.localVars.add(varDec);
					    
					}
					}
					break;
				case 2:
					{
					{
					setState(261);
					((MethodBodyContext)_localctx).ss = singleStatement();

					         _localctx.statements.add(((MethodBodyContext)_localctx).ss.singleRet);
					    
					}
					}
					break;
				}
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

	public static class MethodArgsDecContext extends ParserRuleContext {
		public ArrayList<VariableDeclaration> argsRet;
		public ArgDecContext arg1;
		public ArgDecContext arg2;
		public ArgDecContext arg3;
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public List<ArgDecContext> argDec() {
			return getRuleContexts(ArgDecContext.class);
		}
		public ArgDecContext argDec(int i) {
			return getRuleContext(ArgDecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SimpleLOOPParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SimpleLOOPParser.ASSIGN, i);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public MethodArgsDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgsDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodArgsDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodArgsDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodArgsDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgsDecContext methodArgsDec() throws RecognitionException {
		MethodArgsDecContext _localctx = new MethodArgsDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodArgsDec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(LPAR);

			        ((MethodArgsDecContext)_localctx).argsRet =  new ArrayList<>();
			    
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(270);
				((MethodArgsDecContext)_localctx).arg1 = argDec();

				        _localctx.argsRet.add(((MethodArgsDecContext)_localctx).arg1.argDecRet);
				    
				setState(283);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					{
					setState(272);
					match(ASSIGN);
					setState(273);
					orExpression();
					}
					}
					break;
				case RPAR:
				case COMMA:
					{
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(274);
							match(COMMA);
							setState(275);
							((MethodArgsDecContext)_localctx).arg2 = argDec();

							        _localctx.argsRet.add(((MethodArgsDecContext)_localctx).arg2.argDecRet);
							    
							}
							} 
						}
						setState(282);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(285);
					match(COMMA);
					setState(286);
					((MethodArgsDecContext)_localctx).arg3 = argDec();

					        _localctx.argsRet.add(((MethodArgsDecContext)_localctx).arg3.argDecRet);
					    
					setState(288);
					match(ASSIGN);
					setState(289);
					orExpression();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(298);
			match(RPAR);
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

	public static class ArgDecContext extends ParserRuleContext {
		public VariableDeclaration argDecRet;
		public TypeContext t;
		public IdentifierContext i;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterArgDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitArgDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitArgDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgDecContext argDec() throws RecognitionException {
		ArgDecContext _localctx = new ArgDecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			((ArgDecContext)_localctx).t = type();
			setState(301);
			((ArgDecContext)_localctx).i = identifier();

			        ((ArgDecContext)_localctx).argDecRet =  new VariableDeclaration(((ArgDecContext)_localctx).i.idRet, ((ArgDecContext)_localctx).t.typeRet);
			        _localctx.argDecRet.setLine(((ArgDecContext)_localctx).i.idRet.getLine());
			    
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

	public static class MethodArgsContext extends ParserRuleContext {
		public ArrayList<Expression> methodCallArgsRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public MethodArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgsContext methodArgs() throws RecognitionException {
		MethodArgsContext _localctx = new MethodArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodArgsContext)_localctx).methodCallArgsRet =  new ArrayList<>(); 
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(305);
				((MethodArgsContext)_localctx).e1 = expression();
				 _localctx.methodCallArgsRet.add(((MethodArgsContext)_localctx).e1.expRet); 
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(307);
					match(COMMA);
					setState(308);
					((MethodArgsContext)_localctx).e2 = expression();
					 _localctx.methodCallArgsRet.add(((MethodArgsContext)_localctx).e2.expRet); 
					}
					}
					setState(315);
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

	public static class BodyContext extends ParserRuleContext {
		public Statement statementRet;
		public BlockStatementContext bls;
		public SingleStatementContext sns;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(318);
				((BodyContext)_localctx).bls = blockStatement();

				        ((BodyContext)_localctx).statementRet =  ((BodyContext)_localctx).bls.blockRet;
				     
				}
				break;
			case NEWLINE:
				{
				{
				setState(322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(321);
					match(NEWLINE);
					}
					}
					setState(324); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(326);
				((BodyContext)_localctx).sns = singleStatement();

				        ((BodyContext)_localctx).statementRet =  ((BodyContext)_localctx).sns.singleRet;
				     
				}
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

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStmt blockRet;
		public Token lb;
		public SingleStatementContext sns;
		public TerminalNode RBRACE() { return getToken(SimpleLOOPParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(SimpleLOOPParser.LBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			((BlockStatementContext)_localctx).lb = match(LBRACE);

			        ((BlockStatementContext)_localctx).blockRet =  new BlockStmt();
			        _localctx.blockRet.setLine(((BlockStatementContext)_localctx).lb.getLine());
			    
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333);
				match(NEWLINE);
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				{
				setState(338);
				((BlockStatementContext)_localctx).sns = singleStatement();

				        _localctx.blockRet.addStatement(((BlockStatementContext)_localctx).sns.singleRet);
				    
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(340);
					match(NEWLINE);
					}
					}
					setState(343); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(RBRACE);
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

	public static class SingleStatementContext extends ParserRuleContext {
		public Statement singleRet;
		public IfStatementContext iff;
		public PrintStatementContext ps;
		public MethodCallStmtContext ms;
		public ReturnStatementContext rs;
		public AssignmentStatementContext as;
		public LoopStatementContext ls;
		public AddStatementContext ads;
		public MergeStatementContext mgs;
		public DeleteStatementContext ds;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public MethodCallStmtContext methodCallStmt() {
			return getRuleContext(MethodCallStmtContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public AddStatementContext addStatement() {
			return getRuleContext(AddStatementContext.class,0);
		}
		public MergeStatementContext mergeStatement() {
			return getRuleContext(MergeStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_singleStatement);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				((SingleStatementContext)_localctx).iff = ifStatement();
				 ((SingleStatementContext)_localctx).singleRet =  ((SingleStatementContext)_localctx).iff.ifRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				((SingleStatementContext)_localctx).ps = printStatement();
				 ((SingleStatementContext)_localctx).singleRet =  ((SingleStatementContext)_localctx).ps.printRet; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				((SingleStatementContext)_localctx).ms = methodCallStmt();
				 ((SingleStatementContext)_localctx).singleRet =  ((SingleStatementContext)_localctx).ms.methRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				((SingleStatementContext)_localctx).rs = returnStatement();
				 ((SingleStatementContext)_localctx).singleRet =  ((SingleStatementContext)_localctx).rs.returnStmtRet; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				((SingleStatementContext)_localctx).as = assignmentStatement();
				 ((SingleStatementContext)_localctx).singleRet =  ((SingleStatementContext)_localctx).as.assignmentRet; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(367);
				((SingleStatementContext)_localctx).ls = loopStatement();
				 ((SingleStatementContext)_localctx).singleRet =  ((SingleStatementContext)_localctx).ls.loopRet; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(370);
				((SingleStatementContext)_localctx).ads = addStatement();
				 ((SingleStatementContext)_localctx).singleRet =  ((SingleStatementContext)_localctx).ads.addSRet; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(373);
				((SingleStatementContext)_localctx).mgs = mergeStatement();
				 ((SingleStatementContext)_localctx).singleRet =  ((SingleStatementContext)_localctx).mgs.mergeRet; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(376);
				((SingleStatementContext)_localctx).ds = deleteStatement();
				 ((SingleStatementContext)_localctx).singleRet =  ((SingleStatementContext)_localctx).ds.delRet; 
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

	public static class AddStatementContext extends ParserRuleContext {
		public SetAdd addSRet;
		public ExpressionContext expr;
		public Token adds;
		public OrExpressionContext orexpr;
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SimpleLOOPParser.ADD, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public AddStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAddStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAddStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAddStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddStatementContext addStatement() throws RecognitionException {
		AddStatementContext _localctx = new AddStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_addStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			((AddStatementContext)_localctx).expr = expression();
			setState(382);
			match(DOT);
			setState(383);
			((AddStatementContext)_localctx).adds = match(ADD);
			setState(384);
			match(LPAR);
			setState(385);
			((AddStatementContext)_localctx).orexpr = orExpression();
			setState(386);
			match(RPAR);

			        ((AddStatementContext)_localctx).addSRet =  new SetAdd(((AddStatementContext)_localctx).expr.expRet, ((AddStatementContext)_localctx).orexpr.orExprRet);
			        _localctx.addSRet.setLine(((AddStatementContext)_localctx).adds.getLine());
			    
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

	public static class MergeStatementContext extends ParserRuleContext {
		public SetMerge mergeRet;
		public ArrayList <Expression> exprArgs;
		public ExpressionContext expr;
		public Token merge;
		public OrExpressionContext orexpr;
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MERGE() { return getToken(SimpleLOOPParser.MERGE, 0); }
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public MergeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMergeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMergeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMergeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeStatementContext mergeStatement() throws RecognitionException {
		MergeStatementContext _localctx = new MergeStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mergeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			((MergeStatementContext)_localctx).expr = expression();
			setState(390);
			match(DOT);
			setState(391);
			((MergeStatementContext)_localctx).merge = match(MERGE);
			setState(392);
			match(LPAR);
			setState(393);
			((MergeStatementContext)_localctx).orexpr = orExpression();

			        ((MergeStatementContext)_localctx).exprArgs =  new ArrayList <> ();
			        _localctx.exprArgs.add(((MergeStatementContext)_localctx).orexpr.orExprRet); 
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(395);
				match(COMMA);
				setState(396);
				((MergeStatementContext)_localctx).orexpr = orExpression();

				        _localctx.exprArgs.add(((MergeStatementContext)_localctx).orexpr.orExprRet);
				    
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        ((MergeStatementContext)_localctx).mergeRet =  new SetMerge(((MergeStatementContext)_localctx).expr.expRet, _localctx.exprArgs);
			        _localctx.mergeRet.setLine(((MergeStatementContext)_localctx).merge.getLine());
			    
			setState(405);
			match(RPAR);
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

	public static class DeleteStatementContext extends ParserRuleContext {
		public SetDelete delRet;
		public ExpressionContext expr;
		public Token del;
		public OrExpressionContext orexpr;
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(SimpleLOOPParser.DELETE, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_deleteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			((DeleteStatementContext)_localctx).expr = expression();
			setState(408);
			match(DOT);
			setState(409);
			((DeleteStatementContext)_localctx).del = match(DELETE);
			setState(410);
			match(LPAR);
			setState(411);
			((DeleteStatementContext)_localctx).orexpr = orExpression();
			setState(412);
			match(RPAR);

			        ((DeleteStatementContext)_localctx).delRet =  new SetDelete(((DeleteStatementContext)_localctx).expr.expRet, ((DeleteStatementContext)_localctx).orexpr.orExprRet);
			        _localctx.delRet.setLine(((DeleteStatementContext)_localctx).del.getLine());
			    
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

	public static class VarDecStatementContext extends ParserRuleContext {
		public ArrayList<VariableDeclaration> varDecStmtRet;
		public VariableDeclaration varDecTmp;
		public TypeContext t;
		public IdentifierContext id;
		public IdentifierContext id2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public VarDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterVarDecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitVarDecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitVarDecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecStatementContext varDecStatement() throws RecognitionException {
		VarDecStatementContext _localctx = new VarDecStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varDecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VarDecStatementContext)_localctx).varDecStmtRet =  new ArrayList<>();
			setState(416);
			((VarDecStatementContext)_localctx).t = type();
			setState(417);
			((VarDecStatementContext)_localctx).id = identifier();

			        ((VarDecStatementContext)_localctx).varDecTmp =  new VariableDeclaration(((VarDecStatementContext)_localctx).id.idRet, ((VarDecStatementContext)_localctx).t.typeRet);
			        _localctx.varDecTmp.setLine(((VarDecStatementContext)_localctx).id.line);
			        _localctx.varDecStmtRet.add(_localctx.varDecTmp); 
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(419);
				match(COMMA);
				setState(420);
				((VarDecStatementContext)_localctx).id2 = identifier();

				        ((VarDecStatementContext)_localctx).varDecTmp =  new VariableDeclaration(((VarDecStatementContext)_localctx).id2.idRet, ((VarDecStatementContext)_localctx).t.typeRet);
				        _localctx.varDecTmp.setLine(((VarDecStatementContext)_localctx).id2.line);
				        _localctx.varDecStmtRet.add(_localctx.varDecTmp);
				    
				}
				}
				setState(427);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionalStmt ifRet;
		public ElsifStmt elif;
		public Token i;
		public ConditionContext c;
		public BodyContext b;
		public ElsifStatementContext elsif;
		public ElseStatementContext els;
		public TerminalNode IF() { return getToken(SimpleLOOPParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<ElsifStatementContext> elsifStatement() {
			return getRuleContexts(ElsifStatementContext.class);
		}
		public ElsifStatementContext elsifStatement(int i) {
			return getRuleContext(ElsifStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
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
		enterRule(_localctx, 34, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			((IfStatementContext)_localctx).i = match(IF);
			setState(429);
			((IfStatementContext)_localctx).c = condition();
			setState(430);
			((IfStatementContext)_localctx).b = body();

			        ((IfStatementContext)_localctx).ifRet =  new ConditionalStmt(((IfStatementContext)_localctx).c.conditionRet, ((IfStatementContext)_localctx).b.statementRet);
			        _localctx.ifRet.setLine(((IfStatementContext)_localctx).i.getLine());
			    
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(432);
					((IfStatementContext)_localctx).elsif = elsifStatement();

					        ((IfStatementContext)_localctx).elif =  new ElsifStmt(((IfStatementContext)_localctx).elsif.elseifRet.getCondition(), ((IfStatementContext)_localctx).elsif.elseifRet.getThenBody());
					        _localctx.elif.setLine(((IfStatementContext)_localctx).elsif.elseifRet.getLine());
					        _localctx.ifRet.addElsif(_localctx.elif);
					    
					}
					} 
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(440);
				((IfStatementContext)_localctx).els = elseStatement();

				        _localctx.ifRet.setElseBody(((IfStatementContext)_localctx).els.elseRet);
				    
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

	public static class ElsifStatementContext extends ParserRuleContext {
		public ElsifStmt elseifRet;
		public Token el;
		public ConditionContext c;
		public BodyContext b;
		public TerminalNode ELSIF() { return getToken(SimpleLOOPParser.ELSIF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public ElsifStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterElsifStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitElsifStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitElsifStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsifStatementContext elsifStatement() throws RecognitionException {
		ElsifStatementContext _localctx = new ElsifStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elsifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(445);
				match(NEWLINE);
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			((ElsifStatementContext)_localctx).el = match(ELSIF);
			setState(452);
			((ElsifStatementContext)_localctx).c = condition();
			setState(453);
			((ElsifStatementContext)_localctx).b = body();

			        ((ElsifStatementContext)_localctx).elseifRet =  new ElsifStmt(((ElsifStatementContext)_localctx).c.conditionRet, ((ElsifStatementContext)_localctx).b.statementRet);
			        _localctx.elseifRet.setLine(((ElsifStatementContext)_localctx).el.getLine());
			     
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
		public Expression conditionRet;
		public ExpressionContext exp;
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condition);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(456);
				match(LPAR);
				setState(457);
				((ConditionContext)_localctx).exp = expression();

				        ((ConditionContext)_localctx).conditionRet =  ((ConditionContext)_localctx).exp.expRet;
				    
				setState(459);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(461);
				((ConditionContext)_localctx).exp = expression();
				 ((ConditionContext)_localctx).conditionRet =  ((ConditionContext)_localctx).exp.expRet; 
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

	public static class ElseStatementContext extends ParserRuleContext {
		public Statement elseRet;
		public BodyContext b;
		public TerminalNode ELSE() { return getToken(SimpleLOOPParser.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(466);
				match(NEWLINE);
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			match(ELSE);
			setState(473);
			((ElseStatementContext)_localctx).b = body();

			        ((ElseStatementContext)_localctx).elseRet =  ((ElseStatementContext)_localctx).b.statementRet;
			    
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
		public PrintStmt printRet;
		public Token p;
		public ExpressionContext exp;
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode PRINT() { return getToken(SimpleLOOPParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 42, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			((PrintStatementContext)_localctx).p = match(PRINT);
			setState(477);
			match(LPAR);
			setState(478);
			((PrintStatementContext)_localctx).exp = expression();

			        ((PrintStatementContext)_localctx).printRet =  new PrintStmt(((PrintStatementContext)_localctx).exp.expRet);
			        _localctx.printRet.setLine(((PrintStatementContext)_localctx).p.getLine());
			    
			setState(480);
			match(RPAR);
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

	public static class MethodCallStmtContext extends ParserRuleContext {
		public MethodCallStmt methRet;
		public Expression emstm;
		public MethodCall mcallexp;
		public AccessExpressionContext acexp;
		public Token init;
		public IdentifierContext i;
		public Token lp;
		public MethodArgsContext mag;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SimpleLOOPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLOOPParser.DOT, i);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public TerminalNode INC() { return getToken(SimpleLOOPParser.INC, 0); }
		public TerminalNode DEC() { return getToken(SimpleLOOPParser.DEC, 0); }
		public List<TerminalNode> INITIALIZE() { return getTokens(SimpleLOOPParser.INITIALIZE); }
		public TerminalNode INITIALIZE(int i) {
			return getToken(SimpleLOOPParser.INITIALIZE, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MethodCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallStmtContext methodCallStmt() throws RecognitionException {
		MethodCallStmtContext _localctx = new MethodCallStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodCallStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			((MethodCallStmtContext)_localctx).acexp = accessExpression();

			        ((MethodCallStmtContext)_localctx).emstm =  ((MethodCallStmtContext)_localctx).acexp.accessExpRet;
			    
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(484);
				match(DOT);
				setState(490);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INITIALIZE:
					{
					setState(485);
					((MethodCallStmtContext)_localctx).init = match(INITIALIZE);

					        ((MethodCallStmtContext)_localctx).emstm =  new ObjectMemberAccess(_localctx.emstm, new Identifier(((MethodCallStmtContext)_localctx).init.toString()));
					    
					}
					break;
				case IDENTIFIER:
					{
					setState(487);
					((MethodCallStmtContext)_localctx).i = identifier();

					        ((MethodCallStmtContext)_localctx).emstm =  new ObjectMemberAccess(_localctx.emstm, new Identifier(((MethodCallStmtContext)_localctx).i.idRet.toString()));
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				{
				setState(497);
				((MethodCallStmtContext)_localctx).lp = match(LPAR);
				setState(498);
				((MethodCallStmtContext)_localctx).mag = methodArgs();

				        ((MethodCallStmtContext)_localctx).mcallexp =  new MethodCall(_localctx.emstm, ((MethodCallStmtContext)_localctx).mag.methodCallArgsRet);
				        _localctx.mcallexp.setLine(((MethodCallStmtContext)_localctx).lp.getLine());
				    
				setState(500);
				match(RPAR);
				}

				        ((MethodCallStmtContext)_localctx).methRet =  new MethodCallStmt(_localctx.mcallexp);
				        _localctx.methRet.setLine(((MethodCallStmtContext)_localctx).lp.getLine());
				    
				}
				break;
			case INC:
			case DEC:
				{
				{
				setState(504);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt returnStmtRet;
		public Token r;
		public ExpressionContext e;
		public TerminalNode RETURN() { return getToken(SimpleLOOPParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 46, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			((ReturnStatementContext)_localctx).r = match(RETURN);

			        ((ReturnStatementContext)_localctx).returnStmtRet =  new ReturnStmt();
			        _localctx.returnStmtRet.setLine(((ReturnStatementContext)_localctx).r.getLine());
			    
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(509);
				((ReturnStatementContext)_localctx).e = expression();
				 _localctx.returnStmtRet.setReturnedExpr(((ReturnStatementContext)_localctx).e.expRet); 
				}
			}


			             if(_localctx.returnStmtRet.getReturnedExpr() instanceof NullValue) {
			                 NullValue newNullValue = new NullValue();
			                 newNullValue.setLine(((ReturnStatementContext)_localctx).r.getLine());
			                 _localctx.returnStmtRet.setReturnedExpr(newNullValue);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStmt assignmentRet;
		public OrExpressionContext fexp;
		public Token a;
		public ExpressionContext sexp;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SimpleLOOPParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			((AssignmentStatementContext)_localctx).fexp = orExpression();
			setState(517);
			((AssignmentStatementContext)_localctx).a = match(ASSIGN);
			setState(518);
			((AssignmentStatementContext)_localctx).sexp = expression();

			        ((AssignmentStatementContext)_localctx).assignmentRet =  new AssignmentStmt(((AssignmentStatementContext)_localctx).fexp.orExprRet, ((AssignmentStatementContext)_localctx).sexp.expRet);
			        _localctx.assignmentRet.setLine(((AssignmentStatementContext)_localctx).a.getLine());
			    
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

	public static class LoopStatementContext extends ParserRuleContext {
		public EachStmt loopRet;
		public Expression re;
		public AccessExpressionContext ae;
		public Token lp;
		public ExpressionContext lex;
		public ExpressionContext rex;
		public Token each;
		public IdentifierContext id;
		public BodyContext b;
		public List<TerminalNode> DOT() { return getTokens(SimpleLOOPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLOOPParser.DOT, i);
		}
		public TerminalNode DO() { return getToken(SimpleLOOPParser.DO, 0); }
		public List<TerminalNode> BAR() { return getTokens(SimpleLOOPParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(SimpleLOOPParser.BAR, i);
		}
		public TerminalNode EACH() { return getToken(SimpleLOOPParser.EACH, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				{
				setState(521);
				((LoopStatementContext)_localctx).ae = accessExpression();

				        ((LoopStatementContext)_localctx).re =  ((LoopStatementContext)_localctx).ae.accessExpRet;
				        _localctx.re.setLine(((LoopStatementContext)_localctx).ae.accessExpRet.getLine());
				}
				}
				break;
			case 2:
				{
				{
				setState(524);
				((LoopStatementContext)_localctx).lp = match(LPAR);
				setState(525);
				((LoopStatementContext)_localctx).lex = expression();
				setState(526);
				match(DOT);
				setState(527);
				match(DOT);
				setState(528);
				((LoopStatementContext)_localctx).rex = expression();
				setState(529);
				match(RPAR);

				        ((LoopStatementContext)_localctx).re =  new RangeExpression(((LoopStatementContext)_localctx).lex.expRet, ((LoopStatementContext)_localctx).rex.expRet);
				        _localctx.re.setLine(((LoopStatementContext)_localctx).lp.getLine());
				}
				}
				break;
			}
			setState(534);
			match(DOT);
			setState(535);
			((LoopStatementContext)_localctx).each = match(EACH);
			setState(536);
			match(DO);
			setState(537);
			match(BAR);
			setState(538);
			((LoopStatementContext)_localctx).id = identifier();
			setState(539);
			match(BAR);
			setState(540);
			((LoopStatementContext)_localctx).b = body();

			        ((LoopStatementContext)_localctx).loopRet =  new EachStmt(((LoopStatementContext)_localctx).id.idRet, _localctx.re);
			        _localctx.loopRet.setBody(((LoopStatementContext)_localctx).b.statementRet);
			        _localctx.loopRet.setLine(((LoopStatementContext)_localctx).each.getLine());
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression expRet;
		public TernaryExpressionContext trexp;
		public Token assign;
		public ExpressionContext exp;
		public Token dot;
		public Token inc;
		public OrExpressionContext oe;
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleLOOPParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode INCLUDE() { return getToken(SimpleLOOPParser.INCLUDE, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			((ExpressionContext)_localctx).trexp = ternaryExpression();
			 ((ExpressionContext)_localctx).expRet =  ((ExpressionContext)_localctx).trexp.trExpRet ;
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(545);
				((ExpressionContext)_localctx).assign = match(ASSIGN);
				setState(546);
				((ExpressionContext)_localctx).exp = expression();

				        BinaryOperator op = BinaryOperator.assign;
				        ((ExpressionContext)_localctx).expRet =  new BinaryExpression(_localctx.expRet, ((ExpressionContext)_localctx).exp.expRet, op);
				        _localctx.expRet.setLine(((ExpressionContext)_localctx).assign.getLine());
				        
				}
			}

			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(551);
				((ExpressionContext)_localctx).dot = match(DOT);
				setState(552);
				((ExpressionContext)_localctx).inc = match(INCLUDE);
				setState(553);
				match(LPAR);
				setState(554);
				((ExpressionContext)_localctx).oe = orExpression();
				setState(555);
				match(RPAR);

				        ((ExpressionContext)_localctx).expRet =  new SetInclude(_localctx.expRet, ((ExpressionContext)_localctx).oe.orExprRet);
				        _localctx.expRet.setLine(((ExpressionContext)_localctx).dot.getLine());
				     
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

	public static class TernaryExpressionContext extends ParserRuleContext {
		public Expression trExpRet;
		public OrExpressionContext orexp;
		public Token tif;
		public TernaryExpressionContext trexp;
		public TernaryExpressionContext trexpl;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode TELSE() { return getToken(SimpleLOOPParser.TELSE, 0); }
		public TerminalNode TIF() { return getToken(SimpleLOOPParser.TIF, 0); }
		public List<TernaryExpressionContext> ternaryExpression() {
			return getRuleContexts(TernaryExpressionContext.class);
		}
		public TernaryExpressionContext ternaryExpression(int i) {
			return getRuleContext(TernaryExpressionContext.class,i);
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
		enterRule(_localctx, 54, RULE_ternaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			((TernaryExpressionContext)_localctx).orexp = orExpression();
			 ((TernaryExpressionContext)_localctx).trExpRet =  ((TernaryExpressionContext)_localctx).orexp.orExprRet; 
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIF) {
				{
				setState(562);
				((TernaryExpressionContext)_localctx).tif = match(TIF);
				setState(563);
				((TernaryExpressionContext)_localctx).trexp = ternaryExpression();
				setState(564);
				match(TELSE);
				setState(565);
				((TernaryExpressionContext)_localctx).trexpl = ternaryExpression();

				        TernaryOperator op = TernaryOperator.ternary;
				        ((TernaryExpressionContext)_localctx).trExpRet =  new TernaryExpression(_localctx.trExpRet, ((TernaryExpressionContext)_localctx).trexp.trExpRet, ((TernaryExpressionContext)_localctx).trexpl.trExpRet);
				        _localctx.trExpRet.setLine(((TernaryExpressionContext)_localctx).tif.getLine());
				     
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

	public static class OrExpressionContext extends ParserRuleContext {
		public Expression orExprRet;
		public AndExpressionContext andexp;
		public Token o;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SimpleLOOPParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SimpleLOOPParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			((OrExpressionContext)_localctx).andexp = andExpression();
			 ((OrExpressionContext)_localctx).orExprRet =  ((OrExpressionContext)_localctx).andexp.andExpRet; 
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(572);
				((OrExpressionContext)_localctx).o = match(OR);
				setState(573);
				((OrExpressionContext)_localctx).andexp = andExpression();

				        BinaryOperator op = BinaryOperator.or;
				        ((OrExpressionContext)_localctx).orExprRet =  new BinaryExpression(_localctx.orExprRet, ((OrExpressionContext)_localctx).andexp.andExpRet, op);
				        _localctx.orExprRet.setLine(((OrExpressionContext)_localctx).o.getLine());
				    
				}
				}
				setState(580);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression andExpRet;
		public EqualityExpressionContext eqexp;
		public Token and;
		public EqualityExpressionContext expr;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SimpleLOOPParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SimpleLOOPParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			((AndExpressionContext)_localctx).eqexp = equalityExpression();
			 ((AndExpressionContext)_localctx).andExpRet =  ((AndExpressionContext)_localctx).eqexp.eqExpRet ;
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(583);
				((AndExpressionContext)_localctx).and = match(AND);
				setState(584);
				((AndExpressionContext)_localctx).expr = equalityExpression();

				        BinaryOperator op = BinaryOperator.and;
				        ((AndExpressionContext)_localctx).andExpRet =  new BinaryExpression(_localctx.andExpRet, ((AndExpressionContext)_localctx).expr.eqExpRet, op);
				        _localctx.andExpRet.setLine(((AndExpressionContext)_localctx).and.getLine());
				    
				}
				}
				setState(591);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression eqExpRet;
		public RelationalExpressionContext reexp;
		public Token eq;
		public RelationalExpressionContext expr;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(SimpleLOOPParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SimpleLOOPParser.EQUAL, i);
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
		enterRule(_localctx, 60, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			((EqualityExpressionContext)_localctx).reexp = relationalExpression();
			 ((EqualityExpressionContext)_localctx).eqExpRet =  ((EqualityExpressionContext)_localctx).reexp.relExprRet; 
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(594);
				((EqualityExpressionContext)_localctx).eq = match(EQUAL);
				setState(595);
				((EqualityExpressionContext)_localctx).expr = relationalExpression();

				        BinaryOperator op = BinaryOperator.eq;
				        ((EqualityExpressionContext)_localctx).eqExpRet =  new BinaryExpression(_localctx.eqExpRet, ((EqualityExpressionContext)_localctx).expr.relExprRet, op);
				        _localctx.eqExpRet.setLine(((EqualityExpressionContext)_localctx).eq.getLine());
				     
				}
				}
				setState(602);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression relExprRet;
		public BinaryOperator op;
		public int line;
		public AdditiveExpressionContext adtexpf;
		public Token gt;
		public Token lt;
		public AdditiveExpressionContext adtexps;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(SimpleLOOPParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(SimpleLOOPParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(SimpleLOOPParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(SimpleLOOPParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			((RelationalExpressionContext)_localctx).adtexpf = additiveExpression();
			 ((RelationalExpressionContext)_localctx).relExprRet =  ((RelationalExpressionContext)_localctx).adtexpf.addExpRet; 
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(609);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(605);
					((RelationalExpressionContext)_localctx).gt = match(GREATER_THAN);

					            ((RelationalExpressionContext)_localctx).op =  BinaryOperator.gt;
					            ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).gt.getLine();
					        
					}
					break;
				case LESS_THAN:
					{
					setState(607);
					((RelationalExpressionContext)_localctx).lt = match(LESS_THAN);

					            ((RelationalExpressionContext)_localctx).op =  BinaryOperator.lt;
					            ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).lt.getLine();
					        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(611);
				((RelationalExpressionContext)_localctx).adtexps = additiveExpression();

				            ((RelationalExpressionContext)_localctx).relExprRet =  new BinaryExpression(_localctx.relExprRet, ((RelationalExpressionContext)_localctx).adtexps.addExpRet, _localctx.op);
				            _localctx.relExprRet.setLine(_localctx.line);
				        
				}
				}
				setState(618);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression addExpRet;
		public BinaryOperator op;
		public int line;
		public MultiplicativeExpressionContext mel;
		public Token add;
		public Token sub;
		public MultiplicativeExpressionContext mer;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SimpleLOOPParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SimpleLOOPParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SimpleLOOPParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SimpleLOOPParser.MINUS, i);
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
		enterRule(_localctx, 64, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			((AdditiveExpressionContext)_localctx).mel = multiplicativeExpression();
			 ((AdditiveExpressionContext)_localctx).addExpRet =  ((AdditiveExpressionContext)_localctx).mel.exp; 
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(625);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(621);
					((AdditiveExpressionContext)_localctx).add = match(PLUS);

					         ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.add;
					         ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).add.getLine();
					     
					}
					break;
				case MINUS:
					{
					setState(623);
					((AdditiveExpressionContext)_localctx).sub = match(MINUS);

					         ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.sub;
					         ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).sub.getLine();
					     
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(627);
				((AdditiveExpressionContext)_localctx).mer = multiplicativeExpression();

				         ((AdditiveExpressionContext)_localctx).addExpRet =  new BinaryExpression(_localctx.addExpRet, ((AdditiveExpressionContext)_localctx).mer.exp, _localctx.op);
				         _localctx.addExpRet.setLine(_localctx.line);
				     
				}
				}
				setState(634);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression exp;
		public BinaryOperator op;
		public int line;
		public PreUnaryExpressionContext pel;
		public Token mult;
		public Token div;
		public PreUnaryExpressionContext per;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SimpleLOOPParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SimpleLOOPParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(SimpleLOOPParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(SimpleLOOPParser.DIVIDE, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			((MultiplicativeExpressionContext)_localctx).pel = preUnaryExpression();
			 ((MultiplicativeExpressionContext)_localctx).exp =  ((MultiplicativeExpressionContext)_localctx).pel.preUExpRet; 
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(641);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(637);
					((MultiplicativeExpressionContext)_localctx).mult = match(MULT);

					         ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.mult;
					         ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).mult.getLine();
					    
					}
					break;
				case DIVIDE:
					{
					setState(639);
					((MultiplicativeExpressionContext)_localctx).div = match(DIVIDE);

					         ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.div;
					         ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).div.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(643);
				((MultiplicativeExpressionContext)_localctx).per = preUnaryExpression();

				         ((MultiplicativeExpressionContext)_localctx).exp =  new BinaryExpression(_localctx.exp, ((MultiplicativeExpressionContext)_localctx).per.preUExpRet, _localctx.op);
				         _localctx.exp.setLine(_localctx.line);
				    
				}
				}
				setState(650);
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression preUExpRet;
		public UnaryOperator op;
		public int line;
		public Token not;
		public Token minus;
		public PreUnaryExpressionContext pre;
		public PostUnaryExpressionContext post;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SimpleLOOPParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(SimpleLOOPParser.MINUS, 0); }
		public PostUnaryExpressionContext postUnaryExpression() {
			return getRuleContext(PostUnaryExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_preUnaryExpression);
		try {
			setState(663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(651);
					((PreUnaryExpressionContext)_localctx).not = match(NOT);

					        ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.not;
					        ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).not.getLine();
					    
					}
					break;
				case MINUS:
					{
					setState(653);
					((PreUnaryExpressionContext)_localctx).minus = match(MINUS);

					        ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.minus;
					        ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).minus.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(657);
				((PreUnaryExpressionContext)_localctx).pre = preUnaryExpression();

				        ((PreUnaryExpressionContext)_localctx).preUExpRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).pre.preUExpRet, _localctx.op);
				        _localctx.preUExpRet.setLine(_localctx.line);
				    
				}
				break;
			case SELF:
			case TRUE:
			case FALSE:
			case SET:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
			case CLASS_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				((PreUnaryExpressionContext)_localctx).post = postUnaryExpression();
				 ((PreUnaryExpressionContext)_localctx).preUExpRet =  ((PreUnaryExpressionContext)_localctx).post.postUExpRet; 
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

	public static class PostUnaryExpressionContext extends ParserRuleContext {
		public Expression postUExpRet;
		public AccessExpressionContext ae;
		public Token postinc;
		public Token postdec;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(SimpleLOOPParser.INC, 0); }
		public TerminalNode DEC() { return getToken(SimpleLOOPParser.DEC, 0); }
		public PostUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterPostUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitPostUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitPostUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryExpressionContext postUnaryExpression() throws RecognitionException {
		PostUnaryExpressionContext _localctx = new PostUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_postUnaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			((PostUnaryExpressionContext)_localctx).ae = accessExpression();
			 ((PostUnaryExpressionContext)_localctx).postUExpRet =  ((PostUnaryExpressionContext)_localctx).ae.accessExpRet; 
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				{
				setState(667);
				((PostUnaryExpressionContext)_localctx).postinc = match(INC);

				            UnaryOperator op = UnaryOperator.postinc;
				            ((PostUnaryExpressionContext)_localctx).postUExpRet =  new UnaryExpression(_localctx.postUExpRet, op);
				            _localctx.postUExpRet.setLine(((PostUnaryExpressionContext)_localctx).postinc.getLine());
				        
				}
				break;
			case DEC:
				{
				setState(669);
				((PostUnaryExpressionContext)_localctx).postdec = match(DEC);

				            UnaryOperator op = UnaryOperator.postdec;
				            ((PostUnaryExpressionContext)_localctx).postUExpRet =  new UnaryExpression(_localctx.postUExpRet, op);
				            _localctx.postUExpRet.setLine(((PostUnaryExpressionContext)_localctx).postdec.getLine());
				        
				}
				break;
			case ELSE:
			case ELSIF:
			case PLUS:
			case MINUS:
			case MULT:
			case DIVIDE:
			case EQUAL:
			case GREATER_THAN:
			case LESS_THAN:
			case AND:
			case OR:
			case TIF:
			case TELSE:
			case ASSIGN:
			case RPAR:
			case RBRACK:
			case LBRACE:
			case COMMA:
			case DOT:
			case NEWLINE:
				break;
			default:
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression accessExpRet;
		public OtherExpressionContext oe;
		public Token l;
		public MethodArgsContext m;
		public Token dot;
		public IdentifierContext i;
		public Token n;
		public Token dt;
		public ExpressionContext index;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(SimpleLOOPParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SimpleLOOPParser.RPAR, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimpleLOOPParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimpleLOOPParser.RBRACK, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(SimpleLOOPParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SimpleLOOPParser.LPAR, i);
		}
		public List<MethodArgsContext> methodArgs() {
			return getRuleContexts(MethodArgsContext.class);
		}
		public MethodArgsContext methodArgs(int i) {
			return getRuleContext(MethodArgsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SimpleLOOPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLOOPParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SimpleLOOPParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimpleLOOPParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> INITIALIZE() { return getTokens(SimpleLOOPParser.INITIALIZE); }
		public TerminalNode INITIALIZE(int i) {
			return getToken(SimpleLOOPParser.INITIALIZE, i);
		}
		public List<TerminalNode> NEW() { return getTokens(SimpleLOOPParser.NEW); }
		public TerminalNode NEW(int i) {
			return getToken(SimpleLOOPParser.NEW, i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_accessExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			((AccessExpressionContext)_localctx).oe = otherExpression();
			 ((AccessExpressionContext)_localctx).accessExpRet =  ((AccessExpressionContext)_localctx).oe.otherExprRet; 
			setState(691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(689);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(675);
						((AccessExpressionContext)_localctx).l = match(LPAR);
						setState(676);
						((AccessExpressionContext)_localctx).m = methodArgs();

						        if(_localctx.accessExpRet instanceof NewClassInstance)
						            ((NewClassInstance) _localctx.accessExpRet).setArgs(((AccessExpressionContext)_localctx).m.methodCallArgsRet);
						        else{
						            ((AccessExpressionContext)_localctx).accessExpRet =  new MethodCall(_localctx.accessExpRet, ((AccessExpressionContext)_localctx).m.methodCallArgsRet);
						            _localctx.accessExpRet.setLine((((AccessExpressionContext)_localctx).l!=null?((AccessExpressionContext)_localctx).l.getLine():0));
						        }
						    
						setState(678);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(680);
						((AccessExpressionContext)_localctx).dot = match(DOT);
						setState(687);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(681);
							((AccessExpressionContext)_localctx).i = identifier();

							        ((AccessExpressionContext)_localctx).accessExpRet =  new ObjectMemberAccess(_localctx.accessExpRet, ((AccessExpressionContext)_localctx).i.idRet);
							        _localctx.accessExpRet.setLine(((AccessExpressionContext)_localctx).dot.getLine());
							    
							}
							break;
						case NEW:
							{
							setState(684);
							((AccessExpressionContext)_localctx).n = match(NEW);

							        ((AccessExpressionContext)_localctx).accessExpRet =  new NewClassInstance(new ClassType((Identifier) _localctx.accessExpRet));
							        _localctx.accessExpRet.setLine(((AccessExpressionContext)_localctx).n.getLine());
							    
							}
							break;
						case INITIALIZE:
							{
							setState(686);
							match(INITIALIZE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(705);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(694);
						((AccessExpressionContext)_localctx).dt = match(DOT);
						setState(695);
						((AccessExpressionContext)_localctx).i = identifier();
						}

						         ((AccessExpressionContext)_localctx).accessExpRet =  new ObjectMemberAccess(_localctx.accessExpRet, ((AccessExpressionContext)_localctx).i.idRet);
						         _localctx.accessExpRet.setLine(((AccessExpressionContext)_localctx).dt.getLine());
						    
						}
						break;
					case LBRACK:
						{
						{
						setState(699);
						((AccessExpressionContext)_localctx).l = match(LBRACK);
						setState(700);
						((AccessExpressionContext)_localctx).index = expression();
						setState(701);
						match(RBRACK);
						}

						         ((AccessExpressionContext)_localctx).accessExpRet =  new ArrayAccessByIndex(_localctx.accessExpRet, ((AccessExpressionContext)_localctx).index.expRet);
						         _localctx.accessExpRet.setLine(((AccessExpressionContext)_localctx).l.getLine());
						    
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression otherExprRet;
		public Token s;
		public Class_identifierContext ci;
		public ValueContext val;
		public IdentifierContext id;
		public SetNewContext sn;
		public ExpressionContext exp;
		public TerminalNode SELF() { return getToken(SimpleLOOPParser.SELF, 0); }
		public Class_identifierContext class_identifier() {
			return getRuleContext(Class_identifierContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetNewContext setNew() {
			return getRuleContext(SetNewContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_otherExpression);
		try {
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				((OtherExpressionContext)_localctx).s = match(SELF);

				        ((OtherExpressionContext)_localctx).otherExprRet =  new SelfClass();
				        _localctx.otherExprRet.setLine(((OtherExpressionContext)_localctx).s.getLine());
				    
				}
				break;
			case CLASS_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				((OtherExpressionContext)_localctx).ci = class_identifier();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).ci.idRet; 
				}
				break;
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(715);
				((OtherExpressionContext)_localctx).val = value();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).val.valuesRet; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(718);
				((OtherExpressionContext)_localctx).id = identifier();
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).id.idRet; 
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 5);
				{
				setState(721);
				((OtherExpressionContext)_localctx).sn = setNew();
				 ((OtherExpressionContext)_localctx).otherExprRet =   ((OtherExpressionContext)_localctx).sn.setNewRet; 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(724);
				match(LPAR);
				{
				setState(725);
				((OtherExpressionContext)_localctx).exp = expression();
				}
				setState(726);
				match(RPAR);
				 ((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).exp.expRet; 
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

	public static class SetNewContext extends ParserRuleContext {
		public Expression setNewRet;
		public ArrayList<Expression> args;
		public Token n;
		public OrExpressionContext orexp;
		public OrExpressionContext orex;
		public TerminalNode SET() { return getToken(SimpleLOOPParser.SET, 0); }
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public List<TerminalNode> LPAR() { return getTokens(SimpleLOOPParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SimpleLOOPParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SimpleLOOPParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SimpleLOOPParser.RPAR, i);
		}
		public TerminalNode NEW() { return getToken(SimpleLOOPParser.NEW, 0); }
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public SetNewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setNew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSetNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSetNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSetNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetNewContext setNew() throws RecognitionException {
		SetNewContext _localctx = new SetNewContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_setNew);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((SetNewContext)_localctx).args =  new ArrayList<>(); 
			setState(732);
			match(SET);
			setState(733);
			match(DOT);
			setState(734);
			((SetNewContext)_localctx).n = match(NEW);
			setState(735);
			match(LPAR);
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(736);
				match(LPAR);
				setState(737);
				((SetNewContext)_localctx).orexp = orExpression();

				        _localctx.args.add(((SetNewContext)_localctx).orexp.orExprRet);
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(739);
					match(COMMA);
					setState(740);
					((SetNewContext)_localctx).orex = orExpression();

					        _localctx.args.add(((SetNewContext)_localctx).orex.orExprRet); 
					}
					}
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(748);
				match(RPAR);
				}
			}

			setState(752);
			match(RPAR);
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

	public static class ValueContext extends ParserRuleContext {
		public Value valuesRet;
		public BoolValueContext b;
		public Token i;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode INT_VALUE() { return getToken(SimpleLOOPParser.INT_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_value);
		try {
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				((ValueContext)_localctx).b = boolValue();

				        ((ValueContext)_localctx).valuesRet =  new BoolValue(((ValueContext)_localctx).b.boolValueRet);
				        _localctx.valuesRet.setLine(((ValueContext)_localctx).b.line);
				    
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				((ValueContext)_localctx).i = match(INT_VALUE);

				        ((ValueContext)_localctx).valuesRet =  new IntValue((((ValueContext)_localctx).i!=null?Integer.valueOf(((ValueContext)_localctx).i.getText()):0));
				        _localctx.valuesRet.setLine(((ValueContext)_localctx).i.getLine());
				    
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

	public static class BoolValueContext extends ParserRuleContext {
		public boolean boolValueRet;
		public int line;
		public Token t;
		public Token f;
		public TerminalNode TRUE() { return getToken(SimpleLOOPParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SimpleLOOPParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_boolValue);
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				((BoolValueContext)_localctx).t = match(TRUE);

				        ((BoolValueContext)_localctx).boolValueRet =  (true);
				        ((BoolValueContext)_localctx).line =  ((BoolValueContext)_localctx).t.getLine();
				    
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				((BoolValueContext)_localctx).f = match(FALSE);

				        ((BoolValueContext)_localctx).boolValueRet =  (false);
				        ((BoolValueContext)_localctx).line =  ((BoolValueContext)_localctx).f.getLine();
				    
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

	public static class Class_identifierContext extends ParserRuleContext {
		public Identifier idRet;
		public int line;
		public Token cid;
		public TerminalNode CLASS_IDENTIFIER() { return getToken(SimpleLOOPParser.CLASS_IDENTIFIER, 0); }
		public Class_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClass_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClass_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClass_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_identifierContext class_identifier() throws RecognitionException {
		Class_identifierContext _localctx = new Class_identifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_class_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			((Class_identifierContext)_localctx).cid = match(CLASS_IDENTIFIER);

			        ((Class_identifierContext)_localctx).idRet =  new Identifier((((Class_identifierContext)_localctx).cid!=null?((Class_identifierContext)_localctx).cid.getText():null));
			        _localctx.idRet.setLine(((Class_identifierContext)_localctx).cid.getLine());
			        ((Class_identifierContext)_localctx).line =  ((Class_identifierContext)_localctx).cid.getLine();
			    
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier idRet;
		public int line;
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(SimpleLOOPParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			((IdentifierContext)_localctx).id = match(IDENTIFIER);

			        ((IdentifierContext)_localctx).idRet =  new Identifier((((IdentifierContext)_localctx).id!=null?((IdentifierContext)_localctx).id.getText():null));
			        _localctx.idRet.setLine(((IdentifierContext)_localctx).id.getLine());
			        ((IdentifierContext)_localctx).line =  ((IdentifierContext)_localctx).id.getLine();
			    
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
		public Type typeRet;
		public Array_typeContext arr;
		public Fptr_typeContext fpt;
		public Set_typeContext st;
		public Class_identifierContext cid;
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(SimpleLOOPParser.BOOL, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Fptr_typeContext fptr_type() {
			return getRuleContext(Fptr_typeContext.class,0);
		}
		public Set_typeContext set_type() {
			return getRuleContext(Set_typeContext.class,0);
		}
		public Class_identifierContext class_identifier() {
			return getRuleContext(Class_identifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_type);
		try {
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				match(INT);
				 ((TypeContext)_localctx).typeRet =  new IntType(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				match(BOOL);
				 ((TypeContext)_localctx).typeRet =  new BoolType(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(777);
				((TypeContext)_localctx).arr = array_type();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).arr.arrTypeRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(780);
				((TypeContext)_localctx).fpt = fptr_type();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).fpt.fptrTypeRet; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(783);
				((TypeContext)_localctx).st = set_type();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).st.setTypeRet; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(786);
				((TypeContext)_localctx).cid = class_identifier();
				 ((TypeContext)_localctx).typeRet =  new ClassType(((TypeContext)_localctx).cid.idRet); 
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

	public static class Array_typeContext extends ParserRuleContext {
		public ArrayType arrTypeRet;
		public Type t;
		public ArrayList<Expression> df;
		public Class_identifierContext cid;
		public ExpressionContext exp;
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(SimpleLOOPParser.BOOL, 0); }
		public Class_identifierContext class_identifier() {
			return getRuleContext(Class_identifierContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SimpleLOOPParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimpleLOOPParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimpleLOOPParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimpleLOOPParser.RBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 88, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((Array_typeContext)_localctx).df =  new ArrayList<>(); 
			setState(799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(792);
				match(INT);
				 ((Array_typeContext)_localctx).t =  new IntType(); 
				}
				break;
			case BOOL:
				{
				setState(794);
				match(BOOL);
				 ((Array_typeContext)_localctx).t =  new BoolType(); 
				}
				break;
			case CLASS_IDENTIFIER:
				{
				setState(796);
				((Array_typeContext)_localctx).cid = class_identifier();
				 ((Array_typeContext)_localctx).t =  new ClassType(((Array_typeContext)_localctx).cid.idRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(806); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(801);
				match(LBRACK);
				setState(802);
				((Array_typeContext)_localctx).exp = expression();
				setState(803);
				match(RBRACK);

				        _localctx.df.add(((Array_typeContext)_localctx).exp.expRet);
				    
				}
				}
				setState(808); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACK );
			 ((Array_typeContext)_localctx).arrTypeRet =  new ArrayType(_localctx.t, _localctx.df);
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
		public FptrType fptrTypeRet;
		public ArrayList<Type> args;
		public Type _return;
		public TypeContext t;
		public TerminalNode FPTR() { return getToken(SimpleLOOPParser.FPTR, 0); }
		public TerminalNode LESS_THAN() { return getToken(SimpleLOOPParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(SimpleLOOPParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SimpleLOOPParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(SimpleLOOPParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(SimpleLOOPParser.VOID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
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
		enterRule(_localctx, 90, RULE_fptr_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(FPTR);
			((Fptr_typeContext)_localctx).args =  new ArrayList<Type>();
			setState(814);
			match(LESS_THAN);
			setState(828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(815);
				match(VOID);
				_localctx.args.add(new VoidType());
				}
				break;
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				{
				setState(817);
				((Fptr_typeContext)_localctx).t = type();
				_localctx.args.add(((Fptr_typeContext)_localctx).t.typeRet);
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(819);
					match(COMMA);
					setState(820);
					((Fptr_typeContext)_localctx).t = type();
					_localctx.args.add(((Fptr_typeContext)_localctx).t.typeRet);
					}
					}
					setState(827);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(830);
			match(ARROW);
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				setState(831);
				((Fptr_typeContext)_localctx).t = type();
				((Fptr_typeContext)_localctx)._return =  ((Fptr_typeContext)_localctx).t.typeRet;
				}
				break;
			case VOID:
				{
				setState(834);
				match(VOID);
				((Fptr_typeContext)_localctx)._return =  new VoidType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(838);
			match(GREATER_THAN);
			((Fptr_typeContext)_localctx).fptrTypeRet =  new FptrType(_localctx.args, _localctx._return);
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
		public SetType setTypeRet;
		public TerminalNode SET() { return getToken(SimpleLOOPParser.SET, 0); }
		public TerminalNode LESS_THAN() { return getToken(SimpleLOOPParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SimpleLOOPParser.GREATER_THAN, 0); }
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
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
		enterRule(_localctx, 92, RULE_set_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(SET);
			setState(842);
			match(LESS_THAN);
			{
			setState(843);
			match(INT);
			}
			setState(844);
			match(GREATER_THAN);

			        ((Set_typeContext)_localctx).setTypeRet =  new SetType();
			    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0352\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\3\2\3"+
		"\2\7\2j\n\2\f\2\16\2m\13\2\3\2\3\2\3\3\3\3\3\3\6\3t\n\3\r\3\16\3u\3\3"+
		"\3\3\7\3z\n\3\f\3\16\3}\13\3\3\3\3\3\6\3\u0081\n\3\r\3\16\3\u0082\3\3"+
		"\3\3\7\3\u0087\n\3\f\3\16\3\u008a\13\3\3\4\3\4\3\4\3\4\3\4\7\4\u0091\n"+
		"\4\f\4\16\4\u0094\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u00a1\n\5\3\5\7\5\u00a4\n\5\f\5\16\5\u00a7\13\5\3\5\3\5\6\5\u00ab\n\5"+
		"\r\5\16\5\u00ac\3\5\3\5\3\5\6\5\u00b2\n\5\r\5\16\5\u00b3\6\5\u00b6\n\5"+
		"\r\5\16\5\u00b7\3\5\3\5\3\5\3\5\3\5\5\5\u00bf\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u00c9\n\6\3\6\3\6\3\6\5\6\u00ce\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00d5\n\7\3\7\3\7\3\7\7\7\u00da\n\7\f\7\16\7\u00dd\13\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\6\b\u00e5\n\b\r\b\16\b\u00e6\3\b\3\b\6\b\u00eb\n\b\r"+
		"\b\16\b\u00ec\3\b\3\b\7\b\u00f1\n\b\f\b\16\b\u00f4\13\b\3\b\3\b\6\b\u00f8"+
		"\n\b\r\b\16\b\u00f9\3\b\3\b\7\b\u00fe\n\b\f\b\16\b\u0101\13\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u010b\n\b\5\b\u010d\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u0119\n\t\f\t\16\t\u011c\13\t\5\t\u011e\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0126\n\t\f\t\16\t\u0129\13\t\5\t\u012b\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u013a"+
		"\n\13\f\13\16\13\u013d\13\13\5\13\u013f\n\13\3\f\3\f\3\f\3\f\6\f\u0145"+
		"\n\f\r\f\16\f\u0146\3\f\3\f\3\f\5\f\u014c\n\f\3\r\3\r\3\r\6\r\u0151\n"+
		"\r\r\r\16\r\u0152\3\r\3\r\3\r\6\r\u0158\n\r\r\r\16\r\u0159\7\r\u015c\n"+
		"\r\f\r\16\r\u015f\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u017e\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0192"+
		"\n\20\f\20\16\20\u0195\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01aa\n\22"+
		"\f\22\16\22\u01ad\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01b6"+
		"\n\23\f\23\16\23\u01b9\13\23\3\23\3\23\3\23\5\23\u01be\n\23\3\24\7\24"+
		"\u01c1\n\24\f\24\16\24\u01c4\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01d3\n\25\3\26\7\26\u01d6\n\26\f"+
		"\26\16\26\u01d9\13\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01ed\n\30\7\30\u01ef\n"+
		"\30\f\30\16\30\u01f2\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u01fc\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0203\n\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u0217\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u0228\n\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0231\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u023b"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0243\n\36\f\36\16\36\u0246\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u024e\n\37\f\37\16\37\u0251\13"+
		"\37\3 \3 \3 \3 \3 \3 \7 \u0259\n \f \16 \u025c\13 \3!\3!\3!\3!\3!\3!\5"+
		"!\u0264\n!\3!\3!\3!\7!\u0269\n!\f!\16!\u026c\13!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\5\"\u0274\n\"\3\"\3\"\3\"\7\"\u0279\n\"\f\"\16\"\u027c\13\"\3#\3#\3"+
		"#\3#\3#\3#\5#\u0284\n#\3#\3#\3#\7#\u0289\n#\f#\16#\u028c\13#\3$\3$\3$"+
		"\3$\5$\u0292\n$\3$\3$\3$\3$\3$\3$\5$\u029a\n$\3%\3%\3%\3%\3%\3%\5%\u02a2"+
		"\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u02b2\n&\7&\u02b4\n&"+
		"\f&\16&\u02b7\13&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u02c4\n&\f&\16&"+
		"\u02c7\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u02dc\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7("+
		"\u02ea\n(\f(\16(\u02ed\13(\3(\3(\5(\u02f1\n(\3(\3(\3)\3)\3)\3)\3)\5)\u02fa"+
		"\n)\3*\3*\3*\3*\5*\u0300\n*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0318\n-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0322"+
		"\n.\3.\3.\3.\3.\3.\6.\u0329\n.\r.\16.\u032a\3.\3.\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\7/\u033a\n/\f/\16/\u033d\13/\5/\u033f\n/\3/\3/\3/\3/\3/"+
		"\3/\5/\u0347\n/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\2\2\61\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^\2\4\3\2\5\6\3\2\30\31\2\u0383\2c\3\2\2\2\4p\3\2\2\2\6\u008b\3"+
		"\2\2\2\b\u0099\3\2\2\2\n\u00c0\3\2\2\2\f\u00d4\3\2\2\2\16\u010c\3\2\2"+
		"\2\20\u010e\3\2\2\2\22\u012e\3\2\2\2\24\u0132\3\2\2\2\26\u014b\3\2\2\2"+
		"\30\u014d\3\2\2\2\32\u017d\3\2\2\2\34\u017f\3\2\2\2\36\u0187\3\2\2\2 "+
		"\u0199\3\2\2\2\"\u01a1\3\2\2\2$\u01ae\3\2\2\2&\u01c2\3\2\2\2(\u01d2\3"+
		"\2\2\2*\u01d7\3\2\2\2,\u01de\3\2\2\2.\u01e4\3\2\2\2\60\u01fd\3\2\2\2\62"+
		"\u0206\3\2\2\2\64\u0216\3\2\2\2\66\u0221\3\2\2\28\u0232\3\2\2\2:\u023c"+
		"\3\2\2\2<\u0247\3\2\2\2>\u0252\3\2\2\2@\u025d\3\2\2\2B\u026d\3\2\2\2D"+
		"\u027d\3\2\2\2F\u0299\3\2\2\2H\u029b\3\2\2\2J\u02a3\3\2\2\2L\u02db\3\2"+
		"\2\2N\u02dd\3\2\2\2P\u02f9\3\2\2\2R\u02ff\3\2\2\2T\u0301\3\2\2\2V\u0304"+
		"\3\2\2\2X\u0317\3\2\2\2Z\u0319\3\2\2\2\\\u032e\3\2\2\2^\u034b\3\2\2\2"+
		"`b\7:\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2"+
		"fg\5\4\3\2gk\b\2\1\2hj\7:\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2"+
		"ln\3\2\2\2mk\3\2\2\2no\7\2\2\3o\3\3\2\2\2p{\b\3\1\2qs\5\"\22\2rt\7:\2"+
		"\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\3\1\2xz\3\2\2"+
		"\2yq\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0088\3\2\2\2}{\3\2\2\2~\u0080"+
		"\5\b\5\2\177\u0081\7:\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\3"+
		"\1\2\u0085\u0087\3\2\2\2\u0086~\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\5\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7\5\2\2\u008c\u008d\7\7\2\2\u008d\u008e\b\4\1\2\u008e\u0092\5\20"+
		"\t\2\u008f\u0091\7:\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0096\b\4\1\2\u0096\u0097\5\16\b\2\u0097\u0098\b\4\1\2\u0098"+
		"\7\3\2\2\2\u0099\u009a\7\4\2\2\u009a\u009b\5T+\2\u009b\u00a0\b\5\1\2\u009c"+
		"\u009d\7\34\2\2\u009d\u009e\5T+\2\u009e\u009f\b\5\1\2\u009f\u00a1\3\2"+
		"\2\2\u00a0\u009c\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a5\3\2\2\2\u00a2"+
		"\u00a4\7:\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00be\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00aa\7\65\2\2\u00a9\u00ab\7:\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b5\3\2\2\2\u00ae"+
		"\u00af\5\n\6\2\u00af\u00b1\b\5\1\2\u00b0\u00b2\7:\2\2\u00b1\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00ae\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\66\2\2\u00ba"+
		"\u00bf\3\2\2\2\u00bb\u00bc\5\n\6\2\u00bc\u00bd\b\5\1\2\u00bd\u00bf\3\2"+
		"\2\2\u00be\u00a8\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\t\3\2\2\2\u00c0\u00cd"+
		"\b\6\1\2\u00c1\u00c8\t\2\2\2\u00c2\u00c3\5\"\22\2\u00c3\u00c4\b\6\1\2"+
		"\u00c4\u00c9\3\2\2\2\u00c5\u00c6\5\f\7\2\u00c6\u00c7\b\6\1\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\u00ce\3\2\2\2\u00ca"+
		"\u00cb\5\6\4\2\u00cb\u00cc\b\6\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00c1\3\2"+
		"\2\2\u00cd\u00ca\3\2\2\2\u00ce\13\3\2\2\2\u00cf\u00d0\5X-\2\u00d0\u00d1"+
		"\b\7\1\2\u00d1\u00d5\3\2\2\2\u00d2\u00d3\7\13\2\2\u00d3\u00d5\b\7\1\2"+
		"\u00d4\u00cf\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\5V,\2\u00d7\u00db\5\20\t\2\u00d8\u00da\7:\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\5\16\b\2\u00df\u00e0\b\7\1\2\u00e0"+
		"\r\3\2\2\2\u00e1\u00e2\b\b\1\2\u00e2\u00e4\7\65\2\2\u00e3\u00e5\7:\2\2"+
		"\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00f2\3\2\2\2\u00e8\u00ea\5\"\22\2\u00e9\u00eb\7:\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\b\1\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00e8\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00ff\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\5\32\16\2\u00f6"+
		"\u00f8\7:\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b\b\1\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u010d\7\66\2\2\u0103\u010a\b\b\1\2\u0104\u0105\5\"\22\2\u0105\u0106\b"+
		"\b\1\2\u0106\u010b\3\2\2\2\u0107\u0108\5\32\16\2\u0108\u0109\b\b\1\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0104\3\2\2\2\u010a\u0107\3\2\2\2\u010b\u010d\3\2"+
		"\2\2\u010c\u00e1\3\2\2\2\u010c\u0103\3\2\2\2\u010d\17\3\2\2\2\u010e\u010f"+
		"\7\61\2\2\u010f\u012a\b\t\1\2\u0110\u0111\5\22\n\2\u0111\u011d\b\t\1\2"+
		"\u0112\u0113\7/\2\2\u0113\u011e\5:\36\2\u0114\u0115\7\67\2\2\u0115\u0116"+
		"\5\22\n\2\u0116\u0117\b\t\1\2\u0117\u0119\3\2\2\2\u0118\u0114\3\2\2\2"+
		"\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0112\3\2\2\2\u011d\u011a\3\2\2\2\u011e"+
		"\u0127\3\2\2\2\u011f\u0120\7\67\2\2\u0120\u0121\5\22\n\2\u0121\u0122\b"+
		"\t\1\2\u0122\u0123\7/\2\2\u0123\u0124\5:\36\2\u0124\u0126\3\2\2\2\u0125"+
		"\u011f\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u0110\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\62\2\2\u012d\21\3\2\2"+
		"\2\u012e\u012f\5X-\2\u012f\u0130\5V,\2\u0130\u0131\b\n\1\2\u0131\23\3"+
		"\2\2\2\u0132\u013e\b\13\1\2\u0133\u0134\5\66\34\2\u0134\u013b\b\13\1\2"+
		"\u0135\u0136\7\67\2\2\u0136\u0137\5\66\34\2\u0137\u0138\b\13\1\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0135\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u0133\3\2\2\2\u013e\u013f\3\2\2\2\u013f\25\3\2\2\2\u0140\u0141\5\30\r"+
		"\2\u0141\u0142\b\f\1\2\u0142\u014c\3\2\2\2\u0143\u0145\7:\2\2\u0144\u0143"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0149\5\32\16\2\u0149\u014a\b\f\1\2\u014a\u014c\3"+
		"\2\2\2\u014b\u0140\3\2\2\2\u014b\u0144\3\2\2\2\u014c\27\3\2\2\2\u014d"+
		"\u014e\7\65\2\2\u014e\u0150\b\r\1\2\u014f\u0151\7:\2\2\u0150\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u015d\3\2\2\2\u0154\u0155\5\32\16\2\u0155\u0157\b\r\1\2\u0156\u0158\7"+
		":\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0154\3\2\2\2\u015c\u015f\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0161\7\66\2\2\u0161\31\3\2\2\2\u0162\u0163\5$\23"+
		"\2\u0163\u0164\b\16\1\2\u0164\u017e\3\2\2\2\u0165\u0166\5,\27\2\u0166"+
		"\u0167\b\16\1\2\u0167\u017e\3\2\2\2\u0168\u0169\5.\30\2\u0169\u016a\b"+
		"\16\1\2\u016a\u017e\3\2\2\2\u016b\u016c\5\60\31\2\u016c\u016d\b\16\1\2"+
		"\u016d\u017e\3\2\2\2\u016e\u016f\5\62\32\2\u016f\u0170\b\16\1\2\u0170"+
		"\u017e\3\2\2\2\u0171\u0172\5\64\33\2\u0172\u0173\b\16\1\2\u0173\u017e"+
		"\3\2\2\2\u0174\u0175\5\34\17\2\u0175\u0176\b\16\1\2\u0176\u017e\3\2\2"+
		"\2\u0177\u0178\5\36\20\2\u0178\u0179\b\16\1\2\u0179\u017e\3\2\2\2\u017a"+
		"\u017b\5 \21\2\u017b\u017c\b\16\1\2\u017c\u017e\3\2\2\2\u017d\u0162\3"+
		"\2\2\2\u017d\u0165\3\2\2\2\u017d\u0168\3\2\2\2\u017d\u016b\3\2\2\2\u017d"+
		"\u016e\3\2\2\2\u017d\u0171\3\2\2\2\u017d\u0174\3\2\2\2\u017d\u0177\3\2"+
		"\2\2\u017d\u017a\3\2\2\2\u017e\33\3\2\2\2\u017f\u0180\5\66\34\2\u0180"+
		"\u0181\78\2\2\u0181\u0182\7\16\2\2\u0182\u0183\7\61\2\2\u0183\u0184\5"+
		":\36\2\u0184\u0185\7\62\2\2\u0185\u0186\b\17\1\2\u0186\35\3\2\2\2\u0187"+
		"\u0188\5\66\34\2\u0188\u0189\78\2\2\u0189\u018a\7\17\2\2\u018a\u018b\7"+
		"\61\2\2\u018b\u018c\5:\36\2\u018c\u0193\b\20\1\2\u018d\u018e\7\67\2\2"+
		"\u018e\u018f\5:\36\2\u018f\u0190\b\20\1\2\u0190\u0192\3\2\2\2\u0191\u018d"+
		"\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\b\20\1\2\u0197\u0198\7"+
		"\62\2\2\u0198\37\3\2\2\2\u0199\u019a\5\66\34\2\u019a\u019b\78\2\2\u019b"+
		"\u019c\7\f\2\2\u019c\u019d\7\61\2\2\u019d\u019e\5:\36\2\u019e\u019f\7"+
		"\62\2\2\u019f\u01a0\b\21\1\2\u01a0!\3\2\2\2\u01a1\u01a2\b\22\1\2\u01a2"+
		"\u01a3\5X-\2\u01a3\u01a4\5V,\2\u01a4\u01ab\b\22\1\2\u01a5\u01a6\7\67\2"+
		"\2\u01a6\u01a7\5V,\2\u01a7\u01a8\b\22\1\2\u01a8\u01aa\3\2\2\2\u01a9\u01a5"+
		"\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"#\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\7\21\2\2\u01af\u01b0\5(\25\2"+
		"\u01b0\u01b1\5\26\f\2\u01b1\u01b7\b\23\1\2\u01b2\u01b3\5&\24\2\u01b3\u01b4"+
		"\b\23\1\2\u01b4\u01b6\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b6\u01b9\3\2\2\2"+
		"\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bd\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01ba\u01bb\5*\26\2\u01bb\u01bc\b\23\1\2\u01bc\u01be\3\2\2\2"+
		"\u01bd\u01ba\3\2\2\2\u01bd\u01be\3\2\2\2\u01be%\3\2\2\2\u01bf\u01c1\7"+
		":\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7\23"+
		"\2\2\u01c6\u01c7\5(\25\2\u01c7\u01c8\5\26\f\2\u01c8\u01c9\b\24\1\2\u01c9"+
		"\'\3\2\2\2\u01ca\u01cb\7\61\2\2\u01cb\u01cc\5\66\34\2\u01cc\u01cd\b\25"+
		"\1\2\u01cd\u01ce\7\62\2\2\u01ce\u01d3\3\2\2\2\u01cf\u01d0\5\66\34\2\u01d0"+
		"\u01d1\b\25\1\2\u01d1\u01d3\3\2\2\2\u01d2\u01ca\3\2\2\2\u01d2\u01cf\3"+
		"\2\2\2\u01d3)\3\2\2\2\u01d4\u01d6\7:\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9"+
		"\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9"+
		"\u01d7\3\2\2\2\u01da\u01db\7\22\2\2\u01db\u01dc\5\26\f\2\u01dc\u01dd\b"+
		"\26\1\2\u01dd+\3\2\2\2\u01de\u01df\7\20\2\2\u01df\u01e0\7\61\2\2\u01e0"+
		"\u01e1\5\66\34\2\u01e1\u01e2\b\27\1\2\u01e2\u01e3\7\62\2\2\u01e3-\3\2"+
		"\2\2\u01e4\u01e5\5J&\2\u01e5\u01f0\b\30\1\2\u01e6\u01ec\78\2\2\u01e7\u01e8"+
		"\7\7\2\2\u01e8\u01ed\b\30\1\2\u01e9\u01ea\5V,\2\u01ea\u01eb\b\30\1\2\u01eb"+
		"\u01ed\3\2\2\2\u01ec\u01e7\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ed\u01ef\3\2"+
		"\2\2\u01ee\u01e6\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01fb\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\7\61"+
		"\2\2\u01f4\u01f5\5\24\13\2\u01f5\u01f6\b\30\1\2\u01f6\u01f7\7\62\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01f9\b\30\1\2\u01f9\u01fc\3\2\2\2\u01fa\u01fc\t"+
		"\3\2\2\u01fb\u01f3\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc/\3\2\2\2\u01fd\u01fe"+
		"\7\n\2\2\u01fe\u0202\b\31\1\2\u01ff\u0200\5\66\34\2\u0200\u0201\b\31\1"+
		"\2\u0201\u0203\3\2\2\2\u0202\u01ff\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204"+
		"\3\2\2\2\u0204\u0205\b\31\1\2\u0205\61\3\2\2\2\u0206\u0207\5:\36\2\u0207"+
		"\u0208\7/\2\2\u0208\u0209\5\66\34\2\u0209\u020a\b\32\1\2\u020a\63\3\2"+
		"\2\2\u020b\u020c\5J&\2\u020c\u020d\b\33\1\2\u020d\u0217\3\2\2\2\u020e"+
		"\u020f\7\61\2\2\u020f\u0210\5\66\34\2\u0210\u0211\78\2\2\u0211\u0212\7"+
		"8\2\2\u0212\u0213\5\66\34\2\u0213\u0214\7\62\2\2\u0214\u0215\b\33\1\2"+
		"\u0215\u0217\3\2\2\2\u0216\u020b\3\2\2\2\u0216\u020e\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218\u0219\78\2\2\u0219\u021a\7-\2\2\u021a\u021b\7.\2\2\u021b"+
		"\u021c\7\36\2\2\u021c\u021d\5V,\2\u021d\u021e\7\36\2\2\u021e\u021f\5\26"+
		"\f\2\u021f\u0220\b\33\1\2\u0220\65\3\2\2\2\u0221\u0222\58\35\2\u0222\u0227"+
		"\b\34\1\2\u0223\u0224\7/\2\2\u0224\u0225\5\66\34\2\u0225\u0226\b\34\1"+
		"\2\u0226\u0228\3\2\2\2\u0227\u0223\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0230"+
		"\3\2\2\2\u0229\u022a\78\2\2\u022a\u022b\7\r\2\2\u022b\u022c\7\61\2\2\u022c"+
		"\u022d\5:\36\2\u022d\u022e\7\62\2\2\u022e\u022f\b\34\1\2\u022f\u0231\3"+
		"\2\2\2\u0230\u0229\3\2\2\2\u0230\u0231\3\2\2\2\u0231\67\3\2\2\2\u0232"+
		"\u0233\5:\36\2\u0233\u023a\b\35\1\2\u0234\u0235\7\"\2\2\u0235\u0236\5"+
		"8\35\2\u0236\u0237\7#\2\2\u0237\u0238\58\35\2\u0238\u0239\b\35\1\2\u0239"+
		"\u023b\3\2\2\2\u023a\u0234\3\2\2\2\u023a\u023b\3\2\2\2\u023b9\3\2\2\2"+
		"\u023c\u023d\5<\37\2\u023d\u0244\b\36\1\2\u023e\u023f\7 \2\2\u023f\u0240"+
		"\5<\37\2\u0240\u0241\b\36\1\2\u0241\u0243\3\2\2\2\u0242\u023e\3\2\2\2"+
		"\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245;\3"+
		"\2\2\2\u0246\u0244\3\2\2\2\u0247\u0248\5> \2\u0248\u024f\b\37\1\2\u0249"+
		"\u024a\7\37\2\2\u024a\u024b\5> \2\u024b\u024c\b\37\1\2\u024c\u024e\3\2"+
		"\2\2\u024d\u0249\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f"+
		"\u0250\3\2\2\2\u0250=\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0253\5@!\2\u0253"+
		"\u025a\b \1\2\u0254\u0255\7\32\2\2\u0255\u0256\5@!\2\u0256\u0257\b \1"+
		"\2\u0257\u0259\3\2\2\2\u0258\u0254\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b?\3\2\2\2\u025c\u025a\3\2\2\2\u025d"+
		"\u025e\5B\"\2\u025e\u026a\b!\1\2\u025f\u0260\7\33\2\2\u0260\u0264\b!\1"+
		"\2\u0261\u0262\7\34\2\2\u0262\u0264\b!\1\2\u0263\u025f\3\2\2\2\u0263\u0261"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\5B\"\2\u0266\u0267\b!\1\2\u0267"+
		"\u0269\3\2\2\2\u0268\u0263\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2"+
		"\2\2\u026a\u026b\3\2\2\2\u026bA\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u026e"+
		"\5D#\2\u026e\u027a\b\"\1\2\u026f\u0270\7\24\2\2\u0270\u0274\b\"\1\2\u0271"+
		"\u0272\7\25\2\2\u0272\u0274\b\"\1\2\u0273\u026f\3\2\2\2\u0273\u0271\3"+
		"\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\5D#\2\u0276\u0277\b\"\1\2\u0277"+
		"\u0279\3\2\2\2\u0278\u0273\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2"+
		"\2\2\u027a\u027b\3\2\2\2\u027bC\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027e"+
		"\5F$\2\u027e\u028a\b#\1\2\u027f\u0280\7\26\2\2\u0280\u0284\b#\1\2\u0281"+
		"\u0282\7\27\2\2\u0282\u0284\b#\1\2\u0283\u027f\3\2\2\2\u0283\u0281\3\2"+
		"\2\2\u0284\u0285\3\2\2\2\u0285\u0286\5F$\2\u0286\u0287\b#\1\2\u0287\u0289"+
		"\3\2\2\2\u0288\u0283\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028bE\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u028e\7!\2\2\u028e"+
		"\u0292\b$\1\2\u028f\u0290\7\25\2\2\u0290\u0292\b$\1\2\u0291\u028d\3\2"+
		"\2\2\u0291\u028f\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\5F$\2\u0294\u0295"+
		"\b$\1\2\u0295\u029a\3\2\2\2\u0296\u0297\5H%\2\u0297\u0298\b$\1\2\u0298"+
		"\u029a\3\2\2\2\u0299\u0291\3\2\2\2\u0299\u0296\3\2\2\2\u029aG\3\2\2\2"+
		"\u029b\u029c\5J&\2\u029c\u02a1\b%\1\2\u029d\u029e\7\30\2\2\u029e\u02a2"+
		"\b%\1\2\u029f\u02a0\7\31\2\2\u02a0\u02a2\b%\1\2\u02a1\u029d\3\2\2\2\u02a1"+
		"\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2I\3\2\2\2\u02a3\u02a4\5L\'\2\u02a4"+
		"\u02b5\b&\1\2\u02a5\u02a6\7\61\2\2\u02a6\u02a7\5\24\13\2\u02a7\u02a8\b"+
		"&\1\2\u02a8\u02a9\7\62\2\2\u02a9\u02b4\3\2\2\2\u02aa\u02b1\78\2\2\u02ab"+
		"\u02ac\5V,\2\u02ac\u02ad\b&\1\2\u02ad\u02b2\3\2\2\2\u02ae\u02af\7\b\2"+
		"\2\u02af\u02b2\b&\1\2\u02b0\u02b2\7\7\2\2\u02b1\u02ab\3\2\2\2\u02b1\u02ae"+
		"\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02a5\3\2\2\2\u02b3"+
		"\u02aa\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2"+
		"\2\2\u02b6\u02c5\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02b9\78\2\2\u02b9"+
		"\u02ba\5V,\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\b&\1\2\u02bc\u02c4\3\2\2"+
		"\2\u02bd\u02be\7\63\2\2\u02be\u02bf\5\66\34\2\u02bf\u02c0\7\64\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02c2\b&\1\2\u02c2\u02c4\3\2\2\2\u02c3\u02b8\3\2"+
		"\2\2\u02c3\u02bd\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5"+
		"\u02c6\3\2\2\2\u02c6K\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\7\t\2\2"+
		"\u02c9\u02dc\b\'\1\2\u02ca\u02cb\5T+\2\u02cb\u02cc\b\'\1\2\u02cc\u02dc"+
		"\3\2\2\2\u02cd\u02ce\5P)\2\u02ce\u02cf\b\'\1\2\u02cf\u02dc\3\2\2\2\u02d0"+
		"\u02d1\5V,\2\u02d1\u02d2\b\'\1\2\u02d2\u02dc\3\2\2\2\u02d3\u02d4\5N(\2"+
		"\u02d4\u02d5\b\'\1\2\u02d5\u02dc\3\2\2\2\u02d6\u02d7\7\61\2\2\u02d7\u02d8"+
		"\5\66\34\2\u02d8\u02d9\7\62\2\2\u02d9\u02da\b\'\1\2\u02da\u02dc\3\2\2"+
		"\2\u02db\u02c8\3\2\2\2\u02db\u02ca\3\2\2\2\u02db\u02cd\3\2\2\2\u02db\u02d0"+
		"\3\2\2\2\u02db\u02d3\3\2\2\2\u02db\u02d6\3\2\2\2\u02dcM\3\2\2\2\u02dd"+
		"\u02de\b(\1\2\u02de\u02df\7,\2\2\u02df\u02e0\78\2\2\u02e0\u02e1\7\b\2"+
		"\2\u02e1\u02f0\7\61\2\2\u02e2\u02e3\7\61\2\2\u02e3\u02e4\5:\36\2\u02e4"+
		"\u02eb\b(\1\2\u02e5\u02e6\7\67\2\2\u02e6\u02e7\5:\36\2\u02e7\u02e8\b("+
		"\1\2\u02e8\u02ea\3\2\2\2\u02e9\u02e5\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb"+
		"\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02eb\3\2"+
		"\2\2\u02ee\u02ef\7\62\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02e2\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\7\62\2\2\u02f3O\3\2\2\2"+
		"\u02f4\u02f5\5R*\2\u02f5\u02f6\b)\1\2\u02f6\u02fa\3\2\2\2\u02f7\u02f8"+
		"\7;\2\2\u02f8\u02fa\b)\1\2\u02f9\u02f4\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa"+
		"Q\3\2\2\2\u02fb\u02fc\7$\2\2\u02fc\u0300\b*\1\2\u02fd\u02fe\7%\2\2\u02fe"+
		"\u0300\b*\1\2\u02ff\u02fb\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300S\3\2\2\2\u0301"+
		"\u0302\7=\2\2\u0302\u0303\b+\1\2\u0303U\3\2\2\2\u0304\u0305\7<\2\2\u0305"+
		"\u0306\b,\1\2\u0306W\3\2\2\2\u0307\u0308\7)\2\2\u0308\u0318\b-\1\2\u0309"+
		"\u030a\7*\2\2\u030a\u0318\b-\1\2\u030b\u030c\5Z.\2\u030c\u030d\b-\1\2"+
		"\u030d\u0318\3\2\2\2\u030e\u030f\5\\/\2\u030f\u0310\b-\1\2\u0310\u0318"+
		"\3\2\2\2\u0311\u0312\5^\60\2\u0312\u0313\b-\1\2\u0313\u0318\3\2\2\2\u0314"+
		"\u0315\5T+\2\u0315\u0316\b-\1\2\u0316\u0318\3\2\2\2\u0317\u0307\3\2\2"+
		"\2\u0317\u0309\3\2\2\2\u0317\u030b\3\2\2\2\u0317\u030e\3\2\2\2\u0317\u0311"+
		"\3\2\2\2\u0317\u0314\3\2\2\2\u0318Y\3\2\2\2\u0319\u0321\b.\1\2\u031a\u031b"+
		"\7)\2\2\u031b\u0322\b.\1\2\u031c\u031d\7*\2\2\u031d\u0322\b.\1\2\u031e"+
		"\u031f\5T+\2\u031f\u0320\b.\1\2\u0320\u0322\3\2\2\2\u0321\u031a\3\2\2"+
		"\2\u0321\u031c\3\2\2\2\u0321\u031e\3\2\2\2\u0322\u0328\3\2\2\2\u0323\u0324"+
		"\7\63\2\2\u0324\u0325\5\66\34\2\u0325\u0326\7\64\2\2\u0326\u0327\b.\1"+
		"\2\u0327\u0329\3\2\2\2\u0328\u0323\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u0328"+
		"\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\b.\1\2\u032d"+
		"[\3\2\2\2\u032e\u032f\7+\2\2\u032f\u0330\b/\1\2\u0330\u033e\7\34\2\2\u0331"+
		"\u0332\7\13\2\2\u0332\u033f\b/\1\2\u0333\u0334\5X-\2\u0334\u033b\b/\1"+
		"\2\u0335\u0336\7\67\2\2\u0336\u0337\5X-\2\u0337\u0338\b/\1\2\u0338\u033a"+
		"\3\2\2\2\u0339\u0335\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u0331\3\2"+
		"\2\2\u033e\u0333\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0346\7\35\2\2\u0341"+
		"\u0342\5X-\2\u0342\u0343\b/\1\2\u0343\u0347\3\2\2\2\u0344\u0345\7\13\2"+
		"\2\u0345\u0347\b/\1\2\u0346\u0341\3\2\2\2\u0346\u0344\3\2\2\2\u0347\u0348"+
		"\3\2\2\2\u0348\u0349\7\33\2\2\u0349\u034a\b/\1\2\u034a]\3\2\2\2\u034b"+
		"\u034c\7,\2\2\u034c\u034d\7\34\2\2\u034d\u034e\7)\2\2\u034e\u034f\7\33"+
		"\2\2\u034f\u0350\b\60\1\2\u0350_\3\2\2\2Qcku{\u0082\u0088\u0092\u00a0"+
		"\u00a5\u00ac\u00b3\u00b7\u00be\u00c8\u00cd\u00d4\u00db\u00e6\u00ec\u00f2"+
		"\u00f9\u00ff\u010a\u010c\u011a\u011d\u0127\u012a\u013b\u013e\u0146\u014b"+
		"\u0152\u0159\u015d\u017d\u0193\u01ab\u01b7\u01bd\u01c2\u01d2\u01d7\u01ec"+
		"\u01f0\u01fb\u0202\u0216\u0227\u0230\u023a\u0244\u024f\u025a\u0263\u026a"+
		"\u0273\u027a\u0283\u028a\u0291\u0299\u02a1\u02b1\u02b3\u02b5\u02c3\u02c5"+
		"\u02db\u02eb\u02f0\u02f9\u02ff\u0317\u0321\u032a\u033b\u033e\u0346";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}