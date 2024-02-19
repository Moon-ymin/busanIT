package class0;

public class Class7 {
    public static void main(String[] args) {
        // 라디오와 연관된 데이터를 라디오 객체로 묶음
        // 관련 데이러를 쉽게 구분 가능
        Radio radio = new Radio();  // 라디오 객체 생성

        // 재사용이 가능한 기능들을 메소드로 추출하기
        turnOn(radio);
        volumeUp(radio);
        volumeUp(radio);
        volumeUp(radio);
        volumeUp(radio);
        volumeDown(radio);
        volumeDown(radio);
        showRadioStatus(radio);
        showRadioStatus(radio);
        turnOff(radio);
        turnOn(radio);

        // 모듈화
        // 코드 중복이 제거
        // 같은 로직이 필요하면 메서드를 호출하면 됨
        // 기능이 수정될 때, 메서드 내부만 변경하면 된다.

    }



    // 라디오 켜는 메소드
    static void turnOn(Radio radio) {
        radio.isOn = true;
        System.out.println("라디오 전원을 켰습니다.");
    }

    static void volumeUp(Radio radio) {
        // 음량 높이기
        radio.volume = radio.volume + 2;       // volume = volume + 1
        System.out.println("라디오 음량 : " + radio.volume);
    }

    static void volumeDown(Radio radio) {
        // 음량 줄이기
        radio.volume--;
        System.out.println("라디오 음량 : " + radio.volume);
    }

    static void showRadioStatus(Radio radio) {
        // 라디오 상태 확인
        System.out.println("라디오 상태 확인");
        if (radio.isOn == true) {
            System.out.println("라디오 전원 켜짐, 음량 : " + radio.volume);
        } else {
            System.out.println("라디오 전원 꺼짐");
        }
    }

    static void turnOff(Radio radio) {
        // 라디오 끄기
        radio.isOn = false;
        System.out.println("라디오를 종료합니다.");
    }
}