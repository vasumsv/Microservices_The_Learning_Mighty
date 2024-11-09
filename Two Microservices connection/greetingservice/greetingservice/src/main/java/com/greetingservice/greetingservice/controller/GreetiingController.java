@package com.greetingservice.greetingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetiingController {

	@GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello, " + name + "! Welcome to the microservices world."; 
    }
}
