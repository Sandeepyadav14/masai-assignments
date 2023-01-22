package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilConnection {
    public static EntityManager provideConnection(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Universty");
        EntityManager em=emf.createEntityManager();
        return em;
    }
}
