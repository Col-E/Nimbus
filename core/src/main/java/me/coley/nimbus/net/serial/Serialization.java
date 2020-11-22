package me.coley.nimbus.net.serial;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

import java.io.ByteArrayOutputStream;

/**
 * Serialization services backed by {@link Kryo}.
 *
 * @author Matt Coley
 */
public class Serialization {
	private final Kryo kryo = new Kryo();

	/**
	 * Create the serialization service.
	 */
	public Serialization() {
		// Have kryo automatically register types for us
		kryo.setRegistrationRequired(false);
	}

	/**
	 * Add a custom serializer for the given type.
	 *
	 * @param type
	 * 		Type to support serialization of. This should be the concrete implementation of the class <i>(IE: ArrayList instead of List)</i>.
	 * @param serializer
	 * 		The serializer to add.
	 * @param <T>
	 * 		Intended object type.
	 */
	public <T> void addTypeConverter(Class<T> type, Serializer<T> serializer) {
		kryo.register(type, serializer);
	}

	/**
	 * Convert some serialized data into an object instance.
	 *
	 * @param input
	 * 		Input serialized data.
	 * @param type
	 * 		Type to deserialize into.
	 * @param <T>
	 * 		Intended object type.
	 *
	 * @return Object value from deserialized data.
	 */
	public <T> T deserializeObject(byte[] input, Class<T> type) {
		return kryo.readObject(new Input(input), type);
	}

	/**
	 * Serialize some object.
	 *
	 * @param object
	 * 		Value to serialize.
	 *
	 * @return Serialized representation of the given value.
	 */
	public byte[] serializeObject(Object object) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		Output output = new Output(baos);
		kryo.writeObject(output, object);
		output.close();
		return baos.toByteArray();
	}
}
