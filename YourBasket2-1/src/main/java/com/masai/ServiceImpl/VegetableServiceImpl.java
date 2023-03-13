package com.masai.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.CredentialException;
import com.masai.Exception.VegetableException;
import com.masai.Repository.CurrentUserSessionRepo;
import com.masai.Repository.VegetableRepo;
import com.masai.Service.VegetableService;
import com.masai.module.CurrentUserSession;
import com.masai.module.Vegetable;

@Service
public class VegetableServiceImpl implements VegetableService {

	@Autowired
	private CurrentUserSessionRepo currentUserSessionRepo;
	
	
	@Autowired 
	private VegetableRepo vegetableRepo;
	
	
	@Override
	public Vegetable addVegetables(Vegetable vegetables, String key) throws VegetableException {
		CurrentUserSession currentUserSession=	currentUserSessionRepo.findByUuid(key);
		if(currentUserSession==null) {
			throw new CredentialException("Enter Valid Data....");
		}
		else if(currentUserSession.getRole().equalsIgnoreCase("admin")){
			if(vegetables==null) {
				throw new VegetableException("Your vegetable data not saved...");
			}
			return vegetableRepo.save(vegetables);
		}
		else {
			throw new CredentialException("You are not admin...");
		}
	}

	@Override
	public Vegetable updateVegetables(Vegetable vegetables, String key) throws VegetableException {
		CurrentUserSession currentUserSession=	currentUserSessionRepo.findByUuid(key);
		if(currentUserSession==null) {
			throw new CredentialException("Enter Valid Data....");
		}
		
		else if(currentUserSession.getRole().equalsIgnoreCase("admin")){
		   Optional<Vegetable> optional= vegetableRepo.findById(vegetables.getVegId());
		   if(optional.isEmpty()) {
			   throw new VegetableException("Vegetable Data Not Updated...");
		   }else {
			   Vegetable vegetable=optional.get();
			   vegetable.setName(vegetables.getName());
			   vegetable.setPrice(vegetables.getPrice());
			   vegetable.setQuantity(vegetables.getQuantity());
			   vegetable.setType(vegetables.getType());
			 return  vegetableRepo.save(vegetable);
			   
		   }   
			
		}
		else {
			throw new CredentialException("You are not admin...");
		}

	}

	@Override
	public Vegetable removeVegetables(Integer vegetablesId, String key) throws VegetableException {
		CurrentUserSession currentUserSession=	currentUserSessionRepo.findByUuid(key);
		if(currentUserSession==null) {
			throw new CredentialException("Enter Valid Data....");
		}
		
		else if(currentUserSession.getRole().equalsIgnoreCase("admin")){
			  Optional<Vegetable> optional= vegetableRepo.findById(vegetablesId);
			  if(optional.isEmpty()) {
				  throw new VegetableException("Vegetable not delted...");
			  }else {
				  Vegetable vegetable=optional.get();
				 vegetableRepo.delete(vegetable);
				 return vegetable;
			  }
		}
		else {
			throw new CredentialException("You are not admin...");
		}
		
	}

	@Override
	public List<Vegetable> viewsAllVegetables() throws VegetableException {
	    List<Vegetable> listVegetable= vegetableRepo.findAll();
	    if(listVegetable.isEmpty()) {
	    	throw new VegetableException("data not found...");
	    }else {
	    	return listVegetable;
	    }
	}

	@Override
	public List<Vegetable> viewVegetablesList(String type, String key) throws VegetableException {
		
		List<Vegetable> listVegetables=vegetableRepo.findByType(type);
		if(listVegetables.isEmpty()) {
			throw new VegetableException("data not found...");
		}else {
			return listVegetables;
		}
	
	}

	@Override
	public List<Vegetable> viewVegetablesByName(String name, String key) throws VegetableException {
		List<Vegetable> listVegetables=vegetableRepo.findByName(name);
		if(listVegetables.isEmpty()) {
			throw new VegetableException("data not found...");
		}else {
			return listVegetables;
		}	}

}
