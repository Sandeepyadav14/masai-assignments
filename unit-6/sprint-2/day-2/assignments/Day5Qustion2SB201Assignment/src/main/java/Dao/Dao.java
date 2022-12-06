package Dao;

import Bean.Employee;

import java.util.List;
import Exception.EmployeeException;
public interface Dao {
    public String saveEmployee(int id,String name,String address,int salary) throws EmployeeException;
    public List<Employee> getAllEmployees() throws EmployeeException;
    public List<Employee> getEmployeesByAddress(String address) throws EmployeeException;
    public List<Employee> getAllEmployeeWithRangeSalary(int startSalary,int endSalary) throws EmployeeException;
  public Object[]  getEmployeeNameAndSalary(int empId)throws EmployeeException;
    public int getEmployeeSalaryById(int empId)throws EmployeeException;
}
//


