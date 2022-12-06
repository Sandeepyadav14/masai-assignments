package Demo;

import Bean.Employee;
import Dao.Dao;
import Dao.Daoimpl;
import Exception.EmployeeException;
import java.util.List;

public class GetDataBetween {
    public static void main(String[] args) throws EmployeeException {
        Dao d=new Daoimpl();
       List<Employee> list= d.getAllEmployeeWithRangeSalary(6000,12000);
       list.forEach(s-> System.out.println(s));
    }
}
