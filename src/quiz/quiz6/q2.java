package quiz.quiz6;

import java.util.Map;
import java.util.function.BiFunction;

public class q2 {
    public static void main(String[] args) {
        Map<String, Integer> userScores = Map
                .of("Alice", 75, "Bob", 45, "Charlie", 85);

        BiFunction<String, Integer, String> result =
                (name, score) -> (score>=50 ? "합격" : "불합격");

        for (Map.Entry<String, Integer> entry : userScores.entrySet()) {
            System.out.println( entry.getKey() + ": " + result.apply(entry.getKey(), entry.getValue()));
        }
    }
}
