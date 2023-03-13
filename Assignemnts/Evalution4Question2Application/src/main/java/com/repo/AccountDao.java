package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Account;


public interface AccountDao extends JpaRepository<Account,Integer>{

}