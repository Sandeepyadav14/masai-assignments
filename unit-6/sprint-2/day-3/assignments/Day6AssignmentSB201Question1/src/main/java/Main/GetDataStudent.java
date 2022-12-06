package Main;

import Bean.College;
import Bean.Student;
import ManagerFactory.Emutil;

import javax.persistence.EntityManager;
import java.util.List;

public class GetDataStudent {
    public static void main(String[] args) {

        EntityManager em= Emutil.entityManager();
        College college=em.find(College.class,1);
        List<Student> st=college.getList();
        for(Student i:st){
            System.out.println(i.getStudentName());
            System.out.println(i.getStudentRoll());
            System.out.println(i.getEmail());
            System.out.println(i.getMobileNumber());
            System.out.println(i.getCollege().getCollageName());
            System.out.println("*************************************");
        }
    }
}
