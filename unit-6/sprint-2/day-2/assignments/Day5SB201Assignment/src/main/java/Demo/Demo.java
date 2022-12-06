package Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Demo.Employee;

public class Demo {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Employee");
        EntityManager em=emf.createEntityManager();
        Employee e=new Employee();
        e.setName("Rajkumar");
        e.setGender("Male");
        e.setSalary(3000);
        e.getEmpAddress().add(new Address("Up","Lucknow","401209","home"));
        e.getEmpAddress().add(new Address("Bihar","Patna","899788","office"));
//        e.setName("Rajkumar");
//        e.setGender("Male");
//        e.setSalary(45900);
//        e.getEmpAddress().add(new Address("Uttarpradesh","lucknow","645673","office"));
//        e.getEmpAddress().add(new Address("Punjab","chandigarh","887873","home"));
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        System.out.println("done.....");
    }




}
