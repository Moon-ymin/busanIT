package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalClass {
    public static void main(String[] args) {
        // Optional 클래스
        // Java 8부터 도입, 값이 있거나, 없을 수 있는 컨테이너 객체
        // NPE 을 방지함. 메서드가 결과를 반환할 수 없을 때 null 대신 사용
        // 집계값이 존재하지 않을 경우 디폴트 값을 설정하거나 람다식을 등록할 수 있음.
        List<Integer> list = new ArrayList<>();
        // list.addAll(List.of(1, 2, 3, 4, 5)); // 주석처리 풀면서 확인

        // 평균을 가져오는데 NoSuchElementException 가 발생
//        double asDouble = list
//                .stream()
//                .mapToInt(Integer::intValue)
//                .average()
//                .getAsDouble();

        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("====================");

        // 1. isPresent : Optional 이 값을 포함하는 여부를 확인
        boolean present = optional.isPresent();
        System.out.println("present = " + present);

        // 존재하지 않을 경우(null일 경우 isPresent == false)를 처리
        if (present) {
            System.out.println("평균값 : " + optional.getAsDouble());
        } else {
            System.out.println("평균값 : 0");
        }

        // 2. orElse : 값이 없을경우(null) 기본값을 정해놓음
        // 존재하면 값 반환, 존재하지 않으면 other(디폴트값) 반환
        double avg = optional.orElse(0);
        System.out.println("orElse 사용 방법 / 평균 : " + avg);

        // 3. ifPresent : 값이 있을 경우만 동작하는 람다식
        optional.ifPresent(
                // 값이 있을 경우 Consumer 람다식
                n -> System.out.println("ifPresent / 평균 : " + n)
        );

        // 3-1 ifPresentOrElse
        optional.ifPresentOrElse(
                // 값이 있을 경우 Consumer 람다식
                n -> System.out.println("ifPresentOrElse / 평균 : " + n),
                // 값이 없을 경우 Runnable 람다식
                () -> System.out.println("ifPresentOrElse / 평균 : 요소가 없습니다.")
        );

        // 4. orElseThrow : 값이 존재하지 않을 경우 예외발생시키기
        // double avg2 = optional.orElseThrow();
        double avg3 = optional.orElseThrow(() -> new IllegalArgumentException("배열에 아무 요소가 없습니다."));
    }
}
