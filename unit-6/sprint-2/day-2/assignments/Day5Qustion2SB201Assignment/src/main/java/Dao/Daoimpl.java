package Dao;

import Bean.Employee;

import java.util.List;
import Exception.EmployeeException;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;

public class Daoimpl implements Dao {
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("Employee");
    EntityManager em=emf.createEntityManager();


    @Override
    public String saveEmployee(int id, String name, String address, int salary) throws EmployeeException {
        Employee e=new Employee(id,name,address,salary);
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        String msg="done";
        return msg;
    }

    @Override
    public List<Employee> getAllEmployees() throws EmployeeException {
        Query query = em.createQuery("From Employee");
        List<Employee> list=query.getResultList();
        return list;
    }

    @Override
    public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
        Query q=em.createQuery("from Employee where Address=:d");
        q.setParameter("d",address);
        List<Employee> list=q.getResultList();
        return list;
    }

    @Override
    public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {

        String query="from Employee where salary between:first and :second ";
        Query q=em.createQuery(query);
        q.setParameter("first",startSalary);
        q.setParameter("second",endSalary);
        List<Employee> list=q.getResultList();
        return list;

    }

    @Override
    public int getEmployeeSalaryById(int empId) throws EmployeeException {
        String query="select salary from Employee where id=:i";
        Query q=em.createQuery(query);
        q.setParameter("i",empId);
        List<Integer> list=q.getResultList();
        for (Integer i:list){
            return i;
        }
           return 0;

    }

    @Override
    public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
        String query="Select NAME,salary from Employee where id=:i";
        Query q=em.createQuery(query);
        q.setParameter("i",empId);
        List<Object[]> list=q.getResultList();
        return list.get(0);
    }
}
