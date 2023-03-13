package com.masai.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.module.Vegetable;

@Repository
public interface VegetableRepo extends JpaRepository<Vegetable, Integer> {
    
	List<Vegetable> findByType(String type);
	List<Vegetable> findByName(String name);
}
