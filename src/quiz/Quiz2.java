package quiz;

import java.util.Scanner;
/*
Quiz 2의 완료 여부를 체크해주세요.

반복문 : 짝수의 합 구하기
사용자로부터 두 정수 start와 end를 입력받아,
start와 end 사이의 모든 짝수의 합을 계산하는 프로그램을 작성하세요
/*
출력예시
======
시작 정수: 4
끝 정수: 15
4 + 6 + 8 + 10 + 12 + 14 = 54
*/
 */
public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 정수를 입력하세요");

        System.out.printf("시작 정수 : ");
        int start = sc.nextInt();
        System.out.printf("끝 정수 : ");
        int end = sc.nextInt();

        int[] numbers = new int[end - start +1];
        int sum = 0;
        String s = "";

        for (int i=start; i<end; i++) {
            if (i % 2 == 0) {
                numbers[i] = i;
                sum += i;
                s += i + "+";
            }
        }

        System.out.println(s);


    }
}
