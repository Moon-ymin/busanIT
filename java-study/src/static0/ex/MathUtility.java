package static0.ex;

public class MathUtility {

    public static int max(int a, int b) {
        return ( a > b ? a : b);
    }

    public static int min(int a, int b) {
        return ( a > b ? b : a);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int factorial(int n) {
        if (n==1) return 1;
        return n*factorial(n-1);
    }
}
