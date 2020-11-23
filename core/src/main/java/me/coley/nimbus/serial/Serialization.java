package me.coley.nimbus.serial;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import me.coley.nimbus.NimbusID;

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
		registerInternalTypes();
	}

	private void registerInternalTypes() {
		kryo.addDefaultSerializer(NimbusID.class, new Serializer<NimbusID>() {
			@Override
			public void write(Kryo kryo, Output output, NimbusID object) {
				output.writeByte(object.getNetworkAddress().length);
				output.writeBytes(object.getNetworkAddress());
				output.writeInt(object.getApplicationId());
			}

			@Override
			@SuppressWarnings("ResultOfMethodCallIgnored")
			public NimbusID read(Kryo kryo, Input input, Class<? extends NimbusID> type) {
				int len = input.readByte();
				byte[] address = new byte[len];
				input.read(address);
				int id = input.readInt();
				return new NimbusID(address, id);
			}
		});
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
