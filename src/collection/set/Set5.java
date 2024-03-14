package collection.set;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set5 {
    // TreeSet : https://www.cs.usfca.edu/~galles/visualization/RedBlack.html
    // 자동으로 정렬되는 중복을 불허하는 자료구조 
    // Red-Black Tree 알고리즘을 기반으로 사용
    // Comparable 이 구현되었거나, Comparator 를 통해 순서를 확인할 수 없으면
    // TreeSet 에 요소로 추가할 수 없음
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(7);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(36);
        treeSet.add(5);     // 중복 불허
//        treeSet.add(null);  // null 불허 (Runtime Exception)

        System.out.println("treeSet = " + treeSet);

        // 첫번째 요소 가져오기
        Integer first = treeSet.first();
        System.out.println("first = " + first);

        // 마지막 요소 가져오기
        Integer last = treeSet.last();
        System.out.println("last = " + last);

        // 10보다 head(왼쪽 ,작은) 숫자들의 집합을 반환 (요소 불포함)
        SortedSet<Integer> headSet = treeSet.headSet(10);
        System.out.println("headSet = " + headSet);

        // 10보다 tail(오른쪽, 큰) 숫자들의 집합을 반환 (요소 포함)
        SortedSet<Integer> tailSet = treeSet.tailSet(10);
        System.out.println("tailSet = " + tailSet);

        // 해당 요소 바로 아래 요소 리턴
        Integer lower = treeSet.lower(10);
        System.out.println("lower = " + lower);

        // 해당 요소 바로 위 요소 리턴
        Integer higher = treeSet.higher(10);
        System.out.println("higher = " + higher);

        // TreeSet 문자열 자동 정렬
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.addAll(
                Arrays.asList("Banana","Coke","Apple","Zebra","Fruit")
        );
        System.out.println("stringTreeSet = " + stringTreeSet);
        // 한글도 됨
        stringTreeSet.addAll(
                Arrays.asList("가", "다", "나", "하", "자")
        );
        System.out.println("stringTreeSet = " + stringTreeSet);
    }
    
}
