package polymorphism.ex.ex1;

public class Car {
    // 필드 (Composition 포함 관계)
    // Car has four Tires.
    Tire TireFL = new Tire("앞왼쪽",5);
    Tire TireFR = new Tire("앞오른쪽",4);
    Tire TireBL = new Tire("뒤왼쪽",2);
    Tire TireBR = new Tire("뒤오른쪽",3);

    public int run() {
        // 반환값 : 타이어가 고장이 나면 고장난 타이어 번호를 반환한다
        // 순서대로 1, 2, 3, 4 | 고장이 나지 않으면 0을 반환한다
        // 자동차가 달릴 시, 타이어의 roll 메서드가 수행된다
        System.out.println("=== 자동차가 달립니다 ===");
        if( !TireFL.roll() ) { stop(); return 1; }
        if( !TireFR.roll() ) { stop(); return 2; }
        if( !TireBL.roll() ) { stop(); return 3; }
        if( !TireBR.roll() ) { stop(); return 4; }
        // 타이어가 펑크가 나면 자동차가 멈춘다
        return 0;
    }
    public void stop(){
        System.out.println("타이어 펑크로 인해 자동차가 멈춥니다.");
    }


}
