package Dao;

import java.util.List;

import Bean.Employee;

public interface Employeedao {
	
	public String InsertDetailOfEmployee(Employee e);
	public List<Employee> EmployeeWorkInAccount();
}
