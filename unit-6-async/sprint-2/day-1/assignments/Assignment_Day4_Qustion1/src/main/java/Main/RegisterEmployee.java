package Main;

import Bean.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Exception.EmployeeException;
import java.util.Scanner;

public class RegisterEmployee {
    public static void main(String[] args) throws EmployeeException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        String name=sc.next();
        System.out.println("Enter Employee Address:");
        String address=sc.next();
        System.out.println("Enter Employee Salary:");
        int salary=sc.nextInt();
        EmployeeDao ed=new EmployeeDaoImpl();
        Employee employee=new Employee();
        employee.setSalary(salary);
        employee.setName(name);
        employee.setAddress(address);
        Employee employee1= ed.registerEmployee(employee);
        System.out.println(employee1);

    }
}
