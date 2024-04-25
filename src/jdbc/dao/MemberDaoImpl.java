package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO 인터페이스 구현 객체
public class MemberDaoImpl implements MemberDao {
    Connection conn;

    // DAO 생성과 동시에 접근 객체 생성
    public MemberDaoImpl() {
        this.conn = DatabaseUtil.getConnection();
    }

    @Override
    public void insert(MemberDto member) {
        String sql = """
                INSERT INTO members (id, name, email)
                VALUES (?, ?, ?)""";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, member.getId());
            pstmt.setString(2, member.getName());
            pstmt.setString(3, member.getEmail());
            pstmt.executeUpdate();

            // 리소스 정리
            pstmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public MemberDto getMemberById(String id) {
        String sql = """
                SELECT id, name, email
                FROM members
                WHERE id = ?
                """;
        try{
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                MemberDto member = new MemberDto(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("email")
                );
                return member;
            }
            pstmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void update(MemberDto member) {

    }

    @Override
    public void delete(String id) {

    }
}
