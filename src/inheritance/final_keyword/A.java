package inheritance.final_keyword;

// 클래스에 선언된 final의 경우 더 이상 상속 받을 수 없음을 나타낸다
//final public class A {
public class A {
    // 메서드에 선언된 final은 더 이상 오버라이드(재정의) 될 수 없음을 나타낸다
//    final public void method() {
    public void method() {
        System.out.println("메서드");
    }
}
