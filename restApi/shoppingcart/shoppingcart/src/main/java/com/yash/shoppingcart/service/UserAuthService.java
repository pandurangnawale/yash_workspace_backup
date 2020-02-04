package com.yash.shoppingcart.service;

import org.springframework.data.repository.Repository;

import com.yash.shoppingcart.model.User;

public interface UserAuthService extends Repository<User, Integer> {

	User findB (String username, String password);

	User findUserByName(String userName);

	User AddNewUser(User user);

}
