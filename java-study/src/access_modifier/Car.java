package access_modifier;

public class Car {
    // 필드 : 데이터
    private int speed;      // 속도
    private boolean isStop; // 정지여부

    // 생성자


    // 메서드
    // Getter method : 필드에 접근하여 데이터를 가져온다.
    public int getSpeed() {
        if (!isStop) {
            return speed;
        } else {
            return -1;
        }
    }
    // Setter method : 안전하게 필드에 값을 설정할 때 사용된다
    public void setSpeed(int speed) {
        // 세터 메서드에 제약사항을 추가할 수 있다
        if (speed >= 0 && speed <= 120) {
            this.speed = speed;
        } else {
            System.out.println("0~120까지의 속도만 설정 가능합니다.");
        }
    }

    public void speedUP() {    // 제약사항 : 120 이상으로 올라가지 않을 것
        if ( speed >= 120 ) {
            this.speed = 120;
            System.out.println("더 이상 속도를 올릴 수 없습니다.");
            return;
        }
        speed++;
    }
    public void speedDown() {  // 제약사항 : 0 이하로 내려가지 않을 것
        if (speed <= 0) {
            this.speed = 0;
            System.out.println("속도를 낮출 수 없습니다.");
        }
        speed--;
    }
}
