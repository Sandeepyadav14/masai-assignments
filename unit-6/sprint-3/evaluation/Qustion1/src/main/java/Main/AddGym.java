package Main;

import Bean.Gym;
import Dao.Dao;
import Dao.DaoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddGym {
   static Dao dao=new DaoImpl();
    public static void main(String[] args) {
        Gym gym=new Gym();
        gym.setGym_name("Killer Gym");
        gym.setMonthly_fee("5000");
         dao.addGym(gym);

    }
}
