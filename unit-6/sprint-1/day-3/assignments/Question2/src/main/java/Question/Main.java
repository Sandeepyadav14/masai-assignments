package Question;

import Question.Dao.EmploDao;
import Question.Dao.ImpleDao;

public class Main {
    public static void main(String[] args) {
                ImpleDao imp=new EmploDao();
                Employee e=new Employee("sandy","mumbai",322);
                imp.save(e);
                String msg=imp.getAddressOfEmployee(8);
                System.out.println(msg);
                imp.giveBonusToEmployee(9,800);
                boolean d=imp.deleteEmployee(10);
                if(d){
                    System.out.println("Deleted Employee Data");
                }else{
                    System.out.println("Data is not deleted");
                }

    }
}
