package JoinedTable.Bean;

import javax.persistence.*;

@Entity
public class Series {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seriesId;
    private String seriesName;
    private int noOfEpisodes;

    public Series(int seriesId, String seriesName, int noOfEpisodes) {
        this.seriesId = seriesId;
        this.seriesName = seriesName;
        this.noOfEpisodes = noOfEpisodes;
    }

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public int getNoOfEpisodes() {
        return noOfEpisodes;
    }

    public void setNoOfEpisodes(int noOfEpisodes) {
        this.noOfEpisodes = noOfEpisodes;
    }

    public Series() {
    }

    @Override
    public String toString() {
        return "Series{" +
                "seriesId=" + seriesId +
                ", seriesName='" + seriesName + '\'' +
                ", noOfEpisodes=" + noOfEpisodes +
                '}';
    }
}
