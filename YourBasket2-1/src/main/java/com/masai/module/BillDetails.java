package com.masai.module;

import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class BillDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer billingDetailsId;
	private Integer orderId;
	private String transactionMode;
	private LocalDateTime transactionDate;
	private String transactionStatus;
	
	@Embedded
	private Address billingAddress;


}
