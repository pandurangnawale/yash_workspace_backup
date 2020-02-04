package com.yash.pta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;
/**
 * 
 * The class helps listens to the user request
 * @author poonam.avhad
 *
 */

//User entity
@Entity
//@Table(name = "User", uniqueConstraints = { @UniqueConstraint(columnNames = { "loginName" } ) })
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long usrId;

	@NotBlank(message = "Name cannot be empty!")
	@Size(min = 5, max = 10, message = "Your name should be between 5 - 10 characters.")
	private String userName;
	

	@Pattern(regexp = "(^$|[0-9]{10})")
	private String contact;

	@Pattern(regexp = ".+@.+\\..+", message = "Wrong email!")
	@Column(name  = "email", unique = true) 
	private String email;

	@NotBlank(message = "Login Name cannot be empty!")
	@Size(min = 5, max = 10, message = "Your User Name should be between 5 - 10 characters.")
	@Column(name  = "loginName", unique = true)  
	private String loginName;

	
	@NotBlank(message = "Password Name cannot be empty!")
	@Length(min = 5, max = 10, message = "Password should be between 5 - 10 charactes")
	private String password;

	public Long getUsrId() {
		return usrId;
	}

	public void setUsrId(Long usrId) {
		this.usrId = usrId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
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
	
	/*@toString It prints String representation of User object*/
	@Override
	public String toString() {
		return "User [usrId=" + usrId + ", userName=" + userName + ", contact=" + contact + ", email=" + email + ", loginName="
				+ loginName + ", password=" + password + "]";
	}

}
