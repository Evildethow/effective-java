package org.evildethow.staticfactory;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CollectionUtilsTest {

	private HashMap<String, List<String>> hashMap;
	
	@Before
	public void init() {
		hashMap = CollectionUtils.newHashMap();
	}
	
	@Test
	public void verifyNewHashMapNotNull() {
		assertNotNull(hashMap);
	}

}
