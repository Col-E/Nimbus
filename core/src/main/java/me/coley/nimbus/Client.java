package me.coley.nimbus;

import me.coley.nimbus.discovery.Discovery;

/**
 * Network participant client.
 *
 * @author Matt Coley
 */
public class Client implements NimbusEntity {
	private final Nimbus nimbus;
	private final NimbusID identifier;
	// TODO: Publish-Subscribe with cache
	//  Cache Reading
	//  - Cache#peek() - Peek latest value
	//  - Cache#pop()  - Pop latest value

	public Client(Nimbus nimbus, NimbusID identifier) {
		this.nimbus = nimbus;
		this.identifier = identifier;
	}

	/**
	 * @return New local network client neighbor discovery.
	 */
	public Discovery createDiscovery() {
		return new Discovery(this);
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
