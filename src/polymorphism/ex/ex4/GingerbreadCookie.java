package polymorphism.ex.ex4;

public class GingerbreadCookie extends Cookie{
    @Override
    public void run() {
        System.out.println("진저브레드맨이 달립니다!");
    }

    @Override
    public void jump() {
        System.out.println("진저브레드 맨이 작게 점프합니다!");
    }

}
