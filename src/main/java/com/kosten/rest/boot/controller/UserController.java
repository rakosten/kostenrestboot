package com.kosten.rest.boot.controller;

import com.kosten.rest.boot.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class UserController {

	@PostMapping("/initialize")
	public String initialize(@RequestBody User user) {
		return "Hello " + user.getUserName();
	}
}
