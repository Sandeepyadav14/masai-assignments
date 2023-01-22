package Main;

import Bean.Shipment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class GetDataById {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("BlueDart");
        EntityManager em=emf.createEntityManager();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id");
        int id=sc.nextInt();
        em.getTransaction().begin();
        Shipment bd=em.find(Shipment.class,id);
        if(bd!=null){
            em.getTransaction().commit();
            em.close();
            System.out.println(bd);
        }else{
            System.out.println("data not find...");
        }

    }
}
