package com.masai.Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.awt.print.Book;
import java.sql.Timestamp;
import java.util.Scanner;

public class CreateBook {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Please Enter the Book Id");
//        int id=sc.nextInt();
//        System.out.println("Please Enter the Name");
//        String name=sc.next();
//        System.out.println("Please Enter the auther name");
//        String author=sc.next();
//        System.out.println("Please Enter the publication");
//        String publication=sc.next();
//        System.out.println("Please Enter the category");
//        String category=sc.next();
//        System.out.println("Please Enter the pages");
//        int pages=sc.nextInt();
//        System.out.println("Please Enter the price");
//        int price=sc.nextInt();
//        System.out.println("Please Enter the date and time");
//        Timestamp timedate= Timestamp.valueOf(sc.next());





        EntityManagerFactory emf= Persistence.createEntityManagerFactory("BookLibrary");


        EntityManager em= emf.createEntityManager();


        BookLibrary bl=new BookLibrary(102,"sandy","deep","hsdgsd","dbhsdbgs",64,647, "2019-12-11 10:58:37");
        if(bl!=null){
            em.getTransaction().begin();
            em.persist(bl);
            em.getTransaction().commit();
            System.out.println("done");
        }else{
            System.out.println("data is not insert");
        }

    }
}
