package Main;

import Bean.Address;
import Bean.Customer;
import Util.UtilManager;

import javax.persistence.EntityManager;

public class AddCustomer {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setName("Rohit");
        customer.setEmail("Rohit@gmail.com");
        customer.setMobileNumber("845745647456");

        Address address=new Address();
        address.setPincode("4654343");
        address.setCity("Mumbai");
        address.setState("Maharashtra");
        address.setType("Home_Address");

        Address address1=new Address();
        address1.setState("Bengal");
        address1.setCity("Kolkata");
        address1.setPincode("8937483");
        address1.setType("Office+Address");

        customer.getAddressList().add(address);
        customer.getAddressList().add(address1);

        EntityManager em= UtilManager.provideConnection();
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
        em.close();
        System.out.println("Done......");

    }
}
