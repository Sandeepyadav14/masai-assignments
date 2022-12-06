package Demo;
import Dao.Dao;
import Dao.Daoimpl;
import Exception.EmployeeException;

public class GetDataInArrayObject {
    public static void main(String[] args) throws EmployeeException {
        Dao d=new Daoimpl();
        Object[] list=d.getEmployeeNameAndSalary(1);
        for(Object i:list){
            System.out.println(i);
        }
    }
}
