package collection.list.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex2 {
    /*
    요소 제거

    문제: 문자열을 저장하는 ArrayList를 생성하고, 여러 개의 문자열을 추가하세요.
    그 후, 특정 조건(예: 길이가 5 이하인 문자열)을 만족하는 요소들을 모두 제거하세요.
    최종 리스트를 출력하는 프로그램을 작성하세요.

    > 예시 문자열
    "Hello", "World", "Java", "Programming"
    > 제거 후 리스트에 남은 요소
    "Programming"
     */
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Hello");
        str.add("World");
        str.add("Java");
        str.add("Programming");

        /*for(String s : str) {
            if (s.length() <= 5) str.remove(s); // ConcurrentModificationException 오류 발생함!
        }*/
        // remove 하면서 인덱스에 변화가 생기기 때문에
//        System.out.println(str);

        // Java 9버전 이상인 경우 immutable List를 만드는 of 메서드
//        List<String> strings = List.of("Hello", "World", "Java", "Programming");
        // Java 9버전 이상인 경우 mmutable List를 만드는 of 메서드
        List<String> strings = new ArrayList<>(List.of("Hello", "World", "Java", "Programming"));
        for (int i = 0; i < strings.size() ; i++) {
            if (strings.get(i).length() <= 5){
                strings.remove(strings.get(i)); // 이것도 제대로 안됨. 중간중간 제거하면서 인덱스에 변화가 생겨서!
            }
        }

        // 해결법 1 : 제거할 때마다 인덱스 조정
        strings = new ArrayList<>(List.of("Hello", "World", "Java", "Programming"));
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() <= 5){
                strings.remove(strings.get(i));
                i--;
            }
        }
        System.out.println("해결법 1의 결과 : " + strings);
        // 해결법 2 : 역순으로 접근
        strings = new ArrayList<>(List.of("Hello", "World", "Java", "Programming"));
        for (int i = strings.size()-1; i >= 0; i--) {
            if (strings.get(i).length() <= 5) strings.remove(i);
        }
        System.out.println("해결법 2의 결과 : " + strings);

        // 해결법 3 : 반복자를 사용하여 제거하는 법 (표준)
        strings.clear();
        strings.addAll(List.of("Hello", "World", "Java", "Programming"));
        Iterator<String> iterator = strings.iterator();
        iterator = strings.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            // 길이 5이하인 문자열 제거
            if (s.length() <= 5) {
                iterator.remove();
            }
        }
        System.out.println("해결법 3의 결과 : " + strings);

    }
}
