package inheritance.ex.Ex2;

public class PopMusicTrack extends MusicTrack{
    String album;

    public PopMusicTrack(String title, String artist,String album) {
        super(title, artist);
        this.album = album;

    }

    @Override
    public void play(){
        super.play();
        System.out.println(", Album : "+album);
    }
}
