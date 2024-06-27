package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SequencedSet;
import java.util.Set;

public class Set4 {
    // LinkedHashSet
    // HashSet 과 유사한 기능들을 모두 가짐. (중복 허용하지 않음)
    // 내부적으로 LinkedList 를 사용하여 순서를 가질 수 있게 됨.
    // 중복을 불허하는 고유 요소를 유지하면서도 순서를 기억해야할 때 사용.
    // HashSet 보다 성능상으로 조금 느림
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        hashSet.add("해시셋은");
        hashSet.add("순서를");
        hashSet.add("보장하지");
        hashSet.add("않습니다.");
        hashSet.add(null);      // null 가능
        hashSet.add(null);      // null 중복 불가


        System.out.println("hashSet = " + hashSet);

        linkedHashSet.add("링크드");
        linkedHashSet.add("해시셋은");
        linkedHashSet.add("순서를");
        linkedHashSet.add("보장합니다.");
        linkedHashSet.add(null);
        linkedHashSet.add(null);        // null 삽입 가능 + 중복 불가
        linkedHashSet.add("링크드");     // 중복 불가

        System.out.println("linkedHashSet = " + linkedHashSet);

        linkedHashSet.addFirst("첫번째 순서에 추가");

        System.out.println("linkedHashSet = " + linkedHashSet);

        // 첫번째 삭제
        linkedHashSet.removeFirst();
        System.out.println("linkedHashSet = " + linkedHashSet);

        // 첫번째 요소 가져오기
        String first = linkedHashSet.getFirst();
        System.out.println("first = " + first);

        // 순서를 뒤집은 셋 반환
        Set<String> reversed = linkedHashSet.reversed();
        System.out.println("reversed = " + reversed);

    }
}