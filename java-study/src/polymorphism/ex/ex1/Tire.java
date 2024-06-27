package polymorphism.ex.ex1;

public class Tire {
    // 필드
    String location;             // 위치
    int maxRotation;             // 최대회전수
    int accumulatedRotation;     // 누적회전수

    // 생성자
    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    // 메서드
    public boolean roll() {
        // 한 번 회전시 누적회전수 증가
        accumulatedRotation++;
        // 누적회전수가 최대회전수를 초과했을 때 펑크, 아니면 정상수행
        if (accumulatedRotation > maxRotation) {
            System.out.println(location + " 타이어 펑크");
            // 펑크가 나면 false를 반환
            return false;
        } else {
            System.out.println(location + " 타이어가 굴러갑니다. 수명 : " +
                    (maxRotation - accumulatedRotation) );
            // 정상 회전일 경우 타이어 수명 체크
            return true;
        }
    }
}