package com.masai.module;

import javax.persistence.Entity;

//@Entity
public class ProductDTO {
 private String productName;
 private Double price;
 private Integer quantity;

public ProductDTO() {}

public ProductDTO(String productName, Double price, Integer quantity) {
	super();
	this.productName = productName;
	this.price = price;
	this.quantity = quantity;
}

@Override
public String toString() {
	return "ProductDTO [productName=" + productName + ", price=" + price + ", quantity=" + quantity + "]";
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}

public Integer getQuantity() {
	return quantity;
}

public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}

}
