import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * 코딩 기초 트레이닝 Day 22
 * 배열의 원소 삭제하기
 */
public class Main4 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] arr, int[] delete_list) {
        LinkedList<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(LinkedList::new));

        for (int i = 0; i < delete_list.length; i++) {
            if (list.contains(delete_list[i])) {
                list.remove(list.indexOf(delete_list[i]));
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
