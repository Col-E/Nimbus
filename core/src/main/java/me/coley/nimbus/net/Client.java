package me.coley.nimbus.net;

import me.coley.nimbus.net.discovery.Discovery;

/**
 * Network participant client.
 *
 * @author Matt Coley
 */
public class Client implements NetEntity {
	private final NetContext netContext;
	private final String address;
	// TODO: Publish-Subscribe with cache
	//  Cache Reading
	//  - Cache#peek() - Peek latest value
	//  - Cache#pop()  - Pop latest value

	public Client(NetContext netContext, String address) {
		this.netContext = netContext;
		this.address = address;
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
	 * @return The address of the client on the local network.
	 * Not directly accessible if {@link #isLocal()} is {@code false}.
	 */
	public String getAddress() {
		return address;
	}

	@Override
	public NetContext getNetContext() {
		return netContext;
	}
}
