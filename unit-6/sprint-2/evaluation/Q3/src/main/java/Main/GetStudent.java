package Main;

import Dao.Dao;
import Dao.Daoimpl;
import com.sun.xml.fastinfoset.sax.SystemIdResolver;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class GetStudent {
    public static void main(String[] args) {
        Dao d = new Daoimpl();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll No:;");
        int n = sc.nextInt();

        d.getStudent(n);

    }
}

