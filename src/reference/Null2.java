package reference;

public class Null2 {
    public static void main(String[] args) {
        Data data = null;
//        Data data = new Data();
        data.value1 = 100;

        // null.value1 = 100; <- 참조할 주소가 존재하지 않는다
        // NullPointerException이 발생하며 프로그램이 종료된다.

        System.out.println(data.value1);
    }
}
