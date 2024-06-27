package BookManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 데이터 베이스 연결 관리 유틸리티 객체
public class DatabaseUtil {
    // 필드 : 연결 정보 및 연결 객체
    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String user = "root";
    private static final String password = "1234";
    private static Connection conn;

    // 메서드
    public static Connection getConnection() {
        // 연결이 없으면 생성
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();    // 예외 메시지 출력
            }
        }
        return conn;
    }

    public static void close() {
        // 연결이 있으면 종료
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
