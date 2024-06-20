/**
 * 코딩 기초 트레이닝 Day 24
 * 특별한 이차원 배열 1
 */
public class Main5 {
    public static void main(String[] args) {
        int[][] result = solution(3);

        for (int[] arr : result) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        result = solution(6);
        for (int[] arr : result) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        result = solution(1);
        for (int[] arr : result) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = 0;
                }
            }
        }

        return answer;
    }
}
