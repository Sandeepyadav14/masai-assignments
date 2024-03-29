package com.masai.module;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer customerId;
	private String name;
	private String mobileNo;

    @Embedded
	private Address address;
	private String email;
	private String password;

	@OneToMany(cascade = CascadeType.ALL)
	private List<FeedBack> feedBackList=new ArrayList();

	@OneToOne
	private Cart cart;

}
