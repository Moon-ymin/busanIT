package polymorphism.interface0.ex.ex3;

public class Warrior extends GameCharacter implements Attackable{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack(GameCharacter gameCharacter) {
        System.out.println(name+"가 "+gameCharacter.name+"을(를) 공격합니다. 강한 공격!");
    }
}
