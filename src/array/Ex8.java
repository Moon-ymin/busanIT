package array;

public class Ex8 {
    // 이진탐색은 정렬되어있는 배열을 이용해야 한다
    static int[] arr = {1, 3, 5, 7, 8, 10, 20, 35, 99, 100};
    public static void main(String[] args) {
        // 이진탐색 binarySearch 구현
        // 숫자가 정렬된 배열이 있습니다. 배열을 반으로 나누고,
        // 목표값이 있는 방향으로 다시 반으로 나누는 방식으로 목표값을 찾는 알고리즘을
        // 구현해보세요.

        System.out.println("1. 순환 호출을 이용한 이진 탐색");
        System.out.println(binarySearch1(5, 0, arr.length - 1));
        System.out.println("2. 반복을 이용한 이진 탐색");
        System.out.println(binarySearch2(20, 0, arr.length - 1));
    }

    // 재귀적 탐색
    static int binarySearch1( int key, int low, int high){
        int mid;
        if (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) { // 탐색 끝
                return mid;
            } else if (key < arr[mid]) { // 오른쪽 버림
                return binarySearch1(key, low, mid - 1);
            } else { // 왼쪽 버림
                return binarySearch1(key, mid + 1, high);
            }
        }
        return -1; // 탐색 실패
    }

    // 반복적 탐색
    static int binarySearch2( int key, int low, int high){
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) { // 왼족 탐색
                return high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // 탐색 실패

    }

}