package stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
    /*
    문제 1: 고양이 이름 필터링

    고양이 이름이 담긴 리스트가 있습니다.
    이름이 4글자 이상인 고양이들만 필터링하여
    그 이름을 대문자로 변환한 후, 결과를 출력하세요.
     */
    public static void main(String[] args) {
        List<String> catNames = Arrays.asList("Leo", "Milo", "Luna",
                "Oli", "Zoe", "Bella");

        List<String> answer = catNames.stream()
                .filter(cat -> cat.length() >= 4)   // 이름이 4글자 이상인 고양이들만 필터링해서
                .map(String::toUpperCase)           // 이름을 대문자로 변환해서
                .toList();

        answer.forEach(System.out::println);
    }

}
