package static0;

public class Final4 {
    public static void main(String[] args) {
        Member member = new Member("hong", "홍길동");
        member.printMember();
        // ...
        member.modifyMember("hong7", "홍지원");
        // 만약 id를 기준으로 다른 프로그램에서 참조하고 있는 로직이 있다면
        // 변경 시 큰 문제가 발생할 수 있다. 하지만 final 키워드를 사용하면 원천 차단 가능
        member.printMember();
    }
}
