package com.example.demo.service;

import java.io.IOException;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

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

	@Transactional(rollbackOn = Exception.class, dontRollbackOn = { IllegalArgumentException.class, IOException.class })
	public Integer saveUser(User user) throws Exception {
		User savedUser = repository.save(user);
//		somework();

		return savedUser.getId();
	}
	@Transactional(value = TxType.REQUIRES_NEW)
	void somework() throws Exception {
		if (true)
			throw new Exception();
	}

}
