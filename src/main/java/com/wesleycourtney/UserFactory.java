package com.wesleycourtney;

public class UserFactory {

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String birthdate;
	private String streetAddress;
	private String city;
	private String zip;
	private String country;

	public UserFactory setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public UserFactory setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserFactory setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public UserFactory setEmail(String email) {
		this.email = email;
		return this;
	}

	public UserFactory setBirthdate(String birthdate) {
		this.birthdate = birthdate;
		return this;
	}

	public UserFactory setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
		return this;
	}

	public UserFactory setCity(String city) {
		this.city = city;
		return this;
	}

	public UserFactory setZip(String zip) {
		this.zip = zip;
		return this;
	}

	public UserFactory setCountry(String country) {
		this.country = country;
		return this;
	}

	public User build() {
		User newUser = new User();
		newUser.setFirstName(firstName);
		newUser.setLastName(lastName);
		newUser.setPhoneNumber(phoneNumber);
		newUser.setEmail(email);
		newUser.setBirthdate(birthdate);
		newUser.setStreetAddress(streetAddress);
		newUser.setCity(city);
		newUser.setZip(zip);
		newUser.setCountry(country);
		return newUser;
	}

	public class User {

		private String firstName;
		private String lastName;
		private String phoneNumber;
		private String email;
		private String birthdate;
		private String streetAddress;
		private String city;
		private String zip;
		private String country;

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setBirthdate(String birthdate) {
			this.birthdate = birthdate;
		}

		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		private User() {

		}

	}
}
