package com.yash.pta.serviceApi;
import org.springframework.stereotype.Service;
import com.yash.pta.exceptions.InvalidCredentialsException;
import com.yash.pta.model.User;

/**
 * This is service interface which contains User entity related methods.
 */
@Service
public interface UserServiceApi 
{
	/**
	 * This method Creates User.
	 */
	User createUser(User user);
	
	/**
	 * Authenticate user credential if user is valid or not.
	 * @throws InvalidCredentialsException if incorrect details entered.
	 */
	User findByLoginNameAndPassword(String username, String password) throws InvalidCredentialsException;
	
}
