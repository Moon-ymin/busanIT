package nested.anonymous_interface;

import access_modifier.first.A;

public class RemoteMain {
    public static void main(String[] args) {
        RemoteControl audioRemote = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("오디오를 켭니다.");
                volumeUp(); // 익명 객체 내부에서 호출 가능
            }
            public void volumeUp(){
                System.out.println("볼륨을 올립니다.");
            }
        }; // 익명 객체 뒤에 ; 붙여줘야 함
        // RemoteControl audioRemote = () -> System.out.println("오디오를 켭니다."); 람다 형태

        Anonymous anonymous = new Anonymous();

        // 필드를 통한 익명 구현 객체 접근
        anonymous.airControl.turnOn();
        // 지역변수를 통한 접근
        anonymous.method();
        audioRemote.turnOn();

        // 익명 객체 외부에서 내부에서 지정한 메서드 호출 불가
        // audioRemote.volumeUp();
        // 매개변수를 통한 익명 구현 객체 생성
        anonymous.methodParam(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("컴퓨터를 켭니다.");
            }
        });

    }
}
