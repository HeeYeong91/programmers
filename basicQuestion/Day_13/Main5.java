import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 13
 * n개 간격의 원소들
 */
public class Main5 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{4, 2, 6, 1, 7, 6}, 2);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{4, 2, 6, 1, 7, 6}, 4);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] num_list, int n) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < num_list.length; i += n) {
            list.add(num_list[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
