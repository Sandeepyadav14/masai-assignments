package Demo;

import Dao.Dao;
import Dao.Daoimpl;
import Exception.EmployeeException;
public class GetSalaryById {
    public static void main(String[] args) throws EmployeeException {
        Dao d=new Daoimpl();
        int n= d.getEmployeeSalaryById(1);
        System.out.println(n);

    }

}
