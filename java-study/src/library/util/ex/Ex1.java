package library.util.ex;

import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(6) + 1;
        int b = random.nextInt(6) + 1;

        System.out.println("플레이어 1: "+a);
        System.out.println("플레이어 2: "+b);
        System.out.printf("플레이어 %d가 이겼습니다!",
                ( a > b ? 1 : 2 ) );
    }
}
