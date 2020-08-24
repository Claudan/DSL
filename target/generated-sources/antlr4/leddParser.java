// Generated from leddParser.g4 by ANTLR 4.4

	import model.ArbolBinario;
	import model.ListaEnlazada;
	import model.Pila;

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


		
		ArbolBinario  ab    = null;
		ListaEnlazada ll    = null; 
		Pila 		  p 	= null;
		/*TablaHash    th    = null;   */
		
		int valorTemporal;
		String estructura;
		String metodo;
		
		private void insertaEnEstructura( int valor ) {
	    	if(estructura == "ARBOL_BINARIO"){
				if(metodo == "ADD"){
		    		ab.add(valor);
		    	}	
			}
			else if(estructura == "LISTA_ENLAZADA"){
				if(metodo == "ADD"){
		    		ll.add(valor);
		    	}
			}
			else if(estructura == "PILA"){
				if(metodo == "PUSH"){
		    		p.push(valor);
		    	}
			}
			else if(estructura == "TABLA_HASH"){
					
			}
		} 
		private void generaGrafico( ){
			if(estructura == "ARBOL_BINARIO"){
				ab.generaGrafico();
			}
			else if(estructura == "LISTA_ENLAZADA"){
				ll.generaGrafico();
			}
			else if(estructura == "PILA"){
				p.generaGrafico();		
			}
			else if(estructura == "TABLA_HASH"){
					
			}
		} 

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
			 generaGrafico(); 
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
			setState(23); match(VARIABLE);
			setState(24); match(IGUAL);
			setState(25); estructuraDeDatos();
			setState(26); match(END);
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
		public NumContext refNum;
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
			setState(28); match(VARIABLE);
			setState(29); match(PUNTO);
			setState(30); metodo();
			setState(31); match(L_PARENTESIS);
			setState(32); ((SentenciaContext)_localctx).refNum = num();
			setState(33); match(R_PARENTESIS);
			setState(34); match(END);
			 
									insertaEnEstructura(((SentenciaContext)_localctx).refNum.valor);
								
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
		public String valor;
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
		try {
			setState(43);
			switch (_input.LA(1)) {
			case PUSH:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); match(PUSH);
				 metodo = "PUSH"; 
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); match(ADD);
				 metodo = "ADD";  
				}
				break;
			case PUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(41); match(PUT);
				 metodo = "PUT";  
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
		try {
			setState(53);
			switch (_input.LA(1)) {
			case ARBOL_BINARIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); match(ARBOL_BINARIO);
				 ab = new ArbolBinario() ; estructura = "ARBOL_BINARIO"; 
				}
				break;
			case LISTA_ENLAZADA:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); match(LISTA_ENLAZADA);
				 ll = new ListaEnlazada(); estructura = "LISTA_ENLAZADA";   
				}
				break;
			case PILA:
				enterOuterAlt(_localctx, 3);
				{
				setState(49); match(PILA);
				 p = new Pila()          ; estructura = "PILA"; 
				}
				break;
			case TABLA_HASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(51); match(TABLA_HASH);
				 estructura = "TABLA_HASH"; 
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

	public static class NumContext extends ParserRuleContext {
		public int valor;
		public Token NUMERO;
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
			setState(55); ((NumContext)_localctx).NUMERO = match(NUMERO);
			((NumContext)_localctx).valor =  Integer.parseInt((((NumContext)_localctx).NUMERO!=null?((NumContext)_localctx).NUMERO.getText():null));
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5.\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\68\n\6\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2<\2\16\3\2\2\2\4\31\3\2"+
		"\2\2\6\36\3\2\2\2\b-\3\2\2\2\n\67\3\2\2\2\f9\3\2\2\2\16\17\7\17\2\2\17"+
		"\23\5\4\3\2\20\22\5\6\4\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23"+
		"\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27\7\20\2\2\27\30\b\2\1\2\30"+
		"\3\3\2\2\2\31\32\7\23\2\2\32\33\7\n\2\2\33\34\5\n\6\2\34\35\7\13\2\2\35"+
		"\5\3\2\2\2\36\37\7\23\2\2\37 \7\f\2\2 !\5\b\5\2!\"\7\r\2\2\"#\5\f\7\2"+
		"#$\7\16\2\2$%\7\13\2\2%&\b\4\1\2&\7\3\2\2\2\'(\7\7\2\2(.\b\5\1\2)*\7\b"+
		"\2\2*.\b\5\1\2+,\7\t\2\2,.\b\5\1\2-\'\3\2\2\2-)\3\2\2\2-+\3\2\2\2.\t\3"+
		"\2\2\2/\60\7\3\2\2\608\b\6\1\2\61\62\7\4\2\2\628\b\6\1\2\63\64\7\5\2\2"+
		"\648\b\6\1\2\65\66\7\6\2\2\668\b\6\1\2\67/\3\2\2\2\67\61\3\2\2\2\67\63"+
		"\3\2\2\2\67\65\3\2\2\28\13\3\2\2\29:\7\21\2\2:;\b\7\1\2;\r\3\2\2\2\5\23"+
		"-\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}