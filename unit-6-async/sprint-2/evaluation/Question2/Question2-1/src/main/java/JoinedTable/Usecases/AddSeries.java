package JoinedTable.Usecases;

import JoinedTable.Bean.Series;
import Util.MangerEvalution;

import javax.persistence.EntityManager;

public class AddSeries {
    public static void main(String[] args) {
        Series series=new Series();
        series.setSeriesName("Fixer");
        series.setNoOfEpisodes(122);

        Series series1=new Series();
        series1.setSeriesName("CrimePetrol");
        series1.setNoOfEpisodes(232);

        Series series2=new Series();
        series2.setSeriesName("CID");
        series2.setNoOfEpisodes(3000);

        Series series3=new Series();
        series3.setSeriesName("Bahubali Once Again");
        series3.setNoOfEpisodes(988);

        EntityManager em= MangerEvalution.provideConnection();
        em.getTransaction().begin();
        em.persist(series);
        em.persist(series1);
        em.persist(series2);
        em.persist(series3);

        em.getTransaction().commit();
        em.close();
        System.out.println("Data Save.....");
    }
}
