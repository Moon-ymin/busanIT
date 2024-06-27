package nested;

public class NestedClass {
    /* 중첩 클래스란 : 클래스 내부에 선언한 클래스
    - 서로 관련있는 구조를 더 잘 조직하기 위해서 사용하고,
    - 관련성 있는 구성 요소를 함께 묶어서 복잡성을 줄일 수 있음.
     */
    class InnerClass {
        // 클래스 내부에 있는 중첩 클래스 (인스턴스가 있어야 접근 가능)
    }
    interface InnerInterface {
        // 중첩 인터페이스 : 해당 클래스와 긴밀한 관계를 맺는 구현 클래스를 만들기 위함
    }
    
    static class staticInnerClass {
        // 정적 중첩 클래스 : 외부 클래스의 인스턴스 없이도 접근 가능 
    }
    void method(){
        class localClass {
            // 로컬 클래스 : 메서드를 실행할 때만 사용할 수 있는 클래스
        }
    }
}
