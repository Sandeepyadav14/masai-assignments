package com.masai.Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class DeleteBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("insert the delete book_id");
        int id=sc.nextInt();
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("BookLibrary");


        EntityManager em= emf.createEntityManager();

        BookLibrary bl=em.find(BookLibrary.class,id);
        if(bl!=null){
           em.getTransaction().begin();
           em.remove(bl);
           em.getTransaction().commit();
            System.out.println("Done");
        }else{
            System.out.println("Not Deleted..");
        }
        em.close();
    }

}
