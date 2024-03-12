package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {
    public static void main(String[] args) {
        /*
            ArrayList vs LinkedList
            ArrayList : 인덱스를 통한 빠른 접근이 필요한 상황
                - 조회가 많고, 추가나 삭제가 적은 경우 유리하게 사용
            LinkedList : 데이터의 추가 및 삭제가 빈번하게 발생하는 경우 사용
                - 특히, 대용량 데이터의 삽입, 삭제가 이루어지는 경우 유리하게 사용
         */

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // 시간 측정 : ArrayList
        long startTime, endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("arrayList 삽입 소요시간 : " + (endTime - startTime));

        // 시간 측정 : LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            linkedList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("linkedList 삽입 소요시간 : " + (endTime - startTime));


    }
}
