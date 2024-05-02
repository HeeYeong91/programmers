package Day_7;

import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 7
 * 콜라츠 수열 만들기
 */
public class Main4 {
    public static void main(String[] args) {
        int[] result = solution(10);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int n) {
        LinkedList<Integer> list = new LinkedList<>();

        while (n != 1) {
            list.add(n);

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }

        list.add(1);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
