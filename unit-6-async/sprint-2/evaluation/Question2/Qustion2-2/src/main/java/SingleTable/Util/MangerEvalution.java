package SingleTable.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MangerEvalution {
    public static EntityManager provideConnection() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hotstar");
        EntityManager em = emf.createEntityManager();
        return em;
    }


}
