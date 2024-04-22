package jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex3 {
    /*
    연습문제 : 사용자 정보 업데이트
    요구사항: 사용자로부터 userId, username, password, age, email을 입력받아
    해당 userId를 가진 사용자의 정보를 업데이트하세요.

    사용자로부터 다음 정보를 입력받습니다:
    userId: 업데이트할 사용자 ID
    username: 새 사용자 이름
    password: 새 비밀번호
    age: 새 나이
    email: 새 이메일 주소
    입력받은 정보를 데이터베이스의 users 테이블에 업데이트합니다.
     */
    public static String isNull(String str){
        if (str == null){
            return
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        String[] str = new String
        System.out.print("ID를 입력하세요 : ");
        String userId = sc.nextLine();
        System.out.print("사용자 이름을 입력하세요: ");
        String userName = sc.nextLine();
        System.out.print("비밀번호를 입력하세요: ");
        String userPassword = sc.nextLine();
        System.out.print("나이를 입력하세요: ");
        String age = sc.nextLine();
        System.out.print("이메일 주소를 입력하세요: ");
        String email = sc.nextLine();

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
             PreparedStatement pstmt = conn.prepareStatement(sql)
        ){
            pstmt.setString(1, userId);
            pstmt.setString(2, userName);
            pstmt.setString(3, password);
            pstmt.setInt(4, age);
            pstmt.setString(5, email);
            pstmt.setString(6, userId);
            for (int i = 1; i <= 6 ; i++) {
                String insert =
                pstmt.setString(i, );
            }
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
