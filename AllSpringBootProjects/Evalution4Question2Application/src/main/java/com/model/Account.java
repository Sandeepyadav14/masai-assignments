package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountNo;
	private String accountHolderName;
	private String address;
	private String email;
	private Integer  balance;
	private String mobile;
	public Integer getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Account(Integer accountNo, String accountHolderName, String address, String email, Integer balance,
			String mobile) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.address = address;
		this.email = email;
		this.balance = balance;
		this.mobile = mobile;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}