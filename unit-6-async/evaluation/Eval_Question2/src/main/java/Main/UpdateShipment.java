package Main;

import Bean.Shipment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class UpdateShipment {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("BlueDart");
        EntityManager em=emf.createEntityManager();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Update Id");
        int id=sc.nextInt();

        System.out.println("Enter New Content");
        String content=sc.next();

        System.out.println("Enter New Weight");
        double weight=sc.nextDouble();

        System.out.println("Enter Recipient Address");
        String re_add=sc.next();


        em.getTransaction().begin();
        Shipment bd=em.find(Shipment.class,id);

        if(bd!=null){
            bd.setContent(content);
            bd.setWeight(weight);
            bd.setRecipientAddress(re_add);
            em.getTransaction().commit();
            em.close();
            System.out.println("Your data updated...");
        }else{
            System.out.println("Your data not updated....");
        }



    }
}
