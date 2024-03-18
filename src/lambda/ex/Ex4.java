package lambda.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "python", "swift", "cpp", "ai");

        // sort : 비교자(Comparator (인터페이스)를 매개변수(익명객체)로 입력)
        // 익명객체 -> 람다(compare 함수를 overriding)
        // 길이 순서로 정렬
        /*
        languages.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
         */
        languages.sort((o1, o2) -> o1.length() - o2.length());
        // IDE 에서 힌트를 받아 메서드 참조 변경
        languages.sort(Comparator.comparingInt(String::length));

        // 내부 요소를 하나씩 반복하여 출력 for-each 문
        languages.forEach(System.out::println);

//        System.out.println(languages);
    }
}
