package Main;

import Dao.Dao;
import Dao.Daoimpl;

import javax.security.sasl.SaslClient;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class GetCourse {
    public static void main(String[] args) {
        Dao d=new Daoimpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Course Id;");
        int n=sc.nextInt();
        d.getCourse(n);

    }
}
