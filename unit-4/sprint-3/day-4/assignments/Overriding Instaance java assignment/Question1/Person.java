package Question1;

public class Person {
    String name;
    String gender;
    Address address;

    @Override
    public String toString() {
        return "Person [name="+name+",gender="+gender+",address="+address+"]";
    }
}
class Address{

    String state;
    String pincode;
    String city;
    @Override
    public String toString() {
        return "Address [State="+state+",city="+city+",pincode="+pincode+"]";
    }
}
class Instructer extends Person{
    int instructorId;
    int salary;
    @Override
    public String toString() {
        return "Instructor [instructorId="+instructorId+",salary="+salary+address+"]";
    }
}
class Student extends Person{

    int studentId;
    String courseEnrolled;
    int courseFee;
    @Override
    public String toString() {
        return "Student [StudentId="+studentId+",CourseEnrolled="+courseEnrolled+",courseFee="+courseFee+address+"]";
    }

}
class Main{
    public static Person generatePerson(Person person){
        person.address=new Address();
        person.address.city="chennai";
        person.address.state="Tamiladu";
        person.address.pincode="23299320";

        if(person instanceof Student){
            Student st=(Student) person;
            st.studentId=12;
            st.courseFee=300;
            st.courseEnrolled="ja111";

        }
        else if(person instanceof Instructer){
            Instructer in=(Instructer) person;
            in.instructorId=32;
            in.salary=3000;

        }
        return person;
    }

    public static void main(String[] args) {
        Person p=generatePerson(new Student());
        Person pi=generatePerson(new Instructer());
        System.out.println(p);
        System.out.print(pi);
    }
}