import java.util.Arrays;

/**
 * 코딩테스트 입문 Day 11 수학, 반복문
 * 최댓값 만들기 (1)
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solution(new int[]{0, 31, 24, 10, 1, 9}));
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
