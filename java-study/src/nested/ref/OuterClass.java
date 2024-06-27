package nested.ref;

public class OuterClass {
    // 바깥쪽 필드
    String outerField = "바깥쪽 필드";
    String field = "바깥쪽 필드";
    // 바깥쪽 메서드
    void outerMethod() {
        System.out.println("바깥쪽 메서드");
    }
    void method() {
        System.out.println("바깥쪽 메서드");
    }

    // 안쪽 중첩 클래스
    class InnerClass {
        // 안쪽 필드
        String innerField = "안쪽 필드";
        String field = "안쪽 필드";
        // 안쪽 메서드
        void innerMethod() {
            System.out.println("안쪽 메서드");
        }
        void method() {
            System.out.println("안쪽 메서드");
        }
        void call() {
            System.out.println("=== 1. 안쪽에서 안쪽 필드와 메서드 호출 ===");
            // 1. 안쪽에서 안쪽(중첩객체 참조)
            System.out.println(field);      // 이름이 같을 때 → Scope이 가까운 쪽을 호출한다
            System.out.println(this.field); // this로 클래스 바깥이 아니라 자기 자신에서 참조함
                                            // 필드의 이름이 겹칠 때 this 키워드로 명시적으로 가리킨다
            System.out.println(innerField); // 이름이 다를 때는 this 키워드 없이 호출 가능
            
            method();
            this.innerMethod();             // this로 메서드 바로 참조
            innerMethod();

            // 2. 안쪽에서 바깥쪽 참조
            System.out.println("=== 2. 안쪽에서 바깥쪽 필드와 메서드 호출 ===");
            System.out.println(OuterClass.this.field);  // 클래스명적고 this 적기
            System.out.println(outerField);             // 이름이 구분된 경우 바로 호출 가능
            OuterClass.this.method();                   // 이름이 같은 경우 바깥 클래스에서 this 키워드로 접근하여 호출
            outerMethod();

        }
    }
}
