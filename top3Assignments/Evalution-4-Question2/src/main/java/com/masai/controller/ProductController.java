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

import com.masai.Module.Product;
import com.masai.Module.ProductDTO;
import com.masai.exception.ProductException;
import com.masai.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	
	@PostMapping("/products")
	ResponseEntity<Product> addProduct(@RequestBody Product product) throws ProductException{
		
		Product products=productService.addNewProduct(product);
		return new ResponseEntity<Product>(products,HttpStatus.OK);
	}
	
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductDTO>> findAllProducts() throws ProductException{
		
	List<ProductDTO> listproducts=	productService.getAllProductDetaiils();
	
	return new ResponseEntity<List<ProductDTO>>(listproducts,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<ProductDTO> getProductById(@PathVariable Integer id) throws ProductException{
	ProductDTO productDTO=	productService.getProductById(id);
	return new ResponseEntity<ProductDTO>(productDTO,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<Product> deleteProductById(@PathVariable Integer id) throws ProductException{
		Product product=productService.deleteProductById(id);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<Product> updatedProductById(@PathVariable Integer id,@RequestBody ProductDTO dto) throws ProductException{
		Product product=productService.updateProduct(id,dto);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	
	}

}
