package Question3;

import Question2.Song;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    public List<Song> songs = new ArrayList<>();
    public void addSong(Song song){
        boolean d=false;
        for(int i=0;i< songs.size();i++){
            if(songs.get(i).equals(song)){
                d=true;
            }
        }
        if(d) {
            System.out.println("this is the duplicate object");
        }
        else{
            songs.add(song);
            System.out.println("Song added to the playlist successfully");
        }


    }


}
