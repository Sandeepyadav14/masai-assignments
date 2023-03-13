package com.masai.Service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.masai.Module.SecurityService;
import com.masai.Module.User;
import com.masai.Repository.UserRepo;


 public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserRepo uRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> opt = uRepo.findById(username);
		
		    User user = opt.get();
		    
		if(user!=null)return new SecurityService(user);
		
		else throw new UsernameNotFoundException("No UserName found...");
		
	}

}