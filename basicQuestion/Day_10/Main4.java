/**
 * 코딩 기초 트레이닝 Day 10
 * 세로 읽기
 */
public class Main4 {
    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(solution("programmers", 1, 1));
    }

    public static String solution(String my_string, int m, int c) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (i % m == c - 1) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}
