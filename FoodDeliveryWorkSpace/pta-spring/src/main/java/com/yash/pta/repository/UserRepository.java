package com.yash.pta.repository;

import org.springframework.data.repository.CrudRepository;

import com.yash.pta.model.User;

/**
 * @author poonam.avhad
 *
 */

//CRUD repository for User entity
//Which performs all operations related to user.
public interface UserRepository extends CrudRepository<User, Long> {
	User findByLoginNameAndPassword(String username, String password);
}
