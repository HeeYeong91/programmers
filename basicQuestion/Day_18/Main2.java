import java.util.Comparator;
import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 18
 * 문자열 잘라서 정렬하기
 */
public class Main2 {
    public static void main(String[] args) {
        String[] result = solution("axbxcxdx");

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();

        result = solution("dxccxbbbxaaaa");

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String[] solution(String myString) {
        LinkedList<String> list = new LinkedList<>();

        for (String s : myString.split("x")) {
            if (!s.isBlank()) {
                list.add(s);
            }
        }

        list.sort(Comparator.naturalOrder());

        return list.stream().toArray(String[]::new);
    }
}
