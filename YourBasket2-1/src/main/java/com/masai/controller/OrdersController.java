package com.masai.controller;

import java.util.List;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.OrdersService;
import com.masai.module.Orders;

@RestController
public class OrdersController {
	
	@Autowired
	private OrdersService ordersService;
	
	@PostMapping("/addOrder/{key}")
	public ResponseEntity<Orders> addOrders(@RequestBody Orders orders,@PathVariable String key){
		
		Orders orders2 =ordersService.addOrder(orders,  key);
		
		return new ResponseEntity<Orders>(orders2,HttpStatus.OK);
		
	}
	
	@GetMapping("/order/{orderId}")
	public ResponseEntity<Orders> viewOrders(@PathVariable Integer orderId){
		
		Orders orders=ordersService.viewOrder(orderId);
		
		return new ResponseEntity<Orders>(orders,HttpStatus.OK);
	}
	@PutMapping("/order/{key}")
    public ResponseEntity<Orders> updatedOrders(@RequestBody Orders orders,@PathVariable String key){
		
		Orders orders2=ordersService.UpdateOrderDetails(orders, key);
		
		return new ResponseEntity<Orders>(orders2,HttpStatus.OK);
	}
	
	@GetMapping("/getallOrders/{customerId}")
	public ResponseEntity<List<Orders>> getAllOrdersByCustomerId(@PathVariable Integer customerId){
		
		List<Orders> list=ordersService.viewAllOrders(customerId);
		
		return new ResponseEntity<List<Orders>>(list,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/vieworders")
	public ResponseEntity<List<Orders>> viewOrdersList(){
		
		List<Orders> list=ordersService.viewOrderList();
		
		return new ResponseEntity<List<Orders>>(list,HttpStatus.OK);
	}
    
	@DeleteMapping("/cancelorder/{orderId}/{key}")
	public ResponseEntity<Orders> cancelOrders(@PathVariable Integer orderId,@PathVariable String key){
		
		Orders orders=ordersService.cancleOrder(orderId, key);
		
		return new ResponseEntity<Orders>(orders,HttpStatus.OK);
	}
}
