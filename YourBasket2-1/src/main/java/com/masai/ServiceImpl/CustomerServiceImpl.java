package com.masai.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.CredentialException;
import com.masai.Exception.CustomerException;
import com.masai.Repository.CurrentUserSessionRepo;
import com.masai.Repository.CustomerRepo;
import com.masai.Service.*;
import com.masai.module.CurrentUserSession;
import com.masai.module.Customer;

@Service
public class CustomerServiceImpl implements CustomerServices {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private CurrentUserSessionRepo currentUserSessionRepo;

	@Override
	public Customer addNewCustomer(Customer customer) throws CustomerException {
		
		if(customer==null) {
			throw new CustomerException("Customer Data Not Saved...");
		}else{
			return customerRepo.save(customer);
		}
	}

	@Override
	public Customer updateExistingCustomer(Customer customer) throws CustomerException {
	 
		    Optional<Customer> optional= customerRepo.findById(customer.getCustomerId()); 
		    if(optional.isEmpty()) {
		    	throw new CustomerException("customer Data not updated...");
		    }else {
		    	Customer customer2=optional.get();
		    	customer2.setAddress(customer.getAddress());
		    	customer2.setCart(customer.getCart());
		    	customer2.setEmail(customer.getEmail());
		    	customer2.setFeedBackList(customer.getFeedBackList());
		    	customer2.setMobileNo(customer.getMobileNo());
		    	customer2.setName(customer.getName());
		    	customer2.setPassword(customer.getPassword());
		    	return customerRepo.save(customer2);
		    }
	}

	@Override
	public String removeExistingCustomer(String password) throws CredentialException {
		 Customer customer= customerRepo.findByPassword(password); 
		    if(customer==null) {
		    	throw new CustomerException("customer Data not updated...");
		    }else {
		
		    	customerRepo.delete(customer);
		    	return "customer deleted...";
		    }
		
	}

	@Override
	public Customer viewExistingCustomer(Integer customerId, String key) throws CustomerException {
		 CurrentUserSession currentUserSession= currentUserSessionRepo.findByUuid(key);
			if(currentUserSession==null) {
				throw new CredentialException("Enter Valid Data....");
			}
			else if(currentUserSession.getRole().equalsIgnoreCase("admin")){
				
				Optional<Customer> optional= customerRepo.findById(customerId); 
			    if(optional.isEmpty()) {
			    	throw new CustomerException("customer Data not updated...");
			    }else {
			    	return optional.get();
			    }
				
			}
		    throw new CredentialException("crediantial error...");
	}

	@Override
	public List<Customer> viewAllCustomers() throws CustomerException {
		  List<Customer> list= customerRepo.findAll();
		  if(list.isEmpty()) {
			  throw new CustomerException("customer data not available...");
		  }else {
			  return list;
		  }
	}

}
