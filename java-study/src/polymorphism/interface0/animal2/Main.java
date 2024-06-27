package polymorphism.interface0.animal2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        cat.sound();
        sparrow.sound();
        penguin.sound();

        sparrow.fly();
        penguin.fly();

        penguin.swim();
    }
    static void sound(Animal animal) {
        animal.sound();
    }
    static void fly(Flyable flyable) {
        flyable.fly();
    }
    static void swim(Swimmable swimmable){
        swimmable.swim();
    }
}
