package library.lang.ex;

public class Ex14 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};
        int[] prices = {1000, 500, 2000};

        System.out.println("과일 가격표");
        for (int i = 0; i < 3; i++) {
            String fruit = String.format("%-6s: %,6d원", fruits[i], prices[i]);
            System.out.println(fruit);
        }
    }
}
