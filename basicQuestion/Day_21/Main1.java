import java.util.Arrays;

/**
 * 코딩 기초 트레이닝 Day 21
 * 뒤에서 5등 위로
 */
public class Main1 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10});

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}
