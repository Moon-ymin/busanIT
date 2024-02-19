package class1.ex;

public class Ex2 {
    public static void main(String[] args) {
        GameCharacter A = new GameCharacter("이몽룡", 3, 10);
        GameCharacter B = new GameCharacter("성춘향", 5, 6);

        attack( A );
        takeDamage( B, 2);
    }

    static void attack( GameCharacter gameCharacter ) {
        System.out.println(gameCharacter.name + " attacks!");
    }
    static void takeDamage(GameCharacter gameCharacter, int damage) {
        int health = gameCharacter.health - damage;
        System.out.println(gameCharacter.name + "는(은) 데미지 "+damage+"를 입고 "+health+"만큼 남았습니다.");
    }
}
