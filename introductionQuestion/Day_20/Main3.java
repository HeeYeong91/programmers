import java.util.Arrays;

/**
 * 코딩테스트 입문 Day 20 수학, 시뮬레이션, 문자열, 사칙연산
 * 최댓값 만들기 (2)
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, -3, 4, -5}));
        System.out.println(solution(new int[]{0, -31, 24, 10, 1, 9}));
        System.out.println(solution(new int[]{10, 20, 30, 5, 5, 20, 5}));
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        int a = numbers[0] * numbers[1];
        int b = numbers[numbers.length - 2] * numbers[numbers.length - 1];

        return Math.max(a, b);
    }
}
