package Main;

import Bean.Gym;
import Bean.Trainer;
import Dao.Dao;
import  Dao.DaoImpl;

public class RegisterTrainer {
    static Dao dao=new DaoImpl();
    public static void main(String[] args) {
        Trainer t=new Trainer();
        t.setEmail("hanuman@gmail.com");
        t.setTrainer_name("hanuman");
        t.setYear_of_exeperience("10 years");
        dao.registerTrainer(t);
    }
}
