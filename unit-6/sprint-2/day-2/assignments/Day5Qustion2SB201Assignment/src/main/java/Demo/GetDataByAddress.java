package Demo;

import Bean.Employee;
import Dao.Dao;
import Dao.Daoimpl;
import Exception.EmployeeException;

import java.util.List;

public class GetDataByAddress {
    public static void main(String[] args) throws EmployeeException {
        Dao d=new Daoimpl();
       List<Employee> list= d.getEmployeesByAddress("Delhi");
       list.forEach(s-> System.out.println(s));

    }
}
