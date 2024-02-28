package polymorphism.interface0.ex.ex3;

public class Healer extends GameCharacter implements Healable{

    public Healer(String name) {
        super(name);
    }

    @Override
    public void heal(GameCharacter gameCharacter) {
        System.out.println(name+"는 "+gameCharacter.name+"을(를) 치유합니다. 치유의 빛!");
    }
}
