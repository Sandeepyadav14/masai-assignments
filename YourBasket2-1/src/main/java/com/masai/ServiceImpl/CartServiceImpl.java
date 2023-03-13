package com.masai.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.CartException;
import com.masai.Exception.CredentialException;
import com.masai.Exception.VegetableException;
import com.masai.Repository.CartRepo;
import com.masai.Repository.CurrentUserSessionRepo;
import com.masai.Repository.VegetableRepo;
import com.masai.Service.CartService;
import com.masai.module.Cart;
import com.masai.module.CurrentUserSession;
import com.masai.module.Vegetable;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CurrentUserSessionRepo currentUserSessionRepo;
	
	@Autowired
	private CartRepo cartRepo;
	
	@Autowired
	private VegetableRepo vegetableRepo;

	
	@Override
	public Cart createCart(Cart cart) throws CartException {
		
		if(cart==null) {
			
			throw new CartException("Cart is null");
			
		}else {
			
		   return  cartRepo.save(cart);
		   
		}
	}
	
	@Override
	public Vegetable addToCart(Integer cartId,Vegetable veg,String key) throws VegetableException {
		CurrentUserSession currentUserSession=	currentUserSessionRepo.findByUuid(key);
		if(currentUserSession==null) {
			throw new CredentialException("Enter Valid Data....");
		}else if(currentUserSession.getRole().equalsIgnoreCase("customer")) {
		   Optional<Cart> optional=cartRepo.findById(cartId);
		   if(optional.isEmpty()) {
			   throw new  CartException("cart is null");
		   }else {
			   Cart cart=optional.get();
			   cart.setCustomerId(currentUserSession.getId());
				cart.getVegetableList().add(veg);
				cartRepo.save(cart);
				System.out.print(cart);
				return veg;
		   }
		}
		else {
			throw new CredentialException("You are not Customer...");
		}
		
	}

	@Override
	public Cart increaseVegQuantity(Integer cartId,Integer vegid, Integer quantity,String key) throws VegetableException {
		CurrentUserSession currentUserSession=	currentUserSessionRepo.findByUuid(key);
		if(currentUserSession==null) {
			throw new CredentialException("Enter Valid Data....");
		}else if(currentUserSession.getRole().equalsIgnoreCase("customer")) {
			Optional<Cart> optional=cartRepo.findById(cartId);
		   if(optional.isEmpty()) {
			   throw new CartException("Cart is null");
		   }
		   else {
			   List<Vegetable> list=optional.get().getVegetableList();
			   for(Vegetable i:list) {
				   if(i.getVegId()==vegid) {
					   i.setQuantity(i.getQuantity()+quantity);
					   
				   }
			   }
			   Cart cart=optional.get();
			   cart.setVegetableList(list);
			   cartRepo.save(cart);
			   return cart;
		   }
		}
		else {
			throw new CredentialException("You are not Customer...");
		}
		
	}

	@Override
	public Cart dcreaseVegQuantity(Integer cartId,Integer vegid, Integer quantity,String key) throws VegetableException {
		
		CurrentUserSession currentUserSession=currentUserSessionRepo.findByUuid(key);
		if(currentUserSession==null) {
			throw new CredentialException("Enter Valid Data....");
		}else if(currentUserSession.getRole().equalsIgnoreCase("customer")) {
			Optional<Cart> optional=cartRepo.findById(cartId);
		   if(optional.isEmpty()) {
			   throw new CartException("Cart is null");
		   }
		   else {
			   List<Vegetable> list=optional.get().getVegetableList();
			   for(Vegetable i:list) {
				   if(i.getVegId()==vegid) {
					   i.setQuantity(i.getQuantity()-quantity);
					   
				   }
			   }
			   Cart cart=optional.get();
			   cart.setVegetableList(list);
			   cartRepo.save(cart);
			   return cart;
		   }
		}
		else {
			throw new CredentialException("You are not Customer...");
		}
		
	}

	@Override
	public Cart removeVegetables(Integer id) throws VegetableException {
		Cart cart=null;
		 List<Cart> list=cartRepo.findAll();
		 for(Cart i:list) {
			List<Vegetable> vegeList= i.getVegetableList();
			Vegetable vegetable=null;
			for(Vegetable j:vegeList) {
				if(j.getVegId()==id) {
					vegetable=j;
					vegeList.remove(vegetable);
					break;
				}
				i.setVegetableList(vegeList);
			}
			cart =cartRepo.save(i);
		 }
		 return cart;
	}

	@Override
	public Cart removeAllVegetables(Integer cartId) throws VegetableException {
		   Optional<Cart> optional= cartRepo.findById(cartId);
		   if(optional.isEmpty()) {
			   throw new VegetableException("vegetable not deleted...");
		   }else {
			   Cart cart=optional.get();
			   cart.setVegetableList(null);
			   cartRepo.save(cart);
			   return cart;
			   
		   }
		
	}

	@Override
	public List<Vegetable> ViewAllItems(Integer cartId) throws VegetableException {
		   
		Optional<Cart> optional=cartRepo.findById(cartId);
		if(optional.isEmpty()) {
			throw new VegetableException("vegetable not available...");
		}else {
			Cart cart=optional.get();
			   List<Vegetable> list= cart.getVegetableList();
			   return list;
		}
	}

	

}
