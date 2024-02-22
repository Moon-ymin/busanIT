package inheritance.super_constructor;

public class SuperMain {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        // 1. SubClass -> SuperClass -> GrandClass
        // 2. GrandClass() -> SuperClass() -> SubClass()
        // 2-1. GrandClass() -> SuperClass(int value : 100) -> SubClass()

    }
}
