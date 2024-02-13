package loop;

public class Loop5 {
    public static void main(String[] args) {
        /* continue 문
        while (조건식) {
            code1;
            continue; // 즉시 code2를 실행하지 않고 조건식으로 이동한다
            code2;
        }       
         */
        // 3을 건너뛰고 싶다
        int i = 1;
        while ( i < 6 ) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
            
        }
    }
}
