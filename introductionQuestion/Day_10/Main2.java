/**
 * 코딩테스트 입문 Day 10 조건문, 배열, 수학, 시뮬레이션
 * 2차원으로 만들기
 */
public class Main2 {
    public static void main(String[] args) {
        int[][] result = solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2);
        for (int[] arr : result) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        result = solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3);
        for (int[] arr : result) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] solution(int[] num_list, int n) {
        int m = num_list.length / n;
        int[][] answer = new int[m][n];
        int idx = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[idx++];
            }
        }

        return answer;
    }
}
