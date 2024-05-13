import java.util.Arrays;

/**
 * 코딩 기초 트레이닝 Day 12
 * 배열 조각하기
 */
public class Main5 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5};
        int[] query = new int[]{4, 1, 2};

        int[] result = solution(arr, query);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr, int[] query) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                answer = Arrays.copyOfRange(answer, 0, query[i] + 1);
            } else {
                answer = Arrays.copyOfRange(answer, query[i], answer.length);
            }
        }

        return answer;
    }
}
