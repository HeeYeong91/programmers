import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 9
 * 배열 만들기 5
 */
public class Main1 {
    public static void main(String[] args) {
        int[] result = solution(new String[]{"0123456789","9876543210","9999999999999"}, 50000, 5, 5);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < intStrs.length; i++) {
            int tmp = Integer.parseInt(intStrs[i].substring(s, s + l));

            if (tmp > k) {
                list.add(tmp);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
