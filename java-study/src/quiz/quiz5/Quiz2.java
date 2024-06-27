package quiz.quiz5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Quiz2 {
    public static void main(String[] args) {
        Random r = new Random();
        Set<Integer> lotto = new HashSet<>();

        for (int i = 0; i < 6; i++) {
            lotto.add( r.nextInt(1,46));
        }
        System.out.println("로또 번호: " + lotto);

    }
}
