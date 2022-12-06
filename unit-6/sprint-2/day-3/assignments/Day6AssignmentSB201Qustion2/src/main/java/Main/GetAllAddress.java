package Main;

import Bean.Address;
import Bean.Customer;
import ManagerFactory.Emutil;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Scanner;

public class GetAllAddress {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer Id");
        int cid=sc.nextInt();
        EntityManager em= Emutil.entityManager();
        Customer c=em.find(Customer.class,cid);
        List<Address> list=c.getAddress();
        System.out.println(c.getName());
        System.out.println("********************");
        for(Address i:list){

            System.out.println(i.getType());
            System.out.println(i.getState());
            System.out.println(i.getCity());
            System.out.println(i.getPincode());

            System.out.println("**********************");
        }
    }
}
