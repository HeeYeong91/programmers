/**
 * 코딩 기초 트레이닝 Day 14
 * 홀수 vs 짝수
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 6, 1, 7, 6}));
        System.out.println(solution(new int[]{-1, 2, 5, 6, 3}));
    }

    public static int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                oddSum += num_list[i];
            } else {
                evenSum += num_list[i];
            }
        }

        return Math.max(oddSum, evenSum);
    }
}
