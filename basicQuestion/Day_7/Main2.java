package Day_7;

import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 7
 * 배열 만들기 2
 */
public class Main2 {
    public static void main(String[] args) {
        int[] result = solution(5, 555);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(10, 20);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int l, int r) {
        int[] answer = {};
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = l; i <= r; i++) {
            String[] tmp = String.valueOf(i).split("");
            int count = 0;
            for (String s : tmp) {
                if (s.contains("5") || s.contains("0")) {
                    count++;
                }
            }

            if (count == tmp.length) {
                list.add(i);
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();
        if (answer.length == 0) {
            answer = new int[]{-1};
        }

        return answer;
    }
}
