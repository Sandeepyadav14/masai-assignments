import java.util.Scanner;
public class Demo {
     void average(){

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        StudentBean student= new StudentBean();
        System.out.println("Enter How Many Student There:");
        int n=s.nextInt();
        StudentBean student_arr[]=new StudentBean[n];
        for(int i=0;i<n;i++){
            StudentBean s1=new StudentBean();
            System.out.println("Enter the Student Name:");
            s1.setName(s.next());
            System.out.println("Enter the Student Address:");
            s1.setAddress(s.next());
            System.out.println("Enter Student Roll Number:");
            s1.setRoll(s.nextInt());
            System.out.println("Enter the Student Marks:");
            s1.setMarks(s.nextInt());
            student_arr[i]=s1;

        }
        int sp=0;
       for(int i=0;i<n;i++){
           System.out.println(student_arr[i].getName());
           System.out.println(student_arr[i].getAddress());
           System.out.println(student_arr[i].getRoll());
           System.out.println(student_arr[i].getMarks());
           sp=sp+student_arr[i].getMarks();
       }
       int a=sp/n;
       System.out.println("Average Marks is "+a);

    }
}
class StudentBean{
    int roll;
    String name;
    String address;
    int marks;

    public StudentBean(int roll, String name, String address, int marks) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    public StudentBean() {

    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}