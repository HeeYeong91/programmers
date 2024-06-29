/**
 * 코딩테스트 입문 Day 8 배열, 구현, 수학
 * 배열 자르기
 */
public class Main1 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 3, 4, 5}, 1, 3);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{1, 3, 5}, 1, 2);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int idx = 0;

        for (int i = num1; i <= num2; i++) {
            answer[idx++] = numbers[i];
        }

        return answer;
    }
}
