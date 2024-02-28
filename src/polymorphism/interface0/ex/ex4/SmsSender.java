package polymorphism.interface0.ex.ex4;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS 발송 성공: "+message);
    }
}
