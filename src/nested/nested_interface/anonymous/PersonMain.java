package nested.nested_interface.anonymous;

public class PersonMain {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

        // 익명 객체의 필드에 접근하여 사용
        anonymous.person.wake();
        // anonymous.person.work(); (사용불가)

        // 익명 객체 로컬 변수로 사용하기
        anonymous.method();

        // 익명 객체를 매개변수로 사용하기
        anonymous.methodParam( new Person() {
            @Override
            void wake() {
                System.out.println("아침 5시에 일어납니다.");
                study();
            }
            void study() {
                System.out.println("공부합니다.");
            }
        });

    }
}
