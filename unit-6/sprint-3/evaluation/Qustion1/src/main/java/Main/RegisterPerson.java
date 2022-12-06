package Main;

import Bean.Gym;
import Bean.Person;
import Dao.Dao;
import Dao.DaoImpl;
import Exception.GymException;

public class RegisterPerson {
    static Dao dao=new DaoImpl();
    public static void main(String[] args) {
        Person person=new Person();
        person.setEmail("s@gmail.com");
        person.setName("Nitesh Shukla");
        int gym_id=2;
        try{
            dao.registerPerson(person,2);
        }catch(GymException g){
            g.getMessage();
        }

    }

}
