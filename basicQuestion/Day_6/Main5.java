package Day_6;

/**
 * 코딩 기초 트레이닝 Day 6
 * 수열과 구간 쿼리 2
 */
public class Main5 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        int[] result = solution(arr, queries);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = Integer.MAX_VALUE;

            for (int j = s; j <= e; j++) {

                if (arr[j] > k) {
                    min = Math.min(min, arr[j]);
                }
            }

            answer[i] = min != Integer.MAX_VALUE ? min : -1;
        }

        return answer;
    }
}
