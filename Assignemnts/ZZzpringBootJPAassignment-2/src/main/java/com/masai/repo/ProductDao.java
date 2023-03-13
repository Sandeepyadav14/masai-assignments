package com.masai.repo;

import java.awt.print.PrinterException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.exception.ProductException;
import com.masai.module.Product;
import com.masai.module.ProductDTO;
//@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
   public List<Product> findByCategory(String category);
   @Query("select new com.masai.module.ProductDTO(p.name,p.quantity,p.price)from Product p")
   public List<ProductDTO> getlistProductNameQtyPrice()throws ProductException ;
   
}
