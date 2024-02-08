package condition;

public class Condition8 {
    public static void main(String[] args) {
        // 주사위 던지기 -> Condition7의 for문을 switch문으로
        // typeCasting
        int diceNumber = (int) (Math.random() * 6) + 1;  // 1 ~ 6까지 랜덤한 난수 생성

        // switch문은 조건식에 해당하는 특정 값으로 실행할 코드를 선택한다.
        // 조건식의 결과값이 case의 값과 일치하면 case의 코드를 실행
        // break문은 switch문을 빠져나가게 한다.
        switch(diceNumber) {
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default:
                System.out.println("6번이 나왔습니다.");
                break;
        }
    }
}
