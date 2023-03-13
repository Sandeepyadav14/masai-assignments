package com.masai.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.CredentialException;
import com.masai.Exception.FeedBackException;
import com.masai.Repository.CurrentUserSessionRepo;
import com.masai.Repository.CustomerRepo;
import com.masai.Repository.FeedBackRepo;
import com.masai.Repository.VegetableRepo;
import com.masai.Service.FeedbackService;
import com.masai.module.CurrentUserSession;
import com.masai.module.FeedBack;
import com.masai.module.Vegetable;

@Service
public class FeedBackServiceImpl implements FeedbackService {

	@Autowired
	private CurrentUserSessionRepo currentUserSessionRepo;
	
	@Autowired
	private VegetableRepo vegetableRepo;
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private FeedBackRepo feedBackRepo;
	
	
	@Override
	public FeedBack addFeedback(FeedBack fdbk, String key) throws FeedBackException, CredentialException {
		
		FeedBack back=null;
		CurrentUserSession currentUserSession=	currentUserSessionRepo.findByUuid(key);
		if(currentUserSession.getRole().equalsIgnoreCase("customer")){
		     if(fdbk==null) {
		    	 throw new FeedBackException("Your feedback not saved...");
		     }else {
		    	back= feedBackRepo.save(fdbk);
		     }
		     return back;
		}
		throw new CredentialException("You are not customer...");
		
	}

	@Override
	public List<FeedBack> viewAllFeedaback(Integer vegetableId) throws FeedBackException {
		List<FeedBack> list=	feedBackRepo.findByVegetablesId(vegetableId);
		if(list.isEmpty()) {
			throw new FeedBackException("Feedback is not available for this vegetables");
			
		}
		else {
			return list;
		}
	
	}

	@Override
	public List<FeedBack> viewFeedback(Integer customerId) throws FeedBackException {
		List<FeedBack> list=feedBackRepo.findByCustomerId(customerId);
		if(list.isEmpty()) {
			throw new FeedBackException("Feedback is not availabe for this customer");
		}else {
			return list;
		}
	}

}
