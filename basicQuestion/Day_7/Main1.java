package Day_7;

/**
 * 코딩 기초 트레이닝 Day 7
 * 수열과 구간 쿼리 4
 */
public class Main1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};

        int[] result = solution(arr, queries);
        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i];
        }

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for (int j = s; j <= e; j++) {
                if (j % k == 0) {
                    answer[j] += 1;
                }
            }
        }

        return answer;
    }
}
