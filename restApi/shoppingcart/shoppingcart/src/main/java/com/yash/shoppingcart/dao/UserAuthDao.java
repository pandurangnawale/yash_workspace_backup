package com.yash.shoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.shoppingcart.model.User;

public interface UserAuthDao extends  JpaRepository<User, Long>{

	User loginUser(String username, String password);

	User findByUserName(String userName);

}
