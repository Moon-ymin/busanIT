package variable;

public class Var4 {
    public static void main(String[] args) {
        // 두 변수의 값을 교환 swap
        int green = 10;
        int blue = 20;
        int x;

        x = green;
        green = blue;
        blue = x;

        System.out.println("green : " + green + " L");
        System.out.println("blue : " + blue + " L");
    }
}
