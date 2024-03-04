package exception;


public class Throws1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 예외 떠넘기기
        // 일반적으로 try-catch 구문으로 예외를 처리할 수 있지만,
        // 메서드를 호출한 곳으로 예외를 떠넘길 수도 있음.
        findClass();
        // main 메서드는 더 이상 더넘길 수가 없기 때문에
        // main 메서드가 떠넘기게 되면 JVM이 최종적으로 예외를 처리하게 됨.
        // 오류 발생 가능성이 있는 경우 main메서드에서는 try-catch 구문으로 처리하는 것이 좋다. => 예외의 전파
    }


    private static void findClass() throws ClassNotFoundException {
        // ClassNotFoundException 발생
        // 호출한 곳으로 예외를 떠넘긴다.
        Class<?> name = Class.forName("java.lang.Object1231");
    }
}
