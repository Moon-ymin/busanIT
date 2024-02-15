package method;

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println(add(1, 2));  // 두 수를 더하는 메서드
        System.out.println(add(1, 2, 5));  // 세 수를 더하는 메서드
        System.out.println(add(1.0, 2.0));


    }

    public static int add(int x, int y) {
        System.out.println("두 수를 더하는 메서드");
        return x + y;
    }

    public static int add(int x, int y, int z) {
        System.out.println("세 수를 더하는 메서드");
        return x + y + z;
    }

    public static double add(double x, double y) {
        System.out.println("두 실수를 더하는 메서드");
        return x + y;
    }

    public static double add(int x, double y) {
        return x + y;
    }
    public static double add(double x, int y) {
        return x + y;
    }
//    public static String add(double x, int y) {
//        return "x + y";
//    }

    public static String add(String x, String y) {
        return x + y; // 두 문자열을 연결하는 메서드
    }

    /*
    ## 메서드 오버로딩
    - 같은 이름의 메서드를 여러개 정의하는 것
    - 메서드의 이름은 같지만, 매개변수의 개수가 다르거나, 타입이 다르면 오버로딩이 가능하다.
    - 메서드의 이름이 같아도, 타입의 순서가 다르면 오버로딩이 가능하다.
    - 리턴 타입만 다를 경우에는 오버로딩이 되지 않는다.
    - 오버로딩된 메서드는 모두 같은 클래스에 정의되어야 한다.
     */
}