package lambda.function;

import java.util.function.*;

public class Function1 {
    /*
        java.util.function 패키지
        - 람다식을 위한 인터페이스를 미리 제공
     */
    public static void main(String[] args) {
        // 매개변수가 없고, 반환 값이 없음 (java.lang 패키지)
        Runnable runnable;
        // 매개변수가 1개<T>있고, 반환 값이 없음
        Consumer<Integer> consumer;
        // 매개변수가 2개<T, U> 있고, 반환 값이 없음
        BiConsumer<Integer, String> biConsumer;
        // 매개변수는 없고, 반환<T> 값이 있음
        Supplier<Integer> supplier;
        // 매개변수<T>도 있고, 반환 값<R>도 있음
        Function<Integer, String> function;
        // 매개변수<T, U>가 2개 있고, 반환<R> 값도 있음
        BiFunction<Integer, Integer, Integer> biFunction;
        // 매개변수<T>가 있고, 반환값이 Boolean 임 => 판별식
        Predicate<Integer> predicate;
        // 매개변수가 2개<T, U> 반환값이 Boolean
        BiPredicate<Integer, Integer> biPredicate;
        // 매개변수의 타입과, 리턴타입이 똑같은 형태의 Function => Operator
        UnaryOperator<Integer> unaryOperator;      // 단항 연산자
        BinaryOperator<Integer> binaryOperator;    // 이항 연산자

    }
}
