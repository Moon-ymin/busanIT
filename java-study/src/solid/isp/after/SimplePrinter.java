package solid.isp.after;

// ISP를 적용하여 불필요한 인터페이스를 구현하지 않는다
public class SimplePrinter implements Printer{
    // 프린터 기능만 있는 단순 프린터

    @Override
    public void print() {
        // 프린트 로직
    }
}
