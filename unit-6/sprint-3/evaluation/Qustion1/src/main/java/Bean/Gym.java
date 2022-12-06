package Bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gym_id;
    private String gym_name;
    private String monthly_fee;

    @ManyToMany(cascade = CascadeType.ALL)
    List<Person> personList=new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "person_id")
    private List<Trainer> trainerList=new ArrayList<>();
    public int getGym_id() {
        return gym_id;
    }

    public void setGym_id(int gym_id) {
        this.gym_id = gym_id;
    }

    public String getGym_name() {
        return gym_name;
    }

    public void setGym_name(String gym_name) {
        this.gym_name = gym_name;
    }

    public String getMonthly_fee() {
        return monthly_fee;
    }

    public void setMonthly_fee(String monthly_fee) {
        this.monthly_fee = monthly_fee;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "gym_id=" + gym_id +
                ", gym_name='" + gym_name + '\'' +
                ", monthly_fee='" + monthly_fee + '\'' +
                '}';
    }
}
