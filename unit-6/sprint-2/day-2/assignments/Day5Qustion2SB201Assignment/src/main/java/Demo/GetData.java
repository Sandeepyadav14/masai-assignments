package Demo;

import Bean.Employee;
import Dao.Dao;
import Dao.Daoimpl;
import Exception.EmployeeException;
import java.util.List;

public class GetData {
    public static void main(String[] args) throws EmployeeException {
        Dao d=new Daoimpl();
        List<Employee> list=d.getAllEmployees();
      for (Employee i:list){
          System.out.println(i);
      }
    }


}
