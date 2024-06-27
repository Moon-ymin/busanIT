package lambda.ex;

import java.util.function.Function;

public class Ex2 {
    public static void main(String[] args) {

        Function<String, String> ChangeDate = string -> {
            String result = string.substring(0,4) + "-"
                    + string.substring(4,6) + "-"
                    + string.substring(6,8);
            return result;
        };

        String s = ChangeDate.apply("20240320");
        System.out.println(s);
    }

    /* 수업
    public static void main(String[] args) {
        // 입력값이 문자열, 반환값이 문자열
        // return 포함 한 줄이면, { }, return 생략
        Function<String, String> function = date ->
                date.substring(0, 4) + "-"
                + date.substring(4, 6) + "-"
                + date.substring(6, 8);

        String dateStr = function.apply("20240320");
        System.out.println("dateStr = " + dateStr);

        System.out.println(function.apply("20240706"));
    }
     */


}
