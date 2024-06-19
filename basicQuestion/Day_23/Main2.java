/**
 * 코딩 기초 트레이닝 Day 23
 * 꼬리 문자열
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"abc", "def", "ghi"}, "ef"));
        System.out.println(solution(new String[]{"abc", "bbc", "cbc"}, "c"));
    }

    public static String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)) {
                sb.append(str_list[i]);
            }
        }

        return sb.toString();
    }
}
