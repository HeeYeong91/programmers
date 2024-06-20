/**
 * 코딩 기초 트레이닝 Day 24
 * 조건에 맞게 수열 변환하기 3
 */
public class Main3 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 3, 100, 99, 98}, 3);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{1, 2, 3, 100, 99, 98}, 2);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (k % 2 != 0) {
                answer[i] = arr[i] * k;
            } else {
                answer[i] = arr[i] + k;
            }
        }

        return answer;
    }
}
