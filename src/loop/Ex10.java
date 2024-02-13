package loop;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // 은행 앱
        /*
        ------------------------------------
        1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        ------------------------------------
        선택>
        1. 번을 선택할 경우
        예금액> 10000    => 잔고에 10000원이 입금
        2. 번을 선택할 경우
        출금액> 1000     => 잔고에서 1000원이 출금
        3. 번
        잔고액> 9000     => 잔고액 확인가능
        4. 번
        "프로그램이 종료됩니다"
         */

        Scanner sc = new Scanner(System.in);
        int left = 0; // 은행 잔고

        while (true) {
            System.out.println("------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("------------------------------------");
            System.out.print("몇 번을 선택하시겠습니까? : ");
            int task = sc.nextInt();

            if (task == 1) {
                System.out.print("예금액> ");
                int money= sc.nextInt();
                left += money;
                System.out.printf("=> 잔고에 %d원이 입금\n", left);
                continue;
            } else if (task == 2) {
                System.out.print("출금액> ");
                int money = sc.nextInt();
                left -= money;
                System.out.printf("=> 잔고에서 %d원이 출금\n", left);
                continue;
            } else if (task == 3) {
                System.out.print("잔고액> ");
                System.out.printf("=> 잔고에 %d원이 입금\n", left);
                continue;
            } else if (task == 4) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
        }

        /* 다른 버전 - FLAG, SWITCH문 사용
        - 예외 : 더 큰 금액을 다루려면, int말고 long으로 하면 됨~
        - 예외 : 마이너스 통장? 출금할 때 money > left의 예외문 넣어서 출금 안되는 것 조건문 넣기
        // 실행여부를 판단하는 flag
        boolean isRun = true;
        long balance = 0;        // 은행 잔고

        while (isRun) {
            // 프롬프트를 출력
            System.out.println("------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
            System.out.println("------------------------------------");
            System.out.print("번호를 선택해주세요 > ");
            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.print("예금액> ");
                    long amount = scanner.nextLong();
                    balance += amount;      // 잔고에 금액을 추가
                    break;
                case 2:
                    System.out.print("출금액> ");
                    long money = scanner.nextLong();   // 잔고에 금액을 인출
                    if (money > balance) {
                        System.out.println("예금액 이상의 금액은 인출할 수 없습니다.");
                    }
                    balance -= money;
                    break;
                case 3:
                    System.out.println("잔고> " + balance);
                    break;
                case 4:     // 종료
                    isRun = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;

            }
        }
         */

    }
}