import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 코딩 기초 트레이닝 Day 15
 * 길이에 따른 연산
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
        System.out.println(solution(new int[]{2, 3, 4, 5}));
    }

    public static int solution(int[] num_list) {
        int answer = 0;

        if (num_list.length >= 11) {
            answer = Arrays.stream(num_list).sum();
        } else {
            answer = IntStream.of(num_list).reduce(1, (a, b) -> a * b);
        }

        return answer;
    }
}
