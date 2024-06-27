package class1.ex;

public class Ex2 {
    /* GameCharacter 를 설계해주세요.
    필드:
    name: 캐릭터의 이름 (String)
    level: 캐릭터의 레벨 (int)
    health: 캐릭터의 생명력 (int)
    생성자:
    모든 필드를 초기화하는 생성자를 작성하세요.
    메서드:
    attack(): 콘솔에 "name attacks!" 메시지를 출력하는 메서드.
    takeDamage(int damage): 캐릭터가 받은 데미지를 health에서 차감하는 메서드.

    - 메인 메서드에서 두 캐릭터를 생성하고 공격을 받고 피해받는 것을 주고받아보세요.
     */
    public static void main(String[] args) {
        GameCharacter david = new GameCharacter("David", 10, 100);
        GameCharacter peter = new GameCharacter("Peter", 20, 200);

        david.attack();
        peter.takeDamage(10);

        peter.attack();
        david.takeDamage(20);

    }

}
