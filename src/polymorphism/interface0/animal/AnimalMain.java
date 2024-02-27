package polymorphism.interface0.animal;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        sound(dog);
        sound(cat);

        move(dog);
        move(cat);
    }

    // 매개변수로 Animal 인터페이스를 받는다
    // 인터페이스를 구현한 클래스들을 다형적 매개변수로 받을 수 있다
    static void sound(Animal animal) {
        animal.sound();
    }
    static void move(Animal animal) {
        animal.move();
    }

    // 다형성이 적용되지 않았을 때 메서드 구현
    // 동물이 추가되면 코드가 변경되야 한다.

    static void soundCat(Cat cat) {
        cat.sound();
    }
}
