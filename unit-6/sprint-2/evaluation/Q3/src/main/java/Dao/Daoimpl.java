package Dao;

import Bean.Course;
import Bean.Student;
import Exception.StudentNotFoundException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Daoimpl implements Dao{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Evalution");
    EntityManager em = emf.createEntityManager();
    @Override
    public void addCourse(Course course) {


        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        System.out.println("done...");
    }

    @Override
    public void getStudent(int roll_no)  {

        Student s=  em.find(Student.class,roll_no);
        System.out.println(s.getEmail());
        System.out.println(s.getName());
        System.out.println(s.getRollNo());
        System.out.println(s.getCourse().getCourseId());
        System.out.println(s.getCourse().getCourseName());
        System.out.println(s.getCourse().getCourseId());
        System.out.println(s.getCourse().getDuration());
        System.out.println("*****************");


    }

    @Override
    public void getCourse(int course_id) {
    Course c=em.find(Course.class,course_id);
        System.out.println(c.getCourseId());
        System.out.println(c.getCourseName());
        System.out.println(c.getFee());
        System.out.println(c.getDuration());
       List<Student> list= c.getStudents();
       for(Student  i:list){
           System.out.println(i.getName());
           System.out.println(i.getRollNo());
           System.out.println(i.getEmail());
           System.out.println("***************");
       }
    }


}
