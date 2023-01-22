package Dao;

import Bean.Employee;
import Exception.EmployeeException;
import Util.UtilEmf;
import jdk.jshell.execution.Util;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public String addEmployee(Employee employee) throws EmployeeException {
        EntityManager em=UtilEmf.provideConnection();
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        em.close();
        return "data saved";
    }

    @Override
    public List<Employee> getAllEmployees() throws EmployeeException {
        EntityManager em= UtilEmf.provideConnection();
        em.getTransaction().begin();
       Query query= em.createQuery("from Employee");
       List<Employee> list=query.getResultList();
       return list;
    }

    @Override
    public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
        EntityManager em=UtilEmf.provideConnection();
        em.getTransaction().begin();
        Query query=em.createQuery("from Employee where Address=:d");
        query.setParameter("d",address);
        List<Employee> list=query.getResultList();
        return list;
    }

    @Override
    public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {
        EntityManager em= UtilEmf.provideConnection();
        em.getTransaction().begin();
        Query query= em.createQuery("from Employee where salary between:s and :s1 ");
        query.setParameter("s",startSalary);
        query.setParameter("s1",endSalary);
        List<Employee> list=query.getResultList();
        return list;
    }

    @Override
    public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
        EntityManager em= UtilEmf.provideConnection();
        String query="Select NAME,salary from Employee where id=:i";
        Query q=em.createQuery(query);
        q.setParameter("i",empId);
        List<Object[]> list=q.getResultList();
        return list.get(0);
    }

    @Override
    public int getEmployeeSalaryById(int empId) throws EmployeeException {
        EntityManager em=UtilEmf.provideConnection();
        em.getTransaction().begin();
       Employee e= em.find(Employee.class,empId);
       int salary=e.getSalary();
       em.getTransaction().commit();
       em.close();
       return salary;

    }
}
