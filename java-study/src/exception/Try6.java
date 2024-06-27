package exception;

public class Try6 {
    public static void main(String[] args) {
        // NumberFormat
        String str1 = "1000";
        String str2 = "1000개";

        // 정상적으로 문자열 -> 숫자 변경 가능한 경우
        int i1 = Integer.parseInt(str1);
        // 문자열 -> 숫자로 변경 불가능한 경우
        int i2 = Integer.parseInt(str2); // NumberFormatException -> IllegalArgumentException

        System.out.println(i1 + i2);
    }
}