package me.coley.nimbus.util;

import java.util.function.Consumer;

@FunctionalInterface
public interface ThrowingConsumer<T> extends Consumer<T> {
	@Override
	default void accept(T elem) {
		try {
			acceptThrows(elem);
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}
	}

	void acceptThrows(T elem) throws Exception;
}