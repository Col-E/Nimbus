package me.coley.nimbus;

import me.coley.nimbus.discovery.Discovery;
import me.coley.nimbus.discovery.NimbusID;
import me.coley.nimbus.topic.TopicManager;

/**
 * Network participant client.
 *
 * @author Matt Coley
 */
public class Client implements NimbusEntity {
	private final Nimbus nimbus;
	private final NimbusID identifier;
	private final TopicManager topicManager;

	/**
	 * Create a client.
	 *
	 * @param nimbus
	 * 		Parent nimbus instance.
	 * @param identifier
	 * 		Identifier of the nimbus instance.
	 */
	public Client(Nimbus nimbus, NimbusID identifier) {
		this.nimbus = nimbus;
		this.identifier = identifier;
		this.topicManager = new TopicManager(this);
	}

	/**
	 * @return New local network client neighbor discovery.
	 */
	public Discovery createDiscovery() {
		return new Discovery(this);
	}

	/**
	 * @return Tracked topics.
	 */
	public TopicManager getTopicManager() {
		return topicManager;
	}

	/**
	 * @return {@code true} if the client is on the local network.
	 * {@code false} if it belongs to a non-local/external network.
	 */
	public boolean isLocal() {
		// The assumption that any base client is on the local network.
		// Remote clients will be sub-typed to override this, along with other functionality.
		return true;
	}

	/**
	 * @return The parent nimbus instance identifier.
	 * Allows clients to distinguish between network addresses and application instances.
	 */
	public NimbusID getIdentifier() {
		return identifier;
	}

	@Override
	public Nimbus getNimbus() {
		return nimbus;
	}
}
