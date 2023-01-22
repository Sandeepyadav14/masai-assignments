package Main;

import Bean.Collage;
import Bean.Student;
import Util.UtilManager;

import javax.persistence.EntityManager;
import javax.security.sasl.SaslClient;
import java.util.List;
import java.util.Scanner;

public class GetStudentByCollageId {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter College Id:...");
        int collageId= sc.nextInt();

        EntityManager em= UtilManager.provideConnection();
        Collage collage=em.find(Collage.class,collageId);
        System.out.println("**************");

        System.out.println("Collage Id:- "+collage.getCollageId());
        System.out.println("Collage Name:- "+collage.getCollageName());
        System.out.println("Collage Address:- "+collage.getCollageAddress());
        System.out.println("*****************");
        List<Student> studentList=collage.getStudentList();
        for (Student i:studentList){
            System.out.println("Student Roll:- "+i.getStudentRoll());
            System.out.println("Student Name:- "+i.getStudentName());
            System.out.println("Student Mobile Number:- "+i.getMobileNumber());
            System.out.println("Student Email:- "+i.getEmail());
            System.out.println("********************");
        }
    }
}
