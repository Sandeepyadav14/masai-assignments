package SingleTable.UseCases;

import SingleTable.Bean.Movie;
import SingleTable.Util.MangerEvalution;

import javax.persistence.EntityManager;

public class AddMovie {
    public static void main(String[] args) {
        Movie movie=new Movie();
        movie.setMovieName("Shipahi");
        movie.setGenre("Thriller");
        EntityManager em= MangerEvalution.provideConnection();
        em.getTransaction().begin();

        em.persist(movie);

        em.getTransaction().commit();
        em.close();
    }
}
