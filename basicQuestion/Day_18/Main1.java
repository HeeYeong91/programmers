import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 18
 * x 사이의 개수
 */
public class Main1 {
    public static void main(String[] args) {
        int[] result = solution("oxooxoxxox");

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution("xabcxdefxghi");

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(String myString) {
        LinkedList<Integer> list = new LinkedList<>();
        int cnt = 0;

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != 'x') {
                cnt++;
            } else {
                list.add(cnt);
                cnt = 0;
            }
        }

        list.add(cnt);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
