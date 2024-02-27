package polymorphism.interface0.ex.ex1;

public class CDPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("CD 재생 시작!");
    }

    @Override
    public void pause() {
        System.out.println("CD 일시 정지!");
    }

    @Override
    public void stop() {
        System.out.println("CD 재생 중지!");
    }
}
