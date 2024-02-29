package nested.anonymous_interface;

public class Anonymous {
    // 필드의 초기값으로 익명 구현 객체 대입
    RemoteControl airControl = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("에어컨 켭니다.");
        }
    };

    void method() {
        // 지역 변수 값으로 익명 구현 객체 대입
        RemoteControl radioRemote = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("라디오 켭니다.");
            }
        };
        radioRemote.turnOn();
    }

    // 매개변수 입력으로 인터페이스 구현 객체를 받을 수 있음
    void methodParam(RemoteControl remoteControl) {
        remoteControl.turnOn();
    }
}
