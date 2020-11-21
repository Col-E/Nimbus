package me.coley.nimbus;

import me.coley.nimbus.net.NetContext;

/**
 * Interface to outline access to all services.
 *
 * @param <S>
 * 		Serialized intermediate type.
 *
 * @author Matt Coley
 */
public interface ServiceProvider<S> {
	/**
	 * Implementations of this function should point to a single instance of the context.
	 *
	 * @return Network context provided.
	 */
	NetContext<S> getNetContext();
}
