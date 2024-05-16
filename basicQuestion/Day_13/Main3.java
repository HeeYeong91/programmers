import java.util.Arrays;

/**
 * 코딩 기초 트레이닝 Day 13
 * 왼쪽 오른쪽
 */
public class Main3 {
    public static void main(String[] args) {
        String[] result = solution(new String[]{"u", "u", "l", "r"});

        for (String str : result) {
            System.out.print(str + " ");
        }
        System.out.println();

        result = solution(new String[]{"l"});

        for (String str : result) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static String[] solution(String[] str_list) {
        String[] answer = {};

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }

        return answer;
    }
}
