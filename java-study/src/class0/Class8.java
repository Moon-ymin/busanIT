package class0;

public class Class8 {
    public static void main(String[] args) {
        Radio radio = new Radio();

        radio.turnOn();
        radio.volumeUp();
        radio.showRadioStatus();
        radio.volumeUp();
        radio.volumeUp();
        radio.volumeUp();
        radio.volumeDown();
        radio.showRadioStatus();
        radio.volumeDown();
        radio.turnOff();

        // 라디오 객체를 생성하고 필요한 행동(메서드)만 호출하면 끝
        // 객체를 사용하는 쪽에서는 데이터를 몰라도 사용하는데 지장이 없다
        // 라디오와 관련된 속성과 기능이 하나의 캡슐에 쌓여있는 것 같음 => 캡슐화
        // 코드를 변경하게 되더라고, 라디오와 관련된 내용은 클래스에서만 변경하면 모두 적용
    }
}
