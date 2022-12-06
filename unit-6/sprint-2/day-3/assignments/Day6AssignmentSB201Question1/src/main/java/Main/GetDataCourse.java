package Main;

import Bean.Student;
import ManagerFactory.Emutil;

import javax.persistence.EntityManager;

public class GetDataCourse {
    public static void main(String[] args) {
        EntityManager em = Emutil.entityManager();
        Student st = em.find(Student.class, 2);
        System.out.println(st.getCollege().getCollageId());
        System.out.println(st.getCollege().getCollageName());
        System.out.println(st.getCollege().getCollageAddress());
        System.out.println("***********************************");
    }
}
