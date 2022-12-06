package Main;

import Bean.Address;
import Bean.Customer;
import ManagerFactory.Emutil;
import javax.persistence.EntityManager;

public class AddData {
    public static void main(String[] args) {
        EntityManager em = Emutil.entityManager();

        Customer c=new Customer();
        c.setEmail("ssgmail.com");
        c.setMobileNumber("94574875");
        c.setName("Nitesh Shukla");


        Address add=new Address();
        add.setCity("Mumbai");
        add.setPincode("7836473");
        add.setState("Maharashtra");
        add.setType("Home_Address");

        Address add1=new Address();
        add1.setState("UttarPradesh");
        add1.setCity("Lucknow");
        add1.setPincode("87348473");
        add1.setType("Office_Address");

        c.getAddress().add(add1);
        c.getAddress().add(add);
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        System.out.println("Done........");
    }
}
