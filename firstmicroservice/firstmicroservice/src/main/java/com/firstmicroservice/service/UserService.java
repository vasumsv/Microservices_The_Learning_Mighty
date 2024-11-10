package com.firstmicroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstmicroservice.model.User;
import com.firstmicroservice.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	
	//Read
	public List<User> findAll() {
		return userRepo.findAll();
	}
	
	//Create or Update
	public User save(User user) {
		return userRepo.save(user);
	}
	
	//Read
	public User findUserByd(Long id) {
		return userRepo.findById(id).orElse(null);
	}
	
	
	//Delete 
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}
	
	

}
