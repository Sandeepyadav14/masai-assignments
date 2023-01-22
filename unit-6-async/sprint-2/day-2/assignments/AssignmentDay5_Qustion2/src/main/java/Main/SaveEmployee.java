package Main;

import Bean.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Exception.EmployeeException;
import java.util.Scanner;

public class SaveEmployee {
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
        employee.setAddress(address);
        employee.setName(name);
        String msg=ed.addEmployee(employee);
        System.out.println(msg);
    }
}
