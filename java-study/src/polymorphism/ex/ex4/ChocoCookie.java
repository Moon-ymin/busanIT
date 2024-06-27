package polymorphism.ex.ex4;

public class ChocoCookie extends Cookie {
    @Override
    void run() {
        System.out.println("초코 쿠키가 달립니다!");
    }

    @Override
    void jump() {
        System.out.println("초코 쿠키가 중간 높이로 점프합니다!");
    }

    @Override
    void specialSkill() {
        System.out.println("초코 쿠키가 초콜릿 폭발을 일으킵니다!");
    }
}
