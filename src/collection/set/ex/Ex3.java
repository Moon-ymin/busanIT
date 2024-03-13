package collection.set.ex;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex3 {
    public static void main(String[] args) {
        Random r = new Random();
        Set<Integer> lotto = new HashSet<>();

        while (true) {
            int randomNumber = r.nextInt(1,46);
            lotto.add(randomNumber);
            if (lotto.size() == 6) break;
        }
        System.out.println("로또 번호: " + lotto);
    }
}
