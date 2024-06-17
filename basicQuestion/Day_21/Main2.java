import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 21
 * 전국 대회 선발 고사
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 7, 2, 5, 4, 6, 1}, new boolean[]{false, true, true, true, true, false, false}));
        System.out.println(solution(new int[]{1, 2, 3}, new boolean[]{true, true, true}));
        System.out.println(solution(new int[]{6, 1, 5, 2, 3, 4}, new boolean[]{true, false, true, false, false, true}));
    }

    public static int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                hm.put(rank[i], i);
            }
        }

        LinkedList<Integer> list = new LinkedList<>(hm.keySet());
        list.sort(Comparator.naturalOrder());

        int a = hm.get(list.get(0));
        int b = hm.get(list.get(1));
        int c = hm.get(list.get(2));

        return 10000 * a + 100 * b + c;
    }
}
