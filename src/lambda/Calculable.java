package lambda;

@FunctionalInterface
public interface Calculable {
    // 입력값이 2개 리턴값이 없는 추상 메서드 1개
    void calculate(int x, int y);

//    void plus(int x, int y);
}
