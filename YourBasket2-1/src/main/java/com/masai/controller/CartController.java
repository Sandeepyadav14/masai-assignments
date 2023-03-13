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
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.CartService;
import com.masai.module.Cart;
import com.masai.module.Vegetable;


@RestController
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	
	
	@PostMapping("/cart")
	public ResponseEntity<Cart> createCart(@RequestBody Cart cart){
		
		Cart cart2=cartService.createCart(cart);
		
		return new ResponseEntity<Cart>(cart2,HttpStatus.OK);
	}
	
	
	
	
	@PostMapping("/cart/{cartId}/{key}")
	public ResponseEntity<Vegetable> addtoVegetables(@PathVariable Integer cartId,@RequestBody Vegetable vegetable,@PathVariable String key) {
		
		Vegetable vegetable2=cartService.addToCart(cartId,vegetable, key);
		
		return new ResponseEntity<Vegetable>(vegetable2,HttpStatus.CREATED);
	}
	
	@PutMapping("/increasecart/{cartId}/{vegId}/{quantity}/{key}")
	public ResponseEntity<Cart> increaseQuantity(@PathVariable Integer cartId,@PathVariable Integer vegId,@PathVariable Integer quantity,@PathVariable String key){
		
		Cart cart=cartService.increaseVegQuantity(cartId, vegId, quantity, key);
		
		return new ResponseEntity<Cart>(cart,HttpStatus.OK);
	}
	
	@PutMapping("/decreasecart/{cartId}/{vegId}/{quantity}/{key}")
	public ResponseEntity<Cart> decreaseQuantity(@PathVariable Integer cartId,@PathVariable Integer vegId,@PathVariable Integer quantity,@PathVariable String key){
		
		Cart cart=cartService.dcreaseVegQuantity(cartId, vegId, quantity, key);
		
		return new ResponseEntity<Cart>(cart,HttpStatus.OK);
	}
	
	@PutMapping("/cart/vegetable/{vegId}")
	public ResponseEntity<Cart> removeVegetable(@PathVariable Integer vegId){
		
		Cart cart=cartService.removeVegetables(vegId);
		
		return new ResponseEntity<Cart>(cart,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/cart/allvegetable/{cartId}")
	public ResponseEntity<Cart> removeAllVegetable(@PathVariable Integer cartId){
		
		Cart cart=cartService.removeAllVegetables(cartId);
		
		return new ResponseEntity<Cart>(cart,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getVegetables/{cartId}")
	public ResponseEntity<List<Vegetable>> getAllVegetables(@PathVariable Integer cartId){
		
		      List<Vegetable> list= cartService.ViewAllItems(cartId);
		      
		      return new  ResponseEntity<List<Vegetable>>(list,HttpStatus.ACCEPTED);
	}

}
