package Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Demo.Employee;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Employee");
        EntityManager em=emf.createEntityManager();
        Employee e=new Employee();
        e.setName("sandeep");
        e.setGender("male");
        e.setSalary(200);
        e.getEmpAddress().add(new Address("Maharashtra","Mumbai","401209","home"));
        e.getEmpAddress().add(new Address("Karnatka","Bengluru","899788","office"));
        Employee e1=new Employee();
        e1.setName("rajkumar");
        e1.setGender("male");
        e1.setSalary(20009);
        e1.getEmpAddress().add(new Address("Uttarpradesh","lucknow","645673","office"));
        e1.getEmpAddress().add(new Address("Punjab","chandigarh","887873","home"));
        em.getTransaction().begin();
        em.persist(e);
        em.persist(e1);
        em.getTransaction().commit();
        System.out.println("done.....");
        em.close();
    }




}
