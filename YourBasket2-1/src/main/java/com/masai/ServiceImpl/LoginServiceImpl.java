package com.masai.ServiceImpl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.DTO.LoginDto;
import com.masai.Exception.AdminException;
import com.masai.Exception.CredentialException;
import com.masai.Exception.CustomerException;
import com.masai.Exception.UserException;
import com.masai.Repository.AdminRepo;
import com.masai.Repository.CurrentUserSessionRepo;
import com.masai.Repository.CustomerRepo;
import com.masai.Service.LoginService;
import com.masai.module.Admin;
import com.masai.module.CurrentUserSession;
import com.masai.module.Customer;
import com.masai.module.User;

import net.bytebuddy.utility.RandomString;

@Service
public class LoginServiceImpl implements LoginService {
     
	
	@Autowired
	private AdminRepo adminRepo;
	
	
	@Autowired
	private CustomerRepo customerRepo;
	
	
	@Autowired
	private CurrentUserSessionRepo currentUserSessionRepo;
	
	
	@Override
	public String logIntoAccount(User user) throws CredentialException {
		
		//for admin
		if(user.getRole().equalsIgnoreCase("admin")) {   //first we check user which type
			
			Admin admin=adminRepo.findByEmailId(user.getUserId());//if user admin we find out admin by emailid;
			
		    if(admin==null) {//if admin is not present so throw exception'
		    	
			throw new AdminException("Enter the proper detail...");
			
		   }
		    
		   Optional<CurrentUserSession> optional= currentUserSessionRepo.findById(admin.getAdminId());//after you can check current sesion user already exist or not if user exist then u throw user exception
		   
		   if(optional.isPresent()) {
			   
			   throw new UserException("User Already Logedd...");
		   }
		   
		   
		   if(admin.getPassword().equals(user.getPassword())) {//if user not logeed so you can check enter password right or wrong with admin between user.
			   
			   String key= RandomString.make(6);//you can generate UUId 
			                                     
			   CurrentUserSession currentUserSession=new CurrentUserSession();//after that if admin email and password right you can admin id and localdate and uuid data save in ussersesssion.
			   currentUserSession.setId(admin.getAdminId());
			   currentUserSession.setLocalDateTime(LocalDateTime.now());
			   currentUserSession.setUuid(key);
			   currentUserSession.setRole(user.getRole());
			   currentUserSessionRepo.save(currentUserSession);
			   
			   
			   return currentUserSession.toString();
			   
		   }else{
			   
		      throw new UserException("Admin Password Is Wrong....");
		   }
		
		}
		
		
		
		//for customer
		else if(user.getRole().equalsIgnoreCase("customer")) {
			Customer customer=customerRepo.findByEmail(user.getUserId());
			if(customer==null) {
				throw new CustomerException("Enter the proper email....");
			}
		   Optional<CurrentUserSession> optional=currentUserSessionRepo.findById(customer.getCustomerId());
		     
		   System.out.print(false);
		   System.out.print(optional);
		  if(optional.isPresent()) {
			  throw new CredentialException("User already logged in...");
		  }
			  if(customer.getPassword().equals(user.getPassword())) {
				  String key=RandomString.make(6);
				  
				  CurrentUserSession currentUserSession=new  CurrentUserSession();
				  currentUserSession.setId(customer.getCustomerId());
				  currentUserSession.setLocalDateTime(LocalDateTime.now());
				  currentUserSession.setUuid(key);
				  currentUserSession.setRole(user.getRole());
				  currentUserSessionRepo.save(currentUserSession);
				  
				  return currentUserSession.toString();
			  }
			  else {
				  throw new CustomerException("Enter a valid password....");
			  }
		  
		   
	  }
		
		//if customer and admin type not enter so generate this else condition...
		else {
			throw new UserException("Invalid User Details.....");
		}
	}

	@Override
	public String logOutFromAccount(String key) throws CredentialException {
		
		CurrentUserSession currentUserSession=currentUserSessionRepo.findByUuid(key);
		if(currentUserSession==null) {
			throw new UserException("User not logged in...");
		}else {
			currentUserSessionRepo.delete(currentUserSession);
			return "User Log Out Succesfully...";
		}
		
	}

}
