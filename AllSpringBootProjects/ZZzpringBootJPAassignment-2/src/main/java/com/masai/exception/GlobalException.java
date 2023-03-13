package com.masai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalException {
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<String> MyException(ProductException pe){
		return new ResponseEntity<String> (pe.getMessage(),HttpStatus.BAD_REQUEST);
	}

}
