package Bean;

import javax.naming.StringRefAddr;
import javax.persistence.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int trainer_id;
    private String trainer_name;
    private String year_of_exeperience;
    private String email;


     @ManyToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "gym_id@")
     private Gym gym;


    public int getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }

    public String getTrainer_name() {
        return trainer_name;
    }

    public void setTrainer_name(String trainer_name) {
        this.trainer_name = trainer_name;
    }

    public String getYear_of_exeperience() {
        return year_of_exeperience;
    }

    public void setYear_of_exeperience(String year_of_exeperience) {
        this.year_of_exeperience = year_of_exeperience;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainer_id=" + trainer_id +
                ", trainer_name='" + trainer_name + '\'' +
                ", year_of_exeperience='" + year_of_exeperience + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


