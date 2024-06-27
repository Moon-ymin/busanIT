package library.util;

import java.util.Calendar;
import java.util.Date;

public class CalenderClass {
    // java.util 클래스
    // 날짜와 시간 관련, Date, Calender
    public static void main(String[] args) {
        // Date 클래스는 시간대 정보가 없는 timestamp를 관리
        // timestamp : 197001010000 => 0으로 시작한 정수값
        // 대부분의 생성자와 메서드가 deprecated 상태 
        Date date = new Date(2024, 3, 8);
        Date datenow = new Date();

        // Calender 클래스는 날짜와 시간을 표현하고, 시간대 지원
        // new 연산자를 통해 인스턴스 생성 불가
        // 정적 메서드 getInstance를 통한 사용 (싱글턴 패턴)
        Calendar calender = Calendar.getInstance();

        int year = calender.get(Calendar.YEAR);
        int month = calender.get(Calendar.MONTH) + 1;   // 0~11까지 리턴
        int dayOfMonth = calender.get(Calendar.DAY_OF_MONTH);
        int hour = calender.get(Calendar.HOUR);
        int minute = calender.get(Calendar.MINUTE);
        int second = calender.get(Calendar.SECOND);

        System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초",
                year, month, dayOfMonth, hour, minute, second);

    }
}
