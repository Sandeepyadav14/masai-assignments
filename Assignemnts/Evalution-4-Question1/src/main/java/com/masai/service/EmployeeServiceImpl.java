package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sound.midi.Soundbank;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeException;
import com.masai.module.Address;
import com.masai.module.Employee;
import com.masai.module.EmployeeDTO;
import com.masai.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		Employee employee1=employeeRepository.save(employee);
		if(employee1==null) {
			throw new EmployeeException("Data is not saved...");
		}else {
			return employee1;
		}
	}
	
	
	

	@Override
	public Employee getEmployeeById(Integer employeeId) throws EmployeeException {
	Optional<Employee> optional=employeeRepository.findById(employeeId);
	if(optional.isEmpty()) {
		throw new EmployeeException("Employee data not available from id: "+employeeId);
	}else{
		Employee employee=optional.get();
		return employee;
	 }
   }

	@Override
	public Employee loginEmployee(String email, String password) throws EmployeeException {
		Employee employee=employeeRepository.loginEmployeeByPasswordandEmail(email, password);
		if(employee==null) {
			throw new EmployeeException("Please enter correct detail for login...");
		}else {
			return employee;
		}
	}

	
	
	
	
	
	@Override
	
	public Employee updateEmployeePassword(String email, String oldPassword, String newPassword) throws EmployeeException {
	Employee employee=employeeRepository.loginEmployeeByPasswordandEmail(email, oldPassword);
	if(employee==null) {
		throw new EmployeeException("Please enter valid password...");
		
	}else {
		
		employee.setPassword(newPassword);
		employeeRepository.save(employee);
		return employee;
	   }
	}
	
	
	
	
	

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
	List<Employee > employees=	employeeRepository.findAll();
	if(employees.isEmpty()) {
		throw new EmployeeException("Data is not find...");
	}else {
		return employees;
	}

	}
	
	
	
	

	@Override
	public Employee deleteEmployeeById(Integer employeeId) throws EmployeeException {
		Optional< Employee> optional=employeeRepository.findById(employeeId);
		if(optional.isEmpty()) {
			throw new EmployeeException("Employee data not deleted...");
			
		}else {
			Employee employee=optional.get();
			employeeRepository.delete(employee);
			return employee;
		}
			}
	
	
	
	
	

	@Override
	public List<Employee> getEmployeeDetailsByAddress(Address address) throws EmployeeException {
		List<Employee> employees= employeeRepository.getEmployeeByAdress(address.getCity());
		 if(employees.isEmpty()) {
			 throw new EmployeeException("Employee data not find by address");
		 }else {
			return employees;
		 }
		
	}

	
	
	
	
	
	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		
		Optional<Employee> optional=employeeRepository.findById(employee.getEmployeeId());
		if(optional.isEmpty()) {
			return employeeRepository.save(employee);
			
		}else {
			
			throw new EmployeeException("Employee data not updated...");
		}
			}

	
	
	
	
	
	
	@Override
	public Employee updateEmployeeAddress(Integer employeeId, Address address) throws EmployeeException {
	Optional<Employee> optional=	employeeRepository.findById(employeeId);
	if(optional.isEmpty()) {
		throw new EmployeeException("Employee data is not updated...");
	}else {
		Employee employee=optional.get();
		employee.setAddress(address);
		employeeRepository.save(employee);
		return employee;
	}
		
	}
	
	
	
	
	

	@Override
	public List<Employee> getEmployeesBetweenAge(Integer start_age, Integer end_age) throws EmployeeException {
		
	List<Employee> listEmployee=employeeRepository.findByAgeBetween(start_age, end_age);
	if(listEmployee.isEmpty()) {
		throw new EmployeeException("not data find...");
	}else {
		return listEmployee;
 	}
		
	
}

	@Override
	public List<EmployeeDTO> getNameAddressAgeOfAllEmployees() throws EmployeeException {
	List<EmployeeDTO> employeeDTOs=	employeeRepository.getAddressNameandAgeofEmployee();
	if(employeeDTOs.isEmpty()) {
		throw new EmployeeException("Data is not find...");
	}else {
		return employeeDTOs;
	}
	}

}
