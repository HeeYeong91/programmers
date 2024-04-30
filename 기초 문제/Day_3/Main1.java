/**
 * 코딩 기초 트레이닝 Day 3
 * 문자열 섞기
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution("aaaaa", "bbbbb"));
    }

    public static String solution(String str1, String str2) {
        StringBuffer answer = new StringBuffer();

        for (int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i)).append(str2.charAt(i));
        }

        return answer.toString();
    }
}
