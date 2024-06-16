import java.util.Arrays;

/**
 *  코딩 기초 트레이닝 Day 20
 *  배열 비교하기
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{49, 13}, new int[]{70, 11, 2}));
        System.out.println(solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36}));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3}));
    }

    public static int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            if (arr1.length > arr2.length) {
                return 1;
            } else {
                return -1;
            }
        } else {
            int arr1Sum = Arrays.stream(arr1).sum();
            int arr2Sum = Arrays.stream(arr2).sum();

            if (arr1Sum > arr2Sum) {
                return 1;
            } else if (arr1Sum < arr2Sum) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
