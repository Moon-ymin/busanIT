package access_modifier.ex.com.bank.system;

public class Account {
    // 필드
    private double balance;

    // 메서드
    public void getBalance(){
        System.out.println("초기 잔액: "+balance);
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("입금 후 잔액: "+balance);
    }
    public void withdraw(double amount) {
        if ( amount <= balance ) {
            balance -= amount;
            System.out.println("출금 후 잔액: "+balance);
        } else {
            System.out.println("출금 시도: "+amount);
            System.out.println("출금 실패. 잔액 부족");
        }
    }
}
