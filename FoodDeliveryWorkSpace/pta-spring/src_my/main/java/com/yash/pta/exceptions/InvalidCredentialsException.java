package com.yash.pta.exceptions;


/**
 * This is custom exception, throws when user is not valid.
 */
@SuppressWarnings("serial")
public class InvalidCredentialsException extends Exception {
	public InvalidCredentialsException() {
		super();
	}
	public InvalidCredentialsException(String message){
		super(message);
	}
}
