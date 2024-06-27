package library.util.ex;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원금: ");
        BigDecimal Principal = sc.nextBigDecimal();
        // 소수점의 계산이 중요하기 때문에 BigDecimal로 받음
        System.out.print("연이율: ");
        BigDecimal AnnualInterestRate = sc.nextBigDecimal();
        
        System.out.print("기간(년 단위): ");
        int TermInYear = sc.nextInt();
        
        BigDecimal num = BigDecimal.ONE.add(AnnualInterestRate); // AnnualInterestRate.add(new BigDecimal("1"))
        BigDecimal total = Principal.multiply( num.pow(TermInYear) ); // pow안에는 int형 데이터 들어가야 함

        /* 이런식으로 표기도 가능
        BigDecimal total = Principal
                              .multiply(BigDecimal.ONE
                              .add(AnnualInterestRate)
                              .pow(TermInYear));
         */

        System.out.printf("최종 금액: %,.2f원", total);
    }
}
