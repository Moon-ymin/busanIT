public class MathUtility {
    static int max(int a, int b) {
        return (a > b ? a : b);
    }
    static int min(int a, int b) {
        return (a < b ? a : b);
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static int factorial(int n){
        if (n==1) return 1;
        return n*factorial(n-1);
    }
}
