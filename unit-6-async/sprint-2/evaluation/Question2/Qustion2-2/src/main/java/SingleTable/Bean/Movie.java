package SingleTable.Bean;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieId;
    private String movieName;
    private String genre;

    public Movie(int movieId, String movieName, String genre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
    }

    public Movie() {

    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
