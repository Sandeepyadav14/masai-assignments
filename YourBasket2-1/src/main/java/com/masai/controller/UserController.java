package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.LoginService;
import com.masai.module.User;

@RestController
public class UserController {
	
	@Autowired
	private LoginService loginService;
	
	
	@PostMapping("/user")
	private ResponseEntity<String> loginUserController(@RequestBody User user){
		
		String msg=loginService.logIntoAccount(user);
		
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	
	
	@PostMapping("/user/{key}")
	private ResponseEntity<String> logOutController(@PathVariable String key){
		
		String msg=loginService.logOutFromAccount(key);
		
		return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
	}

}
