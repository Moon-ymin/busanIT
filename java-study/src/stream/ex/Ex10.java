package stream.ex;

import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(88, 92, 75, 65, 97, 85, 100, 67);

        OptionalDouble average = grades.stream()
                .mapToInt(Integer::intValue).average();
        Optional<Integer> first = grades.stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .findFirst();
        long count = grades.stream()
                .filter(n -> n > average.getAsDouble())
                .count();

        System.out.println("평균 성적: " + average.getAsDouble());
        System.out.println("최고 성적: " + first.get().intValue());
        System.out.println("평균 이상 성적 학생 수: " + count);

        // 수업에서 한 방식
        // 1.
        double avg = grades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("평균 성적: " + avg);

        // 2.
        int highest = grades.stream()
                .max(Comparator.naturalOrder())
                .orElse(0);
        System.out.println("최고 성적: " + highest);

        // 3. 평균 이상 성적 학생 수: 5
        long counts = grades.stream()
                .filter(score -> score >= avg)
                .count();

        System.out.println("평균 이상 성적 학생 수: " + counts);

    }
}
