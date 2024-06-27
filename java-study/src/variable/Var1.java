package variable;

public class Var1 {
    public static void main(String[] args){
        // 변수 선언
        int age;
        double value;
        int x, y, z;

        int score;
        score = 90;
        score = 100; // 같은 변수에 값을 다시 할당 가능 variable

        System.out.println( "점수 : " + score );

        int num = 100; // 선언과 초기화 동시에
        int result = num + score; // 변수끼리 연산가능

        System.out.println( result );
    }
}
