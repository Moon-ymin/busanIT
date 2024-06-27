package collection.set.ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>(
                List.of("김철수",
                        "이영희",
                        "박지영",
                        "김철수",
                        "박지영",
                        "박민수",
                        "이영희")
        );
        Set<String> studentName = new HashSet<>(name);
        System.out.println(studentName);
    }
}
