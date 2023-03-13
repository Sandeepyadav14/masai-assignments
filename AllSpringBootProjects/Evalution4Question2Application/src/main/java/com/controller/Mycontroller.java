package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.AccountException;
import com.exception.InsufficientFundException;
import com.model.Account;
import com.model.AccountDTO;
import com.service.AccountService;

@RequestMapping("Acc")
@RestController

public class Mycontroller {
	
	@Autowired
	private AccountService accd;

	@PostMapping("/account")
	public Account openAccountHandler(@RequestBody Account acc)throws AccountException{
		
		return  accd.openAccount(acc);
	}
	
	@DeleteMapping("/account/{accno}")
	public Account closeAccountHandler(@PathVariable Integer accno)throws AccountException{
		
		return accd.closeAccount(accno);
	}
	
	@PutMapping("/dep/{accno}/{amount}")
	public Account depositAmountHandler(@PathVariable Integer accno,@PathVariable Integer amount)throws
	AccountException{
		
		return accd.depositAmount(accno, amount);
		
	}

	@PutMapping("/with/{accno}/{amount}")
	public Account withdrawAmmountHandler(int accno, Integer amount)throws
	AccountException, InsufficientFundException{
		
		return accd.withdrawAmmount(accno, amount);
		
	}
	
	@PostMapping("/acctdto")
	public String transferAmountHandler(@RequestBody  AccountDTO dto)throws AccountException,
	InsufficientFundException{
		return accd.transferAmount(dto);
	}

}