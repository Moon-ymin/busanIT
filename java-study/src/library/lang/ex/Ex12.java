package library.lang.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> codes = new ArrayList<String>();

        System.out.print("몇 명의 주민등록번호를 입력받겠습니까?: ");
        int n = sc.nextInt();
        sc.nextLine();
//        int n = 2;

        for (int i = 0; i < n; i++) {
            System.out.print("주민등록번호: ");
            codes.add(sc.nextLine());
        }

        for(String code : codes) {
            String area, year, month, day, sex;
            if (code.charAt(7) == '0' || code.charAt(7) == '1') area = "20";
            else area = "21";
            if (area.equals("20")) {
                year = "19" + code.substring(0,2);
                month = code.substring(2,4);
                day = code.substring(4,6);
                sex =  (code.charAt(7) == '1') ? "남성" : "여성";
            } else {
                year = "20" + code.substring(0,2);
                sex =  (code.charAt(7) == '3') ? "남성" : "여성";
                month = code.substring(2,4);
                day = code.substring(4,6);
            }
            System.out.printf("생년월일: %s년 %s월 %s일\n", year, month, day);
            System.out.printf("성별: %s\n", sex);

        }
    }
}
