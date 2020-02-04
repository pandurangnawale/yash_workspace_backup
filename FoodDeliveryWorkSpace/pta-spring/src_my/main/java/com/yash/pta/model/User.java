package com.yash.pta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;
/**
 * The class helps listens to the user request
 * User model class which represents user
 */
@Entity
@Table(name = "User")
@Component
public class User 
{
	/**
	 * This is User Id
	 * @Id represents auto-generated primary key
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;

	/**
	 * This is User name
	 * @size restricts that User name should be 3 - 10 character.
	 */
	@NotBlank(message = "Name cannot be empty!")
	@Size(min = 3, max = 10, message = "Your name should be between 3 - 10 characters.")
	private String userName;
	
	/**
	 * This is Contact number
	 */
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String contactNo;

	/**
	 * This email Id of User
	 */
	@Pattern(regexp = ".+@.+\\..+", message = "Wrong email!")
	@Column(name  = "email", unique = true) 
	private String email;

	/**
	 * This is login name which is use for login
	 * @column indicates column name in User table
	 * @size restricts that login name should be 5-10 characters
	 */
	@NotBlank(message = "Login Name cannot be empty!")
	@Size(min = 5, max = 10, message = "Your User Name should be between 5 - 10 characters.")
	@Column(name  = "loginName", unique = true)  
	private String loginName;

	/**
	 * This is password which is use for login
	 * @Length validate that password should be 5 -10 characters
	 */
	@NotBlank(message = "Password Name cannot be empty!")
	@Length(min = 5, max = 10, message = "Password should be between 5 - 10 charactes")
	private String password;

	/**
	 * Setter and getters of User entity
	 */
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contact) {
		this.contactNo = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 *@toString It prints String representation of User object
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", contactNo=" + contactNo + ", email=" + email + ", loginName="
				+ loginName + ", password=" + password + "]";
	}
	
}
