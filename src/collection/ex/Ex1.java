package collection.ex;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<String> bag = new ArrayList<>();
        bag.addAll(
                Arrays.asList("지갑", "여권", "선글라스", "책", "삼각대", "충전기", "지도", "겨울옷")
        );
        System.out.println("원본 물품 = " + bag);

        Collections.sort(bag);
        System.out.println("정렬 후 = " + bag);

        Collections.reverse(bag);
        System.out.println("역순 정렬 = " + bag);

        Collections.shuffle(bag);
        System.out.println("섞은 물품 = " + bag);

        Collections.addAll(bag, "휴대폰", "카메라", "책");
        System.out.println("추가 후 물품 = " + bag);

        int books = Collections.frequency(bag, "책");
        System.out.println("책의 빈도 수  = " + books);

        Set<String> uniqueItems = new HashSet<>(bag);
        System.out.println("중복 제거 = " + uniqueItems);

        String maxItem = Collections.max(uniqueItems);
        System.out.println("중요 아이템 = " + maxItem);
    }
}
