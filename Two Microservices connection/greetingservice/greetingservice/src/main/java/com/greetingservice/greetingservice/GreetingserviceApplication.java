package com.greetingservice.greetingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingserviceApplication.class, args);
		System.out.println("Application Started");
	}

}
