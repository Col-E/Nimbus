package me.coley.nimbus.net;

/**
 * Interface applied to classes that require access to network utilities.
 *
 * @author Matt Coley
 */
public interface NetEntity {
	/**
	 * @return Parent network context.
	 */
	NetContext getNetContext();
}
