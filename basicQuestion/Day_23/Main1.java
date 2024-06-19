/**
 * 코딩 기초 트레이닝 Day 23
 * 부분 문자열
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(solution("abc", "aabcc"));
        System.out.println(solution("tbt", "tbbttb"));
    }

    public static int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}
