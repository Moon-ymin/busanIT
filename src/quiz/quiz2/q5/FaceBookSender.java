package quiz.quiz2.q5;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북 발송 성공: "+message);
    }
}
