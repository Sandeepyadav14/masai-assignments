package Main;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Exception.EmployeeException;
public class GetNameAndSalary {
    public static void main(String[] args) throws EmployeeException {
        EmployeeDao ed=new EmployeeDaoImpl();
        Object[] list= ed.getEmployeeNameAndSalary(1);
        for(Object i:list){
            System.out.println(i);
        }
    }
}
