import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 12
 * 배열 만들기 3
 */
public class Main3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[][] intervals = new int[][]{{1, 3}, {0, 4}};

        int[] result = solution(arr, intervals);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr, int[][] intervals) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            list.add(arr[i]);
        }

        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            list.add(arr[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
