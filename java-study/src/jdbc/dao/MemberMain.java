package jdbc.dao;

import java.util.List;
import java.util.Scanner;

// 메인 실행계층에서는 데이터 접근과 관련된 모든 코드를 DAO에 위임
public class MemberMain {
    private static Scanner sc = new Scanner(System.in);
    private static MemberDao memberDao;
    public static void main(String[] args) {

        // DAO 연결 객체 초기화
        memberDao = new MemberDaoImpl(DatabaseUtil.getConnection());

        // 데이터베이스 접근 객체 생성
        while (true) {
            System.out.print("1. 회원생성 | 2. 회원조회 | 3. 회원정보수정 | 4. 회원삭제  | 5. 전체회원목록 | 6. 나가기 > ");
            String menu = sc.nextLine();

            switch (menu) {
                case "1" -> insert();
                case "2" -> select();
                case "3" -> update();
                case "4" -> delete();
                case "5" -> list();
                case "6" -> {DatabaseUtil.close(); return;}
            }
        }
    }
    private static void list(){
        List<MemberDto> allMembers = memberDao.getAllMembers();
        System.out.printf("%-10s %-16s %-30s\n","아이디", "회원이름", "이메일");
        System.out.println("----------------------------------------------");
        for (MemberDto member : allMembers) {
            System.out.printf("%-10s %-16s %-30s\n",
                    member.getId(), member.getName(), member.getEmail());
        }
    }

    private static void insert() {
        // 회원 가입
        System.out.println("[회원 생성]");
        System.out.print("id : ");
        String id = sc.nextLine();
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("이메일 : ");
        String email = sc.nextLine();

        // DTO 객체 생성
        MemberDto memberDto = new MemberDto(id, name, email);

        // 데이터 접근은 DAO에게 위임.
        memberDao.insert(memberDto);
    }

    private static void select() {
        // SELECT
        System.out.print("조회할 id를 입력하세요> ");
        String id = sc.nextLine();
        MemberDto hong = memberDao.getMemberById(id);
        System.out.println("ID : " + hong.getId());
        System.out.println("이름 : " + hong.getName());
        System.out.println("이메일 : " + hong.getEmail());
    }
    private static void update(){
        // Update 메서드 구현
        // 조회하기 위해서는 ID(식별자)가 필요
        System.out.print("수정할 회원 ID를 입력하세요 : ");
        String id = sc.nextLine();
        // 수정하기 위해서는 기존 정보가 필요 => SELECT 로 조회
        MemberDto member = memberDao.getMemberById(id);

        if (member != null) {
            System.out.print("변경할 이름을 입력하세요 : ");
            String name = sc.nextLine();
            if (!name.isEmpty()) member.setName(name);
            System.out.print("변경할 이메일을 입력하세요 : ");
            String email = sc.nextLine();
            if (!email.isEmpty()) member.setEmail(email);

            memberDao.update(member);   // 데이터베이스 접근 위임
            System.out.println("회원 정보가 변경되었습니다.");
        } else {
            System.out.println("존재하지 않는 회원입니다.");
        }
    }
    private static void delete() {
        // DELETE 메서드 구현
        System.out.print("삭제할 회원 ID를 입력하세요 : ");
        String id = sc.nextLine();
        if (memberDao.getMemberById(id) != null) {
            memberDao.delete(id);
            System.out.println(id + " 회원이 삭제되었습니다.");
        } else {
            System.out.println("존재하지 않는 회원입니다.");
        }
    }
}
