package com.yash.pta.service;

import org.springframework.stereotype.Service;

import com.yash.pta.exception.InvalidCredentialsException;
import com.yash.pta.model.User;

/**
 * @author poonam.avhad
 *
 */
@Service
public interface UserService 
{
	
	//Creates User
	//@author poonam.avhad
	User createUser(User user);

	//Authenticate user credential if user is valid or not.
	//@author poonam.avhad
	User findByLoginNameAndPassword(String username, String password) throws InvalidCredentialsException;	
}
