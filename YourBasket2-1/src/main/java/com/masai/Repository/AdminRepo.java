package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.module.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {
  
	Admin findByEmailId(String emailId);
}
