package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.UserService;
import com.example.demo.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;
//	@Autowired
//	RestTemplate template;

	@PostMapping
	Integer createUser(@RequestBody User user) {
		if (user == null) {
			throw new RuntimeException();
		}
		return service.saveUser(user);
	}
}
