package me.coley.nimbus.net;

/**
 * Interface applied to classes that require access to network utilities.
 *
 * @param <S>
 * 		Serialized intermediate type.
 *
 * @author Matt Coley
 */
public interface NetEntity<S> {
	/**
	 * @return Parent network context.
	 */
	NetContext<S> getNetContext();
}
