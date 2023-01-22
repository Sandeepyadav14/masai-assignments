package Main;

import Dao.UniversityDAO;
import Dao.UniversityDaoImpl;

public class UpdatedStudent {
    public static void main(String[] args) {
        UniversityDAO ud=new UniversityDaoImpl();
        String msg=ud.updateStudentCGPA(1,10);
        System.out.println(msg);
    }
}
