package Main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Module.Employee;

import java.util.Scanner;
import Exception.EmployeeException;
public class Main {


    public static void main(String[] args) throws EmployeeException {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("masai");
        EntityManager em=emf.createEntityManager();



        Main m=new Main();
        Scanner sc=new Scanner(System.in);
        System.out.println("1).  Register Employee Data");
        System.out.println("2).  Find employee data help of employee id");
        int n=sc.nextInt();
        if(n==1){
            System.out.println(m.registerEmployee(em));
        }else if(n==2){
            System.out.println("enter the emplployee id");
            int id=sc.nextInt();
            System.out.println(m.getEmployeeById(em,id));
        }else{
            System.out.println("enter correct details....1");
        }



    }

    public String registerEmployee(EntityManager em){
        Scanner sc=new Scanner(System.in);

        Employee employee=new Employee();

        System.out.println("Enter Employee Name:");
        employee.setName(sc.next());

        System.out.println("Enter Employee Email:");
        employee.setEmail(sc.next());

        System.out.println("Enter Employee Address:");
        employee.setAddress(sc.next());

        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        return "Employee Data Added....";

    }

    public Employee getEmployeeById(EntityManager em,int empId) throws EmployeeException {
        Employee employees=null;
        em.getTransaction().begin();
        Employee e= em.find(Employee.class,empId);
        employees=e;
        em.getTransaction().commit();
        em.close();
        return employees;

    }

}
