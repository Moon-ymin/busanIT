package jdbc.dao;

import java.util.Scanner;

// 메인 실행계층에서는 데이터 접근과 관련된 모든 코드를 DAO에 위임
public class MemberMain {
    public static void main(String[] args) {
        // 데이터베이스 접근 객체 생성
        MemberDao memberDao = new MemberDaoImpl();

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. insert | 2. select > ");
        String menu = scanner.nextLine();

        switch (menu) {
            case "1" -> insert(memberDao);
            case "2" -> select()
        }


        // SELECT
//        MemberDto hong = memberDao.getMemberById("hong");
//        System.out.println(hong.getId() + " " +  hong.getName()+ " " + hong.getEmail());
    }

    private static void insert(MemberDao memberDao) {
        Scanner scanner = new Scanner(System.in);

        // 회원 가입
        System.out.println("[회원 생성]");
        System.out.print("id : ");
        String id = scanner.nextLine();
        System.out.print("이름 : ");
        String name = scanner.nextLine();
        System.out.print("이메일 : ");
        String email = scanner.nextLine();

        // DTO 객체 생성
        MemberDto memberDto = new MemberDto(id, name, email);

        // 데이터 접근은 DAO에게 위임.
        memberDao.insert(memberDto);
    }

    private static void select(String id) {
        Scanner scanner = new Scanner(System.in);
    }
}
