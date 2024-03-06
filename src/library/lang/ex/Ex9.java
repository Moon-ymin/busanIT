package library.lang.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("문자열 길이: "+str.length());

        int blank = 0;
        String[] str1 = str.split("");
        for(String s : str1) {
            if (s.equals(" ")) blank++;
        }
        System.out.println("공백 수: "+blank);

        String[] stringstr = str.split(" ");
        int[] cnt = new int[stringstr.length];
        for (int i = 0; i < cnt.length; i++) {
            cnt[i] = stringstr[i].length();
        }
        System.out.println("각 부분 문자열 길이: "+ Arrays.toString(cnt));

        System.out.println("\"Java\" 포함 여부: " + str.contains("Java"));
        System.out.println("\"프로그래밍\"으로 끝나는가: " + str.endsWith("프로그래밍"));

        int a = 0;
        for(String s : str1) {
            if (s.equals("a")) a++;
        }
        System.out.println("\"a\" 문자의 수: "+a);
    }
}
