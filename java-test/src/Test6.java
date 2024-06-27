public class Test6 {
    public static void main(String[] args) {
        GameCharacter ch1 = new GameCharacter("전사", 3, 100);
        GameCharacter ch2 = new GameCharacter("마법사", 5, 200);

        ch1.attack();
        ch2.takeDamage(10);
        ch2.attack();
        ch1.takeDamage(20);
    }
}
