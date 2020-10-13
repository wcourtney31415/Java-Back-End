package com.wesleycourtney;

import static spark.Spark.*;

import org.apache.log4j.BasicConfigurator;

import com.google.gson.Gson;

import spark.Spark;

public class App {
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Spark.port(80);
		
		Gson gson = new Gson();
		User rhonda = new User();
		rhonda.firstName = "Rhonda";
		rhonda.lastName = "Holloway";
		rhonda.phoneNumber = "(526) 141-3395";
		rhonda.email = "elit.erat.vitae@vitaenibhDonec.net";
		rhonda.birthdate = "01-24-10";
		rhonda.streetAddress = "Ap #509-9596 Auctor, Rd.";
		rhonda.city = "Chepstow";
		rhonda.zip = "6152";
		rhonda.country = "Malta";
		
		get("/hello", (req, res) -> gson.toJson(rhonda));
	}

}

class User {
	String firstName;
	String lastName;
	String phoneNumber;
	String email;
	String birthdate;
	String streetAddress;
	String city;
	String zip;
	String country;

	User() {

	}

}