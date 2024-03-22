package quiz.quiz5;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Quiz3 {
    public static void main(String[] args) {
        String text = "나는 집에 간다. 나는 학교에 간다.";
        text = text.replace(".", "");
        String[] words = text.split(" ");
        Map<String, Integer> wordAppear = new HashMap<>();
        String Korean = "[^가-힣]";

        for (int i = 0; i < words.length; i++) {
            String word = ( !Pattern.matches(words[i], Korean) ? words[i].toLowerCase() : words[i]);
            if (wordAppear.containsKey(word)) { // 기존에 있으면
                int cnt = (int)wordAppear.get(word) + 1;
                wordAppear.put(word, cnt);
            } else {    // 없
                wordAppear.put(word, 1);
            }
        }
        System.out.println("단어 빈도수:");
        for(Map.Entry<String, Integer> w : wordAppear.entrySet()) {
            System.out.printf("%s : %d\n", w.getKey(), w.getValue());
        }
    }
}
