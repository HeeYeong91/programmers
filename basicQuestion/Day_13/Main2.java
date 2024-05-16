import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 코딩 기초 트레이닝 Day 13
 * 순서 바꾸기
 */
public class Main2 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{2, 1, 6}, 1);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{5, 2, 1, 7, 5}, 3);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] num_list, int n) {
        int[] part1 = Arrays.stream(num_list, n , num_list.length).toArray();
        int[] part2 = Arrays.stream(num_list, 0, n).toArray();

        return IntStream.concat(Arrays.stream(part1), Arrays.stream(part2)).toArray();
    }
}
