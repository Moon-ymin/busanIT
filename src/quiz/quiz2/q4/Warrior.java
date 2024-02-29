package quiz.quiz2.q4;

public class Warrior extends Character implements Attackable{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack(Character character) {
        System.out.println(name+"이(가) "+character.name+"을(를) 공격합니다. 강한 공격!");
    }
}
