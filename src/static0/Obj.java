package static0;

public class Obj {
    // 필드
    String name;    // 객체의 이름
//    int count; // 인스턴스 멤버변수인 경우 : 개수가 공유되지 않는다 (힙영역 객체 내부에 저장)
    static int count;      // 객체의 개수 : static
    // 메서드 영역의 static 영역에 저장되며, 모든 객체에서 공유되게 된다

    // 생성자
    Obj( String name ) {
        this.name = name;       // 생성하면서 이름 초기화
        count++;                // 객체 갯수 증가
    }
    
    // 숫자를 세는 다른 객체(계수기)를 매개변수로 가져와서
    Obj(String name, Counter counter) {
        this.name = name;
        counter.count++;        // 생성될때마다 계수기의 개수 증가
    }

}
