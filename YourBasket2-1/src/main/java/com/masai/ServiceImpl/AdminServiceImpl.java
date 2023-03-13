package com.masai.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.AdminException;
import com.masai.Exception.CredentialException;
import com.masai.Repository.AdminRepo;
import com.masai.Repository.CurrentUserSessionRepo;
import com.masai.Service.AdminService;
import com.masai.module.Admin;
import com.masai.module.CurrentUserSession;

@Service
public class AdminServiceImpl implements AdminService {
	
	
	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	CurrentUserSessionRepo currentUserSessionRepo;

	@Override
	public Admin addAdmin(Admin admin) throws AdminException {
		if(admin==null) {
			throw new AdminException("Admin Data Is null ...");
		}	
	     return adminRepo.save(admin);
		
	}

	@Override
	public Admin updateAdmin(Admin admin, String key) throws CredentialException {
	CurrentUserSession currentUserSession=	currentUserSessionRepo.findByUuid(key);
	if(currentUserSession==null) {
		throw new CredentialException("Enter Valid Data....");
	}
	 Optional<Admin> optional= adminRepo.findById(admin.getAdminId());
	 if(optional.isEmpty()) {
     throw new AdminException("Admin Data Not Updated....");
     }else {
    	 Admin admin2=optional.get();
    	 admin2.setContactNumber(admin.getContactNumber());
    	 admin2.setEmailId(admin.getEmailId());
    	 admin2.setName(admin.getName());
    	 admin2.setPassword(admin.getPassword());
    	return  adminRepo.save(admin2);
	}
		
	}

	@Override
	public Admin removeAdmin(Integer adminId, String key) throws CredentialException {
		CurrentUserSession currentUserSession=	currentUserSessionRepo.findByUuid(key);
		if(currentUserSession==null) {
			throw new CredentialException("Enter Valid Data....");
		}
		Optional<Admin> optional=adminRepo.findById(adminId);
		if(optional.isEmpty()) {
			throw new AdminException("Admin Data Not deleted....");
		}
		else {
			Admin admin=optional.get();
			adminRepo.delete(admin);
			return admin;
		}
	}

	@Override
	public Admin viewAdmin(Integer adminId, String key) throws CredentialException {
		CurrentUserSession currentUserSession=	currentUserSessionRepo.findByUuid(key);
		if(currentUserSession==null) {
			throw new CredentialException("Enter Valid Data....");
		}
		Optional<Admin> optional=adminRepo.findById(adminId);
		if(optional.isEmpty()) {
			throw new AdminException("Admin Data is null...");
		}else {
			Admin admin=optional.get();
			return admin;
		}
	}

	@Override
	public List<Admin> viewAllAdmin() throws AdminException {
		List<Admin> adminList= adminRepo.findAll();
		if(adminList.isEmpty()) {
			throw new AdminException("Admin data is null please Enter a valid  Id");
		}else {
			return adminList;
		}
	}

}
