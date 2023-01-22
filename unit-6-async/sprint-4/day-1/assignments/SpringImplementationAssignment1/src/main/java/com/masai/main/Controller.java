package com.masai.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.masai.Bean.Address;
import com.masai.Bean.Employee;

@RestController
public class Controller {
	
	@GetMapping("/getEmployee")
	public static Employee addStudent() {
		
	Employee employee =new Employee();
	employee.setEmpId(1);
	employee.setName("Rajkumar");
	employee.setSalary(20000);
	employee.setAddress(new Address("Mumbai", "47438", "Maharashtra"));
	return employee;
		
	}
	@GetMapping("/getEmployeeList")
	public static List<Employee> listEmployee(){
		List<Employee> list=new ArrayList<>();
		Employee employee=new Employee();
		employee.setEmpId(1);
		employee.setName("Sandeep");
		employee.setSalary(444);
		employee.setAddress(new Address("Pune", "747553", "Gujrat"));
		
		Employee employee1=new Employee();
		employee1.setEmpId(2);
		employee1.setName("Nitesh");
		employee1.setSalary(786);
		employee1.setAddress(new Address("Locknow", "4656541", "Uttar Pradesh"));
		
		Employee employee2=new Employee();
		employee2.setEmpId(3);
		employee2.setName("Ankit");
		employee2.setSalary(8384);
		employee2.setAddress(new Address("Patna", "898473", "Vihar"));
		
		Employee employee3=new Employee();
		employee3.setEmpId(4);
		employee3.setName("Ankit");
		employee3.setSalary(8384);
		employee3.setAddress(new Address("Chandigarh", "984338", "Punjab"));
		
		Employee employee4=new Employee();
		employee4.setEmpId(5);
		employee4.setName("Pradyuman");
		employee4.setSalary(9232);
		employee4.setAddress(new Address("Chennai", "5125132", "Tamilnadu"));
		
		list.add(employee);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		return list;
		
		
		
	}
	
	@GetMapping("/hello")
	public static String sayHello() {
		return "Welcome To SpringBoot";
	}
	
	
	@PutMapping("/updateEmployee/{id}")
	public static Employee updateEmployee(@PathVariable("id")int id) {
		Employee employee=new Employee();
		employee.setEmpId(id);
		employee.setName("Rajkumar");
		employee.setSalary(377826726);
		employee.setAddress(new Address("Hyderabad", "894838", "Andhra Pradeh"));
		
		return employee;
		
	}
	
	@PostMapping("/addEmployee")
	public static Employee postEmployee(@RequestBody Employee employee) {
		return employee;
	}
	
	@PostMapping("/addAddress")
	public static Address postAddress(@RequestBody Address address) {
		return address;
	}
	@DeleteMapping("/deleteEmployee/{id}")
	public static Employee deleteEmployee(@PathVariable("id")int id) {
		Employee employee=new Employee();
		employee.setEmpId(id);
		employee.setName("Rajkumar");
		employee.setSalary(377826726);
		employee.setAddress(new Address("Hyderabad", "894838", "Andhra Pradeh"));
		
		return employee;
		
	}
}
