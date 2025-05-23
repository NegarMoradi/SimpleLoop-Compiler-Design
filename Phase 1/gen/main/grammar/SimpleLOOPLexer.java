// Generated from C:/Users/negar/OneDrive/Documents/UT/Term6/Compiler/1/src/main/grammar\SimpleLOOP.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLOOPLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IntLiteral", "Class", "Private", "Public", "Self", "Initialize", "Print", 
			"New", "Null", "Delete", "Include", "Add", "Merge", "Begin", "End", "Int", 
			"Bool", "True", "False", "Set", "Fptr", "Main", "Void", "While", "Do", 
			"If", "Else", "Elsif", "Each", "Return", "SemiCollon", "LPar", "RPar", 
			"LBrack", "RBrack", "LCurlyBrack", "RCurlyBrack", "Comma", "Equals", 
			"PPlus", "MMinus", "Assign", "Plus", "Minus", "Not", "Multiply", "Division", 
			"DSlahs", "Dot", "Arrow", "Less", "Greater", "And", "Or", "Line", "Colon", 
			"QMark", "NONZERODIGIT", "Identifier", "ClassIdentifier", "NewLine", 
			"Comment", "WS"
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


	public SimpleLOOPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLOOP.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u019d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\7\2\u0084\n\2\f\2\16\2\u0087\13\2\3\2\5\2\u008a"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;"+
		"\3<\3<\7<\u016e\n<\f<\16<\u0171\13<\3=\3=\7=\u0175\n=\f=\16=\u0178\13"+
		"=\3>\6>\u017b\n>\r>\16>\u017c\3?\3?\3?\3?\3?\3?\3?\3?\7?\u0187\n?\f?\16"+
		"?\u018a\13?\3?\3?\3?\3?\3?\3?\6?\u0192\n?\r?\16?\u0193\5?\u0196\n?\3?"+
		"\3?\3@\3@\3@\3@\2\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\3\2\13\3\2\63;\3\2\62;\3\2\62"+
		"\62\4\2aac|\6\2\62;C\\aac|\3\2C\\\4\2\f\f\17\17\3\2\f\f\5\2\13\13\17\17"+
		"\"\"\2\u01a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0089\3\2\2\2\5\u008b"+
		"\3\2\2\2\7\u0091\3\2\2\2\t\u0099\3\2\2\2\13\u00a0\3\2\2\2\r\u00a5\3\2"+
		"\2\2\17\u00b0\3\2\2\2\21\u00b6\3\2\2\2\23\u00ba\3\2\2\2\25\u00bf\3\2\2"+
		"\2\27\u00c6\3\2\2\2\31\u00ce\3\2\2\2\33\u00d2\3\2\2\2\35\u00d8\3\2\2\2"+
		"\37\u00de\3\2\2\2!\u00e2\3\2\2\2#\u00e6\3\2\2\2%\u00eb\3\2\2\2\'\u00f0"+
		"\3\2\2\2)\u00f6\3\2\2\2+\u00fa\3\2\2\2-\u00ff\3\2\2\2/\u0104\3\2\2\2\61"+
		"\u0109\3\2\2\2\63\u010f\3\2\2\2\65\u0112\3\2\2\2\67\u0115\3\2\2\29\u011a"+
		"\3\2\2\2;\u0120\3\2\2\2=\u0125\3\2\2\2?\u012c\3\2\2\2A\u012e\3\2\2\2C"+
		"\u0130\3\2\2\2E\u0132\3\2\2\2G\u0134\3\2\2\2I\u0136\3\2\2\2K\u0138\3\2"+
		"\2\2M\u013a\3\2\2\2O\u013c\3\2\2\2Q\u013f\3\2\2\2S\u0142\3\2\2\2U\u0145"+
		"\3\2\2\2W\u0147\3\2\2\2Y\u0149\3\2\2\2[\u014b\3\2\2\2]\u014d\3\2\2\2_"+
		"\u014f\3\2\2\2a\u0151\3\2\2\2c\u0154\3\2\2\2e\u0156\3\2\2\2g\u0159\3\2"+
		"\2\2i\u015b\3\2\2\2k\u015d\3\2\2\2m\u0160\3\2\2\2o\u0163\3\2\2\2q\u0165"+
		"\3\2\2\2s\u0167\3\2\2\2u\u0169\3\2\2\2w\u016b\3\2\2\2y\u0172\3\2\2\2{"+
		"\u017a\3\2\2\2}\u0195\3\2\2\2\177\u0199\3\2\2\2\u0081\u0085\t\2\2\2\u0082"+
		"\u0084\t\3\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u008a\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u008a\t\4\2\2\u0089\u0081\3\2\2\2\u0089\u0088\3\2\2\2\u008a\4\3\2\2\2"+
		"\u008b\u008c\7e\2\2\u008c\u008d\7n\2\2\u008d\u008e\7c\2\2\u008e\u008f"+
		"\7u\2\2\u008f\u0090\7u\2\2\u0090\6\3\2\2\2\u0091\u0092\7r\2\2\u0092\u0093"+
		"\7t\2\2\u0093\u0094\7k\2\2\u0094\u0095\7x\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7v\2\2\u0097\u0098\7g\2\2\u0098\b\3\2\2\2\u0099\u009a\7r\2\2\u009a"+
		"\u009b\7w\2\2\u009b\u009c\7d\2\2\u009c\u009d\7n\2\2\u009d\u009e\7k\2\2"+
		"\u009e\u009f\7e\2\2\u009f\n\3\2\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g"+
		"\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7h\2\2\u00a4\f\3\2\2\2\u00a5\u00a6"+
		"\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7v\2\2\u00a9"+
		"\u00aa\7k\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7k\2\2"+
		"\u00ad\u00ae\7|\2\2\u00ae\u00af\7g\2\2\u00af\16\3\2\2\2\u00b0\u00b1\7"+
		"r\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5"+
		"\7v\2\2\u00b5\20\3\2\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9"+
		"\7y\2\2\u00b9\22\3\2\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd"+
		"\7n\2\2\u00bd\u00be\7n\2\2\u00be\24\3\2\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7v\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5\26\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8"+
		"\u00c9\7e\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7f\2\2"+
		"\u00cc\u00cd\7g\2\2\u00cd\30\3\2\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7"+
		"f\2\2\u00d0\u00d1\7f\2\2\u00d1\32\3\2\2\2\u00d2\u00d3\7o\2\2\u00d3\u00d4"+
		"\7g\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7i\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"\34\3\2\2\2\u00d8\u00d9\7d\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7i\2\2\u00db"+
		"\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd\36\3\2\2\2\u00de\u00df\7g\2\2\u00df"+
		"\u00e0\7p\2\2\u00e0\u00e1\7f\2\2\u00e1 \3\2\2\2\u00e2\u00e3\7k\2\2\u00e3"+
		"\u00e4\7p\2\2\u00e4\u00e5\7v\2\2\u00e5\"\3\2\2\2\u00e6\u00e7\7d\2\2\u00e7"+
		"\u00e8\7q\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7n\2\2\u00ea$\3\2\2\2\u00eb"+
		"\u00ec\7v\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef\7g\2\2"+
		"\u00ef&\3\2\2\2\u00f0\u00f1\7h\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7n\2"+
		"\2\u00f3\u00f4\7u\2\2\u00f4\u00f5\7g\2\2\u00f5(\3\2\2\2\u00f6\u00f7\7"+
		"U\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7v\2\2\u00f9*\3\2\2\2\u00fa\u00fb"+
		"\7h\2\2\u00fb\u00fc\7r\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7t\2\2\u00fe"+
		",\3\2\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7c\2\2\u0101\u0102\7k\2\2\u0102"+
		"\u0103\7p\2\2\u0103.\3\2\2\2\u0104\u0105\7x\2\2\u0105\u0106\7q\2\2\u0106"+
		"\u0107\7k\2\2\u0107\u0108\7f\2\2\u0108\60\3\2\2\2\u0109\u010a\7y\2\2\u010a"+
		"\u010b\7j\2\2\u010b\u010c\7k\2\2\u010c\u010d\7n\2\2\u010d\u010e\7g\2\2"+
		"\u010e\62\3\2\2\2\u010f\u0110\7f\2\2\u0110\u0111\7q\2\2\u0111\64\3\2\2"+
		"\2\u0112\u0113\7k\2\2\u0113\u0114\7h\2\2\u0114\66\3\2\2\2\u0115\u0116"+
		"\7g\2\2\u0116\u0117\7n\2\2\u0117\u0118\7u\2\2\u0118\u0119\7g\2\2\u0119"+
		"8\3\2\2\2\u011a\u011b\7g\2\2\u011b\u011c\7n\2\2\u011c\u011d\7u\2\2\u011d"+
		"\u011e\7k\2\2\u011e\u011f\7h\2\2\u011f:\3\2\2\2\u0120\u0121\7g\2\2\u0121"+
		"\u0122\7c\2\2\u0122\u0123\7e\2\2\u0123\u0124\7j\2\2\u0124<\3\2\2\2\u0125"+
		"\u0126\7t\2\2\u0126\u0127\7g\2\2\u0127\u0128\7v\2\2\u0128\u0129\7w\2\2"+
		"\u0129\u012a\7t\2\2\u012a\u012b\7p\2\2\u012b>\3\2\2\2\u012c\u012d\7=\2"+
		"\2\u012d@\3\2\2\2\u012e\u012f\7*\2\2\u012fB\3\2\2\2\u0130\u0131\7+\2\2"+
		"\u0131D\3\2\2\2\u0132\u0133\7]\2\2\u0133F\3\2\2\2\u0134\u0135\7_\2\2\u0135"+
		"H\3\2\2\2\u0136\u0137\7}\2\2\u0137J\3\2\2\2\u0138\u0139\7\177\2\2\u0139"+
		"L\3\2\2\2\u013a\u013b\7.\2\2\u013bN\3\2\2\2\u013c\u013d\7?\2\2\u013d\u013e"+
		"\7?\2\2\u013eP\3\2\2\2\u013f\u0140\7-\2\2\u0140\u0141\7-\2\2\u0141R\3"+
		"\2\2\2\u0142\u0143\7/\2\2\u0143\u0144\7/\2\2\u0144T\3\2\2\2\u0145\u0146"+
		"\7?\2\2\u0146V\3\2\2\2\u0147\u0148\7-\2\2\u0148X\3\2\2\2\u0149\u014a\7"+
		"/\2\2\u014aZ\3\2\2\2\u014b\u014c\7#\2\2\u014c\\\3\2\2\2\u014d\u014e\7"+
		",\2\2\u014e^\3\2\2\2\u014f\u0150\7\61\2\2\u0150`\3\2\2\2\u0151\u0152\7"+
		"\61\2\2\u0152\u0153\7\61\2\2\u0153b\3\2\2\2\u0154\u0155\7\60\2\2\u0155"+
		"d\3\2\2\2\u0156\u0157\7/\2\2\u0157\u0158\7@\2\2\u0158f\3\2\2\2\u0159\u015a"+
		"\7>\2\2\u015ah\3\2\2\2\u015b\u015c\7@\2\2\u015cj\3\2\2\2\u015d\u015e\7"+
		"(\2\2\u015e\u015f\7(\2\2\u015fl\3\2\2\2\u0160\u0161\7~\2\2\u0161\u0162"+
		"\7~\2\2\u0162n\3\2\2\2\u0163\u0164\7~\2\2\u0164p\3\2\2\2\u0165\u0166\7"+
		"<\2\2\u0166r\3\2\2\2\u0167\u0168\7A\2\2\u0168t\3\2\2\2\u0169\u016a\t\2"+
		"\2\2\u016av\3\2\2\2\u016b\u016f\t\5\2\2\u016c\u016e\t\6\2\2\u016d\u016c"+
		"\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"x\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0176\t\7\2\2\u0173\u0175\t\6\2\2"+
		"\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177"+
		"\3\2\2\2\u0177z\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017b\t\b\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d|\3\2\2\2\u017e\u017f\7?\2\2\u017f\u0180\7d\2\2\u0180\u0181"+
		"\7g\2\2\u0181\u0182\7i\2\2\u0182\u0183\7k\2\2\u0183\u0184\7p\2\2\u0184"+
		"\u0188\3\2\2\2\u0185\u0187\13\2\2\2\u0186\u0185\3\2\2\2\u0187\u018a\3"+
		"\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018b\u018c\7?\2\2\u018c\u018d\7g\2\2\u018d\u018e\7p\2"+
		"\2\u018e\u0196\7f\2\2\u018f\u0191\7%\2\2\u0190\u0192\n\t\2\2\u0191\u0190"+
		"\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\3\2\2\2\u0195\u017e\3\2\2\2\u0195\u018f\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0198\b?\2\2\u0198~\3\2\2\2\u0199\u019a\t\n\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u019c\b@\2\2\u019c\u0080\3\2\2\2\13\2\u0085\u0089\u016f"+
		"\u0176\u017c\u0188\u0193\u0195\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}