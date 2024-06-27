package polymorphism.interface0.ex.ex1;

public class MP3Player implements Playable{
    @Override
    public void play() {
        System.out.println("MP3 재생 시작!");
    }

    @Override
    public void pause() {
        System.out.println("MP3 일시 정지!");
    }

    @Override
    public void stop() {
        System.out.println("MP3 재생 중지!");
    }
}
