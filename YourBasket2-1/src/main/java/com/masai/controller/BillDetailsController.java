package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Repository.BillDetailsRepo;
import com.masai.Service.BillingService;
import com.masai.module.BillDetails;

@RestController
public class BillDetailsController {

	
	@Autowired
	private BillingService billingService;
	
	@PostMapping("/billdetail/{key}")
	public ResponseEntity<BillDetails> addBill(@RequestBody BillDetails billDetails,@PathVariable String key){
		
		BillDetails billDetails2=billingService.addBill(billDetails, key);
		
		return new ResponseEntity<BillDetails>(billDetails2,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/billdetail/{key}")
	public ResponseEntity<BillDetails> getBillDetails(  @RequestBody BillDetails billDetails, @PathVariable String key ){
		
		BillDetails billDetails1=billingService.updateBill(billDetails, key);
		
		return new ResponseEntity<BillDetails>(billDetails1,HttpStatus.OK);
	}
	
	@GetMapping("/billdetail/{billId}")
	public ResponseEntity<BillDetails> getBillDetails(@PathVariable Integer billId){
		
		BillDetails billDetails=billingService.viewBill(billId);
		
		return new ResponseEntity<BillDetails>(billDetails,HttpStatus.OK);
	}
	
	
}
