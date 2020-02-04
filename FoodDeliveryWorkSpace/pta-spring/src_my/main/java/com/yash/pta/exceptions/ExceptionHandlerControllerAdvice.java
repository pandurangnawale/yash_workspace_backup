package com.yash.pta.exceptions;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


/**
 * Global exception handler which handles the exceptions and validate the entity properties
 */

@ControllerAdvice
public class ExceptionHandlerControllerAdvice extends ResponseEntityExceptionHandler 
{
	
	/**
	 * This is overridden method of ResponseEntityExceptionHandler class.
	 * This method validate all the properties of entity and catches the errors and sends them to user.
	 */
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		Map<String,Object>body=new LinkedHashMap<String,Object>();
		body.put("timestamp", new Date());
		body.put("status",status.value());
		
		List<String>error=ex.getBindingResult().getAllErrors().stream().map(x->x.getDefaultMessage()).collect(Collectors.toList());
		body.put("errors",error);
		
		return new ResponseEntity<Object>(body,headers,status);
	}
}
