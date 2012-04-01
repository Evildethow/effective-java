package org.evildethow.builder;

public class Profile {

	public static enum Sex {
		MALE, FEMALE, NOT_DISCLOSED;
	}
	
	private final String screenName;
	private String firstName;
	private String lastName;
	private int age;
	private Sex sex;
}
