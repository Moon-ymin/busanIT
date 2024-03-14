package collection.map.ex;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    /*
    연습문제 1: 학생 점수 관리

    문제 설명
    학생들의 이름과 그에 해당하는 점수를 HashMap을 사용하여 관리하는 프로그램을 작성하세요.
    프로그램은 다음 기능을 수행해야 합니다:

    학생의 이름과 점수를 추가합니다.
    특정 학생의 점수를 조회합니다.
    모든 학생의 이름과 점수를 출력합니다.

    예시 데이터
    학생 "Alice"의 점수는 85점입니다.
    학생 "Bob"의 점수는 92점입니다.
    학생 "Charlie"의 점수는 88점입니다.
     */
    public static void main(String[] args) {
        Map<String, Integer> studentScore = new HashMap<>();

        // 추가
        studentScore.put("Alice", 85);
        studentScore.put("Bob", 92);
        studentScore.put("Charlie", 88);
        
        // 조회
        Integer bobScore = studentScore.get("Bob");
        System.out.println("bobScore = " + bobScore);
        
        // 모든 학생 점수 출력
        System.out.println("[모든 학생의 점수]");
        for(Map.Entry<String, Integer> s : studentScore.entrySet()){
            System.out.printf("학생 \"%s\"의 점수는 %d점입니다.\n",
                    s.getKey(), s.getValue());
        }
    }
}
