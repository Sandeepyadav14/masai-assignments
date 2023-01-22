package Main;

import Bean.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Exception.EmployeeException;
import java.util.Scanner;

public class UpdateEmployee {
    public static void main(String[] args) throws EmployeeException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Id");
        int id=sc.nextInt();
        System.out.println("Enter Employee Name:");
        String name=sc.next();
        System.out.println("Enter Employee Address:");
        String address=sc.next();
        System.out.println("Enter Employee Salary:");
        int salary=sc.nextInt();
        EmployeeDao ed=new EmployeeDaoImpl();
        Employee e=new Employee(id,name,address,salary);
       e= ed.updateEmployee(e);
        System.out.println(e);


    }
}
