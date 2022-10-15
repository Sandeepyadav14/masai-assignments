package Question2;

import java.util.Objects;
import java.util.Scanner;
import Question3.PlayList;
public class Song{
  private String moviename;
  private String songname;

    public Song(String moviename, String songname) {
        this.moviename = moviename;
        this.songname = songname;
    }

    public Song() {

    }

   public void play(){
        System.out.println(this.songname+" of "+this.moviename+" is playing...!");
   }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
//        Song s=(Song) o;
        return this.moviename== ((Song) o).moviename && this.songname==((Song) o).songname;
    }

    public static void main(String[] args) {
  Song s1=new Song();
        Song song=new Song("rrr","rrr");
        Song song1=new Song("rrr","rrr");

        PlayList pl=new PlayList();
        pl.addSong(song);


    }
}
