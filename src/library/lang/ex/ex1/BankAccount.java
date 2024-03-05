package library.lang.ex.ex1;

public class BankAccount {
    public static void main(String[] args) {
        Account account1 = new Account("3333", "홍길동", 10000);
        Account account2 = new Account("6337", "임꺽정", 5000);

        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}

class Account {
    private String accountNumber;
    private String name;
    private double balance;

    public Account(String accountNumber, String name, long balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "계좌 번호 : %s, 이름 : %s, 잔액 : %.2f원".formatted(accountNumber, name, balance);
    }
}
