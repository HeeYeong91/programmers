import java.util.Comparator;
import java.util.LinkedList;

/**
 * 코딩테스트 입문 Day 12 문자열, 정렬, 사칙연산, 수학
 * 문자열 정렬하기 (1)
 */
public class Main2 {
    public static void main(String[] args) {
        int[] result = solution("h112392");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution("p2o4i8gj2");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        result = solution("abcde0");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(String my_string) {
        LinkedList<Integer> list = new LinkedList<>();

        char[] charArr = my_string.toCharArray();

        for (char c : charArr) {
            if (Character.isDigit(c)) {
                list.add(Integer.parseInt(String.valueOf(c)));
            }
        }

        list.sort(Comparator.naturalOrder());

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
