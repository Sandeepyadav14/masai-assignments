package JoinedTable.Usecases;

import JoinedTable.Bean.Movie;
import Util.MangerEvalution;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class GetMovieDetail {
    public static void main(String[] args) {
        EntityManager em= MangerEvalution.provideConnection();
        Query query=em.createQuery("From Movie");

        List<Movie> movieList=query.getResultList();
        movieList.forEach(s-> System.out.println(s));




    }
}
