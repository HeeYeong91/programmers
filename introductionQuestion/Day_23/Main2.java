import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 코딩테스트 입문 Day 23 배열, 정렬, 문자열
 * 등수 매기기
 */
public class Main2 {
    public static void main(String[] args) {
        int[] result = solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}});
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[][] score) {
        List<Integer> list = new ArrayList<>();
        for (int[] a : score) {
            list.add(a[0] + a[1]);
        }

        list.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            answer[i] = list.indexOf(score[i][0] + score[i][1]) + 1;
        }

        return answer;
    }
}
