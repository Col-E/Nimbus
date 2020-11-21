package me.coley.nimbus.stuff;

import me.coley.nimbus.net.serial.NimbusSerializable;
import me.coley.nimbus.net.serial.ObjectReader;
import me.coley.nimbus.net.serial.ObjectWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class ListWrapper<T> implements NimbusSerializable {
	private List<T> list = new ArrayList<>();

	@SafeVarargs
	public final void addValues(T... values) {
		this.list.addAll(Arrays.asList(values));
	}

	@Override
	public void read(ObjectReader<?> reader) {
		list = reader.getList("list", getElementType());
	}

	@Override
	public void write(ObjectWriter<?> writer) {
		writer.setList("list", list, getElementType());
	}

	public abstract Class<T> getElementType();

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
