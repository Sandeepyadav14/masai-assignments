package com.masai.Service;

import com.masai.DTO.LoginDto;
import com.masai.Exception.*;
import com.masai.module.*;
public interface LoginService {

	
	public String logIntoAccount(User user) throws CredentialException;
	
	public String logOutFromAccount(String key) throws CredentialException;

}
