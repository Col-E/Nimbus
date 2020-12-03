package me.coley.nimbus.config;

import java.util.HashMap;

/**
 * Network related configuration values.
 *
 * @author Matt Coley
 */
public class NetConfig extends HashMap<String, Object> {
	private static final String DO_USE_IPV6 = "ipv6";
	private static final String DO_HANDLE_SELF_PUBLISHED = "handle-self-published";

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

	/**
	 * Enables handling of messages that we published ourselves if subscribed to the topic.
	 *
	 * @param value
	 * 		New handling value.
	 */
	public void setDoHandleSelfPublishedMessages(boolean value) {
		put(DO_HANDLE_SELF_PUBLISHED, value);
	}

	/**
	 * @return {@code true} when we should handle messages we published ourselves if subscribed to the topic.
	 */
	public boolean doHandleSelfPublishedMessages() {
		return (boolean) getOrDefault(DO_HANDLE_SELF_PUBLISHED, false);
	}


}
