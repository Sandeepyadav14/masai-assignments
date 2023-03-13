package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Module.User;

@Repository
public interface UserRepo extends JpaRepository<User,String>{
	
	public User findByEmailAndPassword(String email,String password);

}