package polymorphism.interface0.ex.ex3;

public class Mage extends GameCharacter implements Attackable{
    public Mage(String name) {
        super(name);
    }
    @Override
    public void attack(GameCharacter gameCharacter) {
        System.out.println("마법사가 "+gameCharacter.name+"에게 마법 공격을 합니다. 불의 화살!");
    }


}
