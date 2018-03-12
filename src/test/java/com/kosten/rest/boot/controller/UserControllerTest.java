package com.kosten.rest.boot.controller;

import com.kosten.rest.boot.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;


public class UserControllerTest {
	private UserController userController;
	@Before
	public void setUp() throws Exception {
		userController = new UserController();
	}

	@Test
	public void testInitialize() {
		User user = new User();
		user.setUserEmail("robk@emailserver.com");
		user.setUserId(UUID.randomUUID().toString());
		user.setUserName("Rob");

		String response = userController.initialize(user);
		Assert.assertEquals("Hello Rob", response);
	}

}