import java.util.Arrays;

/**
 * 코딩 기초 트레이닝 Day 23
 * 정수 찾기
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(solution(new int[]{15, 98, 23, 2, 15}, 20));
    }

    public static int solution(int[] num_list, int n) {
        return Arrays.stream(num_list).anyMatch(x -> x == n) ? 1 : 0;
    }
}
