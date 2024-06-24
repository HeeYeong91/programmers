import java.util.stream.IntStream;

/**
 * 코딩테스트 입문 Day 3 사칙연산, 배열, 수학
 * 짝수는 싫어요
 */
public class Main4 {
    public static void main(String[] args) {
        int[] result = solution(10);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(15);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 != 0).toArray();
    }
}
