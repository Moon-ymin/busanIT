package array;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 배열에서 최대값과 최소값을 구하기
        // 정수를 n개 입력받아 배열에 저장하고,
        // 그 중 가장 큰 수와 가장 작은 수를 구하는
        // 프로그램을 작성해보세요.
        /* 예시
        입력받을 숫자 : 4
        4개의 정수를 입력하세요
        76
        5
        23
        9
        최대값 : 76, 최소값 : 5
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println(n+"개의 정수를 입력하세요");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if ( max < num ) {
                max = num;
            }
            if ( min > num ) {
                min = num;
            }
        }
        System.out.printf("최대값 : %d, 최소값 : %d", max, min);

    }
}