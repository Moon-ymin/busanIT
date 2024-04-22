package jdbc.ex;

import java.sql.*;
import java.util.Scanner;

public class Ex3_1 {
    // 출력 형식 바꾼 버전
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        System.out.print("ID를 입력하세요 : ");
        String userId = sc.nextLine();
        System.out.print("사용자 이름을 입력하세요: ");
        String userName = sc.nextLine();
        System.out.print("비밀번호를 입력하세요: ");
        String userPassword = sc.nextLine();
        System.out.print("나이를 입력하세요: ");
        Integer age = sc.nextInt();
        sc.nextLine();
        System.out.print("이메일 주소를 입력하세요: ");
        String email = sc.nextLine();

        // 기존 정보
        // 기존 정보 조회
        String selectQuery = "SELECT username, password, age, email " +
                "FROM users WHERE userId = ?";
        String oldUserName = null;
        String oldPassword = null;
        Integer oldAge = null;
        String oldEmail = null;

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement selectStmt = conn.prepareStatement(selectQuery)) {
            selectStmt.setString(1, userId);
            ResultSet resultSet = selectStmt.executeQuery();
            if (resultSet.next()) {
                oldUserName = resultSet.getString("username");
                oldPassword = resultSet.getString("password");
                oldAge = resultSet.getInt("age");
                oldEmail = resultSet.getString("email");
            } else {
                System.out.println("해당하는 사용자가 없습니다.");
                return;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // 입력하지 않은 경우 기존 값으로 설정
        if (userName.isEmpty()) userName = oldUserName;
        if (userPassword.isEmpty()) userPassword = oldPassword;
        if (age == null) age = oldAge;
        if (email.isEmpty()) email = oldEmail;

        String sql = new StringBuilder()
                .append("UPDATE users SET ")
                .append("userId = ?, ")
                .append("username = ?, ")
                .append("password = ?, ")
                .append("age = ? ,")
                .append("email = ? ")
                .append("WHERE userID = ?")
                .toString();

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, userName);
            pstmt.setString(2, userPassword);
            pstmt.setInt(3, age);
            pstmt.setString(4, email);
            pstmt.setString(5, userId);

            // 실행 및 행 개수 반환
            int rows = pstmt.executeUpdate();
            if (rows == 1) {
                System.out.printf("사용자 ID %s의 정보가 성공적으로 업데이트되었습니다.\n", userId);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
