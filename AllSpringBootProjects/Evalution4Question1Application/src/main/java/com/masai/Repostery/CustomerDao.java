package com.masai.Repostery;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.bean.Customer;
@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
	

public List<Customer> findByAddress(String address);
}
