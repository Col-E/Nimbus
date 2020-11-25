package me.coley.nimbus.serial;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import me.coley.nimbus.NimbusID;
import me.coley.nimbus.config.SerialConfig;

import java.io.ByteArrayOutputStream;

/**
 * Serialization services backed by {@link Kryo}.
 *
 * @author Matt Coley
 */
public class Serialization {
	private final Kryo kryo;

	/**
	 * Create the serialization service.
	 *
	 * @param config
	 * 		Serialization config.
	 */
	public Serialization(SerialConfig config) {
		kryo = createKryo(config);
		// Have kryo automatically register types for us
		kryo.setRegistrationRequired(false);
		// Register nimbus internal types that need custom serialization
		registerInternalTypes();
	}

	/**
	 * @return Kryo instance backing the serialization.
	 */
	public Kryo getKryo() {
		return kryo;
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

	private static Kryo createKryo(SerialConfig config) {
		boolean indexed = config.doUseAnnotatedIndices();
		return new Kryo() {
			@Override
			@SuppressWarnings("rawtypes")
			protected Serializer newDefaultSerializer(Class type) {
				if (indexed)
					return new IndexedFieldSerializer(this, type);
				else
					return super.newDefaultSerializer(type);
			}
		};
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
}
