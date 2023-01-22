package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Bean.Email;
import com.masai.Bean.User;
import com.masai.service.UserService;

@RestController
public class UserController {
	
	 @Autowired
	UserService userService;

	 @GetMapping("/getUser")
	public  List<User> getAllUser(){
		List<User> listuser= userService.retrieveAllUsers();
		return listuser;
	}
	
	@PostMapping("/PostUser")
	public  User addUser(@RequestBody User user) {
		  Email email=user.getEmail();
		  System.out.print(email);
		  email.setUser(user);
		return userService.createAUser(user);

	}
	
	@GetMapping("/getUser/{id}")
	public  User getUser(@PathVariable("id") Integer id) {
		  
		User user=userService.retrieveOneUser(id);
		return user;
		
	}
	@DeleteMapping("/deleteUser/{id}")
	public  User deleteUser(@PathVariable("id") Integer id) {
		  
		User user=userService.deleteUser(id);
		return user;
		
	}
	
	@GetMapping("/getEmail/{id}")
	public  Email getEmail(@PathVariable("id") Integer id) {
		return userService.retrieveDetailOfEmail(id);
	
	}
	@PostMapping("/PostEmail")
	public  String addEmail(@RequestBody Email email) {
		
		return userService.createEmailforUser(email);

	}
	
}