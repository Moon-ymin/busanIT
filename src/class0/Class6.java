package class0;

public class Class6 {
    public static void main(String[] args) {
        // 절차적 프로그래밍으로 라디오 구현
        // 위에서부터 아래로 순차적으로 실행되고, 명령문이 한줄씩 실행됨
        int volume = 0;       // 음량 : 0
        boolean isOn = false; // 전원 켜진 여부 : 기본값 꺼짐

        // 라디오 켜기
        isOn = true;
        System.out.println("라디오 전원을 켰습니다.");

        // 음량 높이기
        volume++;
        System.out.println("라디오 음량 : " + volume);

        // 음량 줄이기
        volume--;
        System.out.println("라디오 음량 : " + volume);
        
        // 라디오 상태 확인
        System.out.println("라디오 상태 확인");
        if (isOn == true) {
            System.out.println("라디오 전원 켜짐, 음량 : " + volume);
        } else {
            System.out.println("라디오 전원 꺼짐");
        }

        // 라디오 끄기
        isOn = false;
        System.out.println("라디오를 종료합니다.");
    }
}
