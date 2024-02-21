package static0.ex;

public class Logger {
    // 필드
    static String logLevel = "INFO";

    // 메소드
    public static void logInfo( String s ){
        if (logLevel.equals("ERROR")) {
            System.out.println("[INFO] "+s);
        } else {
            System.out.println("[INFO] "+s);
        }
    }
    public static void logError( String s ){
        if (logLevel.equals("ERROR")) {
            System.out.println("[Error] "+s);
            }
    }

    public static void setLogLevel(String logLevel) {
        Logger.logLevel = logLevel;
    }

}
