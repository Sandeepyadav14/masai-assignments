package Question2;

public class StudentBean implements Comparable<StudentBean> {
    int roll;
    String name;
    int marks;

    public StudentBean(int roll,String name,int marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    public StudentBean(){}

    @Override
    public String toString() {
        return "StudentBean{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(StudentBean o) {
        if(this.marks>o.marks){
            return 1;
        }
        else{
            return -1;
        }
    }
}