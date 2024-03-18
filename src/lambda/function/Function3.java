package lambda.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Function3 {
    public static void main(String[] args) {
        // 매개변수 하나만 있고, 리턴 값 없는 함수형 인터페이스
        Consumer<Integer> oddEven = number -> {
            if (number % 2 == 0) {
                System.out.println(number + "는 짝수입니다.");
            } else {
                System.out.println(number + "는 홀수입니다.");
            }
        };
        // 변수에 저장된 함수를 실행
        oddEven.accept(3);
        oddEven.accept(4);

        // 버튼 객체 생성 및 클릭 리스너 설정
        Button dogButton = new Button("개");
        dogButton.setOnClickListener(() -> System.out.println("왈왈"));

        // 버튼을 클릭하는 함수(람다식을) 함수형 인터페이스(변수)에 저장
        Consumer<Button> clickButton = button -> button.onClick();

        // 버튼 클릭 발생 : 변수에 저장된 함수(객체를 실행하는 람다식)을 실행
        clickButton.accept(dogButton);

        // 입력 없이 결과만 반환
        Supplier randomSupplier = () -> Math.random();
        System.out.println("랜덤값 : " + randomSupplier.get());

        // Function : 입력 -> 반환값
        Function<String, Integer> stringLengthFunction = string -> string.length();
        Integer i = stringLengthFunction.apply("이 문자열의 길이를 반환");
        System.out.println("문자열의 길이 = "+i);

        // Predicate : 입력에 대해 참 거짓 여부 평가
        Predicate<String> isTenUpper = string -> string.length() > 10;
        if ( isTenUpper.test("이 글자의 길이는 10자가 넘나요?") ) {
            System.out.println("10자가 넘습니다.");
        } else {
            System.out.println("10자 미만입니다.");
        }

        // 매개변수 및 다른 타입을 2가지 넣어 판별하는 경우
        BiPredicate<Character, Integer> isSameNumber = ((character, integer) ->
                (int) character == integer);
        boolean b1 = isSameNumber.test('A', 64);
        boolean b2 = isSameNumber.test('A', 65);

        System.out.println("A는 아스키코드 64인가? " + b1);
        System.out.println("A는 아스키코드 65인가? " + b2);

        // BiFunction : 입력을 2가지로 받아 결과를 리턴, 타입이 다를 수 있음
        BiFunction<String, String, Integer> concatLength =
                (s1, s2) -> (s1 + s2).length();
        Integer length = concatLength.apply("문자열 합쳤을 때", "길이를 정수로 변환");
        System.out.println("length = " + length);

        // UnaryOperator(단항) 입력 타입과 결과 타입이 모두 같을 때
        UnaryOperator<Integer> powerOperator = x -> x * x;
        System.out.println("5 * 5 = " + powerOperator.apply(5));

        // UnaryOperator(이항) 입력 타입과 결과 타입이 모두 같을 때
        BinaryOperator<Integer> sumOperator = (x, y) -> x + y;
        System.out.println("20 + 30 = "+sumOperator.apply(20, 30));

        // 컬렉션 프레임워크와 함께 사용
        List<String> nameList = new ArrayList<>();
        nameList.addAll(
                List.of("홍길동", "임꺽정","전우치")
        );
        // Consumer 타입(함수형 인터페이스 = 함수)을 매개변수로 받음
        Consumer<String> printConsumer = s -> System.out.println("===" + s + "===");
        nameList.forEach(printConsumer); // 변수에 저장하여 대입
        nameList.forEach(s -> System.out.println("이름 : " + s)); // 람다식으로 바로 대입
    }
}
