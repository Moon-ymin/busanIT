package polymorphism.abstraction;

public class AnimalMain3 {
    public static void main(String[] args) {
        // 추상 클래스는 인스턴스화가 될 수 없다 => 생성 제약
        // 1. 추상적인 상위 메서드 생성 문제 해결
        // Animal animal = new Animal() 
        Animal[] animals = {new Cat(), new Dog(), new Pig(), new Chicken()};
        // 2. 추상메서드로 오버라이딩 되지 않는 문제 해결

        for (Animal animal : animals) {
            animal.sound();
        }
        
    }
}
