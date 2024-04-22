package jdbc.ex;

import java.sql.*;

public class Ex1 {
    // 연습문제.
    // scott DB에서 10번 부서에 일하는 직원의 이름과 직무, 연봉을 조회하여 출력하세요.
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String password = "1234";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * from emp where deptno = 10"))
        {
            while (rs.next()){
                String name = rs.getString(2);
                String job = rs.getString(3);
                int sal = rs.getInt("SAL");

                System.out.printf("이름 : %s, 직무 : %s, 연봉 : %d\n", name, job, sal);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
