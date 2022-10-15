import java.util.Scanner;
public class Course {
    int courseid;
    String coursename;
    int coursefee;

    void displayCourseDetails(){
        System.out.println(courseid);
        System.out.println(coursename);
        System.out.println(coursefee);
    }
    static void authenticate(String user ,String pass){
        String username="Admin";

        String Password="1234";
        if(username==user && Password==pass) {
            Scanner sc = new Scanner(System.in);
            Course c = new Course();
            System.out.println("Enter course id:");
            c.courseid = sc.nextInt();
            System.out.println("Enter The Coursename:");
            c.coursename = sc.next();
            System.out.println("Enter The Coursees:");
            c.coursefee = sc.nextInt();

            c.displayCourseDetails();
        }else{
            System.out.println("invalid username and password");
        }
    }

    public static void main(String[] args) {
//      String user="Admn";
//      String pass="1234";
//      authenticate(user, pass);
    String use="Admin";
     String pas="1234";
     authenticate(use ,pas);
    }

}
