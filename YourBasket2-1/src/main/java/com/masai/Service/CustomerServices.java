package com.masai.Service;

import com.masai.Exception.*;
import com.masai.module.*;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerServices {

    public Customer addNewCustomer(Customer customer) throws CustomerException;

    public Customer updateExistingCustomer(Customer customer) throws CustomerException;

    public String removeExistingCustomer(String password) throws CredentialException;

    public Customer viewExistingCustomer(Integer customerId,String key) throws CustomerException;

    public List<Customer> viewAllCustomers() throws CustomerException;
}
