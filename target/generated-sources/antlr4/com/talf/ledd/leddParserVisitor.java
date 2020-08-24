// Generated from com\talf\ledd\leddParser.g4 by ANTLR 4.5.1
package com.talf.ledd;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link leddParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface leddParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link leddParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(leddParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link leddParser#sentenciaInicial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaInicial(leddParser.SentenciaInicialContext ctx);
	/**
	 * Visit a parse tree produced by {@link leddParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(leddParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link leddParser#metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo(leddParser.MetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link leddParser#estructuraDeDatos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraDeDatos(leddParser.EstructuraDeDatosContext ctx);
	/**
	 * Visit a parse tree produced by {@link leddParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(leddParser.NumContext ctx);
}