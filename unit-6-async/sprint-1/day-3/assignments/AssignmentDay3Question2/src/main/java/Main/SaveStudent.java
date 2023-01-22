package Main;

import Bean.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

public class SaveStudent {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setAddress("Mumbai");
        e.setName("Sandeep Yadav");
        e.setSalary(20000);
        EmployeeDao ed=new EmployeeDaoImpl();
        ed.save(e);
    }
}
