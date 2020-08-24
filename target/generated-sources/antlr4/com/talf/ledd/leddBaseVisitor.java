// Generated from com\talf\ledd\ledd.g4 by ANTLR 4.5.1
package com.talf.ledd;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link leddVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class leddBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements leddVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStart(leddParser.StartContext ctx) { return visitChildren(ctx); }
}