package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Jdbc10 {
    // 삭제 DELETE
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        String sql = "DELETE FROM boards WHERE boardNo = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setInt(1, 1);

            int rows = pstmt.executeUpdate();

            if (rows == 1) {
                System.out.println(rows + "개 행이 삭제되었습니다.");
            }

        } catch (SQLException e) {
            System.out.println("SQL 예외 발생 : " + e.getMessage());
        }
    }
}
