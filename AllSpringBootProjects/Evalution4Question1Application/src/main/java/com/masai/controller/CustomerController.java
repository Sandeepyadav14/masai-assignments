package com.masai.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Dao.CustomerService;
import com.masai.bean.Customer;
import com.masai.exception.CustomerException;

@RestController
public class CustomerController {
	@Autowired 
	private CustomerService cservice;
	
	
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> registerCustomerdata(@RequestBody Customer customer) throws CustomerException{
		
		Customer cu=cservice.registerCustomer(customer);
		return new ResponseEntity<Customer> (cu,HttpStatus.CREATED);
		
	}
	
	
	
	
	@GetMapping("/customer/{customerid}")
 public ResponseEntity<Customer> getCustomerByCustomerId(@PathVariable("customerid") Integer customerid) throws CustomerException {
		
		Customer c=cservice.getCustomerById(customerid);
		return new ResponseEntity<Customer> (c,HttpStatus.OK);
		
	}
	
	
	
	
	@DeleteMapping("/customer/{customerid}")
public ResponseEntity<Customer> removeCustomerByCustomerId(@PathVariable("customerid") Integer customerid) throws CustomerException {
		
		Customer c1=cservice.deleteCustomerById(customerid);
		return new ResponseEntity<Customer> (c1,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/allcustomer")
public ResponseEntity<List<Customer>> getAllCustomer() throws CustomerException {
		
		List<Customer> list=cservice.getAllCustomerDetails();
		return new ResponseEntity<> (list,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/allCustomerbyaddress/{address}")
	public ResponseEntity<List<Customer>> getAllCustomer(@PathVariable("address")String address) throws CustomerException {
			
			List<Customer> list=cservice.getCustomerDetailsByAddress(address);
			return new ResponseEntity<> (list,HttpStatus.OK);
			
		}
	
	
	
	@PutMapping("/customer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) throws CustomerException {
		
		Customer c=cservice.updateCustomer(customer);
		return new ResponseEntity<> (c,HttpStatus.OK);
		
	}

	
	
	
	

}
