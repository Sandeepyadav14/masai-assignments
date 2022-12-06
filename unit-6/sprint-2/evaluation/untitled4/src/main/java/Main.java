import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import Demo.Employee;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Evalution");
        EntityManager em=emf.createEntityManager();
         Course c=new Course();
         c.setDuration("784574754");
         c.setCourseName("java");
         c.setFee("743743");

         Student s=new Student();
         s.setName("sandep");
         s.setEmail("dsbhsgh");
         s.setCourse(c);
         c.getStudents().add(s);

         em.getTransaction().begin();
         em.persist(c);
         em.getTransaction().commit();
        System.out.println("dione");

    }




}