package org.evildethow.builder;

public class Profile {

	public static enum Sex {
		MALE, FEMALE
	}
	
	private Profile(ProfileBuilder builder) {
		this.screenName = builder.screenName;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.sex = builder.sex;
	}
	
	private final String screenName;
	private final String firstName;
	private final String lastName;
	private final int age;
	private final Sex sex;
	
	public static class ProfileBuilder implements Builder<Profile> {

		private final String screenName;
		private String firstName;
		private String lastName;
		private int age;
		private Sex sex;
		
		public ProfileBuilder(String screenName) {
			this.screenName = screenName;
		}
		
		public ProfileBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public ProfileBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public ProfileBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public ProfileBuilder sex(Sex sex) {
			this.sex = sex;
			return this;
		}
		
		public Profile build() {
			return new Profile(this);
		}
		
	}
	
	public String getScreenName() {
		return screenName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public Sex getSex() {
		return sex;
	}
	
}
