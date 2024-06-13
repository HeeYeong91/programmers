import java.util.LinkedList;

/**
 * 코딩 기초 트레이닝 Day 17
 * 공백으로 구분하기 2
 */
public class Main5 {
    public static void main(String[] args) {
        String[] result = solution("i  love you");

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();

        result = solution(" programmers");

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String[] solution(String my_string) {
        LinkedList<String> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != ' ') {
                sb.append(my_string.charAt(i));
            } else if (sb.length() != 0) {
                list.add(sb.toString());
                sb = new StringBuilder();
            }
        }

        if (sb.length() != 0) {
            list.add(sb.toString());
        }

        return list.stream().toArray(String[]::new);
    }
}
