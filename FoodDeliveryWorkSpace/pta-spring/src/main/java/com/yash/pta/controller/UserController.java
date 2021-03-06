package com.yash.pta.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pta.exception.InvalidCredentialsException;
import com.yash.pta.model.Login;
import com.yash.pta.model.User;
import com.yash.pta.service.UserService;

/**
 * @author poonam.avhad
 *
 */
@RestController
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserService userService;
	
//	private final Logger LOGGER = LoggerFactory.getLogger(UserController.class.getName()); 

	
	/*This method registers the user.
	 * It takes User object as a input and pass it to service layer
	 * @RequestBody annotation binds the HTTPRequest body to the domain object.
	 * @author Poonam.Avhad
	 * @param User Object
	 * @return void*/
	@PostMapping("api/pta/registerUser")
	public void registerUser(@RequestBody User user) {
//		LOGGER.info("Creating user {}",user);
		userService.createUser(user);
	}

	
	
	/*This method validate the if user is registered or not
	 * It takes Login object as input and pass it to service layer for authentication.
	 * @PostMapping is used to handle POST type of request method
	 * @Valid: This annotation validate the user name and password.
	 * @author Poonam.Avhad
	 * @param Login Object
	 * @return User object
	 * @throws InvalidCredentialsException if invalid credentials passed.*/
	@PostMapping("api/pta/loginUser")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody Login login) throws InvalidCredentialsException {
		
		User loginUserObj = userService.findByLoginNameAndPassword(login.getLoginName(), login.getPassword());
//		LOGGER.info("Login user:", loginUserObj);
		
			if(loginUserObj!=null)
		      return new ResponseEntity<>(loginUserObj, HttpStatus.OK);
		     else
			return new ResponseEntity<>("Login failed", HttpStatus.NOT_FOUND);

	}

}
