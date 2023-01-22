package JoinedTable.Usecases;

import JoinedTable.Bean.Movie;
import Util.MangerEvalution;

import javax.persistence.EntityManager;

public class AddMovie {


    public static void main(String[] args) {
        Movie m=new Movie();
        m.setGenre("Drama");
        m.setMovieName("Sholay");

        Movie m1=new Movie();
        m1.setGenre("Comedy");
        m1.setMovieName("RRR");

        Movie m2=new Movie();
        m2.setGenre("Romantic");
        m2.setMovieName("Tirange");

        Movie m3=new Movie();
        m3.setGenre("Thriller");
        m3.setMovieName("tiger2");

        EntityManager em= MangerEvalution.provideConnection();
        em.getTransaction().begin();
        em.persist(m);
        em.persist(m1);
        em.persist(m2);
        em.persist(m3);
        em.getTransaction().commit();
        em.close();
        System.out.println("done.....");
    }
}
