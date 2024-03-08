package quiz.quiz3.q1;

public class CreditCard implements Payment{
    @Override
    public void pay(int money) {
        System.out.printf("신용카드로 %d원 결제되었습니다.\n", money);
    }
}
