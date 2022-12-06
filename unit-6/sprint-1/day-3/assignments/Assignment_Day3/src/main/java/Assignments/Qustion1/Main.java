package Assignments.Qustion1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Product");
        EntityManager em=emf.createEntityManager();
        Product p=new Product("Sandeep",12,2320);
        Product p1=new Product("Ashish",67,11101);
        Product p2=new Product("Rohit",34,3403);
        Product p3=new Product("Chetan",13,1002);
        Product p4=new Product(null,18,1203);
            em.getTransaction().begin();
            em.persist(p);
            em.persist(p1);
            em.persist(p2);
            em.persist(p3);
            em.persist(p4);
            em.getTransaction().commit();
            System.out.println("done");
    }
}
