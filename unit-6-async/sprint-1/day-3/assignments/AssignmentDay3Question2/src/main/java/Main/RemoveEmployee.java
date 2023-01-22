package Main;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

public class RemoveEmployee {
    public static void main(String[] args) {
        EmployeeDao ed=new EmployeeDaoImpl();
     boolean d= ed.deleteEmployee(1);
        System.out.println(d);

    }
}
