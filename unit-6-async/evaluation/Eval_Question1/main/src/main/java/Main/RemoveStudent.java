package Main;

import Dao.UniversityDAO;
import Dao.UniversityDaoImpl;

public class RemoveStudent {
    public static void main(String[] args) {
        UniversityDAO ud=new UniversityDaoImpl();
        String msg=ud.deleteStudentById(1);
        System.out.println(msg);
    }
}
