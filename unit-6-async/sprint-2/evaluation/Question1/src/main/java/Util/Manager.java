package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Manager {
    public static EntityManager provideConnection(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Item");
        EntityManager em=emf.createEntityManager();
        return em;
    }
}
