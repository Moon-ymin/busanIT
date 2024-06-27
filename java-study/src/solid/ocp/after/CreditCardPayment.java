package solid.ocp.after;

public class CreditCardPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("신용 카드 결제 선택");
    }
}
