package collection.set;

import java.util.HashSet;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        Set<String> sports = new HashSet<>();
        sports.add("축구");
        sports.add("야구");
        sports.add("아이스하키");
        System.out.println("sports = " + sports);

        Set<String> winterSports = new HashSet<>();
        winterSports.add("스키");
        winterSports.add("썰매");
        winterSports.add("아이스하키");
        System.out.println("winterSports = " + winterSports);
        // set은 순서가 보장되지 않는다

        // 합집합 : 중복 제거
        Set<String> union = new HashSet<>(sports);
        union.addAll(winterSports);
        System.out.println("union = " + union);

        // 교집합 : 공통된 것
        Set<String> intersection = new HashSet<>(sports);
        intersection.retainAll(winterSports);
        System.out.println("intersection = " + intersection);

        // 차집합 : removeAll
        Set<String> difference = new HashSet<>(sports);
        difference.removeAll(winterSports);
        System.out.println("difference = " + difference);


    }
}
