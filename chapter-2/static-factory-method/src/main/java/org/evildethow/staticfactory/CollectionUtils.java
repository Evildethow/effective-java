package org.evildethow.staticfactory;

import java.util.HashMap;

public class CollectionUtils {

	public static <K,V> HashMap<K,V> newHashMap() {
		return new HashMap<K, V>();
	}
}
