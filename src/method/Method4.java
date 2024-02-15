package method;

public class Method4 {
    public static void main(String[] args) {
        checkAge(16);
    }

    public static void checkAge(int age) {
        if ( age < 18 ) {
            System.out.println("미성년자입니다. 주류 및 담배 판매가 불가합니다.");
            return; // return문을 만나면 그 즉시 메서드가 종료된다
        }
        System.out.println("성인이시군요. 주류 계산하겠습니다.");
    }
}
