package solid.isp.before;

// ISP 인터페이스 분리 원칙 미적용
// 단순한 출력 기능만 있는 프린터도 모든 기능 구현이 강제된다.
public interface MultiFunctionPrinter {
    void print();
    void scan();
    void fax();
}
