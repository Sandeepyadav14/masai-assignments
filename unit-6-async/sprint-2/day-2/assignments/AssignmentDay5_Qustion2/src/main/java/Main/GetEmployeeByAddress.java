package Main;

import Bean.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Exception.EmployeeException;
import org.hibernate.internal.EntityManagerMessageLogger;

import java.util.List;

public class GetEmployeeByAddress {
    public static void main(String[] args) throws EmployeeException {
        EmployeeDao ed=new EmployeeDaoImpl();
       List<Employee> employeeList =  ed.getEmployeesByAddress("mumbai");
       employeeList.forEach(s-> System.out.println(s));
    }
}
