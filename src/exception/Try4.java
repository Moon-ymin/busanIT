package exception;

public class Try4 {
    public static void main(String[] args) {
        // NullPointerException 예외처리
        String str = null;
        try {
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        System.out.println("이후 로직...");

    }
}
