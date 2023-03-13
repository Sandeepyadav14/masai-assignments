package com.masai.Service;

import com.masai.Exception.*;
import com.masai.module.*;

import java.util.List;

public interface AdminService {

    public Admin addAdmin(Admin admin) throws AdminException;

    public Admin updateAdmin(Admin admin, String key) throws CredentialException;

    public Admin removeAdmin(Integer adminId, String key) throws CredentialException;

    public Admin viewAdmin(Integer adminId, String key) throws CredentialException;

    public List<Admin> viewAllAdmin() throws AdminException;

}
