package jdbc.sqlinjection;

import java.sql.*;
import java.util.Scanner;

public class LoginStatement {
    // 로그인 상황 만들기
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String dbpassword = "1234";
        Scanner sc = new Scanner(System.in);

        System.out.println("[로그인]");
        System.out.print("아이디를 입력하세요 : ");
        String userId = sc.nextLine();
        System.out.print("패스워드를 입력하세요 : ");
        String userPassword = sc.nextLine();

        try (Connection conn = DriverManager.getConnection(url, user, dbpassword);
             Statement stmt = conn.createStatement()
        ) {
            // prepare 가 아닌 Statement 로 매개변수가 있는 쿼리문을 작성할 경우

            // SELECT * FROM users WHERE username = ? and password = ?
            String sql = "SELECT * FROM users WHERE userId = '" +
                    userId + "' AND password = '" +
                    userPassword + "'";

            // 정상적 입력 : SELECT * FROM users WHERE userId = 'winter' AND password = '12345'
            // 사용자가 비밀번호 입력란에 abcd' OR 'x'='x 라고 입력했을 경우
            // SQL Injection 공격
            // SELECT * FROM users WHERE userId = 'anything' AND password = 'abcd' OR 'x'='x'
            
            // Statement에서 매개변수를 받아 작성할 경우 SQL 인젝션 공격의 위험이 높다
            /*
            PreparedStatement와 Statement는 JDBC(Java Database Connectivity)에서 SQL을 실행하는 데 사용되는 인터페이스입니다.
            PreparedStatement는 미리 컴파일된 쿼리를 나타내고, 매개변수를 사용하여 쿼리를 동적으로 생성할 수 있습니다.

            반면에 Statement는 정적인 SQL 문장을 나타내며, 매개변수를 사용하지 않고 직접 SQL 쿼리를 작성해야 합니다.
            SQL Injection은 주로 Statement를 사용할 때 발생할 수 있습니다.
            이는 사용자 입력을 직접 쿼리에 포함하므로, 사용자가 악의적인 SQL 코드를 입력하여 데이터베이스를 조작할 수 있습니다.
             */

            // 완성된 SQL문을 실행하고
            ResultSet rs = stmt.executeQuery(sql);

            // 결과 셋이 있을 경우 (ID, PASSWORD 일치할 경우) 로그인
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

/* SQL Injection 에 대해서 어떻게 해결해야 하나?
jdbc 에서~
conn.createStatement() → conn.prepareStatement(sql) 사용
 */