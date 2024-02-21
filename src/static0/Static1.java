package static0;

public class Static1 {
    // 메서드 영역에 관련 클래스 정보와 메서드 정보가 메모리에 올라간다
    // 자바 프로그램이 실행되면서 Entry Point(진입점: main 함수)을 찾는다
    // 스택에 메인 메서드 프레임이 생성된다
    public static void main(String[] args) {
        System.out.println("메인 메서드 시작");
        staticMethod1();    // staticMethod1 호출 -> 스택 프레임 생성
        System.out.println("메인 메서드 끝");
    }

    static void staticMethod1() {
        System.out.println("메서드1 시작");
        // 새로운 클래스의 정보를 메서드 영역에 저장한다
        Data data = new Data(100); // 힙 영역에 객체 생성
        // 메서드 영역의 생성자 정보에 접근하여 생성자 함수 실행
        // 스택 영역의 data 변수에 생성된 메모리 주소를 바인딩
        staticMethod2(data);             // 스택 영역에 메소드 호출 + 스택 프레임 생성
        // 메서드 2 스택 프레임의 매개변수로 data의 참조값을 복사하여 전달
        System.out.println("메서드1 끝");
        // 메서드1 스택 프레임이 제거된다. data 변수도 프레임과 함께 제거
        // 더 이상 Data(100) 객체를 참조하는 변수가 하나도 남아있지 않게 됨
        // GC가 객체도 제거하게 된다.
    }

    static void staticMethod2(Data dataparam) {
        System.out.println("메서드2 시작");
        System.out.println("데이터 객체의 필드 : " + dataparam.getField());
        // 힙영역의 dataParam의 참조값에 접근한다
        // 메서드 영역(공유)의 Data 클래스의 getField 메서드 코드에 접근한다
        System.out.println("메서드2 끝");
        // 메서드2 스택프레임이 제거된다. dataParam 변수도 프레임과 함께 제거
    }
}
