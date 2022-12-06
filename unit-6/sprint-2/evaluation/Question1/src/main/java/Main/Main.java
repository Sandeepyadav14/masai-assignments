package Main;
import Entity.PhoneNumber;
import Entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main{
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Evalution");
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();
        User u = new User();
        u.setUsername("Prateek");
        u.setemailid("pratik@mail.com");
        u.setUserid(1);

        User u1 = new User();
        u1.setUsername("Nrupul");
        u1.setemailid("nrupul@mail.com");
        u1.setUserid(2);



        PhoneNumber phone1=new PhoneNumber();
        phone1.setphoneNumber("7367456436");
        phone1.setPhoneType("Home");
        phone1.setUserid(1);

        PhoneNumber phone2=new PhoneNumber();
        phone2.setphoneNumber("8374384738");
        phone2.setPhoneType("Office");
        phone2.setUserid(1);

        PhoneNumber phone3=new PhoneNumber();
        phone3.setphoneNumber("487563453746");
        phone3.setPhoneType("Landline");
        phone3.setUserid(2);

        PhoneNumber phone4=new PhoneNumber();
        phone4.setphoneNumber("00928329");
        phone4.setPhoneType("Office");
        phone4.setUserid(2);



        u.getPhoneNumber().add(phone1);
        u.getPhoneNumber().add(phone2);
        u1.getPhoneNumber().add(phone3);
        u1.getPhoneNumber().add(phone4);
        em.persist(u1);
          em.persist(u);
        em.getTransaction().commit();
        System.out.println("Done.....");


    }
}
