package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Bean.*;
public interface UserService {
	
	public  List<User> retrieveAllUsers();
	
    public User createAUser(User user );
    public User retrieveOneUser(Integer id);
    public User deleteUser(Integer id);
    public Email retrieveDetailOfEmail(Integer userId);
    public String createEmailforUser(Email email);
}
