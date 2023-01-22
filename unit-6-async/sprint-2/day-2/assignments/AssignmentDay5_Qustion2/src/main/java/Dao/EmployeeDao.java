package Dao;

import Bean.Employee;
import Exception.EmployeeException;
import java.util.List;

public interface EmployeeDao {
    public String addEmployee(Employee employee) throws EmployeeException;
    public List<Employee> getAllEmployees() throws EmployeeException;
    public List<Employee> getEmployeesByAddress(String address) throws EmployeeException;
    public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException;
    public Object[] getEmployeeNameAndSalary(int empId)throws EmployeeException;
    public int getEmployeeSalaryById(int empId)throws EmployeeException;


}
