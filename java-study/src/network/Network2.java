package network;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Network2 {
    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        // 문자열로부터 URI 객체 생성
        URI uri = new URI("https://entertain.naver.com:443/read?oid=076&aid=0004127078#news");

        // URI 메타 정보 조회하기
        String scheme = uri.getScheme();
        System.out.println("scheme = " + scheme);
        String host = uri.getHost();
        System.out.println("host = " + host);
        String path = uri.getPath();
        System.out.println("path = " + path);
        String query = uri.getQuery();
        System.out.println("query = " + query);
        String fragment = uri.getFragment();
        System.out.println("fragment = " + fragment);
        int port = uri.getPort();
        System.out.println("port = " + port);

        // URI를 문자열 또는 URL객체로 변환
        String uriString = uri.toString();
        System.out.println("uriString = " + uriString);
        URL toUrl = uri.toURL();
        System.out.println("url = " + toUrl);

        // URL 객체 : URI의 구조처럼 가지고 올 수 있음
        URL url = new URL("https://entertain.naver.com:443/read?oid=076&aid=0004127078#news");
        // 형식에 맞지 않는 문자열을 사용할 경우 : MalformedURLException

        String externalForm = url.toExternalForm();
        System.out.println("externalForm = " + externalForm);

        String protocol = url.getProtocol();
        System.out.println("protocol = " + protocol);
        int port1 = url.getPort();
        System.out.println("port1 = " + port1); // 없으면 -1
        int defaultPort = url.getDefaultPort();
        System.out.println("defaultPort = " + defaultPort); // 없어도 기본 포트 반환
        String file = url.getFile();
        System.out.println("file = " + file);   // path + query 반환
    }
}
