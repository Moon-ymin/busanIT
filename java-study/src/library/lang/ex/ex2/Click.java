package library.lang.ex.ex2;

public class Click {
    // 연습문제2
    // Click 클래스는 x좌표, y좌표, 시간(timestamp : int타입)을 저장하는 클래스
    // 실제 Click 인스턴스가 x좌표, y좌표가 같으면 동등하다라고 인정되게끔
    // eqauls메서드를 overriding 해서 메인메서드로 확인해보세요.
    int x;
    int y;
    int timestamp;

    public Click(int x, int y, int timestamp) {
        this.x = x;
        this.y = y;
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;     // 참조값 같은지 비교 => true
        // null인 경우, 타입이 다른 경우 false
        if (o == null || getClass() != o.getClass()) return false;
        // 다운캐스팅하여 해당 필드값 비교 => true or false
        Click click = (Click) o;
        return x == click.x && y == click.y;
    }


    public static void main(String[] args) {
        Click click1 = new Click(123, 123, 2024030512);
        Click click2 = new Click(123, 123, 2024030512);
        Click click3 = new Click(123, 123, 2020010112);
        Click click4 = new Click(123, 676, 2024030512);
        Click click5 = new Click(456, 123, 2024030512);
        Click click6 = new Click(456, 972, 2020010112);
        Click click7 = null;
        Object click8 = new Object();

        boolean b1 = click1.equals(click2);// true
        boolean b2 = click1.equals(click3);      // true
        boolean b3 = click1.equals(click4);      // false
        boolean b4 = click1.equals(click5);      // flase
        boolean b5 = click1.equals(click6);      // false
        boolean b6 = click1.equals(click7);      // false
        boolean b7 = click1.equals(click8);      // false

        // 디버거로 예측값과 결과값 비교
    }
}