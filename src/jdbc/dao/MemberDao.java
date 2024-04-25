package jdbc.dao;

public interface MemberDao {
    // 회원과 관련된 DB 연산 정의
    // 회원 정보를 가지고 있는 MemberDTO를 넘겨받아서
    // DB 테이블에 추가, 조회, 수정, 삭제 등을 진행

    // CRUD
    void insert(MemberDto member);      // C 데이터 생성
    MemberDto getMemberById(String id);      // R 아이디(식별자)로 조회
    void update(MemberDto member);      // U 데이터 수정
    void delete(String id);             // D 식별자로 삭제
}
