package com.userservice.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/user-greet")
	public String getUserGreeting(@RequestParam String name) {
		String greetingServiceUrl = "http://localhost:8080/greet?name=" + name;
		String greeting = restTemplate.getForObject(greetingServiceUrl, String.class);
		return "User Service: " + greeting;
	}
}