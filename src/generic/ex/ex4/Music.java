package generic.ex.ex4;

public class Music implements Media{
    String title;
    String artist;

    public Music(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String getTitle() {
        return title;
    }
    public String getArtist(){
        return artist;
    }
}
