package Dao;

import Bean.Employee;
import Exception.EmployeeException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class DaoImpl implements Dao {
    static EntityManagerFactory emf= Persistence.createEntityManagerFactory("Employee");
    static EntityManager em=emf.createEntityManager();

    @Override
    public Employee registerEmployee(Employee employee) throws EmployeeException {
      Employee e=new Employee();
      em.getTransaction().begin();
      e=em.merge(employee);
      em.getTransaction().commit();
     return e;
    }

    @Override
    public Employee getEmployeeById(int empId) throws EmployeeException {
        Employee e=new Employee();
        e=em.find(Employee.class,empId);
        if(e!=null){
            return e;
        }else{
            throw new EmployeeException("data is not found");
        }

    }
    @Override
    public Employee deleteEmployeeById(int empId) throws EmployeeException {
        em.getTransaction().begin();
        Employee  r=em.find(Employee.class,empId);
        em.remove(r);

        em.getTransaction().commit();
        if(r!=null){
            return r;
        }else{
            throw new EmployeeException("data is not deleted");
        }

    }

    @Override
    public Employee updateEmployee(Employee employee) throws EmployeeException {
        Employee e=new Employee();
        em.getTransaction().begin();
        e= em.merge(employee);
        em.getTransaction().commit();
        if(e!=null){
            return  e;
        }else{
            throw new EmployeeException("data is not updated...");
        }

    }


}
