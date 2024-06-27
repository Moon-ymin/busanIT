package generic.ex.ex3;

/* 요구 사항
    NumberDataProcessor 클래스 구현:
    DataProcessor<Integer> 인터페이스를 구현합니다.
    정수 데이터를 두 배로 증가시키는 로직을 processData 메소드에 구현합니다.
 */
public class NumberDataProcessor implements DataProcessor<Integer> {
    @Override
    public Integer processData(Integer data) {
        return 2*data;
    }
}
