package library.lang.ex;

public class Ex8 {
    /*
    연습문제 4: 프로그램 종료 상태 코드 설정

    요구사항:
    프로그램에 전달된 인자(argument)의 개수에 따라 다른 종료 코드를 반환하는 프로그램을 작성하세요.
    인자가 없으면 상태 코드 0을 반환하고 프로그램을 종료합니다.
    인자가 하나 이상 있으면 상태 코드 1을 반환하고 프로그램을 종료합니다.
    System.exit(int status) 메소드를 사용하여 상태 코드를 설정하세요.
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.exit(0);
        } else {
            System.exit(1);
        }
    }
}
