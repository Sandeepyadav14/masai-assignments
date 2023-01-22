package Main;

import Bean.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddProduct {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Product");
        EntityManager em=emf.createEntityManager();
        Product p=new Product();
        p.setPrice(200);
        p.setProductName("Nike");
        p.setQuantity(2001);

        Product p1=new Product();
        p1.setPrice(232);
        p1.setProductName("Bata");
        p1.setQuantity(212);

        Product p2=new Product();
        p2.setPrice(12);
        p2.setProductName("Shoes");
        p2.setQuantity(230);

        Product p3=new Product();
        p3.setPrice(21);
        p3.setProductName("brand");
        p3.setQuantity(21);

        Product p4=new Product();
        p4.setPrice(220);
        p4.setProductName("Nikse");
        p4.setQuantity(201);
        em.getTransaction().begin();
        em.persist(p);
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.persist(p4);
        em.getTransaction().commit();
        em.close();
        System.out.println("Your data saved...");
    }
}
