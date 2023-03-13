package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.masai.module.Employee;
import com.masai.module.EmployeeDTO;

//import antlr.collections.List;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{
	@Query("select e from Employee e where e.email=?1 and e.password=?2")
	 Employee loginEmployeeByPasswordandEmail(String email,String password);
     
	List<Employee> findByAgeBetween(Integer age1,Integer age2);
	 
	
	
	@Query("select new com.masai.module.EmployeeDTO(e.employeeName,e.address,e.age)from Employee e")
	List<EmployeeDTO>getAddressNameandAgeofEmployee();
	
	@Query("select e from Employee e where e.city=?1")
	List<Employee> getEmployeeByAdress(String city);
}

