package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.module.BillDetails;

@Repository
public interface BillDetailsRepo extends JpaRepository<BillDetails, Integer> {

}
