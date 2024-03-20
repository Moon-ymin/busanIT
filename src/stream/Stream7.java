package stream;

import java.util.Comparator;
import java.util.stream.IntStream;

public class Stream7 {
    // 스트림 요소 반복 looping
    // 스트림 요소에 대해 지정한 작업을 반복해서 수행
    // 매개변수로 Consumer : return 값이 없고, 매개변수 있음
    // 중간연산 peek 
    // 최종연산 forEach
    public static void main(String[] args) {
        // peek : 중간연산으로 스트림 처리 과정에 영향을 주지 않고,
        // 각 요소의 중간결과들을 확인하는 디버깅 용도로 주요 사용
        IntStream.rangeClosed(1,10)
                .peek(n -> System.out.println("초기값 : " + n))    // peek : 디버깅에 용이함
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("필터값 : " + n))
                .map(n -> n * 10)
                .peek(n -> System.out.println("변환값 : " + n))
                .sorted()
                .forEach(n -> System.out.println("최종값 : " + n));
    }
}
