package solid.ocp.after;

public class NaverpayPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("네이버페이 결제");
    }
}
