import java.util.Arrays;

/**
 *  코딩 기초 트레이닝 Day 20
 *  뒤에서 5등까지
 */
public class Main5 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{12, 4, 15, 46, 38, 1, 14});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] result = Arrays.copyOf(num_list, 5);

        return result;
    }
}
