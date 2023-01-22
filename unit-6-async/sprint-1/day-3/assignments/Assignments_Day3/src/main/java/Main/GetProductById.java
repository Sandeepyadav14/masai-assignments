package Main;

import Bean.Product;
import org.hibernate.mapping.PrimaryKey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class GetProductById {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Product");
        EntityManager em=emf.createEntityManager();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Product ID");
        int id=sc.nextInt();
        em.getTransaction().begin();
        Product p=em.find(Product.class,id);
        em.getTransaction().commit();
        em.close();
        System.out.println(p);



    }
}
