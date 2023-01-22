package com.masai.module;

public class EmployeeDTO {
	private String name;
	private Address address;
	private Integer age;
	
	public EmployeeDTO(String name, Address address, Integer age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public EmployeeDTO() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	
}
