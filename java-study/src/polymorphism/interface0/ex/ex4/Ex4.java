package polymorphism.interface0.ex.ex4;

public class Ex4 {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("다중 메시지 전송 테스트입니다.");
        }
    }

}
