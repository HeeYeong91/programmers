/**
 * 코딩 기초 트레이닝 Day 25
 * 정사각형으로 만들기
 */
public class Main3 {
    public static void main(String[] args) {
        int[][] result = solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}});
        for (int[] arr : result) {
            for (int num : arr) {
                System.out.printf("%4d ", num);
            }
            System.out.println();
        }
        System.out.println();

        result = solution(new int[][]{{57, 192, 534, 2}, {9, 345, 192, 999}});
        for (int[] arr : result) {
            for (int num : arr) {
                System.out.printf("%4d ", num);
            }
            System.out.println();
        }
        System.out.println();

        result = solution(new int[][]{{1, 2}, {3, 4}});
        for (int[] arr : result) {
            for (int num : arr) {
                System.out.printf("%4d ", num);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] solution(int[][] arr) {
        int x = arr.length;
        int y = arr[0].length;
        int n = Math.max(x, y);

        int[][] answer = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}
