package inheritance;

public class Child extends Parent{
    String field = "child";

    @Override
    public void callMethod() {
        System.out.println("자식 클래스의 메서드");
    }

    public void test() {
        System.out.println("this.field : " + this.field);
        System.out.println("super.field : " + super.field);

        this.callMethod();
        super.callMethod();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.test();

    }
}
