package collection.map;

import java.util.*;

public class Map1 {
    // Key 와 Value 의 값으로 구성되는 Map.Entry 객체를 저장하는 구조
    // Entry : Map 인터페이스 내부에 선언된 중첩 인터페이스
    // Key 는 중복 저장될 수 없으며, Value 는 중복 저장될 수 있음
    // 기존 Key 와 동일한 키로 저장하게 될 경우,
    // 기존 값은 없어지고, 새로운 값으로 대체됨

    /* 구현 클래스
        HashMap, Hashtable, LinkedHashMap, ProperClass, TreeMap
     */

    public static void main(String[] args) {
        // 제네릭으로 Key 타입, Value 타입 지정
        Map<String, Integer> map = new HashMap<>();
        
        // 새로운 Key, value 쌍을 추가
        map.put("사과", 1500);
        map.put("바나나", 3000);
        map.put("오렌지", 2000);

        // size : 전체 크기 확인하기
        int size = map.size();
        System.out.println("size = " + size);

        // get : key 값으로 value 을 반환
        Integer bananaPrice = map.get("바나나");
        System.out.println("bananaPrice = " + bananaPrice);

        // 같은 Key 입력의 경우 마지막에 저장된 값으로 대체
        map.put("오렌지", 2500);
        System.out.println("오렌지 가격 : " + map.get("오렌지"));

        // 객체 순회
        Set<String> keySet = map.keySet();
        Collection<Integer> values = map.values();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        // for-each : 객체의 내부 한 요소씩 순회하는 방법
        // 1. KeySet 을 통한 순회
        for (String key : keySet){
            System.out.println(key + " -> " + map.get(key));
        }
        // 2. values 순화
        for (Integer value : values){
            System.out.println("가격:"+value);
        }
        // 3. Entry 순회
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " ⇒ " + entry.getValue());
            System.out.println(entry);  // 사과=1500 toString() 되어있음
        }
        // 4. 반복자를 통한 순회
        // map.iterator()   // Map에서는 반복자 사용 불가
        // Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        System.out.println("=========================");
        var iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> nextEntry = iterator.next();
            if (nextEntry.getValue() < 2000) {  // value 기준 2000원 이하 삭제
                iterator.remove();              // 안전 제거 (사이즈에 상관없이)
            }
        }

        // 객체 삭제
        System.out.println("==== 바나나 삭제 ====");
        map.remove("바나나");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }

        // 객체 비우기 : 모든 요소 삭제
        map.clear();

        // 비어있는지 여부 확인
        boolean mapEmpty = map.isEmpty();
        System.out.println("mapEmpty = " + mapEmpty);

    }
}
