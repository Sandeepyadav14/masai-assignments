package com.masai.ServiceImpl;

import java.lang.StackWalker.Option;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.CartException;
import com.masai.Exception.CredentialException;
import com.masai.Exception.OrdersException;
import com.masai.Exception.VegetableException;
import com.masai.Repository.CartRepo;
import com.masai.Repository.CurrentUserSessionRepo;
import com.masai.Repository.OrdersRepo;
import com.masai.Repository.VegetableRepo;
import com.masai.Service.OrdersService;
import com.masai.module.Cart;
import com.masai.module.CurrentUserSession;
import com.masai.module.Orders;
import com.masai.module.Vegetable;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private CurrentUserSessionRepo currentUserSessionRepo;
	
	@Autowired
	private OrdersRepo ordersRepo;
	
	@Autowired
	private VegetableRepo vegetableRepo;
	
	@Autowired
	private CartRepo cartRepo;
	
	
	@Override
	public Orders addOrder(Orders order, String key) throws OrdersException {
		
		CurrentUserSession currentUserSession=	currentUserSessionRepo.findByUuid(key);
		if(currentUserSession==null) {
			throw new CredentialException("Enter Valid Data....");
		}
		else if(currentUserSession.getRole().equalsIgnoreCase("customer")){
			 if(order==null) {
				 throw new OrdersException("Order not saved..");
			 }else {
				 
				 return ordersRepo.save(order);
			 }
				 
		}else {
			throw new CredentialException("Credention error...");
			
	
		}
						
			
	}

	@Override
	public Orders viewOrder(Integer orderId) throws OrdersException {
		 
		Optional<Orders> optional= ordersRepo.findById(orderId);
	       if(optional.isEmpty()) {
	    	   throw new OrdersException("order not available this id"+orderId);
	       }else {
	    	   Orders orders=optional.get();
	    	   return orders;
	       }

     
	}
	
	

	@Override
	public Orders UpdateOrderDetails(Orders order, String key) throws OrdersException {
		
		CurrentUserSession currentUserSession=	currentUserSessionRepo.findByUuid(key);
		if(currentUserSession==null) {
			throw new CredentialException("Enter Valid Data....");
		}
		else if(currentUserSession.getRole().equalsIgnoreCase("customer")){
			      Optional<Orders> optional= ordersRepo.findById(order.getOrderNo());
			      if(optional.isEmpty()) {
			    	  throw new OrdersException("Order not updated....");
			      }else {
			    	  Orders orders=optional.get();
			    	  orders.setCustomerId(order.getCustomerId());
			    	  orders.setStatus(order.getStatus());
			    	  orders.setTotalAmount(order.getTotalAmount());
			    	  orders.setVegetables(order.getVegetables());
			    	   return  ordersRepo.save(orders);  
			      }
		}
		throw new CredentialException("Credention error...");
	}

	
	
	@Override
	public List<Orders> viewAllOrders(int custid) throws OrdersException {
		
		    List<Orders> list= ordersRepo.findByCustomerId(custid);
		    if(list.isEmpty()) {
		    	throw new OrdersException("Orders Not found...");
		    }else {
		    	return list;
		    }
		
	}

	
	
	@Override
	public List<Orders> viewAllOrdersBydate(LocalDate date) throws OrdersException {
		 return null;
	}

	@Override
	public List<Orders> viewOrderList() throws OrdersException {
		
		List<Orders> list=ordersRepo.findAll();
		if(list.isEmpty()) {
			throw new OrdersException("Order not available..");
		}else {
			return list;
		}
		
	}

	@Override
	public Orders cancleOrder(int orderid, String key) throws OrdersException {
		CurrentUserSession currentUserSession=	currentUserSessionRepo.findByUuid(key);
		if(currentUserSession==null) {
			throw new CredentialException("Enter Valid Data....");
		}
		else if(currentUserSession.getRole().equalsIgnoreCase("customer")){
		        Optional<Orders> optional=	ordersRepo.findById(orderid);
		        if(optional.isEmpty()) {
		        	throw new OrdersException("order not canceled...");
		        }else {
		        	Orders orders=optional.get();
		        	ordersRepo.delete(orders);
		        	return orders;
		        }
		}
		throw new CredentialException("Credention error...");
	}

}
