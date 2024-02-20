package class1.ex;

public class GameCharacter {
    String name;
    int level;
    int health;

    GameCharacter( String name, int level, int health ) {
        this.name = name;
        this.level = level;
        this.health = health;
    }
//    메서드:
//    attack(): 콘솔에 "name attacks!" 메시지를 출력하는 메서드.
//            takeDamage(int damage): 캐릭터가 받은 데미지를 health에서 차감하는 메서드.

    void attack() {
        System.out.println(name + "의 공격!");
    }

    void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + "이 공격을 받았습니다."
                + damage + "를 입었습니다. 체력이"
                + health + "남았습니다."
        );
    }


}
