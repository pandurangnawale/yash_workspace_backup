package com.yash.shoppingcart.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.shoppingcart.dao.UserAuthDao;
import com.yash.shoppingcart.model.User;
import com.yash.shoppingcart.service.UserAuthService;

@Service
public class UserAuthServieImp implements UserAuthService{

	@Autowired
	UserAuthDao userAuthDao;
	@Override
	public User findB(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByName(String userName) {
		userAuthDao.findByUserName(userName);
		return null;
	}

	@Override
	public User AddNewUser(User user) {
		user=userAuthDao.save(user);
		return user;
	}

	/*@Override
	public User loginUser(String username, String password) {
		return user;
	}*/

	

}
