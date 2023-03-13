package com.masai.service;

import java.util.List;

import com.masai.Module.Product;
import com.masai.Module.ProductDTO;
import com.masai.exception.ProductException;

public interface ProductService {
	 public String addNewProduct(Product product) throws ProductException;
	 public List<ProductDTO> getAllProductDetaiils()throws ProductException;
	 public ProductDTO getProductById(Integer id) throws ProductException;
	 public Product deleteProductById(Integer id) throws ProductException;
	 public Product updateProduct(Integer id,ProductDTO productDTO)throws ProductException;
}
