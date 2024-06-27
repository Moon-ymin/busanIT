package condition;

public class Condition5 {
    public static void main(String[] args) {
        int score = 50;

        // 점수가 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C,
        // 70점 미만이면 D

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
