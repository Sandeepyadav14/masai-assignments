package Main;

import Bean.College;
import Bean.Student;
import ManagerFactory.Emutil;
import javax.persistence.EntityManager;

public class AddStudent {
    public static void main(String[] args) {

        EntityManager em= Emutil.entityManager();
        College c=new College();
        c.setCollageName("vidya Varidhi Vidyalaya");
        c.setCollageAddress("Mumbai");
        Student st1=new Student();
        st1.setCollege(c);
        st1.setEmail("ss@gmail.com");
        st1.setStudentName("Sandeep Yadav");
        Student st2=new Student();
        st2.setCollege(c);
        st2.setEmail("ns@gmail.com");
        st2.setStudentName("Nitesh Shukla");
        c.getList().add(st1);
        c.getList().add(st2);
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        System.out.println("Done........");

    }
}
