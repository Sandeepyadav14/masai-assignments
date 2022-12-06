package Main;

import Bean.Course;
import Bean.Student;
import Dao.Dao;
import Dao.Daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import Demo.Employee;

public class Main {
    public static void main(String[] args) {
        Dao d=new Daoimpl();
        Course c=new Course();
        c.setCourseName("Java");
        c.setFee("87754");
        c.setDuration("3 Months");

        Student s=new Student();
        s.setEmail("s@gmail.com");
        s.setCourse(c);
        s.setName("Sandeep");
        c.getStudents().add(s);
        d.addCourse(c);



    }




}