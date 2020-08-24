// Generated from leddParser.g4 by ANTLR 4.4

	import model.ArbolBinario;
	import model.ListaEnlazada;
	import model.Pila;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link leddParser}.
 */
public interface leddParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link leddParser#sentenciaInicial}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaInicial(@NotNull leddParser.SentenciaInicialContext ctx);
	/**
	 * Exit a parse tree produced by {@link leddParser#sentenciaInicial}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaInicial(@NotNull leddParser.SentenciaInicialContext ctx);
	/**
	 * Enter a parse tree produced by {@link leddParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(@NotNull leddParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link leddParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(@NotNull leddParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link leddParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull leddParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link leddParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull leddParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link leddParser#estructuraDeDatos}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraDeDatos(@NotNull leddParser.EstructuraDeDatosContext ctx);
	/**
	 * Exit a parse tree produced by {@link leddParser#estructuraDeDatos}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraDeDatos(@NotNull leddParser.EstructuraDeDatosContext ctx);
	/**
	 * Enter a parse tree produced by {@link leddParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(@NotNull leddParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link leddParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(@NotNull leddParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link leddParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(@NotNull leddParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link leddParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(@NotNull leddParser.SentenciaContext ctx);
}