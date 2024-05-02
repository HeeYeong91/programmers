package Day_7;

import java.util.stream.IntStream;

/**
 * 코딩 기초 트레이닝 Day 7
 * 카운트 업
 */
public class Main3 {
    public static void main(String[] args) {
        int[] result = solution(3, 10);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int start_num, int end_num) {
        return IntStream.range(start_num, end_num + 1).toArray();
    }
}
