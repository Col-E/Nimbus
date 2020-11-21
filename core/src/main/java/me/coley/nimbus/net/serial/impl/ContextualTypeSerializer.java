package me.coley.nimbus.net.serial.impl;

import me.coley.nimbus.net.NetContext;
import me.coley.nimbus.net.NetEntity;
import me.coley.nimbus.net.serial.NimbusSerializable;
import me.coley.nimbus.net.serial.TypeSerializer;

import java.io.IOException;
import java.util.function.Supplier;

/**
 * Basic implementation of {@link TypeSerializer} that uses a {@link NetContext} to serialize/deserialize types.
 *
 * @param <T>
 * 		Serializable type.
 * @param <S>
 * 		Serialized intermediate type.
 *
 * @author Matt Coley
 */
public class ContextualTypeSerializer<T extends NimbusSerializable, S> implements TypeSerializer<T, S>, NetEntity<S> {
	private final NetContext<S> context;
	private final Class<T> type;
	private final Supplier<T> supplier;

	/**
	 * @param context
	 * 		Network context to use to serialize/deserialize objects with.
	 * 		Serialization is based on provided values from {@link NetContext#createObjectReader()}
	 * 		and {@link NetContext#createObjectWriter()}.
	 * @param type
	 * 		Type to serialize.
	 */
	public ContextualTypeSerializer(NetContext<S> context, Class<T> type, Supplier<T> supplier) {
		this.context = context;
		this.type = type;
		this.supplier = supplier;
	}

	@Override
	public T provide(Class<T> type) {
		return supplier.get();
	}

	@Override
	public S serialize(T value) throws IOException {
		return getNetContext().serializeObject(value);
	}

	@Override
	public T deserialize(S data) throws IOException {
		return getNetContext().deserializeObject(data, getType());
	}

	@Override
	public NetContext<S> getNetContext() {
		return context;
	}

	/**
	 * @return Type to serial/deserialize.
	 */
	public Class<T> getType() {
		return type;
	}
}
