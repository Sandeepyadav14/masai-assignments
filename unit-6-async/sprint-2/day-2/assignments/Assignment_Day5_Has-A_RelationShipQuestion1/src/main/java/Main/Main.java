package Main;

import Bean.Address;
import Bean.Employee;
import Dao.EmployeeAddressDao;
import Dao.EmployeeAddressDaoImpl;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setName("Sandeep Yadav");
        employee.setSalary(2000);
        employee.setGender("Male");
        employee.getEmpAddress().add(new Address("maharashtra","Mumbai","40393","Office"));
        employee.getEmpAddress().add(new Address("Karnataka","chembur","8978","Home"));
        EmployeeAddressDao ead=new EmployeeAddressDaoImpl();
       Employee e= ead.registerEmployeeWithAddress(employee);
        System.out.println(e);

    }
}
