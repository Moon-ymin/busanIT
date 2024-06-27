package variable;

public class Type6 {
    public static void main(String[] args) {
        // 문자열 연산 자동 타입 변환
        // 연산자 중 하나가 문자열일 경우 나머지 연산자도 문자열로 자동 변환
        String str = "3" + "7";
        String str1 = 3 + "7";

        System.out.println(str+"\n"+ str1);
    }
}
