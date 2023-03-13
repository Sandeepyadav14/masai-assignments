package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Module.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
