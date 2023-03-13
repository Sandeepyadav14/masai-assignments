package com.masai.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Vegetable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vegId;
	private String name;
	private String type;
	private Double price;
	private Integer quantity;

}
