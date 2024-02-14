package reference;

public class Ref1 {
    public static void main(String[] args) { // 메소드 영역 -> 스택 영역

        // int는 기본타입 : 스택 영역 : 10
        int int1 = 10; // 변수 선언, 초기화 -> 스택 영역 : 10
        int int2 = 10;

        // 문자열은 참조타입 : 힙영역 0x100 : "홍길동" <- 문자열 리터럴
        String str1 = "홍길동"; // 변수 선언, 초기화 -> 스택 영역 : 0x100 (문자열 리터럴) (메모리 주소)
        String str2 = "홍길동"; // 변수 선언, 문자열 리터럴 참조 : 0x100

        if (int1 == int2) {
            System.out.println("int1과 int2는 값이 같음");
        } else {
            System.out.println("int1과 int2는 값이 다름");
        }

        if (str1 == str2) {
            System.out.println("str1과 str2는 값이 같음");
        } else {
            System.out.println("str1과 str2는 값이 다름");
        }

        // new 연산자 : 객체를 생성하는 연산자
        // 힙 영역 0x200 ->
        String str3 = new String("홍길동"); // 스택 영역 : 0x200
        String str4 = new String("홍길동"); // 스택 영역 : 0x300

        // ==, != 연산은 변수의 값이 같은지 아닌지를 비교
        // 참조 타입의 경우 동일한 객체를 참조하는지 아닌지를 비교
        if (str3 == str4) {         // 0x200 == 0x300 => false
            System.out.println("str3과 str4는 값이 같음");
        } else {
            System.out.println("str3과 str4는 값이 다름");
        }

        // 문자열을 비교할 때는 가능하면 equals 메소드를 사용할 것!
        if (str3.equals(str4)) {     // 문자열 내부값을 비교할 때는 equals 사용
            System.out.println("str3과 str4는 문자열이 같음");
        } else {
            System.out.println("str3과 str4는 문자열이 다름");
        }
        // str3과 str4가 값은 다르지만 문자열이 같다!
    }
}
