package com.yash.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.shoppingcart.model.User;
import com.yash.shoppingcart.service.UserAuthService;

@RestController
public class UserAuthController {
	
	@Autowired
	User user;
	
	@Autowired
	UserAuthService userAuthService;
	/*
	@GetMapping("UserAuth/{uswername}")
	public User userAuthentication(@PathVariable String username, @PathVariable String password) {
		return userAuthService.loginUser(username,password);
	}
	
	*/
	
	@GetMapping("user")
	public User getUserByNameHandler(@RequestParam String userName) {
		User user = userAuthService.findUserByName(userName);
		return user;
		
	}
	
	@PostMapping("user")
	public User addUserHandler(@RequestBody User user) {
		user = userAuthService.AddNewUser(user);
		System.out.println("ADDED");
		return user;
	}

}
