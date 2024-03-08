package quiz.quiz3.q1;

public class BankTransfer implements Payment{
    @Override
    public void pay(int money) {
        System.out.printf("은행이체로 %d원 결제되었습니다.\n", money);
    }
}
