package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Module.Product;
import com.masai.Module.ProductDTO;
import com.masai.exception.ProductException;
import com.masai.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	
	 @Autowired
	 ProductRepo productRepo;
	@Override
	public String addNewProduct(Product product) throws ProductException {
		productRepo.save(product);
		// TODO Auto-generated method stub
		return "hii;";
	}
	@Override
	public List<ProductDTO> getAllProductDetaiils() throws ProductException {
		List<Product> products=productRepo.findAll();
		System.out.println(products);
		List<ProductDTO> productDTOs=new ArrayList<>();
		
		for(Product i:products) {
			ProductDTO productDTO=new ProductDTO();
			productDTO.setBrand(i.getBrand());
			productDTO.setCategory(i.getCategory());
			productDTO.setName(i.getName());
			productDTO.setPrice(i.getPrice());
			productDTOs.add(productDTO);
		}
		
	if(productDTOs.isEmpty()) {
		throw new ProductException("Data not find..");
	}else {
		return productDTOs;
	}
		
	}
	
	
	@Override
	public ProductDTO getProductById(Integer id) throws ProductException {
		Optional<Product> optional=	productRepo.findById(id);
	 if(optional.isEmpty()) {
		throw new ProductException("Product data is not find"+id);
	 }else {
		Product product=optional.get();
			ProductDTO productDTO=new ProductDTO();
			productDTO.setBrand(product.getBrand());
			productDTO.setCategory(product.getCategory());
			productDTO.setName(product.getName());
			productDTO.setPrice(product.getPrice());
		    return productDTO;
	 }

	 
	 
	 
	}
	@Override
	public Product deleteProductById(Integer id) throws ProductException {
		Optional<Product> optional= productRepo.findById(id);
		if(optional.isEmpty()) {
			throw new ProductException("Product is not deleted...");
		}else {
			Product product=optional.get();
			productRepo.delete(product);
			return product;
		}
		
	}
	
	
	
	
	@Override
	public Product updateProduct(Integer id,ProductDTO dto) throws ProductException {
	Optional<Product> optional=	productRepo.findById(id);
	if(optional.isEmpty()) {
		throw new ProductException("Product is not updated...");
	}else {
		Product product=optional.get();
		product.setBrand(dto.getBrand());
		product.setCategory(dto.getCategory());
		product.setName(dto.getName());
		product.setPrice(dto.getPrice());
		productRepo.save(product);
		return product;
		
	}
	}

}
