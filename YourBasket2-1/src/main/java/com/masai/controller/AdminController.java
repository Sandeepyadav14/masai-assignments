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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.AdminService;
import com.masai.module.Admin;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	
	@PostMapping("/admin")
	public ResponseEntity<Admin> logInAsAdmin(@RequestBody Admin admin){
		
		Admin admin1=adminService.addAdmin(admin);
		
		return new ResponseEntity<Admin>(admin1,HttpStatus.CREATED);
	}
   
	@PutMapping("/admin/{key}")
	public ResponseEntity<Admin> updateAdmins(@RequestBody Admin admin,@PathVariable("key") String key){
		
		Admin admin2=adminService.updateAdmin(admin,key);
		
		return new ResponseEntity<Admin>(admin2,HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/admin/{adminId}/{key}")
	public ResponseEntity<Admin> removeAdmin(@PathVariable Integer adminId,@PathVariable String key){
		
		Admin admin=adminService.removeAdmin(adminId, key);
		
		return new ResponseEntity<Admin>(admin,HttpStatus.OK);
	}
	
	@GetMapping("/admin/{adminId}/{key}")
	public ResponseEntity<Admin> viewOneAdmin(@PathVariable Integer adminId,@PathVariable String key){
		Admin admin=adminService.viewAdmin(adminId, key);
		return new ResponseEntity<Admin>(admin,HttpStatus.OK);
	}
	
	@GetMapping("/admin")
	public ResponseEntity<List<Admin>> viewAllAdmin(){
		List<Admin> listAdmin=adminService.viewAllAdmin();
		return new ResponseEntity<List<Admin>>(listAdmin,HttpStatus.OK);
	}
}
