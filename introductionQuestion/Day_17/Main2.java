import java.util.stream.IntStream;

/**
 * 코딩테스트 입문 Day 17 문자열, 수학, 조건문, 배열, 사칙연산
 * n의 배수 고르기
 */
public class Main2 {
    public static void main(String[] args) {
        int[] result = solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(5, new int[]{1, 9, 3, 10, 13, 5});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(12, new int[]{2, 100, 120, 600, 12, 12});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int n, int[] numlist) {
        return IntStream.of(numlist).filter(e -> e % n == 0).toArray();
    }
}
