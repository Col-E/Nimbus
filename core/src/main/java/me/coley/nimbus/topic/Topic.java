package me.coley.nimbus.topic;

import me.coley.nimbus.Nimbus;
import me.coley.nimbus.discovery.NimbusIDHeader;
import org.jgroups.BytesMessage;
import org.jgroups.ChannelListener;
import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.Receiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

/**
 * Topics publish and subscribe to messages of a specific data type.
 *
 * @param <T>
 * 		Topic data type.
 *
 * @author Matt Coley
 */
public class Topic<T> implements Receiver, ChannelListener {
	private static final Logger logger = LoggerFactory.getLogger(Topic.class);
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
		channel.addChannelListener(this);
	}

	@Override
	public void receive(Message msg) {
		// Sanity check, ensure a nimbus entity sent the message
		NimbusIDHeader idHeader = msg.getHeader(NimbusIDHeader.MAGIC_ID);
		if (idHeader == null) {
			logger.debug("Topic '{}' skipped a message since ID header was missing", getTypeName());
			return;
		}
		// Skip self-sent messages unless instructed otherwise
		if (idHeader.getId().equals(header.getId()) &&
				!nimbus.getNetConfig().doHandleSelfPublishedMessages()) {
			return;
		}
		// Deserialize content
		byte[] data = msg.getArray();
		T instance = nimbus.getSerialization().deserializeObject(data, type);
		if (instance == null) {
			logger.warn("Topic '{}' received a message, but deserialized it to NULL", getTypeName());
		} else {
			logger.trace("Topic '{}' received a message: {}", getTypeName(), data);
			// Notify listener
			if (listener != null) {
				listener.accept(instance);
			}
		}
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
		if (data == null) {
			logger.warn("Topic '{}' tried to publish NULL!", getTypeName());
			return;
		} else if (!channel.isOpen()) {
			logger.warn("Topic '{}' tried to publish while the channel was not opened! State={}",
					getTypeName(), channel.getState());
			return;
		}
		byte[] content = nimbus.getSerialization().serializeObject(data);
		Message message = new BytesMessage(null, content);
		message.putHeader(NimbusIDHeader.MAGIC_ID, header);
		channel.send(message);
		logger.trace("Topic '{}' sent a message: {}", getTypeName(), data.toString());
	}

	@Override
	public void channelConnected(JChannel channel) {
		logger.debug("Topic '{}' connected", getTypeName());
	}

	@Override
	public void channelDisconnected(JChannel channel) {
		logger.debug("Topic '{}' disconnected", getTypeName());
	}

	@Override
	public void channelClosed(JChannel channel) {
		logger.debug("Topic '{}' closed", getTypeName());
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
	 * Sets the listener that will be fed incoming messages of the topic's type.
	 *
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
	 * @return Topic data type as a string.
	 */
	public String getTypeName() {
		return getType().getName();
	}

	/**
	 * @return {@code true} when the topic is closed.
	 */
	public boolean isClosed() {
		return channel.isClosed();
	}
}
