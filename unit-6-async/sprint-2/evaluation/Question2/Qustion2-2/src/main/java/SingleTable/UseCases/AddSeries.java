package SingleTable.UseCases;

import SingleTable.Bean.Series;
import SingleTable.Util.MangerEvalution;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;

public class AddSeries {
    public static void main(String[] args) {
        Series series=new Series();
        series.setSeriesName("Fixer");
        series.setNoOfEpisodes(989);
        EntityManager em= MangerEvalution.provideConnection();
        em.getTransaction().begin();
        em.persist(series);
        em.getTransaction().commit();
        em.close();
    }
}
