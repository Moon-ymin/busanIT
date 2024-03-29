package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Network4 {
    public static void main(String[] args) {
        String urlString = "http://example.com";

        try {
            URL url = new URL(urlString);

            // URL 객체에서 HTTP 연결 객체를 생성
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // 연결되기 전에 헤더 정보를 변경
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            // HTTP 요청 메서드 가져오기, 설정하기
            String requestMethod = connection.getRequestMethod();
            connection.setRequestMethod("GET");     // 기본 값이 GET; POST 등으로 변경 가능
            System.out.println("requestMethod = " + requestMethod);

            // 헤더 정보 가져오기
            Map<String, List<String>> headerFields = connection.getHeaderFields();

            // Status Code 가져오기
            int responseCode = connection.getResponseCode();
            System.out.println("응답코드 = " + responseCode);

            // 응답 메시지 가져오기
            String responseMessage = connection.getResponseMessage();
            System.out.println("응답 메시지 = " + responseMessage);

            // 응답을 받을 객체
            StringBuilder response = new StringBuilder();

            // 정상적인 응답(200, OK)이면
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = connection.getInputStream();
                BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

                while (true) {
                    String line = in.readLine();
                    if (line == null) break;
                    response.append(line + "\n");
                }

                in.close();
            }
            System.out.println("=== 응답 내용 ===");
            System.out.println(response);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}