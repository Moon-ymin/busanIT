package static0.ex;

public class BankAccount {
    // 필드
    private int id;          // 계좌ID
    private double balance;  // 잔고
    private static int accountCount; // 모든 계좌의 수

    // 생성자
    public BankAccount() {
        id = ++accountCount; // 생성될 때마다 계좌 ID를 증가시킨다.
        // 전위 증감연산자 사용
        // id = accountCount;
    }

    // 메서드
    public void printAccount() {
        System.out.println("계좌" + id + " : 잔고 = " + balance);
    }

    // 전체 계좌수 가져오기
    public static int getAccountCount() {
        return accountCount;
    }

    // 입금
    public void deposit(double amount) {
        balance += amount;
    }

    // 출금
    public void withdraw(double amount) {
        // 제약조건
        if (amount > balance) {
            System.out.println("출금 불가합니다.");
            return;
        }
        balance -= amount;
    }
}