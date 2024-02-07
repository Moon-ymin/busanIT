package variable;

public class Print1 {
    public static void main(String[] args) {
        System.out.println("A"); // 행 변경
        System.out.print("B"); // 행을 변경하지 않을 때
        System.out.printf("%c", 'C'); // 포맷 형태
        
        /* 자주 사용되는 포맷스트링
        %s 문자열
        %d 정수
        %f 실수
         */

        System.out.printf("%10s", "홍길동");
        System.out.printf("%10d", 100);
        System.out.printf("%10.2f", 10.0); // 소수점 및 둘째자리까지 반올림
        System.out.printf("%10.2f", 10.125); // 소수점 및 둘째자리까지

    }
}
