package loop;

public class Loop3 {
    public static void main(String[] args) {
        /* do-while 문. while문과 유사하지만, 무조건 한 번은 코드를 실행한다.
        do {
            // 반복할 코드
        } while (조건식);
        */
        int i = 1;
        // do-while문은 최소 한 번은 코드블럭을 실행한다.
        do {
            i++;
            System.out.println("i = " + i);
        } while( i < 5);

        System.out.println("================");

        // 일반 while문의 경우 처음부터 false 조건을 만나면 아무 것도 출력하지 않는다.
        i = 10;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
    }
}
