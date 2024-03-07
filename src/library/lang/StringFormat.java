package library.lang;

import java.text.MessageFormat;
import java.util.Calendar;

public class StringFormat {
    public static void main(String[] args) {
        // 문자열 포매팅하기
        String name = "홍길동";
        int age = 30;
        // 1. printf() : 포맷 형태로 콘솔에 직접 출력
        // 형식지정자를 문자열에 % 기호를 사용하여 삽입할 위치와 방식 지정
        System.out.printf("이름 : %s, 나이 : %d\n", name, age);

        // 2. String.format() : 포매팅 된 문자열로 반환 - 하위버전에서 실무 사용!
        String formattedStr = String.format("이름 : %s, 나이 : %d\n", name, age);

        // 3. MessageFormat.format : 복잡한 포매팅이 필요할 때
        String formattedStr2 = MessageFormat.format("나이 : {1}, 이름 : {0}", name, age);

        // 4. "문자열".formatted("포맷") : 포맷된 문자열을 반환 ! 자바 13버전에서 추가됨.
        String formatted = "이름 : %s, 나이 : %d".formatted(name, age);

        // 문자열 포매팅 예시

        // 숫자 또는 금액 포매팅 (%, 천 단위로 콤마형식,  %.n 부동소수점 자리수)
        double dollarPrice = 1234000000.56;
        String fmt1 = String.format("가격 : %,.2f 달러", dollarPrice);
        System.out.println(fmt1);

        // 날짜 시간 포매팅
        // %tY %tm %td : 연 월 일 형식지정자
        // $1 $2 $3 : 1번째, 2번째, 3번째 인자를 사용하겠다는 의미 (인자 순서가 맞으면 사용할 필요 없음)
        Calendar now = Calendar.getInstance();
        String fmt2 = String.format("현재 날짜 : %1$tY년 %1$tm월 %1$td일", now);
        System.out.println(fmt2);

        // 패딩 간격과 정렬하기
        String fmt3 = String.format("이름 : [[%-10s]]", name);
        System.out.println(fmt3);

        // 대문자 반환하기
        // %S : 영문자 대문자 변환
        String hello = "HELLO JAVA";
        String fmt4 = String.format("인사말 : %S", hello);
        System.out.println(fmt4);

        // 자료형에 따른 형식지정자
        // %s : 문자열, %d : 정수, %f : 실수 (실수 소수점 기본 6자리)
        int year = 2024;
        double temp = 12.3;
        String fmt5 = String.format("연도 : %d, 온도 : %.1f 도", year, temp);
        System.out.println(fmt5);

    }
}
