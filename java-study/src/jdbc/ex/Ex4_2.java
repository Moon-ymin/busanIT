package jdbc.ex;

import java.util.Scanner;
import java.sql.*;
public class Ex4_2 {
    // 수업에서 진행한 코드
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";
        Scanner scanner = new Scanner(System.in);

        // 사용자 정보 입력받기 (엔터를 받을 경우 패스)
        System.out.print("삭제할 사용자의 ID를 입력하세요 : ");
        String userId = scanner.nextLine();

        // DB연결
        try (Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE userId = ?");
            PreparedStatement pstmtDelete = conn.prepareStatement("DELETE FROM users WHERE userId = ?")
        ){
            // SELECT 문으로 존재여부 확인
            pstmt.setString(1, userId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()){
                System.out.println("ID : " + rs.getString("userId"));
                System.out.println("이름 : " + rs.getString("username"));
                System.out.println("이메일 : " + rs.getString("email"));
                System.out.println("나이 : " + rs.getInt("age"));

                // 삭제 여부 확인하기
                System.out.print("정말로 삭제하시겠습니까? (y/n)");
                String response = scanner.nextLine();

                if (response.equals("y")) {

                    pstmtDelete.setString(1, userId);   // 동적 쿼리 완성
                    int rows = pstmtDelete.executeUpdate();
                    if (rows == 1) {
                        System.out.println("성공적으로 삭제되었습니다.");
                    } else {
                        System.out.println("삭제에 실패했습니다.");
                    }
                } else {
                    System.out.println("삭제가 취소 되었습니다.");
                }
            } else {
                System.out.println("해당 사용자 ID가 없습니다.");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
