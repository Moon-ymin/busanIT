package library.lang;

public class StringMethod3 {
    public static void main(String[] args) {
        String hello1 = "Hello, World";
        String hello2 = "hello, world";
        String hello3 = "HELLO, WORLD";

        // equals 문자열 비교 ( 문자열에서 == 비교는 지양 )
        // 대문자 소문자 구분하여 비교한다.
        boolean res1 = hello1.equals(hello2);   // false
        boolean res2 = hello2.equals(hello3);   // false

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);

        // equalsIgnoreCase : 대소문자 무시하고 동등 비교
        boolean res3 = hello1.equalsIgnoreCase(hello2);
        boolean res4 = hello1.equalsIgnoreCase(hello3);

        System.out.println("res3 = " + res3);
        System.out.println("res4 = " + res4);

        String str = "시계가 고장났을 때 하는말은? 똑똑";

        // contains : 포함 여부 확인
        boolean res5 = str.contains("시계");      // true
        boolean res6 = str.contains("회중시계");  // false
        boolean res7 = str.contains("고장");  // true

        // startWith : 해당 문자열로 시작하는지 여부
        boolean res8 = str.startsWith("시계");    // true
        boolean res9 = str.startsWith("고장");    // false
        // 2번째 인자로 받는 인덱스 위치부터 확인
        boolean res10 = str.startsWith("시계", 3);    // false
        boolean res11 = str.startsWith("고장", 4);    // true

        // endWith : 해당 문자열로 끝나는지 여부
        boolean res12 = str.endsWith("똑똑");     // true
        boolean res13 = str.endsWith("시계");     // false

        // match : 정규식을 이용하여 매치 되는 여부
        // email 주소 여부를 확인하는 정규식
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        String email1 = "normal@example.com";
        String email2 = "abnormal_example.com";
        String email3 = "abnormal@example@com";

        boolean res14 = email1.matches(regex);  // true
        boolean res15 = email2.matches(regex);  // false
        boolean res16 = email3.matches(regex);  // false

    }
}