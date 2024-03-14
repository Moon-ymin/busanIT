package collection.map.ex;

import java.util.HashMap;
import java.util.Map;

public class Ex2_1 {
    // 수업 풀이
    public static void main(String[] args) {
        String text = "나는 집에 간다. 나는 학교에 간다.";
        Map<String, Integer> wordMap = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            // 한글이 아닌것을 삭제
            word = word.replaceAll("[^가-힣]", "");

            // 단어가 존재하지 않으면 value에 0, 존재하면 기존 value + 1
            int frequency = wordMap.getOrDefault(word, 0) + 1;
            wordMap.put(word, frequency);
        }

        // 단어빈도수 출력
        System.out.println("단어 빈도수: ");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
