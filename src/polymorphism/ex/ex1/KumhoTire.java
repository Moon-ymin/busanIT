package polymorphism.ex.ex1;

public class KumhoTire extends Tire {
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        // 한 번 회전시 누적회전수 증가
        accumulatedRotation++;
        // 누적회전수가 최대회전수를 초과했을 때 펑크, 아니면 정상수행
        if (accumulatedRotation > maxRotation) {
            System.out.println(location + " 금호타이어 펑크");
            // 펑크가 나면 false를 반환
            return false;
        } else {
            System.out.println(location + " 금호타이어가 굴러갑니다. 수명 : " +
                    (maxRotation - accumulatedRotation) );
            // 정상 회전일 경우 타이어 수명 체크
            return true;
        }
    }
}