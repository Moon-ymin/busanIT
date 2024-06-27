package polymorphism.ex.ex4;

public class StrawberryCookie extends Cookie {
    @Override
    void run() {
        System.out.println("딸기 쿠키가 달립니다!");
    }

    @Override
    void jump() {
        System.out.println("딸기 쿠키가 높게 점프합니다!");
    }

    @Override
    void specialSkill() {
        System.out.println("딸기 쿠키가 베리 베리 보호막을 형성합니다!");
    }
}