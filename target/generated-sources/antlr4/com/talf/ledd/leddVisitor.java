// Generated from com\talf\ledd\ledd.g4 by ANTLR 4.5.1
package com.talf.ledd;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link leddParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface leddVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link leddParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(leddParser.StartContext ctx);
}