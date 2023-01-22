package Main;

import Bean.Collage;
import Bean.Student;
import Util.UtilManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddCollageAndStudent {
    public static void main(String[] args) {

        Student student=new Student();
        student.setStudentName("Sandeep");
        student.setEmail("s@gmail.com");
        student.setMobileNumber("77108172498");

        Student student1=new Student();
        student1.setStudentName("Nitesh");
        student1.setEmail("Nitesh@gmail.com");
        student1.setMobileNumber("7728736374633");

        Student student2=new Student();
        student2.setStudentName("Rajkumar");
        student2.setEmail("Raj@gmail.com");
        student2.setMobileNumber("7783833246");

        Student student3=new Student();
        student3.setStudentName("Ashish");
        student3.setEmail("Ashish@gmail.com");
        student3.setMobileNumber("792832837246");


        Collage collage=new Collage();
        collage.setCollageAddress("Kolkata");
        collage.setCollageName("Morning Star Collage...");
        collage.getStudentList().add(student);
        student.setCollage(collage);
        student1.setCollage(collage);
        student2.setCollage(collage);
        student3.setCollage(collage);


        EntityManager em= UtilManager.provideConnection();

        em.getTransaction().begin();
        em.persist(student);
        em.persist(student1);
        em.persist(student2);
        em.persist(student3);

        em.getTransaction().commit();
        em.close();
        System.out.println("Done...");
    }
}
