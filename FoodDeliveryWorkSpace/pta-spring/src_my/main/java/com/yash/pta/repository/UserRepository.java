package com.yash.pta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.pta.model.User;


/**
 * CRUD repository for User entity
 * Which performs all operations related to user.
 */
@Repository 	
public interface UserRepository extends CrudRepository<User, Long> {
	User findByLoginNameAndPassword(String username, String password);
}
