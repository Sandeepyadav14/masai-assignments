package com.masai.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.module.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
	Customer findByEmail(String email);
	Customer findByPassword(String password);

}
