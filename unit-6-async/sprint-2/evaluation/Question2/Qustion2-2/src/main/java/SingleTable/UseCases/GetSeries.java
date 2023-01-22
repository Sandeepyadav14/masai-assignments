package SingleTable.UseCases;

//import JoinedTable.Bean.Series;
import SingleTable.Bean.Series;
import SingleTable.Util.MangerEvalution;
//import Util.MangerEvalution;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class GetSeries {
    public static void main(String[] args) {
        EntityManager em= MangerEvalution.provideConnection();
        Query query=em.createQuery("From Series");

        List<Series> seriesList=query.getResultList();
        seriesList.forEach(s-> System.out.println(s));




    }

}
