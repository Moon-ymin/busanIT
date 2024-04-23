package jdbc.ex;

import java.sql.*;
import java.util.Scanner;

public class Ex3_2 {
    // 수업에서 한 방식
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";
        Scanner scanner = new Scanner(System.in);

        // 사용자 정보 입력받기 (엔터를 받을 경우 패스) - 전부 String으로 받음
        System.out.print("사용자의 ID를 입력하세요 : ");
        String userId = scanner.nextLine();
        System.out.print("변경할 이름을 입력하세요 : ");
        String username = scanner.nextLine();
        System.out.print("변경할 비밀번호를 입력하세요 : ");
        String userPassword = scanner.nextLine();
        System.out.print("변경할 나이를 입력하세요 : ");
        String age = scanner.nextLine();
        System.out.print("변경할 이메일을 입력하세요 : ");
        String email = scanner.nextLine();

        try (Connection conn = DriverManager.getConnection(url, user, password)){
            // 쿼리문 Update 고정적인 부분
            StringBuilder query = new StringBuilder("UPDATE users SET ");
            // 콤마 SQL 문법을 위한 플래그
            boolean isFirst = true;

            // 동적으로 쿼리문 변경
            //                                  "컬럼명1=값1, 컬럼명2=값2, ..."
            //                                  "WHERE userId = ?";
            // 값을 입력받지 않았을 경우 ""
            if (!username.isEmpty()){
                // 값이 입력되었을 경우
                query.append("username = ?");
                isFirst = false;
            }
            if (!userPassword.isEmpty()) {
                // 값이 입력되었을 경우
                if (!isFirst) query.append(", ");   // 첫번째 컬럼이 아닌경우만 콤마 추가
                query.append("password = ?");
                isFirst = false;                // 첫번째 컬럼 사용됨
            }
            if (!age.isEmpty()) {
                if (!isFirst) query.append(", ");
                query.append("age = ?");
                isFirst = false;
            }
            if (!email.isEmpty()) {
                if (!isFirst) query.append(", ");
                query.append("email = ?");
                isFirst = false;
            }

            // 최종 조건 쿼리문 (고정
            query.append(" WHERE userID = ?");

            // 쿼리문 확인
            System.out.println(query.toString());

            // SQL 문장 준비
            String sql = query.toString();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // 동적인 값을 부여
            int index = 1;
            // 입력받은 값이 있을 경우만 인덱스를 사용하고 인덱스 번호를 증가
            if (!username.isEmpty()) pstmt.setString(index++, username);
            if (!userPassword.isEmpty()) pstmt.setString(index++, userPassword);
            if (!age.isEmpty()) pstmt.setInt(index++, Integer.parseInt(age));
            if (!email.isEmpty()) pstmt.setString(index++, email);
            pstmt.setString(index++, userId);       // userId는 반드시 존재

            // SQL 문 실행
            int rows = pstmt.executeUpdate();

            // 결과 로그
            if (rows == 1) {
                System.out.println(userId+"의 정보가 업데이트 되었습니다.");
            } else {
                System.out.println("업데이트되지 않았습니다.");
            }

            pstmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
