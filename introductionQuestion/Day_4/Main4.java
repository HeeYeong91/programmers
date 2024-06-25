import java.util.Arrays;

/**
 * 코딩테스트 입문 Day 4 수학, 배열
 * 배열의 평균값
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }

    public static double solution(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
    }
}
