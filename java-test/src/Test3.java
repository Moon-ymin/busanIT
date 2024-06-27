import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int answer = r.nextInt(100) + 1;
        int tries = 1;
        boolean isTrue = false;

        do {
            System.out.print("1~100 중에서 숫자를 맞춰보세요 ");
            int number = sc.nextInt();

            if ( number < answer ) {
                System.out.println("작은 숫자를 말하셨네요. 높은 숫자를 찾아주세요.");
                tries++;
            } else if (number > answer){
                System.out.println("큰 숫자를 말하셨네요. 낮은 숫자를 찾아주세요.");
                tries++;
            } else {
                System.out.printf("정답을 맞추셨네요! 축하드려요. %d번만에 맞추셨네요\n", tries);
                isTrue = true;
            }

        } while ( !isTrue );
    }
}
