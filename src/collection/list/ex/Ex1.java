package collection.list.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    /*
    문제: 정수를 저장하는 ArrayList를 생성하고,
    1부터 10까지의 숫자를 추가하세요.
    그리고 이 리스트에서 짝수만 찾아 출력하는 프로그램을 작성하세요.
     */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);                 // 1. 리스트 요소 추가하기
            if ( i % 2 == 0 ) even.add(i);  // 2. 짝수만 찾기
        }
        System.out.println(even);

    }
}
