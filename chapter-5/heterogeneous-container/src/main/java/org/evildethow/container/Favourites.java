package org.evildethow.container;

import java.util.Map;

public class Favourites {

	private final Map<Class<?>, Object> favourites = CollectionUtils.newHashMap();
	
	public <T> void put(Class<T> type, T instance) {
		if (null == type) {
			throw new NullPointerException("Type is null");
		}
		favourites.put(type, type.cast(instance));
	}
	
	public <T> T get(Class<T> type) {
		return type.cast(favourites.get(type));
	}
}
