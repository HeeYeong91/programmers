/**
 * 코딩 기초 트레이닝 Day 9
 * 부분 문자열 이어 붙여 문자열 만들기
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
    }

    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            for (int j = i; j < i + 1; j++) {
                int s = parts[j][0];
                int e = parts[j][1];

                sb.append(my_strings[i].substring(s, e + 1));
            }
        }

        return sb.toString();
    }
}
