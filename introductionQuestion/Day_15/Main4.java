import java.util.stream.IntStream;

/**
 * 코딩테스트 입문 Day 15 문자열, 해시, 배열, 수학
 * 약수 구하기
 */
public class Main4 {
    public static void main(String[] args) {
        int[] result = solution(24);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(29);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}
