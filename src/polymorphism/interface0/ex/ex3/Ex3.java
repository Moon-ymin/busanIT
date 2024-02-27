package polymorphism.interface0.ex.ex3;

public class Ex3 {

    public static void main(String[] args) {
        Warrior warrior = new Warrior("전사");
        Mage mage = new Mage("마법사");
        Healer healer = new Healer("힐러");

        warrior.attack(mage); // 전사가 마법사를 공격
        mage.attack(warrior); // 마법사가 전사를 공격
        healer.heal(warrior); // 힐러가 전사를 치유

    }

}
