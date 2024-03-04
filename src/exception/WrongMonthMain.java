package exception;

public class WrongMonthMain {
    public static void main(String[] args) {
        setMonth(5);
        setMonth(10);
        setMonth(13);
    }

    private static void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new WrongMonthException(month);
            // 예외가 발생하면 아래 코드들은 수행되지 않는다.
        }
        System.out.println(month + "월로 설정되었습니다.");
    }
}