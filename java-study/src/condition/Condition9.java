package condition;

public class Condition9 {
    public static void main(String[] args) {
        // break문 없이 switch문을 사용하게 될 경우
        int time = 8;

        switch (time) {
            case 8:
                System.out.println("출근시간이다.");
            case 9:
                System.out.println("입실 시간이다.");
            case 10:
                System.out.println("수업 시간이다.");
            case 13:
                System.out.println("점심 시간이다.");
            default:
                System.out.println("집에 가자");

        }
    }
}
