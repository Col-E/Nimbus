package me.coley.nimbus.net;

import java.util.HashMap;

/**
 * Network related configuration values.
 *
 * @author Matt Coley
 */
public class NetConfig extends HashMap<String, Object> {
	private static final String DO_USE_IPV6 = "ipv6";

	/**
	 * Enables IPv6 usage.
	 *
	 * @param value
	 * 		New IPv6 usage value.
	 */
	public void setDoUseIpv6(boolean value) {
		put(DO_USE_IPV6, value);
	}

	/**
	 * @return {@code true} when IPv6 usage is enabled.
	 */
	public boolean doUseIpv6() {
		return (boolean) getOrDefault(DO_USE_IPV6, false);
	}
}
