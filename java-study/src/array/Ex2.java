package array;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // 5개의 정수를 입력받아서, 배열에 저장하고, 입력 순서대로 출력해보세요
        /* 예시
        정수를 5개 입력하세요.
        1
        2
        3
        4
        5
        >> 1, 2, 3, 4, 5
         */
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("정수를 5개 입력하세요.");
        for (int i=0; i<5; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print(">> ");
//        for (int i=0; i<4; i++) {
//            System.out.print(nums[i]+", ");
//        }
//        System.out.print(nums[4]);

        for (int i=0; i<5; i++) {
            System.out.print(nums[i]);
            if (i != 4) {
                System.out.print(", ");
            }
        }

    }
}
