// Generated from ledd.g4 by ANTLR 4.4
package com.talf.ledd;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link leddParser}.
 */
public interface leddListener extends ParseTreeListener {
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
}