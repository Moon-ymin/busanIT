package class0;

public class NumberObject {
    // 숫자 데이터를 가진 객체
    int number;

    // 클래스 내부에 기능을 함께 포함한 경우
    void add() {
        number++;
        System.out.println("숫자가 증가되었습니다. "+ number);
    }
    public static void main(String[] args) {
        NumberObject number = new NumberObject();
        // NumberObject라는 객체(0x10)에는 number 변수(0x10), add() 메서드(0x10) 가리킴

        number.add();
        number.add();
        number.add();
        number.add();

    }
    // 기능을 사용하는 쪽에서 정의하는 경우

    
    /*static void add(NumberObject numberObject) {
        numberObject.number++;
        System.out.println("숫자가 증가되었습니다. "+ numberObject.number);
    }*/
}
