// Generated from leddParser.g4 by ANTLR 4.4
package com.talf.ledd;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class leddParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=6, LLAVE_INICIAL=13, L_PARENTESIS=11, TABLA_HASH=4, IGUAL=8, PILA=3, 
		PUNTO=10, ARBOL_BINARIO=1, PUT=7, R_PARENTESIS=12, LISTA_ENLAZADA=2, VARIABLE=17, 
		NUMERO=15, LLAVE_FINAL=14, END=9, WS=16, PUSH=5;
	public static final String[] tokenNames = {
		"<INVALID>", "'ARBOL_BINARIO'", "'LISTA_ENLAZADA'", "'PILA'", "'TABLA_HASH'", 
		"PUSH", "ADD", "PUT", "'='", "';'", "'.'", "'('", "')'", "'{'", "'}'", 
		"NUMERO", "WS", "VARIABLE"
	};
	public static final int
		RULE_start = 0, RULE_sentenciaInicial = 1, RULE_sentencia = 2, RULE_metodo = 3, 
		RULE_estructuraDeDatos = 4, RULE_num = 5;
	public static final String[] ruleNames = {
		"start", "sentenciaInicial", "sentencia", "metodo", "estructuraDeDatos", 
		"num"
	};

	@Override
	public String getGrammarFileName() { return "leddParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public leddParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public TerminalNode LLAVE_INICIAL() { return getToken(leddParser.LLAVE_INICIAL, 0); }
		public SentenciaInicialContext sentenciaInicial() {
			return getRuleContext(SentenciaInicialContext.class,0);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode LLAVE_FINAL() { return getToken(leddParser.LLAVE_FINAL, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leddParserListener ) ((leddParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leddParserListener ) ((leddParserListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); match(LLAVE_INICIAL);
			setState(13); sentenciaInicial();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABLE) {
				{
				{
				setState(14); sentencia();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20); match(LLAVE_FINAL);
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

	public static class SentenciaInicialContext extends ParserRuleContext {
		public EstructuraDeDatosContext estructuraDeDatos() {
			return getRuleContext(EstructuraDeDatosContext.class,0);
		}
		public TerminalNode END() { return getToken(leddParser.END, 0); }
		public TerminalNode VARIABLE() { return getToken(leddParser.VARIABLE, 0); }
		public TerminalNode IGUAL() { return getToken(leddParser.IGUAL, 0); }
		public SentenciaInicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaInicial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leddParserListener ) ((leddParserListener)listener).enterSentenciaInicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leddParserListener ) ((leddParserListener)listener).exitSentenciaInicial(this);
		}
	}

	public final SentenciaInicialContext sentenciaInicial() throws RecognitionException {
		SentenciaInicialContext _localctx = new SentenciaInicialContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentenciaInicial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(VARIABLE);
			setState(23); match(IGUAL);
			setState(24); estructuraDeDatos();
			setState(25); match(END);
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

	public static class SentenciaContext extends ParserRuleContext {
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public TerminalNode R_PARENTESIS() { return getToken(leddParser.R_PARENTESIS, 0); }
		public TerminalNode PUNTO() { return getToken(leddParser.PUNTO, 0); }
		public TerminalNode END() { return getToken(leddParser.END, 0); }
		public TerminalNode VARIABLE() { return getToken(leddParser.VARIABLE, 0); }
		public TerminalNode L_PARENTESIS() { return getToken(leddParser.L_PARENTESIS, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leddParserListener ) ((leddParserListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leddParserListener ) ((leddParserListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); match(VARIABLE);
			setState(28); match(PUNTO);
			setState(29); metodo();
			setState(30); match(L_PARENTESIS);
			setState(31); num();
			setState(32); match(R_PARENTESIS);
			setState(33); match(END);
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

	public static class MetodoContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(leddParser.PUSH, 0); }
		public TerminalNode ADD() { return getToken(leddParser.ADD, 0); }
		public TerminalNode PUT() { return getToken(leddParser.PUT, 0); }
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leddParserListener ) ((leddParserListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leddParserListener ) ((leddParserListener)listener).exitMetodo(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUSH) | (1L << ADD) | (1L << PUT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class EstructuraDeDatosContext extends ParserRuleContext {
		public TerminalNode LISTA_ENLAZADA() { return getToken(leddParser.LISTA_ENLAZADA, 0); }
		public TerminalNode TABLA_HASH() { return getToken(leddParser.TABLA_HASH, 0); }
		public TerminalNode PILA() { return getToken(leddParser.PILA, 0); }
		public TerminalNode ARBOL_BINARIO() { return getToken(leddParser.ARBOL_BINARIO, 0); }
		public EstructuraDeDatosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuraDeDatos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leddParserListener ) ((leddParserListener)listener).enterEstructuraDeDatos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leddParserListener ) ((leddParserListener)listener).exitEstructuraDeDatos(this);
		}
	}

	public final EstructuraDeDatosContext estructuraDeDatos() throws RecognitionException {
		EstructuraDeDatosContext _localctx = new EstructuraDeDatosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_estructuraDeDatos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARBOL_BINARIO) | (1L << LISTA_ENLAZADA) | (1L << PILA) | (1L << TABLA_HASH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(leddParser.NUMERO, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leddParserListener ) ((leddParserListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leddParserListener ) ((leddParserListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(NUMERO);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\4\3\2\7\t\3\2\3\6&\2\16\3"+
		"\2\2\2\4\30\3\2\2\2\6\35\3\2\2\2\b%\3\2\2\2\n\'\3\2\2\2\f)\3\2\2\2\16"+
		"\17\7\17\2\2\17\23\5\4\3\2\20\22\5\6\4\2\21\20\3\2\2\2\22\25\3\2\2\2\23"+
		"\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27\7\20\2\2\27"+
		"\3\3\2\2\2\30\31\7\23\2\2\31\32\7\n\2\2\32\33\5\n\6\2\33\34\7\13\2\2\34"+
		"\5\3\2\2\2\35\36\7\23\2\2\36\37\7\f\2\2\37 \5\b\5\2 !\7\r\2\2!\"\5\f\7"+
		"\2\"#\7\16\2\2#$\7\13\2\2$\7\3\2\2\2%&\t\2\2\2&\t\3\2\2\2\'(\t\3\2\2("+
		"\13\3\2\2\2)*\7\21\2\2*\r\3\2\2\2\3\23";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}