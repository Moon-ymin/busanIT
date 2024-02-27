package solid.ocp.after;

public class KakaopayPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("카카오 페이 결제");
    }
}
