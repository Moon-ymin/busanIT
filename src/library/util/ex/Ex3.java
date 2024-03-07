package library.util.ex;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원금: ");
        BigDecimal Principal = new BigDecimal(sc.nextLine());
        System.out.print("연이율: ");
        BigDecimal AnnualInterestRate = new BigDecimal(sc.nextLine());
        System.out.print("기간(년 단위): ");
        int TermInYear = sc.nextInt();

        BigDecimal num = BigDecimal.ONE.add(AnnualInterestRate);
        BigDecimal total = Principal.multiply( num.pow(TermInYear) );

        System.out.printf("최종 금액: %.2f", total);
    }
}
