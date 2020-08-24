// Generated from leddLexer.g4 by ANTLR 4.4
package com.talf.ledd;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class leddLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARBOL_BINARIO=1, LISTA_ENLAZADA=2, PILA=3, TABLA_HASH=4, PUSH=5, ADD=6, 
		PUT=7, IGUAL=8, END=9, PUNTO=10, L_PARENTESIS=11, R_PARENTESIS=12, LLAVE_INICIAL=13, 
		LLAVE_FINAL=14, NUMERO=15, WS=16, VARIABLE=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'"
	};
	public static final String[] ruleNames = {
		"ARBOL_BINARIO", "LISTA_ENLAZADA", "PILA", "TABLA_HASH", "PUSH", "ADD", 
		"PUT", "IGUAL", "END", "PUNTO", "L_PARENTESIS", "R_PARENTESIS", "LLAVE_INICIAL", 
		"LLAVE_FINAL", "NUMERO", "WS", "VARIABLE", "NameStartChar"
	};


	public leddLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "leddLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7e\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\bm\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\7\20~\n\20\f\20\16\20\u0081\13\20\3\21\6\21\u0084"+
		"\n\21\r\21\16\21\u0085\3\21\3\21\3\22\7\22\u008b\n\22\f\22\16\22\u008e"+
		"\13\22\3\23\5\23\u0091\n\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\3\2\6\3\2\62;\5\2"+
		"\13\f\17\17\"\"\4\2C\\c|\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801"+
		"\uf902\ufdd1\ufdf2\uffff\u0096\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3\'\3\2\2\2\5\65\3\2\2\2\7D\3\2\2\2"+
		"\tI\3\2\2\2\13\\\3\2\2\2\rd\3\2\2\2\17l\3\2\2\2\21n\3\2\2\2\23p\3\2\2"+
		"\2\25r\3\2\2\2\27t\3\2\2\2\31v\3\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37\177"+
		"\3\2\2\2!\u0083\3\2\2\2#\u008c\3\2\2\2%\u0090\3\2\2\2\'(\7C\2\2()\7T\2"+
		"\2)*\7D\2\2*+\7Q\2\2+,\7N\2\2,-\7a\2\2-.\7D\2\2./\7K\2\2/\60\7P\2\2\60"+
		"\61\7C\2\2\61\62\7T\2\2\62\63\7K\2\2\63\64\7Q\2\2\64\4\3\2\2\2\65\66\7"+
		"N\2\2\66\67\7K\2\2\678\7U\2\289\7V\2\29:\7C\2\2:;\7a\2\2;<\7G\2\2<=\7"+
		"P\2\2=>\7N\2\2>?\7C\2\2?@\7\\\2\2@A\7C\2\2AB\7F\2\2BC\7C\2\2C\6\3\2\2"+
		"\2DE\7R\2\2EF\7K\2\2FG\7N\2\2GH\7C\2\2H\b\3\2\2\2IJ\7V\2\2JK\7C\2\2KL"+
		"\7D\2\2LM\7N\2\2MN\7C\2\2NO\7a\2\2OP\7J\2\2PQ\7C\2\2QR\7U\2\2RS\7J\2\2"+
		"S\n\3\2\2\2TU\7R\2\2UV\7W\2\2VW\7U\2\2W]\7J\2\2XY\7r\2\2YZ\7w\2\2Z[\7"+
		"u\2\2[]\7j\2\2\\T\3\2\2\2\\X\3\2\2\2]\f\3\2\2\2^_\7C\2\2_`\7F\2\2`e\7"+
		"F\2\2ab\7c\2\2bc\7f\2\2ce\7f\2\2d^\3\2\2\2da\3\2\2\2e\16\3\2\2\2fg\7R"+
		"\2\2gh\7W\2\2hm\7V\2\2ij\7r\2\2jk\7w\2\2km\7v\2\2lf\3\2\2\2li\3\2\2\2"+
		"m\20\3\2\2\2no\7?\2\2o\22\3\2\2\2pq\7=\2\2q\24\3\2\2\2rs\7\60\2\2s\26"+
		"\3\2\2\2tu\7*\2\2u\30\3\2\2\2vw\7+\2\2w\32\3\2\2\2xy\7}\2\2y\34\3\2\2"+
		"\2z{\7\177\2\2{\36\3\2\2\2|~\t\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080 \3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\t"+
		"\3\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\21\2\2\u0088\"\3\2\2"+
		"\2\u0089\u008b\t\4\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d$\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0091\t\5\2\2\u0090\u008f\3\2\2\2\u0091&\3\2\2\2\n\2\\dl\177\u0085\u008c"+
		"\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}