package loop;

import java.util.Random;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 숫자 맞추기 게임
        // 1~100까지의 랜덤한 숫자가 있습니다
        // 응답한 숫자가 낮으면 낮다. 높으면 높다고 대답하여 랜덤한 숫자를 추측합니다.
        Random random = new Random();
        int answer = random.nextInt(100) + 1; // 1~100까지 랜덤한 숫자

        Scanner sc = new Scanner(System.in);
        int tries = 0;
        
        // 이진 탐색 문제
        while (true) {
            System.out.print("예상하는 숫자는? : ");
            int n = sc.nextInt();
            tries += 1;

            if ( answer == n ) {
                System.out.println(tries+"번 만에 정답입니다!");
                break;
            } else if ( answer > n ) {
                System.out.println("예상하는 숫자보다 큽니다.");
            } else {
                System.out.println("예상하는 숫자보다 작습니다.");
            }
        }

//        // do-while문으로 쓰기
//        do {
//            // 질문 및 프롬프트
//            System.out.print("1~100 중에서 숫자를 맞춰보세요 ");
//            guessNumber = scanner.nextInt();
//            tryCount++;
//
//            if (guessNumber > answer) {
//                System.out.println("큰 숫자를 말하셨네요. 낮은 숫자를 찾아주세요.");
//            } else if (guessNumber < answer) {
//                System.out.println("작은 숫자를 말하셨네요. 높은 숫자를 찾아주세요.");
//            }
//        } while (guessNumber != answer);
//
//        System.out.println("정답을 맞추셨네요! 축하드려요. " + tryCount + "번만에 맞추셨네요");

        // 탐색하는 숫자를 절반씩 줄여나가는 방법 : 이진탐색 binarySearch


    }
}
