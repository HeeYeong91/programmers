import java.util.stream.IntStream;

/**
 * 코딩테스트 입문 Day 3 사칙연산, 배열, 수학
 * 중앙값 구하기
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 7, 10, 11}));
        System.out.println(solution(new int[]{9, -1, 0}));
    }

    public static int solution(int[] array) {
        int center = array.length / 2;
        int[] sortedArr = IntStream.of(array).sorted().toArray();

        return sortedArr[center];
    }
}
