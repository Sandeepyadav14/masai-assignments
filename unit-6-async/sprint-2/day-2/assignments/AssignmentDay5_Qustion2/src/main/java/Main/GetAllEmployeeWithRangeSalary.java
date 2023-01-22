package Main;

import Bean.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Exception.EmployeeException;

import java.util.List;

public class GetAllEmployeeWithRangeSalary {
    public static void main(String[] args) throws EmployeeException {
        EmployeeDao ed=new EmployeeDaoImpl();
       List<Employee> employeeList= ed.getAllEmployeeWithRangeSalary(100,300000);
       employeeList.forEach(s-> System.out.println(s));
    }
}
