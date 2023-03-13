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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.CustomerServices;
import com.masai.module.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerServices customerServices;
	
	@PostMapping("/")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
		
	Customer customer2=customerServices.addNewCustomer(customer);
	
   return new ResponseEntity<Customer>(customer2,HttpStatus.CREATED);
   
	}
	
	@PutMapping("/")
	public ResponseEntity<Customer> updatedCustomer(@RequestBody Customer customer){
		
		Customer customer2=customerServices.updateExistingCustomer(customer);
		
		return new ResponseEntity<>(customer2,HttpStatus.OK);
	}
	@DeleteMapping("/{password}")
	public ResponseEntity<String> deleteCustomer(@PathVariable String password){
		
		String msg=customerServices.removeExistingCustomer(password);
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/{customerId}/{key}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Integer customerId,@PathVariable String key){
		
		Customer customer=customerServices.viewExistingCustomer(customerId, key);
		
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
	
	@GetMapping("/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		
		List<Customer> list=customerServices.viewAllCustomers();
		
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
}

