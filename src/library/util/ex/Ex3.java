package library.util.ex;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원금: ");
        BigInteger Principal = new BigInteger(sc.nextLine());
        System.out.println("연이율: ");
        BigDecimal AnnualInterestRate = new BigDecimal(sc.nextLine());
        System.out.println("기간: ");
        BigInteger TermInYear = new BigInteger(sc.nextLine());

        BigInteger num = BigInteger.valueOf(1).add(AnnualInterestRate);
        BigInteger total = Principal * ( AnnualInterestRate ).pow(TermInYear);

        System.out.println("최종 금액: " + total);
    }
}
