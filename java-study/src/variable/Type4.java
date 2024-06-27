package variable;

public class Type4 {
    public static void main(String[] args) {
        // 강제 타입 변환 Casting
        // 큰 타입을 작은 타입으로 강제로 나눠서 저장하는 것
        int i = 10;
//        byte b = i; 큰 타입에서 작은타입으로 변환 불가
        byte b  = (byte) i; // 작은 타입으로 강제로 변환 , 캐스팅 연산자

        double d = 3.14;
        int i2 = (int) d;
        System.out.println(i2); // 3, 실수 타입이 정수 타입으로 캐스팅 될 때는 소수점 이하 부분은 버려진다.


    }
}
