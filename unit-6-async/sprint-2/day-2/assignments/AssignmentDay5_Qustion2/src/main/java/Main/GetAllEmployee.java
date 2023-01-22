package Main;

import Bean.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Exception.EmployeeException;
import javax.security.sasl.SaslClient;
import java.util.List;

public class GetAllEmployee {
    public static void main(String[] args) throws EmployeeException {
        EmployeeDao ed=new EmployeeDaoImpl();
       List<Employee> list=ed.getAllEmployees();
       list.forEach(s-> System.out.println(s));
    }
}
