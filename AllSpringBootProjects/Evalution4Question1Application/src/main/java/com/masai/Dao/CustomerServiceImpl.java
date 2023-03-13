package com.masai.Dao;

import java.util.List;
import java.util.Optional;

//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.Repostery.CustomerDao;
import com.masai.bean.Customer;
import com.masai.bean.CustomerDTO;
import com.masai.exception.CustomerException;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private  CustomerDao cdao;
	
	@Override
	public Customer registerCustomer(Customer  customer) throws CustomerException {
		// TODO Auto-generated method stub
		Customer c=cdao.save(customer);
		return c;
	}

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerException {
		// TODO Auto-generated method stub

		Optional<Customer> opt=cdao.findById(customerId);
		if(opt.isPresent()) {
			Customer c=opt.get();
			return c;
		}else {
			throw new CustomerException("Customer does not Exist");
		}
	   
	}


	

	@Override
	public List<Customer> getAllCustomerDetails() throws CustomerException {
		// TODO Auto-generated method stub
		List<Customer> list=cdao.findAll();
		if(list.isEmpty()) {
			throw new CustomerException();
		}else {
			return list;
		}
	}

	@Override
	public Customer deleteCustomerById(Integer customerId) throws CustomerException {
		
		Optional<Customer> opt=cdao.findById(customerId);
		if(opt.isPresent()) {
			Customer c=opt.get();
			cdao.delete(c);
			return c;
		}
		else{
			throw new CustomerException("Customer not deleted...");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getCustomerDetailsByAddress(String address) throws CustomerException {
		// TODO Auto-generated method stub
		List<Customer> list=cdao.findByAddress(address);
		if(list.isEmpty()) {
			throw new CustomerException("Address is wrong...");
		}
		else {
			return list;
		}
		
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
		Optional<Customer> opt=cdao.findById(customer.getCustomerId());
		if(opt.isPresent()) {
	
			Customer cust=cdao.save(customer);
			return cust;
		}else {
			throw new CustomerException("Customer data not updated...");
		}
		
		
	
	}

	@Override
	public List<Customer> getCustomersBetweenAge(Integer start_age, Integer end_age) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers() throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer loginCustomer(String email, String password) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomerPassword(String username, String oldPassword, String newPassword)
			throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

}
