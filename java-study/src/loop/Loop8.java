package loop;

public class Loop8 {
    public static void main(String[] args) {
        // 중첩 반복문 : 반복문 안에 반복문을 내포하는 경우

        for(int i = 0; i<3; i++) {
            System.out.println("바깥쪽 for문 " + i); // 총 3번
            for ( int j=0; j<3; j++) {
                System.out.println("안쪽 for문 " + j); // 총 9번 
                for (int k=0; k<3; k++) {
                    System.out.println("3번째 for문 " + k); // 총 27번
                }
            }
            System.out.println();
        }

    }
}
