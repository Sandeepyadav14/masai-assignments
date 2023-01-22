package com.masai.Module;

public class ProductDTO {
	
	
	private String name;
	private Integer price;
	private String brand;
	private String category;
	public ProductDTO(String name, Integer price, String brand, String category) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.category = category;
	}
	public ProductDTO() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", price=" + price + ", brand=" + brand + ", category=" + category + "]";
	}
	
	}
