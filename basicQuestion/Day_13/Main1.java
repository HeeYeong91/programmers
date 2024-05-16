import java.util.Arrays;

/**
 * 코딩 기초 트레이닝 Day 13
 * n 번째 원소부터
 */
public class Main1 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{2, 1, 6}, 3);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{5, 2, 1, 7, 5}, 2);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}
