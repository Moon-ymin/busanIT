package static0.ex;

public class Ex3 {
    public static void main(String[] args) {
//        `MathArrayUtils` 은 객체를 생성하지 않고 사용해야 합니다. 
//        생성이 불가능하게 막으세요. -> static 메소드 구현
        
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + MathArrayUtils.sum(values));
        System.out.println("average=" + MathArrayUtils.average(values));
        System.out.println("min=" + MathArrayUtils.min(values));
        System.out.println("max=" + MathArrayUtils.max(values));
    }
}
