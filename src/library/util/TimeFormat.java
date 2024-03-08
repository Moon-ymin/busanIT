package library.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class TimeFormat {
    public static void main(String[] args) {
        // 날짜와 시간을 원하는 형식으로 지정하기
        LocalDateTime now = LocalDateTime.now();

        System.out.println("now = " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        // 날짜 시간에 미리 만들어둔 포매터에 적용
        String formatted = now.format(formatter);
        System.out.println("formatted = " + formatted);

        // 날짜와 시간 형식의 문자열을 DateTime 타입으로 변환(파싱)
        LocalDateTime parsedDateTime = LocalDateTime.parse(formatted, formatter);
        System.out.println("parsedDateTime = " + parsedDateTime);

        // 문자열을 LocalDate로 변환하기
        // 시간 정보가 없는 경우 LocalDateTime으로 변환하려고 하면 "DateTimeParseException"이 발생하니 주의할 것.!
        String str = "2024년 3월 8일";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy년 M월 d일");
        // LocalDateTime parsedDt = LocalDateTime.parse(str, fmt); (시간 정보가 없으므로 예외발생!)
        LocalDate parsedDt = LocalDate.parse(str, fmt);
        System.out.println("parsedDt = " + parsedDt);


    }
}
