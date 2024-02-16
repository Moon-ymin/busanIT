package reference;

public class Null3 {
    public static void main(String[] args) {
        DataWrapper dataWrapper = new DataWrapper();
        // Stack [0x300] -> 0x300[ null, 0 ]

        // 이거 생김으로 밑에 NPE 안생김
        dataWrapper.data = new Data(); // 인스턴스 내부의 참조필드를 초기화 생성
        // Stack [0x300] -> 0x300[ 0x400, 0 ] -> 0x400

        // 초기화하지않은 필드에 접근 시 초기값이 대입된다
        System.out.println(dataWrapper.count); // int : 0
        System.out.println(dataWrapper.data);  // 참조타입(Data) : null

        // 컴파일러에서 작동하지 않지만, 런타입 단계에서 NPE가 발생
        System.out.println(dataWrapper.data.value1); // null.value1 : NullPointerException
    }
}
