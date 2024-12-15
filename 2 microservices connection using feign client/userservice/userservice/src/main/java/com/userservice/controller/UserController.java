package com.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.model.User;

@RestController
@RequestMapping("/users")     
public class UserController {
	
	@GetMapping("/{userId}")
	public User getUserById(@PathVariable Long userId) {
		return new User(userId, "Iron Man", "tony@mail.com");
	}

}
