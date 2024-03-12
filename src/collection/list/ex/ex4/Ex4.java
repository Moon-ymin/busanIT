package collection.list.ex.ex4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 고길동, 2. 둘리, 3. 마이콜, 4. 희동이");
        while(true) {
            System.out.print("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력) : ");
            int number = sc.nextInt();
            switch (number){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("투표를 종료합니다.");
                    break;
                default:
                    System.out.println("없는 후보입니다.");
            }
        }


    }
}
