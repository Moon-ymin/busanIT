package class0.ex;

public class BankAccount {
    String accountNumber ;
    String ownerName;
    int balance;

    void deposit( int money ) {
        balance += money;
        System.out.println( "입금 후 잔액 : " + balance );
    }
    void withdraw( int money ) {
        balance -= money;
        if (balance < 0) {
            System.out.println("출금을 할 수 없습니다.");
        } else {
            System.out.println( "출금 후 잔액 : " + balance);
        }
    }
    void getBalance() {
        System.out.printf("%s님의 계좌 %s의 잔액은 %d원 입니다.\n",
                ownerName, accountNumber, balance);
    }
}
