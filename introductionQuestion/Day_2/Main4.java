import java.util.stream.IntStream;

/**
 * 코딩테스트 입문 Day 2 사칙연산, 조건문, 배열
 * 배열 두 배 만들기
 */
public class Main4 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 3, 4, 5});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{1, 2, 100, -99, 1, 2, 3});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] numbers) {
        return IntStream.of(numbers).map(n -> n * 2).toArray();
    }
}
