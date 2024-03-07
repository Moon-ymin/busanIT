package library.util.ex;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String password = "";
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        while(true) {
            password = "";
            for (int i = 0; i < len; i++) {
                int index = random.nextInt(charSet.length());
                password += String.valueOf( charSet.charAt(index) );
            }
            if ( password.matches(".*[0-9].*") && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") ) {
                break;
            } else {
                continue;
            }
        }

        System.out.println("생성된 비밀번호: " + password);
    }
}
