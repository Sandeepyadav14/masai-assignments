package Main;


import Bean.Collage;
import Bean.Student;
import Util.UtilManager;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class GetCollageDetailByStudentRollNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Student Roll No.");
        int roll=scanner.nextInt();

        EntityManager em= UtilManager.provideConnection();
        Student student=em.find(Student.class,roll);
        Collage collage=student.getCollage();
        System.out.println("**********************");
        System.out.println("Collage Id:- "+collage.getCollageId());
        System.out.println("Collage Name:- "+collage.getCollageName());
        System.out.println("Collage Address:-  "+collage.getCollageAddress());

    }
}
