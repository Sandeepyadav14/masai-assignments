package Main;

import Bean.Student;
import Dao.UniversityDAO;
import Dao.UniversityDaoImpl;

public class FindStudent {
    public static void main(String[] args) {
        UniversityDAO ud=new UniversityDaoImpl();
        Student st=ud.findStudentById(1);
        if(st==null){
            System.out.println("Student data not found...");
        }else {
            System.out.println(st);
        }
    }

}
