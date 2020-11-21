package me.coley.nimbus;

import me.coley.nimbus.net.NetContext;
import me.coley.nimbus.net.NetConfig;
import me.coley.nimbus.net.serial.ObjectReader;
import me.coley.nimbus.net.serial.ObjectWriter;
import me.coley.nimbus.net.serial.TypeFactory;

import java.util.Objects;
import java.util.function.Function;

/**
 * Builder for {@link NetContext}.
 *
 * @param <S>
 * 		Serialized intermediate type.
 *
 * @author Matt Coley
 */
public class NetContextBuilder<S> {
	private Function<NetContext<S>, ObjectReader<S>> objectReaderFunction;
	private Function<NetContext<S>, ObjectWriter<S>> objectWriterFunction;
	private Function<NetContext<S>, TypeFactory<S>> typeFactoryFunction;

	/**
	 * @param objectReaderFunction
	 * 		A function of network context to a new object reader instance.
	 *
	 * @return Builder.
	 */
	public NetContextBuilder<S> setObjectReaderFunction(Function<NetContext<S>, ObjectReader<S>> objectReaderFunction) {
		this.objectReaderFunction = objectReaderFunction;
		return this;
	}

	/**
	 * @param objectWriterFunction
	 * 		A function of network context to a new object writer instance.
	 *
	 * @return Builder.
	 */
	public NetContextBuilder<S> setObjectWriterFunction(Function<NetContext<S>, ObjectWriter<S>> objectWriterFunction) {
		this.objectWriterFunction = objectWriterFunction;
		return this;
	}

	/**
	 * @param typeFactoryFunction
	 * 		A function of network context to a type factory instance.
	 *
	 * @return Builder.
	 */
	public NetContextBuilder<S> setTypeFactoryFunction(Function<NetContext<S>, TypeFactory<S>> typeFactoryFunction) {
		this.typeFactoryFunction = typeFactoryFunction;
		return this;
	}

	/**
	 * @return Generated network context instance.
	 *
	 * @throws NullPointerException
	 * 		When a required function has not been provided.
	 */
	public NetContext<S> build() {
		// Validate arguments
		Objects.requireNonNull(typeFactoryFunction, "Type factory must be set");
		Objects.requireNonNull(objectReaderFunction, "Object reader must be set");
		Objects.requireNonNull(objectWriterFunction, "Object writer must be set");
		// Create the instance
		return new NetContextImpl();
	}

	/**
	 * Implementation to create from {@link #build()}.
	 *
	 * @author Matt Coley
	 */
	private class NetContextImpl implements NetContext<S> {
		private final TypeFactory<S> typeFactory = typeFactoryFunction.apply(getNetContext());
		private final NetConfig config = new NetConfig();

		@Override
		public ObjectReader<S> createObjectReader() {
			return objectReaderFunction.apply(getNetContext());
		}

		@Override
		public ObjectWriter<S> createObjectWriter() {
			return objectWriterFunction.apply(getNetContext());
		}

		@Override
		public NetConfig getNetConfig() {
			return config;
		}

		@Override
		public TypeFactory<S> getTypeFactory() {
			return typeFactory;
		}
	}
}
