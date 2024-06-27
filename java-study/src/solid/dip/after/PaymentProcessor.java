package solid.dip.after;

// DIP 적용
public class PaymentProcessor {
    // 구체적인(Detail)에 의존하지 않고, 추상화에 의존하게 됨
    private Payment payment;

    // 결제방식을 추가하게 되더라도, 클래스를 수정할 필요가 없게 됨.
    // Payment 인터페이스에 의존
    void processPayment(double amount) {
        payment.processPayment(amount);
    }
}
