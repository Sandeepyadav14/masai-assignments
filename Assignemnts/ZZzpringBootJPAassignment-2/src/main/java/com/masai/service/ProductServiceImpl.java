package com.masai.service;

import java.awt.print.PrinterAbortException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.ProductException;
import com.masai.module.Product;
import com.masai.module.ProductDTO;
import com.masai.repo.ProductDao;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao pd;
	

	@Override
	public Product registerProduct(Product p) throws ProductException {
		
	Product pt=pd.save(p);
	if(pt==null) {
		throw new ProductException("Data not enter");
		
	}else{
		return pt;
	}	
	}

	
	
	
	
	@Override
	public List<Product> getAllProducts() throws ProductException {
		List<Product> list=pd.findAll();
		if(list.isEmpty()) {
			throw new ProductException("data not found...");
			
		}else {
			return list;
		}
		// TODO Auto-generated method stub
		
	}

	
	
	@Override
	public Product updateProdcut(Product p) throws ProductException{
		Optional<Product> opt=pd.findById(p.getProductId());
		if(opt.isPresent()) {
			throw new ProductException("data not updatedd...");
		}else {
			Product ps=pd.save(p);
			return ps;
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product deleteProductById(Integer pid) throws ProductException {
		Optional<Product> opt=pd.findById(pid);
		if(opt.isPresent()) {
			Product p=opt.get();
			pd.delete(p);
			return p;
		}else {
			throw new ProductException("Data not deleted...");
		}
		
}

	@Override
	public List<Product> getsProductByCategory(String category) throws ProductException {
			List<Product> list=pd.findByCategory(category);
			if(list.isEmpty()) {
				throw new ProductException("Data not found...");
			}else {
				return list;
			}
	}


	
	@Override
	public List<ProductDTO> getProductsNameQtyPrice() throws ProductException {
		// TODO Auto-generated method stub
		List<ProductDTO> pdto=pd.getlistProductNameQtyPrice();
		if(pdto.isEmpty()) {
			throw new ProductException("Data not found....");
		}else {
			return pdto;
		}
		
	}

}
