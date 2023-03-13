package com.masai.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.module.Orders;

@Repository
public interface OrdersRepo extends JpaRepository<Orders, Integer> {

	List<Orders> findByCustomerId(Integer customerId);
}
