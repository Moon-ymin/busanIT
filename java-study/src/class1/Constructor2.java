package class1;

public class Constructor2 {
    public static void main(String[] args) {
        Member member = new Member( "홍길동", 80, 30);
        Member member1 = new Member( "이순신", 100, 37);
//        Member member2 = new Member(); // 생성자가 존재할 때,
        // 입력값이 없는 생성자를 호출하면 컴파일 오류가 발생한다
        // => 런타임 오류를 원천 차단, 제약을 줌
        Member member2 = new Member("이몽룡", 25);

        Member[] members = {member, member1, member2};
        for (Member m : members) {
            System.out.println("이름 : " + m.name + " 성적 : " + m.score + " 나이 : " + m.age);
        }

    }
}
