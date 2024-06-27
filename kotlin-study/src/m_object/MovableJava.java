package m_object;

public interface MovableJava {
    void move();
    void fly();
}
class MoveTest {
    public static void main(String[] args) {
        // 익명 객체 (인터페이스를 구현한)
        move(new MovableJava() {
            @Override
            public void move() {
                System.out.println("움직입니다");
            }

            @Override
            public void fly() {
                System.out.println("납니다.");
            }
        });
    }
    private  static void move(MovableJava movableJava) {
        movableJava.move();
        movableJava.fly();
    }
}