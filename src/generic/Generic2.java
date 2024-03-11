package generic;

public class Generic2 {
    // 제네릭 : 결정되지 않은 타입을 파라미터로 처리하고,
    // 실제 사용할 때 파라미터를 구체적인 타입으로 대체하는 기능
    static class Box<T> {
        T content;

        public T getContent() {
            return content;
        }
    }

    public static void main(String[] args) {
        // Box 생성 시 T 대신 String 으로 대체
        Box<String> stringBox = new Box<String>();
        stringBox.content = "문자열";
        String strContent = stringBox.getContent();
        strContent.length();    // 캐스팅이 필요 없음

        // Box 생성 시 T 대신 Integer 로 대체
        // 우측 항에서 타입은 추론 가능하기 때문 생략
        Box<Integer> integerBox = new Box<>();
//        Box<int> intBox = new Box<>(); // 기본타입은 제네릭 대입 불가 ⇒ 포장 타입을 넣는다

        //        integerBox.content = "문자열";
        integerBox.content = 100;
        Integer intContent = integerBox.getContent();
        intContent.equals(100);
    }
}
