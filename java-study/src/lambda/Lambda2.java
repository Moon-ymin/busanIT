package lambda;

public class Lambda2 {
    public static void main(String[] args) {
        Printer anonymousPrinter = new Printer() {
            @Override
            public void print() {
                System.out.println("익명 객체에서 본문 선언하여 출력");
            }
        };
        anonymousPrinter.print();

        Printer lambdaPrinter = () -> {
            System.out.println("람다식으로 본문 선언하여 출력");
        };
        lambdaPrinter.print();

        Printer noReturnPrinter = () -> System.out.println("중괄호 생략하고," +
                " 리턴 값도 없는, 한줄짜리 람다식");
        noReturnPrinter.print();

        Printer twoLinePrinter = () -> {
            System.out.println("여러 줄 있는 경우에는 람다식에");
            System.out.println("본문 부분에 중괄호가 필요");
        };
        twoLinePrinter.print();
    }
}
