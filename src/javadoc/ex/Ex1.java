package javadoc.ex;

public class Ex1 {
    /*
    연습문제 1. Java 수학 라이브러리 빌드하기

     작성한 수학 유틸리티 클래스 2개를 빌드하고 패키징하여 외부에서 사용할 수 있게 만들어주세요.
        - static0.ex.MathyUtil
        - static0.ex.MathArrayUtil

    1. 새로운 프로젝트를 생성하세요. (MathLib)
    2. 위의 소스파일을 해당 프로젝트에 준비하세요.
    3. JavaDoc으로 해당 클래스에 대한 설명을 태그와 함께 작성해보세요.
    4. javadoc을 사용해 API 문서를 만들어주세요.
    5. 빌드 단계를 거쳐 JAR파일 아티팩트를 생성해보세요.
    6. 다른 프로젝트에서 수학유틸리티 라이브러리 클래스를 불러와 사용해보세요.
     */
    public static void main(String[] args) {
        // MathUtil 클래스의 테스트
        System.out.println("max(10, 20) = " + MathUtil.max(10, 20));
        System.out.println("min(10, 20) = " + MathUtil.min(10, 20));
        System.out.println("sum(10, 20) = " + MathUtil.sum(10, 20));
        System.out.println("factorial(5) = " + MathUtil.factorial(5));

        // MathArrayUtil 클래스의 테스트
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("sum(nums) = " + MathArrayUtil.sum(nums));
        System.out.println("average(nums) = " + MathArrayUtil.average(nums));
        System.out.println("min(nums) = " + MathArrayUtil.min(nums));
        System.out.println("max(nums) = " + MathArrayUtil.max(nums));
    }
}
