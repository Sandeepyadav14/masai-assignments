package com.masai.module;

import javax.persistence.Entity;

import lombok.Data;


@Data
public class Address {
    
	private String flatNo;
	private String buildingName;
	private String area;
	private String city;
	private String state;
	private String pincode;

}
