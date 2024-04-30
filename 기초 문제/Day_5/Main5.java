package Day_5;

import java.util.Arrays;

/**
 * 코딩 기초 트레이닝 Day 5
 * 이어 붙인 수
 */
public class Main5 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(solution(new int[]{5, 7, 8, 3}));
    }

    public static int solution(int[] num_list) {
        int evenSum = Arrays.stream(num_list).filter(x -> x % 2 == 0).reduce((x, y) -> (x * 10) + y).getAsInt();
        int oddSum = Arrays.stream(num_list).filter(x -> x % 2 != 0).reduce((x, y) -> (x * 10) + y).getAsInt();

        return evenSum + oddSum;
    }
}
