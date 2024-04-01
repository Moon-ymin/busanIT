package quiz.quiz6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;

public class q1 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "python", "swift", "cpp","ai");

        Comparator<String> lansort = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        TreeSet<String> languagesSort = new TreeSet<>(lansort);
        languagesSort.addAll(languages);
        for(String s : languagesSort){
            System.out.println(s);
        }



    }
}
