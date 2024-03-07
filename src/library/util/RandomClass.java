package library.util;

import java.security.SecureRandom;
import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        // java.util 패키지)
        // (java.lang 패키지를 제외한 모든 패키지는 import 해야 사용할 수 있다.)
        // 컬렉션 프레임워크를 포함한 여러가지 유용한 클래스들을 포함하고 있다.
        Random random = new Random();

        // 0부터 99까지 정수 난수를 생성
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println(randomNumber);
        }
        System.out.println("주사위 숫자 구하기");
        for (int i = 0; i < 10; i++) {
            // 0부터 5까지 정수 난수 생성하고 + 1 더하기
            int diceNum = random.nextInt(6) + 1;
            System.out.println(diceNum);
        }

        // 랜덤한 정수 범위의 값을 반환
        int i1 = random.nextInt();
        int i2 = random.nextInt();
        int i3 = random.nextInt();

        // 랜덤한 0.0 ~ 1.0까지 실수 난수를 생성
        double d1 = random.nextDouble();
        double d2 = random.nextDouble();
        double d3 = random.nextDouble();

        // 해당 범위 내에서 실수 난수 생성
        double d4 = random.nextDouble(3.14, 6.28);

        // 해당 범위 난수 생성  : 첫 인자 포함, 마지막 인자 제외
        int diceRangeNum = random.nextInt(1, 7);

        // 랜덤한 참 거짓 생성
        boolean trueFalse = random.nextBoolean();
        System.out.println(trueFalse);

        // 시드 값 : 난수 생성의 시작점을 제공하고, 동일한 시드값을 생성된 Random 객체는
        // 동일한 난수를 생성
        Random random123 = new Random(123);

        System.out.println("=== 시드 123 ===");
        System.out.println(random123.nextInt(100));

        Random random1232 = new Random(123);
        System.out.println(random1232.nextInt(100));

        System.out.println("=== 시드 456 === ");
        Random random456 = new Random(459123);
        System.out.println(random456.nextInt(100));

        // 시드값을 설정하는 이유
        // 재현성을 확보하여 디버깅, 테스트를 수행할 때, 동일한 난수 생성으로 용이하게 사용
        // 예측 가능성 : 시뮬레이션 실험 등에서 동일 입력 동일 결과를 얻고자할 때 유용
        // 시드값을 설정하지 않을 때 : System.currentTimeMillis() 또는 유사한 시간 기반 값의 시드를 자동으로 설정한다.
        // => 완전한 무작위성과 보안을 보장하지 않는다.
        // 보안이 중요한 상황에서는 SecureRandom 등과 같은 노이즈 값이 포함된 다른 클래스를 사용
        SecureRandom secureRandom;

        // Random 클래스를 사용하는 예시 : 게임 개발, 시뮬레이션, 보안, 암호화 등에 사용.


    }
}
