package exception;

public class Try7 {
    static class Animal{}
    static class Dog extends Animal {}
    static class Cat extends Animal {}
    public static void main(String[] args) {
        // ClassCastException : 불가능한 다운캐스팅 시도시 발생
        Dog dog = new Dog();
        Cat cat = new Cat();
        changeDog(dog);
        changeDog(cat);
    }
    static void changeDog(Animal animal) {
        // instanceOf 연산자로 타입체크 예외처리
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // ClassCastException 이 발생 가능
        }
    }
}
