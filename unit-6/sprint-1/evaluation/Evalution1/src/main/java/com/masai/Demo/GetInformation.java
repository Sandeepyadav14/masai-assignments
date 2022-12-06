package com.masai.Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class GetInformation {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("insert the book_id");
        int id=sc.nextInt();
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("BookLibrary");


        EntityManager em= emf.createEntityManager();

       BookLibrary bl=em.find(BookLibrary.class,id);
       if(bl!=null){

           System.out.println(bl);
       }else{
           System.out.println("data not found");
       }
em.close();
    }
}
