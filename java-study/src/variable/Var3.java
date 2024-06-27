package variable;

public class Var3 {
    public static void main(String[] args) {
        // 변수의 사용
        int hour = 5;
        int min = 15;

        // 시간을 분으로 변환해 저장
        int totalMinute = hour * 60 + min;
        System.out.println("총 "+totalMinute + "분");
    }
}
