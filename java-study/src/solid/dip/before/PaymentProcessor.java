package solid.dip.before;

// 결제 처리 프로세서
public class PaymentProcessor {
    // 고수준 모듈인 PaymentProcessor가
    // 저수준 모듈 CreditCard, DebitCard에 직접 의존하는 상황
    // DIP 위배

    // 필드
    private CreditCard creditCard;
    private DebitCard debitCard;

    // 구체적인(Detail) 클래스에 직접 의존
    void processCreditPayment(double amount) {
        creditCard.processPayment(amount);
    }
    void processDebitPayment(double amount) {
        debitCard.processPayment(amount);
    }
}
