import java.util.Arrays;

/**
 * 코딩테스트 입문 Day 16 문자열, 수학, 배열, 조건문
 * 가장 큰 수 찾기
 */
public class Main2 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 8, 3});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{9, 10, 11, 8});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int idx = 0;
        int max = Arrays.stream(array).max().getAsInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                idx = i;
                break;
            }
        }

        answer[0] = max;
        answer[1] = idx;

        return answer;
    }
}
