package BEAN;

import java.util.Objects;

public class Gym {
    private int gym_id;
    private String gym_name;
    private String monthly_fee;
   public Gym(){

    }
    public Gym(int gym_id, String gym_name, String monthly_fee) {
        this.gym_id = gym_id;
        this.gym_name = gym_name;
        this.monthly_fee = monthly_fee;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gym gym = (Gym) o;
        return gym_id == gym.gym_id && Objects.equals(gym_name, gym.gym_name) && Objects.equals(monthly_fee, gym.monthly_fee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gym_id, gym_name, monthly_fee);
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
