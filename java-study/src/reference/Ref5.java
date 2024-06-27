package reference;

public class Ref5 {
    public static void main(String[] args) {
        Data data = new Data(); // Stack[ data, dataArg ] -> Heap[ 0x100 (new Data) ] : 주소지를 가르킴 ~> 하나의 힙 공간에 있는 객체
        data.value1 = 100;
        System.out.println("1. 메서드 호출 전 : " + data.value1); // 100
        multiply2(data);   // 메서드 호출 : 값(참조값, 메모리 주소 0x100)를 복사해서 대입
        System.out.println("4. 메서드 호출 후 : " + data.value1); // 100 -> 200
    }

    public static void multiply2(Data dataArg) {
        System.out.println("2. 메서드 내 값 변경 전 " + dataArg.value1); // 100
        dataArg.value1 *= 2;  // 0x100.value
        // 참조값을 복사해서 전달하여 data와 dataArg는 같은 참조값 0x100을 가지게 된다
        // 메모리 공간을 참조한 객체의 주소지가 같기 때문에
        // data.value1, dataArg.value1은 같은 값을 가지게 된다

        System.out.println("3. 메서드 내 값 변경 후 " + dataArg.value1); // 200
    }
}
