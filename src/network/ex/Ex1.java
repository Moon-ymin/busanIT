package network.ex;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex1 {
    /*
    연습문제 1: URL 구조 분석기
    URL의 각 구성 요소(프로토콜, 호스트, 포트, 경로, 쿼리 파라미터, 참조)를 분석하고
    출력하는 자바 프로그램을 작성하세요.
    입력된 URL에 대해 다음 정보를 출력해야 합니다:

    요구사항
    - 프로토콜(Protocol)
    - 호스트(Host)
    - 포트 번호(Port) - 명시되지 않은 경우 "기본 포트"라고 출력
    - 경로(Path)
    - 쿼리(Query) - 각 쿼리 파라미터를 별도로 분석하여 출력
    - 참조(Reference) - 없는 경우 "참조 없음"이라고 출력

    입력 예시: https://www.example.com:8080/path/to/resource?name=John&age=30#section

    출력 예시
    ===
    프로토콜: https
    호스트: www.example.com
    포트: 8080
    경로: /path/to/resource
    쿼리:
      - name=John
      - age=30
    참조: section
     */
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.example.com:8080/path/to/resource?name=John&age=30#section");
        System.out.println("프로토콜: " + url.getProtocol());
        System.out.println("호스트: " + url.getHost());
        System.out.println("포트: " + url.getPort());
        System.out.println("경로: " + url.getPath());
        String[] queries = url.getQuery().split("&");
        System.out.println("쿼리:");
        for(String query : queries) {
            System.out.println("    - " + query);
        }
        System.out.println("참조: "+url.getRef());
    }
}
