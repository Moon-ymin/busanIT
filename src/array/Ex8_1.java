package array;

public class Ex8_1 {
    public static void main(String[] args) {
        // 이진탐색 binarySearch
        // 숫자가 정렬된 배열이 있습니다. 배열을 반으로 나누고,
        // 목표값이 있는 방향으로 다시 반으로 나누는 방식으로 목표값을 찾는 알고리즘을
        // 구현해보세요.
        // 시간복잡도가 O(log n) 만큼 반복하여 값을 찾는다
        int[] numbers = {11, 20, 36, 47, 54, 56, 72, 81, 90, 104};
        int target = 47;

        int left = 0; // 가장 왼쪽 인덱스
        int right = numbers.length-1; // 가장 오른쪽 인덱스

        while (left <= right) {
            int mid = (left + right) / 2;   // 가운데 인덱스

            if (numbers[mid] == target) {
                System.out.println("값을 찾았습니다. 타겟은 " + mid + "번 째 있습니다.");
                break;
            } else if (target < numbers[mid]) {
                right = mid - 1;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            }
        }
    }
}