package lambda.ex;

import java.util.function.Function;

public class Ex3 {
    public static void main(String[] args) {
        // 입력 매개변수가 하나면 소괄호 생략
        // 본문이 리턴값 한 줄일 때 중괄호, return 생략
        Function<String, Integer> function = birthDate ->
                2024 - Integer.parseInt(birthDate.substring(0,4));

        System.out.println(function.apply("19900315"));

    }
}
