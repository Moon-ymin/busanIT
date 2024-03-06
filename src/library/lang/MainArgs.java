package library.lang;

public class MainArgs {
    public static void main(String[] args) {
        // 엔트리 포인트로 메인 메서드를 실행할 때
        // 실행 정보와 함께 주어지는 인자를 문자열 배열 String[] args 에 입력된다.
        // 터미널(콘솔) java 파일명.java arg1 arg2 arg3
        // IDE 실행 환경 편집 Run Edit Configuration
        // program arguments 에서 입력이 가능하다 (공백으로 구분)
        System.out.println("안녕하세요~ 메인 인자입니다.");
        String arg1 = args[0];  // 입력받은 인자1
        String arg2 = args[1];  // 입력받은 인자2
        System.out.println("arg1 = " + arg1);
        System.out.println("arg2 = " + arg2);

        // 모든 인자에 접근하기
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
