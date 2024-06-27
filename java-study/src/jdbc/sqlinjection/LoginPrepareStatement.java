package jdbc.sqlinjection;

import java.sql.*;
import java.util.Scanner;

public class LoginPrepareStatement {
    // 로그인 상황 만들기
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String dbPassword = "1234";
        Scanner scanner = new Scanner(System.in);

        // 로그인
        System.out.println("[로그인]");
        System.out.print("아이디를 입력하세요 : ");
        String userId = scanner.nextLine();
        System.out.print("패스워드를 입력하세요 : ");
        String userPassword = scanner.nextLine();

        String sql = "SELECT * FROM users WHERE userId = ? AND password = ?";

        try (Connection conn = DriverManager.getConnection(url, user, dbPassword);
             PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            // SQL 인젝션 공격
            // SELECT * FROM users WHERE userId = 'anythig' AND password = 'abcd' OR 'x'='x'

            pstmt.setString(1, userId);
            pstmt.setString(2, userPassword);
            ResultSet rs = pstmt.executeQuery();

            // 결과 셋이 있을 경우(ID, PASSWORD 일치할 경우) 로그인
            // 아닐 경우 실패
            if (rs.next()) {
                System.out.println("성공적으로 로그인 되었습니다.");
            } else {
                System.out.println("로그인에 실패하였습니다.");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
