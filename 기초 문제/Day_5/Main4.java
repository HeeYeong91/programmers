import java.util.Arrays;

/**
 * 코딩 기초 트레이닝 Day 5
 * 원소들의 곱과 합
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(solution(new int[]{5, 7, 8, 3}));
    }

    public static int solution(int[] num_list) {
        int mul = Arrays.stream(num_list).reduce((a, b) -> a * b).getAsInt();
        int square = (int) Math.pow(Arrays.stream(num_list).sum(), 2);

        return mul < square ? 1 : 0;
    }
}
