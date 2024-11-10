package com.firstmicroservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstmicroservice.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
