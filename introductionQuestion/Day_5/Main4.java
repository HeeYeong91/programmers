import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 코딩테스트 입문 Day 5 수학, 배열
 * 배열 뒤집기
 */
public class Main4 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 3, 4, 5});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{1, 1, 1, 1, 1, 2});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[]{1, 0, 1, 1, 1, 3, 5});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] num_list) {
        List<Integer> list =  Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
