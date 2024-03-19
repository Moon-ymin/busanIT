package stream;

import java.util.stream.IntStream;

public class Stream5 {
    public static void main(String[] args) {
        // filter : 데이터를 걸러냄
        IntStream.range(1, 100)                 // 스트림 생성 : 1 ~ 99
                .filter(i -> i % 2 == 0)        // 중간 : 짝수만 걸러내기
                .skip(10)                    // 중간 : 10개 뛰어넘기
                .limit(10)              // 중간 : 10개까지 끊기
                .forEach(System.out::println);   // 최종 : 요소 출력

        System.out.println("------------------------");
        // map : 요소를 변환 Function (매개변수 -> 리턴값)
        IntStream.range(1, 10)                  // 스트림 생성 : 1-10
                .map(i -> i * 10)               // 중간 : 모두 10개씩
                .forEach(System.out::println);  // 최종 : 요소 출력



    }
}
