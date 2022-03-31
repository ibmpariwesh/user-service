package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;
//	@Autowired
//	RestTemplate template;
	@GetMapping
	void getUser() {
		// TODO Auto-generated method stub

	}
	
	@PostMapping
	Integer createUser(@RequestBody User user) throws Exception {
		if (user == null) {
			throw new RuntimeException();
		}
		return service.saveUser(user);
	}
}
