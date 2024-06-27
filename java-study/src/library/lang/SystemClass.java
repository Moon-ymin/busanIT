package library.lang;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Properties;

public class SystemClass {
    public static void main(String[] args) {
        // System 클래스는 객체를 생성하지 않는다
        // 모든 멤버를 static 으로 클래스 이름을 통해 접근하여 사용한다
        // System system = new System();
        System.out.println();       // 표준 출력 PrintStream 을 사용함
        
        // 필드
        InputStream in = System.in;     // 표준 입력 스트림 : 주로 키보드 입력받을 때 사용
        PrintStream out = System.out;   // 표준 출력 스트림 : 콘솔에 출력할 때 사용
        PrintStream err = System.err;   // 표준 오류 스트림 : 에러 메시지 출력할 때 사용

        System.err.println("에러가 발생했습니다."); // 에러 메시지나 경고 메시지 표시에 사용
        System.out.println("시스템 클래스 사용합니다.");
        System.err.println("주의해주세요!");
        /*
        시스템 클래스 사용합니다.
        에러가 발생했습니다.
        주의해주세요!
         */

        // 메서드
        Map<String, String> getenv = System.getenv(); // Map 자료구조로 전체 환경변수 확인
        // 환경변수 조회 -> 디버거로 확인
        String path = System.getenv("PATH"); // Key 값을 통해 개별 환경변수 문자열 반환

        System.out.println("\n환경변수 : \n" + path);

        // 시스템 속성 조회
        Properties properties = System.getProperties(); // Properties 타입으로 시스템 속성 전체 반환
        String property = System.getenv("os.name"); // Key 값을 통해 시스템 속성 개별 문자열 반환
        System.out.println("\n운영체제 이름 : " + property);
        
        // 프로그램 종료
        // System.exit(0); // 정상종료 상태코드 0 = 일반적으로 종료될 때
        System.exit(1); // 비정상 종료 0을 제외한 상태코드
        System.out.println("프로그램 종료된 후의 코드는");
        System.out.println("실행되지 않습니다.");
    }
}
