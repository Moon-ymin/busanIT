package quiz.quiz4;

public class Quiz1 {
    public static void main(String[] args) {
        int cnt = 0;

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000_000; i++) {
            cnt++;
        }
        long endTime = System.nanoTime();

        System.out.println("반복문 실행 시간 : " + (endTime - startTime));
    }
}
