/**
 * 코딩 기초 트레이닝 Day 14
 * 수열과 구간 쿼리 1
 */
public class Main5 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1}, {1, 2}, {2, 3}});

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            for (int j = s; j <= e; j++) {
                arr[j] += 1;
            }
        }

        return arr;
    }
}
