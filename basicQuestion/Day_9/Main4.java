import java.util.Comparator;
import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 9
 * 접미사 배열
 */
public class Main4 {
    public static void main(String[] args) {
        String[] result = solution("banana");
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();

        result = solution("programmers");
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String[] solution(String my_string) {
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        list.sort(Comparator.naturalOrder());

        return list.stream().toArray(String[]::new);
    }
}
