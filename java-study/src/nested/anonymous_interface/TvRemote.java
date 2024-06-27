package nested.anonymous_interface;

public class TvRemote implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
}
