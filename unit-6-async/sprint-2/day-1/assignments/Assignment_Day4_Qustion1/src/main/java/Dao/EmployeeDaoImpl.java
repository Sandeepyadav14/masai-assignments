package Dao;

import Bean.Employee;
import Exception.EmployeeException;
import Util.UtilEmf;

import javax.persistence.EntityManager;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public Employee registerEmployee(Employee employee) throws EmployeeException {
        EntityManager em=UtilEmf.provideConnection();
        em.getTransaction().begin();
        Employee e= em.merge(employee);
        em.getTransaction().commit();
        em.close();
        return e;
    }

    @Override
    public Employee getEmployeeById(int empId) throws EmployeeException {
        EntityManager em=UtilEmf.provideConnection();
        em.getTransaction().begin();
        Employee employee=em.find(Employee.class,empId);
        em.getTransaction().commit();
        em.close();
        return employee;



    }

    @Override
    public Employee deleteEmployeeById(int empId) throws EmployeeException {
        EntityManager em=UtilEmf.provideConnection();
        em.getTransaction().begin();
        Employee e=em.find(Employee.class,empId);
        em.remove(e);
        em.getTransaction().commit();
        em.close();
        return e;

    }

    @Override
    public Employee updateEmployee(Employee employee) throws EmployeeException {
        EntityManager em=UtilEmf.provideConnection();
        em.getTransaction().begin();
       Employee  e=em.find(Employee.class,employee.getEmpId());

       if(e==null){
           throw  new EmployeeException();
       }else{
           e.setAddress(employee.getAddress());
           e.setSalary(employee.getSalary());
           e.setName(employee.getName());
          e= em.merge(e);
           em.getTransaction().commit();
           em.close();
        }
       return e;

    }
}
