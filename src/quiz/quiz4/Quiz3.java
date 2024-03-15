package quiz.quiz4;

import java.time.LocalDate;
import java.time.Period;

public class Quiz3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate worldCup = LocalDate.of(2026, 6, 14);

        Period between = Period.between(today, worldCup);
        int years = between.getYears();
        int months = between.getMonths();
        int days = between.getDays();

        System.out.printf("다음 월드컵은 %d년 %d개월 %d일 후에 시작합니다\n",
                years, months, days);
    }
}
