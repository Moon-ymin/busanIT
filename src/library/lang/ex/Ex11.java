package library.lang.ex;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");

        int maxLen = words[0].length();
        String maxWord = "";
        for(String word : words){
            if (maxLen < word.length()) {
                maxLen = word.length();
                maxWord = word;
            }
        }
        System.out.println(maxWord);

    }
}
