package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.entity.User;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {
	@InjectMocks
	UserController controller;
	@Mock
	UserService service;

	@Test
	void testCreateUser() {
		// setup
		User user = new User();
		when(service.saveUser(user)).thenReturn(2);
		// act
		int id = controller.createUser(user);
		assertEquals(2, id);
	}

	@Test
	void testCreateUserWithNullUser() {
		// setup
		User user = null;
		// act
		assertThrowsExactly(RuntimeException.class, () -> {
			controller.createUser(user);
		});
	}
}
