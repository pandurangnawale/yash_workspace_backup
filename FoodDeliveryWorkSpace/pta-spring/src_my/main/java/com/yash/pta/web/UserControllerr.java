package com.yash.pta.web;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pta.exceptions.InvalidCredentialsException;
import com.yash.pta.model.Login;
import com.yash.pta.model.User;
import com.yash.pta.serviceApi.UserServiceApi;
/**
 * This is Rest controller which handles all HTTP requests related to User Entity.
 * @RestController marks this class as controller which handles all HTTP requests.
 * @CrossOrigin annotation to handle Cross-Origin-Resource-Sharing (CORS). 
 */
@RestController
@CrossOrigin
public class UserControllerr {

	@Autowired
	UserServiceApi userServiceApi;
	
	/**
	 * This is logger instance.
	 */
	private final Logger LOGGER = LoggerFactory.getLogger(UserControllerr.class); 
	
	
	/**
	 * This method registers the user.
	 * It takes User object as a input and pass it to service layer
	 * @RequestBody annotation binds the HTTPRequest body to the domain object.
	 * @PostMapping is used to handle POST type of request method
	 * @param User Object
	 * @return void
	 */
	@PostMapping("api/pta/registerUser")
	public void registerUser(@RequestBody User user) {
		LOGGER.info("Creating user {}",user);
		//userServiceApi.createUser(user);
	}

	/**
	 * This method validate the if user is registered or not
	 * It takes Login object as input and pass it to service layer for authentication.
	 * @PostMapping is used to handle POST type of request method
	 * @Valid: This annotation validate the user name and password.
	 * @param Login Object
	 * @return User object
	 * @throws InvalidCredentialsException if invalid credentials entered.
	 */
	@PostMapping("api/pta/login")
	public User authenticateUser(@Valid @RequestBody Login login) throws InvalidCredentialsException {
		
		LOGGER.info("****************Inside the login action****************************");
		User loginUserObj = userServiceApi.findByLoginNameAndPassword(login.getLoginName(), login.getPassword());
		LOGGER.info("Login user:", loginUserObj);
		return loginUserObj;

	}

}
