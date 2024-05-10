import java.util.stream.IntStream;

/**
 * 코딩 기초 트레이닝 Day 11
 * 배열 만들기 1
 */
public class Main2 {
    public static void main(String[] args) {
        int[] result = solution(10, 3);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(15, 5);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int n, int k) {
        return IntStream.range(1, n + 1).filter(i -> i % k == 0).toArray();
    }
}
