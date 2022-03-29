package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
//@Component
//@Configuration
public class UserService {
	@Autowired
	UserRepository repository;
	public Integer saveUser(User user) {
		User savedUser = repository.save(user);
		return savedUser.getId();
	}
	
}
