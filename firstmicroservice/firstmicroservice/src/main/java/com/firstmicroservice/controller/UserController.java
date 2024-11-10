package com.firstmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firstmicroservice.model.User;
import com.firstmicroservice.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.findAll();
	}
	
	@PostMapping("/adduser")
	public User createUser(@RequestBody User user) {
		return userService.save(user);
	}
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user) {
		return userService.save(user);
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable Long id ) {
		return userService.findUserByd(id);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}
}
