package collection.list;

import java.util.LinkedList;
import java.util.List;

public class List2linked {
    public static void main(String[] args) {
        // LinkedList
        // List 인터페이스의 구현 객체이므로 arrayList와 사용방법은 동일하지만,
        // 내부 구조는 완전히 다르다.
        // 인접한 객체를 링크를 통해서 연결하여 관리
        // 특정 인덱스의 객체를 제거하면 앞, 뒤의 링크만 변경되고, 나머지는 그대로 유지

        List<String> animals = new LinkedList<>();

        // 요소 추가
        animals.add("개");
        animals.add("말");
        animals.add("고양이");
        System.out.println(animals);

        animals.add(1, "닭");
        System.out.println(animals);

        // 첫번째 요소 추가
        animals.addFirst("소");
        System.out.println(animals);

        // 마지막 요소 추가
        animals.addLast("오리");
        System.out.println(animals);

    }
}