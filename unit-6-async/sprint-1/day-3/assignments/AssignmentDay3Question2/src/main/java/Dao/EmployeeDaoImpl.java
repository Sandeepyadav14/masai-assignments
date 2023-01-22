package Dao;

import Bean.Employee;
import Util.UtilConnection;

import javax.persistence.EntityManager;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void save(Employee emp) {
        EntityManager em= UtilConnection.provideConnection();
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
        em.close();
        System.out.println("Data Saved...");
    }

    @Override
    public String getAddressOfEmployee(int empId) {
        String msg="";
        EntityManager em=UtilConnection.provideConnection();
        em.getTransaction().begin();
      Employee e= em.find(Employee.class,empId);
      if(e!=null){
          msg=e.getAddress();
      }

        return msg;
    }

    @Override
    public String giveBonusToEmployee(int empId, int bonus) {
        String msg="You not give Bonus";
        EntityManager em=UtilConnection.provideConnection();
        em.getTransaction().begin();
        Employee e= em.find(Employee.class,empId);
        if(e!=null){
            e.setSalary(e.getSalary()+bonus);
            em.persist(e);
            em.getTransaction().commit();
            em.close();
            msg="You give bonus";
        }
        return msg;
    }

    @Override
    public boolean deleteEmployee(int empId) {
        boolean d=false;
        EntityManager em=UtilConnection.provideConnection();
        em.getTransaction().begin();
        Employee e= em.find(Employee.class,empId);
        if(e!=null){
           em.remove(e);
           em.getTransaction().commit();
           em.close();
           d=true;
        }
        return d;
    }
}
