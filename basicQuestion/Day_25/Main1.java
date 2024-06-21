/**
 * 코딩 기초 트레이닝 Day 25
 * 정수를 나선형으로 배치하기
 */
public class Main1 {
    public static void main(String[] args) {
        int[][] result = solution(4);

        for (int[] arr : result) {
            for (int num : arr) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
        System.out.println();

        result = solution(5);

        for (int[] arr : result) {
            for (int num : arr) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int num = 1;
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        while (num <= n * n) {
            for (int i = colStart; i <= colEnd; i++) {
                answer[rowStart][i] = num++;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                answer[i][colEnd] = num++;
            }
            colEnd--;

            for (int i = colEnd; i >= colStart; i--) {
                answer[rowEnd][i] = num++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                answer[i][colStart] = num++;
            }
            colStart++;
        }

        return answer;
    }
}
