package quiz.quiz4;

import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");

        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if ( words[index].length() < words[i].length()) {
                index = i;
            }
        }

        System.out.println(words[index]);
    }
}
