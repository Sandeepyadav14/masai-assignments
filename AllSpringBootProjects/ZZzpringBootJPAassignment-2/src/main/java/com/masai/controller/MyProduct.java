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

import com.masai.exception.*;
import com.masai.module.Product;
import com.masai.module.ProductDTO;
import com.masai.service.ProductService;

@RestController
public class MyProduct {
	
    @Autowired
	ProductService ps;
    
    
	@PostMapping("/Product")
	public ResponseEntity<Product> addProduct(@RequestBody Product p) throws ProductException  {
		Product pd=ps.registerProduct(p);
		return new ResponseEntity<Product>(pd,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/AllProduct")
	public ResponseEntity<List<Product>> listProduct() throws ProductException{
		List<Product> list=ps.getAllProducts();
		return new ResponseEntity<>(list,HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/product")
	public ResponseEntity<Product> updatesProduct(@RequestBody Product p) throws ProductException {
		Product product=ps.updateProdcut(p);
		return new ResponseEntity<>(product,HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity<Product> deleteProduct(@PathVariable("id")Integer productid) throws ProductException{
		Product p=ps.deleteProductById(productid);
		return new ResponseEntity<>(p,HttpStatus.ACCEPTED);	}
	
	@GetMapping("productbyaddress/{address}")
	public ResponseEntity<List<Product>> allProductDetailByAddress(@PathVariable("address")String address)throws ProductException
	{
		List<Product> plist=ps.getsProductByCategory(address);
		return new ResponseEntity<>(plist,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("dtoproduct")
	public ResponseEntity<List<ProductDTO>> getQuantityPriceName()throws ProductException{
		   List<ProductDTO> list=ps.getProductsNameQtyPrice();
		   return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	
}
