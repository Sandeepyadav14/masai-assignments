public class Student {



    int roll;
    String name;
    int marks;

    void displayStudentDetails(){
        System.out.println("Roll No is:"+roll);
        System.out.println("Student Name is:"+name);
        System.out.println("Marks is:"+marks);
    }
    public static void main(String[] args){
        Student s1=new Student();
        s1.roll=72;
        s1.name="Sandy";
        s1.marks=1000;
        s1.displayStudentDetails();

        Student s2=new Student();
        s2.roll=79;
        s2.name="Sandeep Yadav";
        s2.marks=05;
        s2.displayStudentDetails();


    }
}
