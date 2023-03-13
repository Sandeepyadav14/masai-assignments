package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.module.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {

}
