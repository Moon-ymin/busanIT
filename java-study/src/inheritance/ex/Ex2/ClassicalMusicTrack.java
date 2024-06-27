package inheritance.ex.Ex2;

public class ClassicalMusicTrack extends MusicTrack{
    private String composer;

    public ClassicalMusicTrack(String title, String artist, String composer) {
        super(title, artist);
        this.composer = composer;

    }

    @Override
    public void play(){
        super.play();
        System.out.println(", Composer: " + composer);

    }



}
