package Main;

import Bean.Employee;
import Dao.Dao;
import Dao.DaoImpl;
import  Exception.EmployeeException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws EmployeeException {
        Dao d=new DaoImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("1) Register Employee Data");
        System.out.println("2) Get employee data by id");
        System.out.println("3) Delete Employee data");
        System.out.println("4) Update Employee data");
        int n=sc.nextInt();
        if(n==1) {
            try {
                Employee e = new Employee("Sandeep", "Mumbai", 30000);
                Employee employee = d.registerEmployee(e);
                System.out.println(employee);
            } catch (EmployeeException e) {
                System.out.println(e.getMessage());
            }
        }
        if(n==2) {
            try {
                System.out.println("Enter the id");
                int id=sc.nextInt();
                Employee r = d.getEmployeeById(id);
                System.out.println(r);
            } catch (EmployeeException e) {
                System.out.println(e.getMessage());
            }
        }
        if(n==3) {
            try {
                System.out.println("Enter the id");
                int id=sc.nextInt();
                Employee r = d.deleteEmployeeById(id);
                System.out.println(r);
            } catch (EmployeeException e) {
                System.out.println(e.getMessage());
            }
        }
        if(n==4){
              try{
                  Employee e = new Employee("Sandeep", "Mumbai", 30000);
                  Employee r=d.updateEmployee(e);
                  System.out.println(r);
              }catch (EmployeeException e){
                  System.out.println(e.getMessage());
              }
        }

    }
}
