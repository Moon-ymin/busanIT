package class0.ex;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        /*
        문제: 간단한 은행 계좌 관리 시스템 설계
        목표: 은행 계좌의 기본적인 기능을 제공하는 간단한 계좌 관리 시스템을 설계하세요.
        계좌의 생성, 입금, 출금, 잔액 조회 기능을 구현합니다.

        1단계: 계좌 클래스(BankAccount) 정의
        속성: 계좌번호(accountNumber), 소유자 이름(ownerName), 잔액(balance)
        기능:
        입금(deposit): 잔액에 특정 금액을 추가합니다.
        출금(withdraw): 잔액에서 특정 금액을 차감합니다. 잔액이 출금하려는 금액보다 적을 경우 출금을 할 수 없습니다.
        잔액 조회(getBalance): 현재 잔액을 출력합니다.

        2단계 : 메인메서드에서 해당 클래스를 생성하고 사용해보세요
         */
        BankAccount bankAccount = new BankAccount();

        Scanner sc = new Scanner(System.in);
        boolean isFinish = false;
        System.out.print("계좌번호를 입력하세요 : ");
        bankAccount.accountNumber = sc.next();
        System.out.print("이름을 입력하세요 : ");
        bankAccount.ownerName = sc.next();


        while( !isFinish ) {
            System.out.print("어떤 기능을 진행하겠습니까? (입금/출금/잔액조회/나가기) : ");
            String task = sc.next();

            switch(task) {
                case "입금":
                    System.out.print("입금하실 금액을 입력하세요 : ");
                    int money = sc.nextInt();
                    bankAccount.deposit(money);
                    break;
                case "출금":
                    System.out.print("출금하실 금액을 입력하세요 : ");
                    int money1 = sc.nextInt();
                    bankAccount.withdraw(money1);
                    break;
                case "잔액조회":
                    bankAccount.getBalance();
                    break;
                case "나가기":
                    isFinish = true;
            }
        }

    }
}