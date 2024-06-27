package static0.ex;

public class Ex4 {
    public static void main(String[] args) {
        //Logger 클래스를 사용하여 다양한 메시지를 로깅합니다.
        //로깅 레벨을 변경하고, 이에 따라 출력되는 메시지를 확인합니다.


        Logger.logInfo("앱이 시작되었습니다...");
        Logger.logError("에러 메시지입니다.");

        Logger.setLogLevel("ERROR");
        Logger.logInfo("ERROR 레벨이 세팅되었을 때 출력되는 INFO 메시지입니다.");
        Logger.logError("ERROR 레벨이 세팅되었을 때 출력되는 ERROR 메시지입니다.");
    }
}
