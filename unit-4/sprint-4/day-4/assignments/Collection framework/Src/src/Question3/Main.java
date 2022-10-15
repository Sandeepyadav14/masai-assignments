package Question3;

import Question2.Song;

public class Main {
    public static void main(String[] args) {
        Song s1=new Song("sandy","sand");
        Song s2=new Song("sandy1","sand2");
        Song s3=new Song("sandy4","sand4");
        Song s4=new Song("sandy4","sand4");

        PlayList p=new PlayList();
        p.addSong(s1);
        p.addSong(s2);
        p.addSong(s3);
        p.addSong(s4);
        Song p2=new Song();
        p2.play();


    }
}
