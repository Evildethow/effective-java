package org.evildethow.container;

import static org.junit.Assert.assertEquals;

import java.util.Formatter;

import org.junit.Test;

public class FavouritesTest {

	@Test
	public void verifyUsage() {
		// setup
		Favourites favourites = new Favourites();
		
		// call put
		favourites.put(String.class, "Java");
		favourites.put(Integer.class, 0xcafebabe);
		favourites.put(Class.class, Favourites.class);
		// call get
		String favString = favourites.get(String.class);
		int favInt = favourites.get(Integer.class);
		Class<?> favClass = favourites.get(Class.class);

		// verify
		String expectedResult = "Java cafebabe Favourites";
		String actualResult = new Formatter().format("%s %x %s", favString, favInt,
				favClass.getSimpleName()).toString();
		
		assertEquals(expectedResult, actualResult);
	}

}
