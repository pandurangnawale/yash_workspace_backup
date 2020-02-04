package com.yash.pta.command;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class LoginCommand {


	@NotBlank(message = "User Name cannot be empty")
	@Length(min = 5, max = 10, message = "Your User Name should be between 5 - 10 characters")
	private String loginName;
	
	@NotBlank(message = "Password cannot be empty")
	@Length(min = 5, max = 10, message = "Password should be between 5 - 10 charactes")
	private String password;

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

	@Override
	public String toString() {
		return "Login [loginName=" + loginName + ", password=" + password + "]";
	}


}
