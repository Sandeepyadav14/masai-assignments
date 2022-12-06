package Main;

import Entity.User;

import javax.persistence.*;
import java.lang.reflect.Type;


public class GetData {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Evalution");
        EntityManager em=emf.createEntityManager();
        String query="from User where username='Nrupul'";
        TypedQuery<User> user=em.createQuery(query,User.class);
        User u=user.getSingleResult();
        System.out.println(u);
        em.close();
    }
}
