package Main;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

public class GiveBonusEmployee {
    public static void main(String[] args) {
        EmployeeDao ed=new EmployeeDaoImpl();
       String msg= ed.giveBonusToEmployee(1,700);
        System.out.println(msg);

    }
}
