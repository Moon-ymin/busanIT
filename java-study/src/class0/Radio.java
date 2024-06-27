package class0;

public class Radio {
    // 필드 : 라디오와 관련된 속성 데이터의 모음
    int volume;
    boolean isOn;

    // 메서드 : 라디오와 관련된 기능, 행동의 모음
    // 관련된 기능과 행동을 모두 가지고 있음
    void turnOn() {
        isOn = true;
        System.out.println("라디오 전원을 켰습니다. 세탁기 광고 추가");
    }

    void volumeUp() {
        // 음량 높이기
        volume = volume + 1;       // volume = volume + 1
        System.out.println("라디오 음량 : " + volume);
    }

    void volumeDown() {
        // 음량 줄이기
        volume--;
        System.out.println("라디오 음량 : " + volume);
    }

    void showRadioStatus() {
        // 라디오 상태 확인
        System.out.println("라디오 상태 확인");
        if (isOn == true) {
            System.out.println("라디오 전원 켜짐, 음량 : " + volume);
        } else {
            System.out.println("라디오 전원 꺼짐");
        }
    }

    void turnOff() {
        // 라디오 끄기
        isOn = false;
        System.out.println("라디오를 종료합니다.");
    }
}
