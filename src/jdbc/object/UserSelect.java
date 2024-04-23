package jdbc.object;

import java.sql.*;

public class UserSelect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String dbPassword = "1234";


        // 연결 객체
        try (Connection conn = DriverManager.getConnection(url, user, dbPassword)) {
            // 동적 SQL
            String sql = "SELECT userId, username, password, age, email FROM users WHERE userId = ?";

            // SQL 문 얻고, ? 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter");

            // SQL 문 실행하여 resultSet을 통한 데이터 접근
            ResultSet rs = pstmt.executeQuery();

            // 결과 셋에 1개만 데이터가 있을 경우 if (rs.next())
            if (rs.next()){
                // 데이터에서 객체로 값을 매핑
                User user1 = new User(rs.getString("userId"),   // 컬럼명
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getInt("age"),
                        rs.getString(5)             // 또는 순번 지정
                );
                // 객체 출력
                System.out.println(user1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
