package nested.ex.ex1;

public class Main {
    public static void main(String[] args) {
        Printable printable = new Printable(){
            @Override
            public void print() {
                System.out.println("Hello, 익명객체!");
            }
        };

        printable.print();
    }
}
