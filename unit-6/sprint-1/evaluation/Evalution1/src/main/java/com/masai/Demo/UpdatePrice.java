package com.masai.Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class UpdatePrice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("insert the Update By bookId");
        int id=sc.nextInt();
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("BookLibrary");


        EntityManager em= emf.createEntityManager();

        BookLibrary bl=em.find(BookLibrary.class,id);
        if(bl!=null){
            em.getTransaction().begin();
            int p=bl.getPrice();
            p=p*2;
            bl.setPrice(p);
            em.getTransaction().commit();
            System.out.println("done");
        }else{
            System.out.println("data not found");
        }
        em.close();

    }
}
