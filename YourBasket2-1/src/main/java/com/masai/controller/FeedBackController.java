package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Repository.FeedBackRepo;
import com.masai.Service.FeedbackService;
import com.masai.module.FeedBack;

@RestController
public class FeedBackController {
	
	@Autowired
	private FeedbackService feedbackService;
	
	
	@PostMapping("/feedback/{key}")
	public ResponseEntity<FeedBack> saveFeedBack(@RequestBody FeedBack back,@PathVariable String key){
		
	 FeedBack feedBack=feedbackService.addFeedback(back, key);
	 
	 return new ResponseEntity<FeedBack>(feedBack,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/feedbackByVegId/{vegId}")
    public ResponseEntity<List<FeedBack>> getFeedBackByVegId(@PathVariable Integer vegId){
		
			List<FeedBack> feedBacklist=feedbackService.viewAllFeedaback(vegId);
			
			return new ResponseEntity<List<FeedBack>>(feedBacklist,HttpStatus.OK);
	}
	
	@GetMapping("/feedbackBycustomerId/{customerId}")
    public ResponseEntity<List<FeedBack>> getFeedBackBycustomerId(@PathVariable Integer customerId){
		
			List<FeedBack> feedBacklist=feedbackService.viewFeedback(customerId);
			
			return new ResponseEntity<List<FeedBack>>(feedBacklist,HttpStatus.OK);
	}

}
