package Main;

import Bean.Shipment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class DeleteShipmentById {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("BlueDart");
        EntityManager em=emf.createEntityManager();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id");
        int id=sc.nextInt();
        em.getTransaction().begin();
        Shipment sm= em.find(Shipment.class,id);
        if(sm!=null){
        em.remove(sm);
        }else{
            System.out.println("Your Data not Deleted....");
        }
        em.getTransaction().commit();
        em.close();

        System.out.println("Your Data Deleted....");


    }
}
