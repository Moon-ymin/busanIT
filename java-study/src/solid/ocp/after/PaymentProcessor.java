package solid.ocp.after;

public class PaymentProcessor {
    // 클라이언트 코드는 새로운 결제방법이 등장해도 변경되지 않는다.
    // 코드 수정에 닫혀있다
    public void processPayment(Payment payment) {
        payment.processPayment();
    }

}
