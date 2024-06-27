package reference;

public class Ref4 {
    public static void main(String[] args) {
        // 기본 타입
        int a = 10;
        int b = a;  // 값(=10)이 복사되어 대입

        System.out.println("a = "+ a);   // 10
        System.out.println("b = "+ b);   // 10

        a = 20; // a 값을 변경

        System.out.println("===============");
        System.out.println("a = "+ a);   // 20
        System.out.println("b = "+ b);   // 10

        b = 100; // b 값을 변경

        System.out.println("=========");
        System.out.println("a = " + a);     // 20
        System.out.println("b = " + b);     // 100

        System.out.println("=========");
        // 참조 타입

        Data dataA = new Data();
        dataA.value1 = 100;
        Data dataB = dataA; // 값(=참조값 27973e9b)이 복사되어 대입 : 얕은 복사 (객체가 복사된 것이 아니라, 주소가 복사됨)

        System.out.println("dataA = " + dataA); // 참조값 0x10
        System.out.println("dataB = " + dataB); // 참조값 0x10

        System.out.println("dataA.value1 = " + dataA.value1); // 100
        System.out.println("dataB.value1 = " + dataB.value1); // 100

        // A의 값이 변경
        dataA.value1 = 200;
        System.out.println("dataA.value1 = " + dataA.value1); // 200
        System.out.println("dataB.value1 = " + dataB.value1); // 200

        // B의 값을 변경
        dataB.value1 = 300;
        System.out.println("dataA.value1 = " + dataA.value1); // 300
        System.out.println("dataB.value1 = " + dataB.value1); // 300


    }
}
