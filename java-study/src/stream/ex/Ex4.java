package stream.ex;

import java.util.Map;
import java.util.stream.Collectors;

public class Ex4 {
    /* 문제 4: 영화 평점 요약
    영화와 그에 대한 평점이 주어졌을 때,
    평점이 8 이상인 영화의 이름을 추출하고,
    "영화명 - 평점" 형태로 변환한 후 결과를 출력하세요.
     */
    public static void main(String[] args) {
        Map<String, Integer> movieRatings = Map.of("The Shawshank Redemption", 9,
                "The Godfather", 9, "The Dark Knight", 8,
                "Pulp Fiction", 8, "Fight Club", 7);

        // Map 자체는 Collection이 아니라서 entrySet() 으로 뽑아줘야 함
        // Map.Entry를 이용하면 Map에 저장된 모든 key-value 쌍을
        // 각각의 key-value를 갖고 있는 하나의 객체로 얻을 수 있다.
        movieRatings.entrySet().stream()
                .filter(a -> a.getValue() >= 8)
                .map(a->a.getKey() + " - " + a.getValue()) // map : 매개변수의 함수에 맞게 요소를 변환
                .forEach(System.out::println);
    }
}
