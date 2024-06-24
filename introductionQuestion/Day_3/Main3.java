import java.util.stream.IntStream;

/**
 * 코딩테스트 입문 Day 3 사칙연산, 배열, 수학
 * 최빈값 구하기
 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 3, 3, 4}));
        System.out.println(solution(new int[]{1, 1, 2, 2}));
        System.out.println(solution(new int[]{1}));
    }

    public static int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int[] frequent = new int[1000];

        for (int i = 0; i < array.length; i++) {
            frequent[array[i]]++;

            if (max < frequent[array[i]]) {
                max = frequent[array[i]];
                answer = array[i];
            }
        }

        int count = 0;
        for (int i = 0; i < 1000; i++) {
            if (max == frequent[i]) {
                count++;
            }

            if (count > 1) {
                return -1;
            }
        }

        return answer;
    }
}
