package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilEmf {
    public static EntityManager provideConnection(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Employee");
        EntityManager em=emf.createEntityManager();
        return  em;


    }
}
