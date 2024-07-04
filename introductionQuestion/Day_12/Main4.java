import java.util.LinkedList;

/**
 * 코딩테스트 입문 Day 12 문자열, 정렬, 사칙연산, 수학
 * 소인수분해
 */
public class Main4 {
    public static void main(String[] args) {
        int[] result = solution(12);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(17);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(420);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int n) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }

                list.add(i);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
