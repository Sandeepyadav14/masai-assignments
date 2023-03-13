package com.masai.ServiceImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.BillDetailsException;
import com.masai.Exception.CredentialException;
import com.masai.Repository.BillDetailsRepo;
import com.masai.Repository.CurrentUserSessionRepo;
import com.masai.Repository.OrdersRepo;
import com.masai.Service.BillingService;
import com.masai.module.BillDetails;
import com.masai.module.CurrentUserSession;

@Service
public class BillDetailsServiceImpl implements BillingService {
	
	@Autowired
	private BillDetailsRepo billDetailsRepo;
	
	@Autowired
	private CurrentUserSessionRepo currentUserSessionRepo;

	@Override
	public BillDetails addBill(BillDetails bill,String key) throws BillDetailsException {
		
		 CurrentUserSession currentUserSession= currentUserSessionRepo.findByUuid(key);
		if(currentUserSession==null) {
			throw new CredentialException("Enter Valid Data....");
		}
		else if(currentUserSession.getRole().equalsIgnoreCase("customer")){
			if(bill==null) {
				throw new BillDetailsException("Bill detail not saved...");
			}else {
				bill.setTransactionDate(LocalDateTime.now());
			   return billDetailsRepo.save(bill);	
			}
		}
		
		throw new CredentialException("Credention error...");
			}

	@Override
	public BillDetails updateBill(BillDetails bill,String key) throws BillDetailsException {
		 CurrentUserSession currentUserSession= currentUserSessionRepo.findByUuid(key);
			if(currentUserSession==null) {
				throw new CredentialException("Enter Valid Data....");
			}
			else if(currentUserSession.getRole().equalsIgnoreCase("customer")){
				Optional<BillDetails> optional= billDetailsRepo.findById(bill.getBillingDetailsId());
				if(optional.isEmpty()) {
					throw new BillDetailsException("bill detail not updated...");
				}else {
					BillDetails billDetails=optional.get();
					billDetails.setOrderId(bill.getOrderId());
					billDetails.setBillingAddress(bill.getBillingAddress());
					billDetails.setTransactionDate(LocalDateTime.now());
					billDetails.setTransactionMode(bill.getTransactionMode());
					billDetails.setTransactionStatus(bill.getTransactionStatus());
					
				    return  billDetailsRepo.save(billDetails);
				    
				}
			}
			throw new CredentialException("Credention error...");

		
	}

	@Override
	public BillDetails viewBill(Integer id) throws BillDetailsException {
		  Optional<BillDetails> optional= billDetailsRepo.findById(id);
		  if(optional.isEmpty()) {
			  throw new BillDetailsException("bill not available..");
		  }else{
			  return optional.get();
		  }
	}

}
