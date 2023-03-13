package com.masai.service;

import java.util.List;

import com.masai.exception.ProductException;
import com.masai.module.Product;
import com.masai.module.ProductDTO;

public interface ProductService {
	public Product registerProduct(Product p)throws ProductException;
	public List<Product> getAllProducts()throws ProductException;
	public Product updateProdcut(Product p)throws ProductException;
	public Product deleteProductById(Integer pid)throws ProductException;
	public List<Product> getsProductByCategory(String category)throws ProductException;
    	public List<ProductDTO> getProductsNameQtyPrice() throws ProductException;
}
