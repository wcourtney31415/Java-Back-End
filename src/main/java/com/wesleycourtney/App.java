package com.wesleycourtney;

import static spark.Spark.*;

import org.apache.log4j.BasicConfigurator;

import com.google.gson.Gson;
import com.wesleycourtney.UserFactory.User;

import spark.Spark;

public class App {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		Spark.port(80);

		Gson gson = new Gson();
		User rhonda = new UserFactory()
				.setFirstName("Rhonda")
				.setLastName("Holloway")
				.setPhoneNumber("(526) 141-3395")
				.setEmail("elit.erat.vitae@vitaenibhDonec.net")
				.setBirthdate("01-24-10")
				.setStreetAddress("Ap #509-9596 Auctor, Rd.")
				.setCity("Chepstow")
				.setZip("6152")
				.setCountry("Malta")
				.build();

		get("/hello", (req, res) -> gson.toJson(rhonda));
	}

}
