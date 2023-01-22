package Main;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Exception.EmployeeException;
public class GetSalary {
    public static void main(String[] args) throws EmployeeException {
        EmployeeDao ed=new EmployeeDaoImpl();
        int salary=ed.getEmployeeSalaryById(1);
        System.out.println(salary);
    }
}
