import java.util.Scanner;

public class Printdata {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=sc.next();

        System.out.println("Enter Your Age");
        int age=sc.nextInt();

        System.out.println(name+" : "+age );
    }
}

