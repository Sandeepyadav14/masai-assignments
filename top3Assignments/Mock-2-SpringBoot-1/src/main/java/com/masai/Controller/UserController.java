package com.masai.Controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.EventException;
import com.masai.Exception.UserException;
import com.masai.Module.Event;
import com.masai.Module.User;
import com.masai.Service.UserService;

@RestController
@RequestMapping("/masaicalender")
public class UserController {

	@Autowired
	private UserService uService;

	@PostMapping("/register")
	public ResponseEntity<User> addUserHandler(@Valid @RequestBody User user) throws UserException {

		User user1 = uService.addUser(user);

		return new ResponseEntity<User>(user1, HttpStatus.CREATED);

	}

	
	@GetMapping("/login")
	public ResponseEntity<String> loginUserHandler(@RequestParam String email,@RequestParam String password) throws UserException {

		String message = uService.loginUser(email, password);

		return new ResponseEntity<String>(message, HttpStatus.OK);

	}
	
	
	
	@GetMapping("/event/{type}")
	public ResponseEntity<List<Event>> getEventByTypeHandler(@PathVariable("type")String type,@RequestParam String email) throws UserException, EventException {

		List<Event> events = uService.getEventByType(email,type);

		return new ResponseEntity<List<Event>>(events, HttpStatus.OK);

	}
	
	@PutMapping("/user")
	public ResponseEntity<User> updateUserHandler(@Valid @RequestParam String email,@RequestBody User user) throws UserException {

		User user1 = uService.updateUser(user, email);

		return new ResponseEntity<User>(user1, HttpStatus.OK);

	}
	
	@GetMapping("/user")
	public ResponseEntity<User> getUserByIdHandler(@RequestParam String email) throws UserException {

		User user1 = uService.getUserById(email);

		return new ResponseEntity<User>(user1, HttpStatus.OK);

	}
	
	@DeleteMapping("/user")
	public ResponseEntity<User> deleteUserByIdHandler(@RequestParam String email) throws UserException {

		User user1 = uService.deleteUser(email);

		return new ResponseEntity<User>(user1, HttpStatus.OK);

	}

}
