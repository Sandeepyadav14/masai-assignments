package Question.Dao;

import Question.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmploDao implements ImpleDao {
    @Override
    public void save(Employee emp) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Employee");
        EntityManager em=emf.createEntityManager();
        Employee e=new Employee(emp.getName(), emp.getAddress(),emp.getSalary());
        if(e!=null){
            em.getTransaction().begin();
            em.persist(e);
            em.getTransaction().commit();
            System.out.println("done");
        }else{
            System.out.println("not done...");
        }
    }

    @Override
    public String getAddressOfEmployee(int empId) {
        String msg="";
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee");
        EntityManager em=emf.createEntityManager();
        Employee e=em.find(Employee.class,empId);
        if(e!=null){
            msg= e.getAddress();
        }
        return msg;
    }

    @Override
    public String giveBonusToEmployee(int empId, int bonus) {
        String msg="";
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee");
        EntityManager em=emf.createEntityManager();
        Employee e=em.find(Employee.class,empId);
        if(e!=null){
            em.getTransaction().begin();
            int sum=e.getSalary()+bonus;
            e.setSalary(sum);
            em.getTransaction().commit();
            msg="done";
        }
        return msg;
    }

    @Override
    public boolean deleteEmployee(int empId) {
        boolean d= false;
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee");
        EntityManager em=emf.createEntityManager();
        Employee e=em.find(Employee.class,empId);
        if(e!=null){
            em.getTransaction().begin();
            em.remove(e);
            em.getTransaction().commit();
            d=true;
        }
        return d;
    }
}
