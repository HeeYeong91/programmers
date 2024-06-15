import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 19
 * 빈 배열에 추가, 삭제하기
 */
public class Main3 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr, boolean[] flag) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    list.removeLast();
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
