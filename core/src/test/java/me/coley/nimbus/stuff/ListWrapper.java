package me.coley.nimbus.stuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListWrapper<T> {
	private final List<T> list = new ArrayList<>();

	@SafeVarargs
	public final void addValues(T... values) {
		this.list.addAll(Arrays.asList(values));
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ListWrapper<?> that = (ListWrapper<?>) o;
		return Objects.equals(list, that.list);
	}

	@Override
	public int hashCode() {
		return Objects.hash(list);
	}
}
