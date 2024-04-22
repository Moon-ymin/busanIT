package jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex4_1 {
    /*
    연습문제 2: 사용자 삭제
    요구사항: 사용자로부터 userId를 입력받아 해당 userId를 가진 사용자의 데이터를
    데이터베이스에서 삭제하세요.

    - 사용자로부터 userId를 입력받습니다.
    - 해당 userId를 가진 사용자의 데이터를 users 테이블에서 삭제합니다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        String sqlSelect = "SELECT * FROM users WHERE userId = ?";
        String sqlDelete = "DELETE FROM users WHERE userId = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement selectStmt = conn.prepareStatement(sqlSelect);
             PreparedStatement deleteStmt = conn.prepareStatement(sqlDelete)
        ) {
            System.out.print("삭제할 사용자 ID를 입력하세요: ");
            String userId = sc.nextLine();

            // 해당 사용자의 정보 조회
            selectStmt.setString(1, userId);
            ResultSet resultSet = selectStmt.executeQuery();

            if (!resultSet.next()) {
                System.out.println("해당 사용자 ID를 가진 사용자가 없습니다.");
                return;
            }

            // 사용자 정보 출력
            System.out.println("발견된 사용자 정보:");
            System.out.println("ID: " + resultSet.getString("userId"));
            System.out.println("이름: " + resultSet.getString("username"));
            System.out.println("이메일: " + resultSet.getString("email"));
            System.out.println("나이: " + resultSet.getInt("age"));

            // 사용자 삭제 여부 확인
            System.out.print("이 사용자를 정말 삭제하시겠습니까? (y/n): ");
            String confirm = sc.nextLine();

            if (confirm.equalsIgnoreCase("y")) {
                // 사용자 삭제
                deleteStmt.setString(1, userId);
                int rows = deleteStmt.executeUpdate();
                if (rows == 1) {
                    System.out.printf("사용자 ID %s의 정보가 성공적으로 삭제되었습니다.\n", userId);
                }
            } else {
                System.out.println("사용자 삭제가 취소되었습니다.");
            }

        } catch (SQLException e) {
            System.out.println("SQL 예외 발생 : " + e.getMessage());
        }
    }
}
