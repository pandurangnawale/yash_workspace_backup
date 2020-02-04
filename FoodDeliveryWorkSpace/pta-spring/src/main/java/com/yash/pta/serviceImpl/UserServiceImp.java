package com.yash.pta.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yash.pta.exception.InvalidCredentialsException;
import com.yash.pta.model.User;
import com.yash.pta.repository.UserRepository;
import com.yash.pta.service.UserService;

/**
 * @author poonam.avhad
 *
 */
@Service
@Transactional
public class UserServiceImp implements UserService{

	//User repository instance
	@Autowired
	UserRepository userRepo;
	
	
	/*This method registers the user.
	 * It takes User object as a input and pass it to dao layer
	 * @author Poonam.Avhad
	 * @param User Object
	 * @return User object*/
	@Override
	public User createUser(User user) {
		userRepo.save(user);
		return user;
	}

	
	/*This method authenticate the user 
	 * @param It takes two parameter as input Username and password
	 * @author poonam.avhad
	 * @return User object if user is valid.
	 * @throws if user is not valid it throws InvalidCredentialsException*/
	@Override
	public User findByLoginNameAndPassword(String username, String password) throws InvalidCredentialsException
	{
			User loginUserObj = userRepo.findByLoginNameAndPassword(username,password);
			if(loginUserObj==null) 
			throw new InvalidCredentialsException("User not found!");
			return loginUserObj;
	}
}
