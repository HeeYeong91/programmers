/**
 * 코딩 기초 트레이닝 Day 2
 * 문자열 겹쳐쓰기
 */
public class Main5 {
    public static void main(String[] args) {
        System.out.println(solution("He11oWor1d", "lloWorl", 2));
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        for (int i = 0; i < s; i++) {
            answer += my_string.charAt(i);
        }

        for (int i = 0; i < overwrite_string.length(); i++) {
            answer += overwrite_string.charAt(i);
        }

        for (int i = overwrite_string.length() + s; i < my_string.length(); i++) {
            answer += my_string.charAt(i);
        }

        return answer;
    }
}
