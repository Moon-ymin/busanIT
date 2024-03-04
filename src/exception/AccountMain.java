package exception;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(1000);
        System.out.println("예금액 : " + account.getBalance());

        // 떠넘겨진 예외(체크 예외)ㄹ,ㄹ 찰;
        try {
            account.withdraw(3000);
        } catch (InsufficientException e) {
            // 예외의 메시지를 가져올 수 있다
            throw new RuntimeException(e.getMessage());
        }
    }
}
