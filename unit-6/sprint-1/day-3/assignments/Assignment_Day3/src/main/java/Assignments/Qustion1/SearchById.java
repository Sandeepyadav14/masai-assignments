package Assignments.Qustion1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SearchById {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Product");
        EntityManager em=emf.createEntityManager();
        Product p=em.find(Product.class,2);
        if(p!=null){
            System.out.println(p);
        }else{
            System.out.println("Data not found");
        }
    }
}
