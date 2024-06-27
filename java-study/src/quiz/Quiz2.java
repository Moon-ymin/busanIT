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
public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 정수를 입력하세요");

        // 시작 정수 입력
        System.out.print("시작 정수: ");
        int start = sc.nextInt();

        // 끝 정수 입력
        System.out.print("끝 정수: ");
        int end = sc.nextInt();


        // 짝수의 합 계산
        int evenSum = 0;
        String equation = ""; // 수식을 저장할 변수

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) { // 짝수인 경우에만 더함
                evenSum += i;
                if (!equation.isEmpty()) {
                    equation += " + "; // 처음이 아닌 경우에는 '+'를 더함
                }
                equation += i; // 수식에 현재 짝수 추가
            }
        }

        // 결과 출력
        System.out.println(equation + " = " + evenSum);


    }
}
