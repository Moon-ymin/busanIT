public class GameCharacter {
    String name;
    int level;
    int health;

    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public void attack() {
        System.out.println(name+"의 공격!");
    }
    public void takeDamage( int damage ) {
        System.out.printf("%s는 %d의 피해를 입었습니다.\n", name, damage);
        health -= damage;
        System.out.println("체력이 "+health+" 남았습니다.");
    }
}
