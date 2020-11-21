package me.coley.nimbus.net;

import me.coley.nimbus.net.serial.ObjectReader;
import me.coley.nimbus.net.serial.ObjectWriter;
import me.coley.nimbus.net.serial.SerialEntity;
import me.coley.nimbus.net.serial.NimbusSerializable;
import me.coley.nimbus.util.NetworkUtils;

import java.io.IOException;
import java.util.Optional;

/**
 * Interface to outline access to network utilities and factory methods.
 *
 * @param <S>
 * 		Serialized intermediate type.
 *
 * @author Matt Coley
 */
public interface NetContext<S> extends NetEntity<S>, SerialEntity<S> {
	/**
	 * @return New object reader.
	 */
	ObjectReader<S> createObjectReader();

	/**
	 * @return New object writer.
	 */
	ObjectWriter<S> createObjectWriter();

	/**
	 * Convert some serialized data into an object instance represented by the serialized data.
	 *
	 * @param input
	 * 		Input serialized data.
	 * @param type
	 * 		Type to deserialize into.
	 * @param <T>
	 * 		Intended object type.
	 *
	 * @return Object value from deserialized data.
	 *
	 * @throws IOException
	 * 		When no deserializer instance is associated with the given type,
	 * 		or when the value cannot be deserialized.
	 */
	default <T extends NimbusSerializable> T deserializeObject(S input, Class<T> type) throws IOException {
		T object = getTypeFactory().create(type);
		ObjectReader<S> reader = createObjectReader();
		reader.read(input);
		object.read(reader);
		return object;
	}

	/**
	 * Convert some serializable object into a serialized type.
	 *
	 * @param object
	 * 		Value to serialize.
	 *
	 * @return Serialized data representing the given value.
	 *
	 * @throws IOException
	 * 		When the value cannot be serialized.
	 */
	default S serializeObject(NimbusSerializable object) throws IOException {
		ObjectWriter<S> writer = createObjectWriter();
		object.write(writer);
		return writer.generate();
	}

	/**
	 * Creates a client configured with the current network context.
	 * It represents the local device.
	 *
	 * @return Client representing local self.
	 *
	 * @throws IOException
	 * 		When the local address could not be found.
	 */
	default Client<S> createClient() throws IOException {
		// Get address, IPv4/IPv6 based on net config.
		Optional<String> address = getNetConfig().doUseIpv6() ?
				NetworkUtils.getLocalIPv6Host() : NetworkUtils.getLocalIPv4Host();
		// Create client representing local self if address found.
		if (address.isPresent()) {
			return new Client<>(this, address.get());
		} else {
			throw new IOException("Failed to get local address");
		}
	}

	/**
	 * @return Network config.
	 */
	NetConfig getNetConfig();

	@Override
	default NetContext<S> getNetContext() {
		return this;
	}

}
