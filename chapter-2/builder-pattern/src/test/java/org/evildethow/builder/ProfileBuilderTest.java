package org.evildethow.builder;

import static org.junit.Assert.assertEquals;

import org.evildethow.builder.Profile.ProfileBuilder;
import org.evildethow.builder.Profile.Sex;
import org.junit.Before;
import org.junit.Test;

public class ProfileBuilderTest {

	private Profile profile;
	private static final String SCREEN_NAME = "evildethow";
	private static final String FIRST_NAME = "owen";
	private static final String LAST_NAME = "wood";
	private static final int AGE = 28;
	private static final Sex SEX = Sex.MALE;
	
	
	@Before
	public void initProfile(){
		profile = new ProfileBuilder(SCREEN_NAME)
				.firstName(FIRST_NAME)
				.lastName(LAST_NAME)
				.age(AGE)
				.sex(SEX)
				.build();
	}
	
	/**
	 * Show that builder pattern does what you expect it to and cooks this object to perfection.
	 */
	@Test
	public void verifyProfileBuilderKnowsItsOven() {
		assertEquals(SCREEN_NAME, profile.getScreenName());
		assertEquals(FIRST_NAME, profile.getFirstName());
		assertEquals(LAST_NAME, profile.getLastName());
		assertEquals(AGE, profile.getAge());
		assertEquals(SEX, profile.getSex());
	}

}
