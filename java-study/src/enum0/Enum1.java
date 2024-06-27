package enum0;

public class Enum1 {
    public static void main(String[] args) {
        // 필드를 통해 열거형에 접근하여 변수 선언
        Week today = Week.MONDAY;

        // 조건문을 통해 열거형에 접근
        switch (today) {
            case MONDAY -> System.out.println("월요일");
            case TUESDAY -> System.out.println("화요일");
            case WEDNESDAY -> System.out.println("수요일");
            case THURSDAY -> System.out.println("목요일");
            case FRIDAY -> System.out.println("금요일");
            case SATURDAY -> System.out.println("토요일");
            case SUNDAY -> System.out.println("일요일");
        }

        // 반복문을 통해 열거형의 종류 확인
        for (Week day : Week.values()) {        // 열거형을 배열로 반환
            System.out.println(day);
        }
    }
}
