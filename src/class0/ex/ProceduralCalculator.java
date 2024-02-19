package class0.ex;
import java.util.Scanner;

// 절차지향적 계산기 => 객체지향적 계산기로 변경해주세요
public class ProceduralCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        char op;

        System.out.print("Enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        op = scanner.next().charAt(0);

        switch(op) {
            case '+':
                System.out.println("Result: " + add(num1, num2));
                break;
            case '-':
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case '*':
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case '/':
                System.out.println("Result: " + divide(num1, num2));
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return (double) a / b;
    }
}