package quiz.quiz5;

import java.util.function.Function;

public class Quiz5 {
    public static void main(String[] args) {
        String date = "20240320";

        Function<String, String> changeDate = string -> {
            String result = string.substring(0, 4) + "-"
             + string.substring(4, 6) + "-" + string.substring(6, string.length());
            return result;
        };
        System.out.println(changeDate.apply(date));

    }
}
