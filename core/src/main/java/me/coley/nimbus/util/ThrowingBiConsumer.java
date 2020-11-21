package me.coley.nimbus.util;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface ThrowingBiConsumer<T, U> extends BiConsumer<T, U> {
	@Override
	default void accept(T elem, U other) {
		try {
			acceptThrows(elem, other);
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}
	}

	void acceptThrows(T elem, U other) throws Exception;
}