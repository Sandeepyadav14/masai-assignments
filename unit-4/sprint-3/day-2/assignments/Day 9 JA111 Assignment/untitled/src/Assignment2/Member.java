package Assignment2;

public class Member {
        String name;
        int age;
        String phoneNumber;
        String address;
        double salary;

        public void printSalary(){
            System.out.print(salary);
        }
    }
    class Employee extends Member {

        String Specialisation;
        String Department;

    }
    class Manager extends Member {
        String Specialisation;
        String Department;
    }
    class MainOfMembers{
        public static void main(String[] args) {
//        Member m=new Member();
        Employee e= new Employee();
        Manager m=new Manager();
        e.name="Sandy";
        e.address="Maharashtra";
        e.salary=200.50;
        e.phoneNumber="7710817246";
          e.printSalary();
        }

}
