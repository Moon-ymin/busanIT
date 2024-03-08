package library.util.ex;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("생년월일을 입력하세요 (1980-01-01) : ");
        String input = scanner.nextLine();
        // DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate.parse(input, fmt);
        // 일반적인 날짜 포맷일 경우, 포맷 없이도 문자열 파싱이 가능하다.
        LocalDate birthDate = LocalDate.parse(input);

        // 올해 생일 구하기
        LocalDate today = LocalDate.now();
        int year = today.getYear();  // 올해
        // LocalDate currentBirthday = LocalDate.of(year, birthDate.getMonthValue(), birthDate.getDayOfMonth()); // 올해와 생일의 달, 날짜 정보로 새로운 날짜 객체 생성
        // withYear 메서드 : 해당 년도의 날짜(기존 월, 일 유지) 객체를 반환한다.
        LocalDate yearBirthday = birthDate.withYear(year);

        // 기간 구하기 : Period 년, 월, 일 단위로 기간을 구한다.
        Period period = Period.between(today, yearBirthday);

        // Duration 남은 기간을 날짜, 시간 Unit 별로 전체 간격을 구할 수 있다.
        Duration duration = Duration.between(today.atStartOfDay(), yearBirthday.atStartOfDay());
        long days = duration.toDays();

        // 출력
        String formatted = "";
        if ( days < 0 ) {
            formatted = String.format("다음 생일까지 %s일 남았습니다.", days + 365);
        } else {
            formatted = String.format("다음 생일까지 %s일 남았습니다.", days);
        }
        System.out.println(formatted);


    }
}
