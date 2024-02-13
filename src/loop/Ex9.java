package loop;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        // 이름과 나이를 입력받고 출력하는 앱
        Scanner sc = new Scanner(System.in);

        // while문 실행 여부를 담고 있는 flag
        boolean isRun = true;

        while(isRun) {
            // 이름을 입력받고 (이름을 입력받을 때 'q'라고 입력을 받으면 종료한다.
            // 나이를 입력받고
            // 입력받은 이름과 나이를 출력한다.
            System.out.print("이름을 입력하세요 : ");
            String name = sc.next();

            if( name.equals("q")) {
                isRun = false; // 반복조건을 없앤다
                System.out.println("종료합니다.");
                continue; // continue의 사용 : 뒤에 코드 패스하고 위로 올라감
//                break;
            }

            System.out.print("나이를 입력하세요 : ");
            int age = sc.nextInt();

            System.out.printf("이름 : %s, 나이 : %d\n", name, age);



        }

    }
}
