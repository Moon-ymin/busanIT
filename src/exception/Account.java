package exception;

public class Account {
    private long balance;

    public Account() {
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    // 호출한 곳으로 예외를 떠넘김
    public void withdraw(int money) throws InsufficientException {
        // 잔액이 부족할 경우 출금이 되지 않는다.
        if (balance < money) {
            // 잔액이 부족하다 라는 예외를 발생시킴
            throw new InsufficientException("잔고가 " + (money - balance) + "원 부족합니다.");
        }
        balance -= money;
    }
}