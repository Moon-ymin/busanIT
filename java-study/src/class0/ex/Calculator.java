package class0.ex;

import java.util.Scanner;

public class Calculator {
    // 필드 : 계산기와 관련된 데이터
    int num1;
    int num2;
    char operator;

    // 메서드 : 계산기와 관련된 기능
    int add() {
        return num1 + num2;
    }

    int subtract() {
        return num1 - num2;
    }

    int multiply() {
        return num1 * num2;
    }

    double divide() {
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return (double) num1 / num2;
    }

    void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

    }

    char inputOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operator (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    void printCalculateNumber(char op) {
        switch (op) {
            case '+':
                System.out.println("Result: " + add());
                break;
            case '-':
                System.out.println("Result: " + subtract());
                break;
            case '*':
                System.out.println("Result: " + multiply());
                break;
            case '/':
                System.out.println("Result: " + divide());
                break;
            default:
                System.out.println("Error: Invalid operator");
        }

    }
}