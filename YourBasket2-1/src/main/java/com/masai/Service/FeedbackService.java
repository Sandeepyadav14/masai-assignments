package com.masai.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Exception.*;
import com.masai.module.*;

public interface FeedbackService {
	
    public FeedBack addFeedback(FeedBack fdbk,String key) throws FeedBackException ,CredentialException;
	
	public List<FeedBack> viewAllFeedaback(Integer vegetableId) throws FeedBackException;
	
	public List <FeedBack> viewFeedback(Integer customerId) throws FeedBackException;

}
