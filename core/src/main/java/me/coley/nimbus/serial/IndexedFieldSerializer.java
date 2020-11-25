package me.coley.nimbus.serial;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.serializers.FieldSerializer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * A field serializer for kryo that sorts based off of {@link Index} order of fields.
 * If no {@link Index} annotations are present in the class, then this defaults to standard serialization ordering.
 *
 * @param <T>
 * 		Type to serialize.
 *
 * @author Matt Coley
 */
public class IndexedFieldSerializer<T> extends FieldSerializer<T> {
	public IndexedFieldSerializer(Kryo kryo, Class type) {
		super(kryo, type);
	}

	@Override
	protected void initializeCachedFields() {
		CachedField[] fields = getFields();
		// Get indices
		Map<CachedField, Integer> indices = new HashMap<>();
		for (CachedField field : fields) {
			Index index = field.getField().getAnnotation(Index.class);
			if (index == null)
				continue;
			indices.put(field, index.value());
		}
		// Skip if no indices
		if (indices.isEmpty())
			return;
		// Remove non-indexed fields
		for (CachedField field : fields)
			if (!indices.containsKey(field))
				removeField(field);
		// Sort the fields by index
		fields = getFields();
		Arrays.sort(fields, Comparator.comparingInt(indices::get));
	}
}
