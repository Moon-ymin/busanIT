package solid.dip.after;

public class DebitCard implements Payment {
    @Override
    public void processPayment(double amount) {
        // 직불카드 결제 처리...
    }
}
