package library.lang.ex;

public class Ex6 {
    /*
    연습문제 2: 환경 변수 조회

    요구사항:
    사용자의 홈 디렉토리 경로를 조회하는 프로그램을 작성하세요.
    System.getenv() 메소드를 사용하여 "HOME" 환경 변수의 값을 조회합니다. (윈도우의 경우 "USERPROFILE" 환경 변수를 사용하세요.)
    조회된 경로를 출력하세요.

    실행 결과 예시:
    사용자 홈 디렉토리: /Users/username
     */
    public static void main(String[] args) {
        String homedir = System.getenv("USERPROFILE");
        System.out.println("사용자 홈 디렉토리: " + homedir);
    }
}
