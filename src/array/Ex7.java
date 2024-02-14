package array;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // 선형탐색
        // 정수 배열에 임의의 정수들이 존재합니다.
        // 해당 배열을 출력하고, 사용자에게 특정 값을 입력받아
        // 특정 값이 배열 내에 존재하는지 확인하는 프로그램을 작성하세요
        // 예시
        int[] numbers = {10, 54, 23, 45, 8, 5};
        /*
        찾는 값을 입력하세요 > 23
        배열의 3번째 위치에 존재합니다.
        (종료)
        찾는 값을 입력하세요 > 24
        배열에 존재하지 않습니다.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("찾는 값을 입력하세요 > ");
        int number = sc.nextInt();
        boolean isExist = false;

        for (int i=0; i<numbers.length; i++) {
            if ( number == numbers[i]) {
                isExist = true;
                System.out.printf("배열의 %d번째 위치에 존재합니다.\n", i+1);
                System.out.println("종료");
                break;
            }
        }
        if ( !isExist ) {
            System.out.println("배열에 존재하지 않습니다.");
        }

        // Big O 표기법으로 최악의 경우 O(n)만큼 탐색한다.
    }
}