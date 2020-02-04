package com.yash.pta.exception;

//This is custom exception, throws when user is not valid.
//@Author poonam.avhad
@SuppressWarnings("serial")
public class InvalidCredentialsException extends Exception {
	public InvalidCredentialsException() {
		super();
	}
	public InvalidCredentialsException(String message){
		super(message);
	}
}
