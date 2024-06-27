package access_modifier.ex;

import access_modifier.ex.com.bank.system.Account;

public class Ex2 {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.getBalance();

        acc.deposit(100);
        acc.withdraw(50);
        acc.withdraw(100);

    }
}
