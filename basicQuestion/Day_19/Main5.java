import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 19
 * 무작위로 K개의 수 뽑기
 */
public class Main5 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{0, 1, 1, 2, 2, 3}, 3);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{0, 1, 1, 1, 1}, 4);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr, int k) {
        LinkedList<Integer> list = new LinkedList<>();

        while (list.size() < k) {
            for (int i = 0; i < arr.length; i++) {
                if (!list.contains(arr[i])) {
                    list.add(arr[i]);
                }

                if (list.size() == k) {
                    break;
                }
            }

            if (list.size() < k) {
                list.add(-1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
