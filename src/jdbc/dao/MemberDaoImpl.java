package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// DAO 인터페이스 구현 객체
public class MemberDaoImpl implements MemberDao {
    Connection conn;

    // DAO 생성과 동시에 접근 객체 생성
    public MemberDaoImpl(Connection conn) {
        this.conn = conn;
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
        String sql = """
                UPDATE members SET name = ?, email = ?
                WHERE id = ?
                """;
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, member.getName());
            pstmt.setString(2, member.getEmail());
            pstmt.setString(3, member.getId());
            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(String id) {
        String sql = """
                DELETE FROM members
                WHERE id = ?
                """;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<MemberDto> getAllMembers() {
        // 데이터를 전달할 객체 리스트 (빈 컬렉션) 생성
        List<MemberDto> members = new ArrayList<>();
        String sql = "SELECT * FROM MEMBERS";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            // 여러개의 SQL문 결과 셋 반복 (커서 이동)
            while (rs.next()) {
                // DTO 객체를 생성하여 빈 컬렉션에 추가
                MemberDto member = new MemberDto(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("email")
                );
                members.add(member);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // 결과 셋을 담은 컬렉션을 반환
        return members;
    }
}
