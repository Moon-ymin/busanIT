package generic.ex.ex3;

/* 요구 사항
    StringDataProcessor 클래스 구현:
    DataProcessor<String> 인터페이스를 구현합니다.
    문자열 데이터를 대문자로 변환하는 로직을 processData 메소드에 구현합니다.
 */
public class StringDataProcessor implements DataProcessor<String> {
    @Override
    public String processData(String data) {
        return data.toUpperCase();
    }
}
