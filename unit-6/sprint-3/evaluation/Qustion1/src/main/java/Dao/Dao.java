package Dao;

import Bean.Gym;
import Bean.Person;
import Bean.Trainer;
import Exception.GymException;
import Exception.TrainerException;

import java.util.List;

public interface Dao {
    public void addGym(Gym gym);
    public void registerPerson(Person person, int gym_id)throws GymException;
    public void registerTrainer(Trainer trainer);
    public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException;
    List<Person> getAllthePersonByGymName(String gym_name)throws GymException;
}
