package inheritance.ex.Ex2;

public class MusicPlayer {
    public static void main(String[] args) {
        ClassicalMusicTrack classic = new ClassicalMusicTrack("Symphony No. 9","Beethoven","Beethoven");
        classic.play();
        PopMusicTrack pop = new PopMusicTrack("Shape of You", "Ed Sheeran","Divide");
        pop.play();

    }
}
