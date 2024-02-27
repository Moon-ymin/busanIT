package polymorphism.interface0.ex.ex2;

public class PaymentProcessor {
    public static void main(String[] args) {
        Payment[] payments = {new CreditCard(), new BankTransfer(), new MobilePay()};

        for(Payment p : payments){
            p.pay(10000);
        }
    }
}
