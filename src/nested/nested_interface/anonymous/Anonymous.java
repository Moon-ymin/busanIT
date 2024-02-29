package nested.nested_interface.anonymous;

public class Anonymous {
    // 익명객체 : 이름 없이 선언과 동시에 생성되는 객체
    // 일회성으로 사용되고 다시 참조될 필요가 없는 경우 사용된다
    // 객체마다 다시 생성하려면 재사용 불가능하며 다시 정의해야 한다.
    // 어떤 클래스를 상속하거나, 인터페이스를 구현해야만 함
    
    // 익명 자식 객체를 필드의 초기값으로 대입한 경우 
    // 익명객체의 필드
    Person person = new Person() {
        // Person을 상속받아 새롭게 정의한 익명 자식 객체 
        void work() {
            System.out.println("출근합니다.");
        }
        
        @Override
        void wake() {
            System.out.println("아침 6에 출근합니다.");
            work(); // ⭐ 익명 객체 내부에서는 정의한 메서드 호출 가능
        }
    };
    
    // 로컬 변수에 익명 자식 객체 정의
    void method() {
        Person localPerson = new Person() {
            void play() {
                System.out.println("쉬고 놉니다.");
            }
            @Override
            void wake() {
                System.out.println("아침 8시에 일어납니다.");
                play(); // ⭐ 내부에서 사용가능 → 외부에서 사용불가
            }
        };

        // 부모 타입의 로컬 변수로 메서드 호출
        localPerson.wake();
//        localPerson.play(); // 자식 타입(익명)의 메서드는 호출할 수 없다 (부모 타입이기 때문)
    }

    void methodParam( Person person ) {
        person.wake();
        // person.work();
    }
}
