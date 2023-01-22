package Main;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

public class GetAddressById {
    public static void main(String[] args) {
        EmployeeDao ed=new EmployeeDaoImpl();
       String msg= ed.getAddressOfEmployee(1);
        System.out.println(msg);
    }
}
