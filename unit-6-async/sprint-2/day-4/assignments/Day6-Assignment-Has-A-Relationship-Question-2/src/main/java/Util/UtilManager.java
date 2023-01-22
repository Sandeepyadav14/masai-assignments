package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilManager {
    public static EntityManager provideConnection() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("customer");
        EntityManager em = emf.createEntityManager();
        return em;
    }


}
