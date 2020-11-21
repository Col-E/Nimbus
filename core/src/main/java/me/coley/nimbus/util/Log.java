package me.coley.nimbus.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logging constants.
 *
 * @author Matt Coley
 */
public class Log {
	private static final String PREFIX = "Nimbus:";
	/** Utility logging */
	public static final Logger NETWORKING = LoggerFactory.getLogger(PREFIX + "Network");
	/** Serialization logging */
	public static final Logger SERIALIZATION = LoggerFactory.getLogger(PREFIX + "Serial");
	// TODO: Insert usage into code-base
	//  - Error logging obviously
	//  - Info logger to track normal behavior (Seen packet P at time T)
	//  - Certain categories need to be more verbose than others (net > serial)
}
