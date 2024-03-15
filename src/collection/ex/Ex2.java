package collection.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 5, 1, 2};
        Arrays.sort(numbers);
        System.out.println("1. 배열 정렬하기 : " + Arrays.toString(numbers));

        int[] sortedNumbers = {1, 2, 3, 4, 5};
        int target = 3;
        int index = Arrays.binarySearch(sortedNumbers, target);
        System.out.println("2. 배열 검색하기 : " + index);

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean isEqual = Arrays.equals(array2, array1);
        System.out.println("3. 배열 비교하기 : " + isEqual);

        int[] original = {1, 2, 3, 4, 5};
        int start = 1;
        int end = 3;
        System.out.println("4. 배열의 일부 복사하기 : " +
                Arrays.toString(Arrays.copyOfRange(original, start,end)));

        String[] fruits = {"Apple", "Banana", "Cherry"};
        List<String> li = Arrays.asList(fruits);
        System.out.println("5. 배열을 리스트로 변환하기 : " + li);
    }
}
