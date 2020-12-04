package me.coley.nimbus.topic;

import me.coley.nimbus.Client;
import org.jgroups.JChannel;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Topic management.
 *
 * @author Matt Coley
 */
public class TopicManager {
	private final Map<String, Topic<?>> topics = new ConcurrentHashMap<>();
	private final Map<String, Class<?>> topicTypes = new ConcurrentHashMap<>();
	private final Client client;

	/**
	 * Creates a topic manager for the given client.
	 *
	 * @param client
	 * 		The client this will manage topics for.
	 */
	public TopicManager(Client client) {
		if (client.getTopicManager() != null)
			throw new IllegalStateException("The given client[" + client.toString() + "] already has a topic manager!");
		this.client = client;
	}

	/**
	 * Get the topic associated with the given type.
	 *
	 * @param topicType
	 * 		Topic data type.
	 * @param <T>
	 * 		Inferred topic data type.
	 *
	 * @return Topic instance for the given type.
	 */
	@SuppressWarnings("unchecked")
	public <T> Topic<T> getTopic(Class<T> topicType) {
		return (Topic<T>) topics.get(topicType.getName());
	}

	/**
	 * Check if we are active in a given topic.
	 *
	 * @param topicType
	 * 		Topic data type.
	 *
	 * @return {@code true} if the client is active in the given topic.
	 */
	public boolean hasTopic(Class<?> topicType) {
		return getTopic(topicType) != null;
	}

	/**
	 * @return Collection of data types of topics the client is active in.
	 */
	public Collection<Class<?>> getTopicTypes() {
		return topicTypes.values();
	}

	/**
	 * @return Collection of topics the client is active in.
	 */
	public Collection<Topic<?>> getTopics() {
		return topics.values();
	}

	/**
	 * Close a topic of a given type and remove it from the manager.
	 *
	 * @param topicType
	 * 		Topic data type to remove.
	 */
	public void removeTopic(Class<?> topicType) {
		Topic<?> topic = getTopic(topicType);
		if (topic != null) {
			topic.close();
			// Update maps
			String name = topicType.getName();
			topics.remove(name);
			topicTypes.remove(name);
		}
	}

	/**
	 * Create a topic. If the topic already has been made then the existing instance is returned.
	 *
	 * @param topicType
	 * 		Topic data type.
	 * @param <T>
	 * 		Inferred topic data type.
	 *
	 * @return Topic instance.
	 *
	 * @throws Exception
	 * 		When the topic cannot be created.
	 */
	public <T> Topic<T> createTopic(Class<T> topicType) throws Exception {
		// Check if already exists
		Topic<T> topic = getTopic(topicType);
		if (topic != null)
			return topic;
		// Create and update maps
		topic = new Topic<>(client.getNimbus(), new JChannel(), topicType);
		String name = topicType.getName();
		topicTypes.put(name, topicType);
		topics.put(name, topic);
		// TODO: Check if users want to automatically open topics
		return topic;
	}
}
