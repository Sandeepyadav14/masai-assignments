package Demo;

import Bean.Employee;
import Dao.Dao;
import Dao.Daoimpl;
import Exception.EmployeeException;

import java.util.List;

public class Save {
    public static void main(String[] args) throws EmployeeException {
        Dao d=new Daoimpl();
        d.saveEmployee(1,"Praduman Shukla","Delhi",8766);



    }
}
