package Main;

import Bean.Student;
import Dao.UniversityDAO;
import Dao.UniversityDaoImpl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentSave {
    public static void main(String[] args) {
        Student st=new Student();
        st.setEmail("s@gmail.com");
        st.setAddress("Mumbai");
        st.setCgpa(32);
        UniversityDAO ud=new UniversityDaoImpl();
        String msg=ud.saveStudent(st);
        System.out.println(msg);

    }
}
