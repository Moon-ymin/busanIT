package quiz.quiz3.q1;

public class PaymentProcessor {
    public static void main(String[] args) {
        Payment[] payment = {new CreditCard(), new BankTransfer(), new MobilePay()};

        for (Payment p : payment){
            p.pay(10000);
        }
    }
}
