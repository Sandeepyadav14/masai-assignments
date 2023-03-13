package com.service;

import com.exception.AccountException;
import com.exception.InsufficientFundException;
import com.model.Account;
import com.model.AccountDTO;

public interface AccountService {

	public Account openAccount(Account acc)throws AccountException;
	public Account closeAccount(Integer accno)throws AccountException;
	public Account depositAmount(Integer accno, Integer amount)throws
	AccountException;
	public Account withdrawAmmount(int accno, Integer amount)throws
	AccountException, InsufficientFundException;
	public String transferAmount(AccountDTO dto)throws AccountException,
	InsufficientFundException;
	}