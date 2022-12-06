package Dao;

import Bean.Gym;
import Bean.Person;
import Bean.Trainer;

import java.util.List;
import Bean.Trainer;
import Exception.GymException;
import Exception.TrainerException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoImpl implements Dao{
   static EntityManagerFactory emf= Persistence.createEntityManagerFactory("sandy");
  static   EntityManager em=emf.createEntityManager();
    @Override
    public void addGym(Gym gym) {
        em.getTransaction().begin();
        em.persist(gym);
        em.getTransaction().commit();
        em.close();
        System.out.println("Gym Data Added...");
    }

    @Override
    public void registerPerson(Person person, int gym_id) throws GymException {
        em.getTransaction().begin();
         Gym gym=em.find(Gym.class,gym_id);

        em.persist(person);
        em.getTransaction().commit();


    }

    @Override
    public void registerTrainer(Trainer trainer) {
        em.getTransaction().begin();
        em.persist(trainer);
        em.getTransaction().commit();
        em.close();
        System.out.println("Trainer Data Added...");

    }

    @Override
    public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException {

    }

    @Override
    public List<Person> getAllthePersonByGymName(String gym_name) throws GymException {
        return null;
    }
}
