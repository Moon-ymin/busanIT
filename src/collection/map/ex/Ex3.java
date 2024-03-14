package collection.map.ex;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    /*
    연습문제 3: 도서관 책 대출 관리

    문제 설명
    도서관의 책 대출 상태를 관리하는 간단한 시스템을 구현하세요.
    각 책은 고유한 ID로 구분되며, 대출 상태는 boolean 값으로 관리됩니다(true는 대출 중, false는 대출 가능).
    책의 ID와 대출 상태를 HashMap에 저장하고, 다음 기능을 수행해야 합니다:

    - 책을 추가하고 초기 대출 상태를 설정합니다.
    - 특정 책의 대출 상태를 변경합니다.
    - 모든 책의 ID와 대출 상태를 출력합니다.

    예시 데이터
    ===
    도서관 책 상태:
    도서ID: 91011, 상태: (대출가능)
    도서ID: 1234, 상태: (대출중)
    도서ID: 5678, 상태: (대출중)
     */
    public static void main(String[] args) {
        Map<String, Boolean> libraryBook = new HashMap<>();

        libraryBook.put("91011", false);
        libraryBook.put("1234", true);
        libraryBook.put("5678", true);

        System.out.println("도서관 책 상태:");
        for(Map.Entry<String, Boolean> b : libraryBook.entrySet()){
            String isAvailable = (b.getValue() ? "(대출중)" : "(대출가능)");
            System.out.printf("도서ID: %s, 상태: %s\n", b.getKey(), isAvailable);
        }

    }
}
