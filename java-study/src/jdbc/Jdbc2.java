package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc2 {
    // 데이터베이스 연결하기
    public static void main(String[] args) {
        // URL (jdbc:서브프로토콜://호스트이름:포트번호/데이터베이스이름)
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";       // 사용자 이름
        String password = "1234";   // 비밀번호

        // DriverManager 에서 연결 객체 가져오기
        // Java SE 6.0 이상에서는 자동으로 드라이버(서비스 제공자)를 로드
        Connection conn = null;
        try {
            // JDBC 드라이버에서 연결 객체 반환
            conn = DriverManager.getConnection(url, user, password);
            if (conn == null) {
                System.out.println("데이터베이스에 성공적으로 연결되었습니다.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    // 데이터베이스 연결이 더 이상 필요하지 않으면 리소스를 해제
                    conn.close();
                    System.out.println("데이터베이스 연결을 종료합니다");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
