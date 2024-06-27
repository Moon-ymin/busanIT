package collection.set.ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex4 {
    public static void main(String[] args) {
        Set<String> userAFriends = new HashSet<>(Arrays.asList("B", "C", "D", "E"));
        Set<String> userBFriends = new HashSet<>(Arrays.asList("A", "C", "D", "F", "G"));

        // B의 친구 집합에서 A의 친구 집합(교집합 부분)을 제거 (차집합)
        Set<String> recommandFriends = new HashSet<>(userBFriends);
        recommandFriends.removeAll(userAFriends);
        // 자기자신(A) 제외
        recommandFriends.remove("A");

        System.out.println("recommandFriends = " + recommandFriends);


    }
}
