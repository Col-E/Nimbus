package me.coley.nimbus.topic;

import me.coley.nimbus.Nimbus;
import me.coley.nimbus.discovery.NimbusIDHeader;
import org.jgroups.BytesMessage;
import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.Receiver;

import java.util.function.Consumer;

/**
 * Topics publish and subscribe to messages of a specific data type.
 *
 * @param <T>
 * 		Topic data type.
 *
 * @author Matt Coley
 */
public class Topic<T> implements Receiver {
	private final Nimbus nimbus;
	private final JChannel channel;
	private final Class<T> type;
	private final NimbusIDHeader header;
	private Consumer<T> listener;
	// TODO: Cache read and written responses
	//  - JChannels should handle resending failed messages
	//  - Can be used to catch up newer JGroup members with old content

	Topic(Nimbus nimbus, JChannel channel, Class<T> type) {
		this.nimbus = nimbus;
		this.channel = channel;
		this.type = type;
		this.header = new NimbusIDHeader().withId(nimbus.getIdentity());
		channel.setReceiver(this);
	}

	@Override
	public void receive(Message msg) {
		// Sanity check, ensure a nimbus entity sent the message
		NimbusIDHeader idHeader = msg.getHeader(NimbusIDHeader.MAGIC_ID);
		if (idHeader == null)
			return;
		// Skip self-sent messages unless instructed otherwise
		if (idHeader.getId().equals(header.getId()) &&
				!nimbus.getNetConfig().doHandleSelfPublishedMessages())
			return;

		// TODO: Cache model instead of direct call like below
		//  - Possibly distributed with: https://mvnrepository.com/artifact/com.github.ben-manes.caffeine/caffeine

		// Deserialize content
		byte[] data = msg.getArray();
		T instance = nimbus.getSerialization().deserializeObject(data, type);
		// Notify listener
		if (listener != null)
			listener.accept(instance);
	}

	/**
	 * @param data
	 * 		Data of the topic's type to publish.
	 *
	 * @throws NullPointerException
	 * 		When the passed data is {@code null}.
	 * @throws IllegalStateException
	 * 		When the topic is closed.
	 */
	public void publish(T data) throws Exception {
		byte[] content = nimbus.getSerialization().serializeObject(data);
		Message message = new BytesMessage(null, content);
		message.putHeader(NimbusIDHeader.MAGIC_ID, header);
		channel.send(message);
	}

	/**
	 * Opens the topic, allowing data to be published and listened to.
	 *
	 * @throws IllegalStateException
	 * 		When the topic is closed.
	 */
	public void open() throws Exception {
		channel.connect(type.getName());
	}

	/**
	 * Closes the topic.
	 */
	public void close() {
		channel.disconnect();
	}

	/**
	 * @return Listener that is used to interact with received data messages.
	 */
	public Consumer<T> getListener() {
		return listener;
	}

	/**
	 * @param listener
	 * 		New listener that is used to interact with received data messages.
	 */
	public void setListener(Consumer<T> listener) {
		this.listener = listener;
	}

	/**
	 * @return Topic data type.
	 */
	public Class<T> getType() {
		return type;
	}

	/**
	 * @return {@code true} when the topic is closed.
	 */
	public boolean isClosed() {
		return channel.isClosed();
	}
}
