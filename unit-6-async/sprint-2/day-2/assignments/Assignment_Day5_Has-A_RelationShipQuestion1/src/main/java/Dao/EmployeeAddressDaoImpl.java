package Dao;

import Bean.Address;
import Bean.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeAddressDaoImpl implements EmployeeAddressDao{

    @Override
    public Employee registerEmployeeWithAddress(Employee employee) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Employee");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        em.close();
        return employee;
    }
}
