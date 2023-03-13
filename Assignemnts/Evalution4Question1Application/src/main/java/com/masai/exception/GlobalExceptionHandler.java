package com.masai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<String> myExceptionHandller(CustomerException ce){
		return new ResponseEntity<String>(ce.getMessage(),HttpStatus.BAD_REQUEST);
	}

   
}
