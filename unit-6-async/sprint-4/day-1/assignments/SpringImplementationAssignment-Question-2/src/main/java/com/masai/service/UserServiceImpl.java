package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Bean.Email;
import com.masai.Bean.User;
import com.masai.controller.EmailRepo;
import com.masai.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
    @Autowired
	UserRepo userRepo;
	
    @Autowired
    EmailRepo emailRepo;
    
	@Override
	public List<User> retrieveAllUsers() {
		
		List<User> userlist=userRepo.findAll();
		
		
		return userlist;
	}

	@Override
	public User createAUser(User user) {
		
		
		return userRepo.save(user);
	}

	@Override
	public User retrieveOneUser(Integer id) {
		Optional<User> user=userRepo.findById(id);
		return user.get();
		
}

	@Override
	public User deleteUser(Integer id) {
		Optional<User> users=userRepo.findById(id);
		User user=users.get();
		userRepo.delete(user);
		return user;
	}

	@Override
	public Email retrieveDetailOfEmail(Integer userId) {
	Optional<User> user=userRepo.findById(userId);
	User users=user.get();
		return users.getEmail();
		
}

	@Override
	public String createEmailforUser(Email email) {
		   emailRepo.save(email);
		   return "Your data added successfully";
	}

}
