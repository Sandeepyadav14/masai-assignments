package com.masai.Service;

import java.util.List;

import com.masai.Exception.EventException;
import com.masai.Exception.UserException;
import com.masai.Module.Event;
import com.masai.Module.User;

public interface UserService {
	
	public User addUser(User user)throws UserException;
	
	public String loginUser(String email,String password)throws UserException;
	
	public User updateUser(User user,String email)throws UserException;
	
	public User deleteUser(String email)throws UserException;
	
	public User getUserById(String email)throws UserException;
	
	public List<Event> getEventByType(String email,String type)throws EventException,UserException;

}