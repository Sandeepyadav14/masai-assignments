package Main;

import Bean.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Exception.EmployeeException;
import java.util.Scanner;

public class RemoveEmployee {
    public static void main(String[] args) throws EmployeeException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Id:");
        int id=sc.nextInt();
        EmployeeDao ed=new EmployeeDaoImpl();
        Employee e=ed.deleteEmployeeById(id);
        System.out.println(e);
    }
}
