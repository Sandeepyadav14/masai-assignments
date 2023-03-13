package com.masai.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.module.FeedBack;

@Repository
public interface FeedBackRepo extends JpaRepository<FeedBack, Integer> {

	List<FeedBack> findByCustomerId(Integer customerId);
	List<FeedBack> findByVegetablesId(Integer vegetablesId);
	
}
