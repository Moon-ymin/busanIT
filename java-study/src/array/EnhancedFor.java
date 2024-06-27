package array;

public class EnhancedFor {
    public static void main(String[] args) {
        // 향상된 for문 : JAVA 5버전부터 사용가능
        // 배열 등 반복 가능한 요소를 각각 탐색하는 for문 for-each

        int[] nums = {1,2,3,4,5};

        // 기존의 for문
        for (int i=0; i<nums.length; i++) {
            int num = nums[i];           // 배열의 구성요소
            System.out.println(nums[i]); // 배열의 구성요소를 출력
        }

        // 향상된 for문
        for (int num : nums) {            // nums 배열 안의 구성요소를 모두 순회
            System.out.println(num);
        }
        /*
        for (타입 변수명 : 배열변수명) {
            // 반복을 수행할 코드 (배열의 길이만큼 반복)
        } => 단축 `iter`
        장점
        1. 기존 코드보다 가독성이 높고, 간결하다
        2. 반복 횟수를 명시하거나 계산할 필요가 없다
        3. 배열의 요소에 인덱스로 접근할 필요가 없다
        단점
        1. 인덱스 값이 감추어져 있기 때문에 index를 사용해야하는 경우 사용할 수 없다.
         */
        for (int i=0; i<nums.length; i++) {
            System.out.println( i+"번째 배열의 요소는 "+ nums);
        }

        // 아래와 같이 사용할 수 있지만 -> 기존의 for문을 추천
        int i = 0;
        for (int num : nums) {
            System.out.println(i + "번째 배열의 요소는 " + nums);
            i++;
        }

    }
}
